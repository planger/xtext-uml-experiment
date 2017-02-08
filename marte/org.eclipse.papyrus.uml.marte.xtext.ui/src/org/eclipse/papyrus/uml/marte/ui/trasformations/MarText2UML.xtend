package org.eclipse.papyrus.uml.marte.ui.trasformations

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.papyrus.uml.marte.marText.HwCache
import org.eclipse.papyrus.uml.marte.marText.HwProcessor
import org.eclipse.uml2.uml.Component
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Profile
import org.eclipse.uml2.uml.Stereotype
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource

/**
 * MarText2UML
 * Given a MarText and a UML model, it propagates the
 * differences from the first to the latter.  
 **/
class MarText2UML {

	/** Resource set **/
	private static val resourceSet = new ResourceSetImpl
	/** MARTE profile URI **/
	private static val marteProfileURI = URI.createURI(
		"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.profile.uml")
	/** MARTE profile resource **/
	private static val marteProfileResource = resourceSet.getResource(marteProfileURI, true) as UMLResource
	/** MARTE Profile **/
	private static val marteProfile = marteProfileResource.contents.findFirst [ containedElement |
		containedElement instanceof Profile && "MARTE".equals((containedElement as Profile).name)
	] as Profile

	/** Supported profiles **/
	private static val supportedProfiles = {
		newHashMap( /* HwComputing Profile (HwProcessor) */ Pair.of("HwComputing",
			marteProfile.allOwnedElements.findFirst [ ownedElement |
				ownedElement instanceof Profile && "HwComputing".equals((ownedElement as Profile).name)
			] as Profile), /* HwMemory Profile (HwCache) */ Pair.of("HwMemory", marteProfile.allOwnedElements.findFirst [ ownedElement |
			ownedElement instanceof Profile && "HwMemory".equals((ownedElement as Profile).name)
		] as Profile))
	};

	/** Supported stereotypes **/
	private static val supportedStereotypes = {
		newHashMap( /* HwProcessor Stereotype */ Pair.of("HwProcessor",
			supportedProfiles.get("HwComputing").allOwnedElements.findFirst [ ownedElement |
				ownedElement instanceof Stereotype && "HwProcessor".equals((ownedElement as Stereotype).name)
			] as Stereotype), /* HwCache Stereotype */ Pair.of("HwCache",
			supportedProfiles.get("HwMemory").allOwnedElements.findFirst [ ownedElement |
				ownedElement instanceof Stereotype && "HwCache".equals((ownedElement as Stereotype).name)
			] as Stereotype))
	};

	/** Used Profiles (keeps track of the required profiles throughout the transformation) **/
	private static val appliedProfiles = newHashSet()

	/**
	 * [RULE] Model
	 **/
	def static void transform(Model umlModel, Model marTextModel) {

		/* Reset applied profiles */
		appliedProfiles.clear
		umlModel.appliedProfiles.toList.forEach[umlModelProfile|umlModel.unapplyProfile(umlModelProfile)]

		/* Update name **/
		umlModel.name = marTextModel.legalName

		/* Retrieve UML model components */
		val umlModelComponents = umlModel.ownedComponents
		/* Retrieve MarText model components */
		val marTextModelComponents = marTextModel.ownedComponents
		/* Retrieve shared components (both UML and MarText models) */
		val sharedComponents = umlModelComponents.filter [ umlModelComponent |
			marTextModelComponents.findFirst [ marTextModelComponent |
				umlModelComponent.qualifiedName.equals(marTextModelComponent.qualifiedName)
			] != null
		].map [ sharedComponent |
			Pair.of(sharedComponent, marTextModelComponents.findFirst [ marTextModelComponent |
				sharedComponent.qualifiedName.equals(marTextModelComponent.qualifiedName)
			])
		].toList
		/* Retrieve inserted components (MarText model only) */
		val insertedComponents = marTextModelComponents.filter [ marTextModelComponent |
			umlModelComponents.findFirst [ umlModelComponent |
				umlModelComponent.qualifiedName.equals(marTextModelComponent.qualifiedName)
			] == null
		].toList
		/* Retrieve removed components (UML model only) */
		val removedComponents = umlModelComponents.filter [ umlModelComponent |
			marTextModelComponents.findFirst [ marTextModelComponent |
				umlModelComponent.qualifiedName.equals(marTextModelComponent.qualifiedName)
			] == null
		].toList
		/* Delete removed components */
		removedComponents.forEach[removedComponent|removedComponent.destroy]
		/* Update shared components */
		sharedComponents.forEach[sharedComponent|transform(sharedComponent.key, sharedComponent.value)]
		/* Create inserted components */
		insertedComponents.forEach [ insertedComponent |
			transform(
				umlModel.createPackagedElement(insertedComponent.name, UMLPackage.Literals.COMPONENT) as Component,
				insertedComponent)
			]

		}

		/**
		 * [RULE] Component
		 **/
		def static void transform(Component umlComponent, Component marTextComponent) {

			/* Update name */
			umlComponent.name = marTextComponent.legalName

			/* Stereotype Application */
			if (marTextComponent instanceof HwProcessor) {
				/* Apply profile if it has not been already applied before */
				if (appliedProfiles.add("HwComputing") &&
					umlComponent.model.getProfileApplication(supportedProfiles.get("HwComputing")) == null) {
					umlComponent.model.applyProfile(supportedProfiles.get("HwComputing"))
				}
				/* Apply stereotype if it has not been already applied before */
				if (umlComponent.getStereotypeApplication(supportedStereotypes.get("HwProcessor")) == null) {
					umlComponent.applyStereotype(supportedStereotypes.get("HwProcessor"))
				}
				/* Update stereotype attributes */
				umlComponent.setValue(umlComponent.appliedStereotypes.findFirst [ appliedStereotype |
					"HwProcessor".equals(appliedStereotype.name)
				], "nbCores", marTextComponent.nbCores.toString)
			} else if (marTextComponent instanceof HwCache) {
				/* Apply profile if it has not been already applied before */
				if (appliedProfiles.add("HwMemory") &&
					umlComponent.model.getProfileApplication(supportedProfiles.get("HwMemory")) == null) {
					umlComponent.model.applyProfile(supportedProfiles.get("HwMemory"))
				}
				/* Apply stereotype if it has not been already applied before */
				if (umlComponent.getStereotypeApplication(supportedStereotypes.get("HwCache")) == null) {
					umlComponent.applyStereotype(supportedStereotypes.get("HwCache"))
				}
				/* Update stereotype attributes */
				umlComponent.setValue(umlComponent.appliedStereotypes.findFirst [ appliedStereotype |
					"HwCache".equals(appliedStereotype.name)
				], "level", marTextComponent.level.toString)
			} else {
				/* Remove unused stereotype applications (supported only) */
				val unusedStereotypes = umlComponent.appliedStereotypes.filter [ appliedStereotype |
					/* Current stereotype supported (i.e. HwProcessor or HwCache) */
					supportedStereotypes.keySet.contains(appliedStereotype.name)
				].toList
				unusedStereotypes.forEach[unusedStereotype|umlComponent.unapplyStereotype(unusedStereotype)]
			}

			/* Retrieve UML model components */
			val umlSubcomponents = umlComponent.ownedComponents
			/* Retrieve MarText model components */
			val marTextSubcomponents = marTextComponent.ownedComponents
			/* Retrieve shared components (both UML and MarText models) */
			val sharedComponents = umlSubcomponents.filter [ umlSubomponent |
				marTextSubcomponents.findFirst [ marTextSubcomponent |
					umlSubomponent.qualifiedName.equals(marTextSubcomponent.qualifiedName)
				] != null
			].map [ sharedComponent |
				Pair.of(sharedComponent, marTextSubcomponents.findFirst [ marTextSubcomponent |
					sharedComponent.qualifiedName.equals(marTextSubcomponent.qualifiedName)
				])
			].toList
			/* Retrieve inserted components (MarText model only) */
			val insertedComponents = marTextSubcomponents.filter [ marTextSubcomponent |
				umlSubcomponents.findFirst [ umlSubcomponent |
					umlSubcomponent.qualifiedName.equals(marTextSubcomponent.qualifiedName)
				] == null
			].toList
			/* Retrieve removed components (UML model only) */
			val removedComponents = umlSubcomponents.filter [ umlSubcomponent |
				marTextSubcomponents.findFirst [ marTextSubcomponent |
					umlSubcomponent.qualifiedName.equals(marTextSubcomponent.qualifiedName)
				] == null
			].toList
			/* Delete removed components */
			removedComponents.forEach[removedComponent|removedComponent.destroy]
			/* Update shared components */
			sharedComponents.forEach[sharedComponent|transform(sharedComponent.key, sharedComponent.value)]
			/* Create inserted components */
			insertedComponents.forEach [ insertedComponent |
				transform(
					umlComponent.createPackagedElement(insertedComponent.name,
						UMLPackage.Literals.COMPONENT) as Component, insertedComponent)
			]
		}

		/**
		 * [UTIL] hasLegalName(NamedElement namedElement) -> Boolean
		 *  - true  : namedElement.name is neither empty nor null
		 *  - false : otherwise 
		 **/
		def static hasLegalName(NamedElement namedElement) {
			!namedElement.name.nullOrEmpty
		}

		/**
		 * [UTIL] getLegalName(NamedElement namedElement) -> String
		 *  - namedElement.name : not empty or null
		 *  - default name : otherwise 
		 **/
		def static getLegalName(NamedElement namedElement) {
			if(namedElement.hasLegalName) namedElement.name else "default_name"
		}

		/**
		 * [UTIL] hasOwnedComponents(Element element) -> Boolean
		 *   - true  : element.ownedElements contains Component instances
		 *   - false : otherwise 
		 **/
		def static hasOwnedComponents(Element element) {
			element.ownedElements.findFirst[ownedElement|ownedElement instanceof Component] != null
		}

		/**
		 * [UTIL] getOwnedComponents(Element element) -> Iterable<Component> 
		 **/
		def static getOwnedComponents(Element element) {
			element.ownedElements.filter[ownedElement|ownedElement instanceof Component].map [ ownedElement |
				ownedElement as Component
			]
		}

	}
	