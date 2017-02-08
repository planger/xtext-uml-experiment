package org.eclipse.papyrus.uml.marte.ui.trasformations

import org.eclipse.uml2.uml.Component
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.NamedElement

/**
 * UML2MarText
 * Given a UML model, it generates its textual representation
 * conforming to the MarText.ecore meta-model  
 **/
class UML2MarText {
	
	/**
	 * [RULE] Model
	 **/
	 def static dispatch CharSequence transform(Model model) {
	 	 '''
	     model «model.legalName» «IF model.hasOwnedComponents»{
	     	«FOR component : model.ownedComponents»
	     		«transform(component)»
	     	«ENDFOR»
	     }«ENDIF»;
	     '''
	 }
	 
	/**
	 * [RULE] Component
	 **/
	def static dispatch CharSequence transform(Component component) {
		if (component.isHwProcessor) {
			System.out.println("YEAH " + component.name)
			'''
			processor «component.legalName»«IF component.hasOwnedComponents» {
				cores: «component.getValue(component.getAppliedStereotypes.findFirst
	  				[appliedStereotype | "HwProcessor".equals(appliedStereotype.name)], "nbCores")»;
				«IF component.hasOwnedComponents»
				caches: {
					«FOR ownedCache : component.ownedComponents»
					«transform(ownedCache)»
					«ENDFOR»
				};«ENDIF»
			};«ELSE»;«ENDIF»
			'''
		} else if (component.isHwCache) {
			'''
			cache «component.legalName» {
				level: «component.getValue(component.getAppliedStereotypes.findFirst
	  				[appliedStereotype | "HwCache".equals(appliedStereotype.name)], "level")»;
			};
			'''
		} else {
			'''
			component «component.legalName»«IF component.hasOwnedComponents» {
				«FOR ownedComponent : component.ownedComponents»
				«transform(ownedComponent)» 
				«ENDFOR»
			};«ELSE»;«ENDIF»
			'''
		}
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
	 * - namedElement.name : not empty or null
	 * - default name : otherwise
	 **/
	def static getLegalName(NamedElement namedElement) {
		if(namedElement.hasLegalName) namedElement.name else "default_name"
	}

	/**
	 * [UTIL] hasOwnedComponents(Element element) -> Boolean
	 *  - true  : element.ownedElements contains Component instances
	 *  - false : otherwise
	 **/
	def static hasOwnedComponents(Element element) {
		element.ownedElements.findFirst[ownedElement|ownedElement instanceof Component] != null
	}

	/**
	 * [UTIL] ownedComponents(Element element) -> Iterable<Component>
	 **/
	def static getOwnedComponents(Element element) {
		element.ownedElements.filter[ownedElement|ownedElement instanceof Component].map [ownedElement |
			ownedElement as Component
		]
	}

	/**
	 * [UTILS] isHwProcessor(Component component) -> Boolean 
	 *  - true  : the component has a <<HwProcessor>> stereotype application
	 *  - false : otherwise
	 **/
	def static isHwProcessor(Component component) {
		component.appliedStereotypes.findFirst[appliedStereotype|"HwProcessor".equals(appliedStereotype.name)] != null
	}

	/**
	 * [UTILS] hasOwnedCaches(Component component) -> Boolean
	 *  - true  : element.ownedElement contains <<HwCache>> Component instances
	 * 	- false : otherwise
	 **/
	def static hasOwnedCaches(Component component) {
		component.ownedComponents.findFirst[ownedComponent|ownedComponent.isHwCache] != null
	}

	/**
	 * [UTILS] getOwnedCaches(Component component) -> Iterable<Component>
	 **/
	def static getOwnedCaches(Component component) {
		component.ownedComponents.filter[ownedComponent|ownedComponent.isHwCache]
	}

	/**
	 * [UTILS] isHwCache(Component component) -> Boolean
	 *  - true  : element.ownedElements. contains <<HwProcessor>> Component instances
	 *  - false : otherwise
	 **/
	def static isHwCache(Component component) {
		component.appliedStereotypes.findFirst[appliedStereotype|"HwCache".equals(appliedStereotype.name)] != null
	}
}