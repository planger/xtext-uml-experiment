/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.umlrt.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrusrt.umlrt.services.UmlRtTextGrammarAccess;
import org.eclipse.papyrusrt.umlrt.umlrt.Capsule;
import org.eclipse.papyrusrt.umlrt.umlrt.CapsulePart;
import org.eclipse.papyrusrt.umlrt.umlrt.Protocol;
import org.eclipse.papyrusrt.umlrt.umlrt.ProtocolContainer;
import org.eclipse.papyrusrt.umlrt.umlrt.RTConnector;
import org.eclipse.papyrusrt.umlrt.umlrt.RTGuard;
import org.eclipse.papyrusrt.umlrt.umlrt.RTMessageSet;
import org.eclipse.papyrusrt.umlrt.umlrt.RTPort;
import org.eclipse.papyrusrt.umlrt.umlrt.RTPseudostate;
import org.eclipse.papyrusrt.umlrt.umlrt.RTRedefinedElement;
import org.eclipse.papyrusrt.umlrt.umlrt.RTRegion;
import org.eclipse.papyrusrt.umlrt.umlrt.RTState;
import org.eclipse.papyrusrt.umlrt.umlrt.RTStateMachine;
import org.eclipse.papyrusrt.umlrt.umlrt.RTTrigger;
import org.eclipse.papyrusrt.umlrt.umlrt.UmlrtPackage;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UmlRtTextSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UmlRtTextGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UMLPackage.CLASS:
				sequence_Class(context, (org.eclipse.uml2.uml.Class) semanticObject); 
				return; 
			case UMLPackage.COLLABORATION:
				sequence_Collaboration(context, (Collaboration) semanticObject); 
				return; 
			case UMLPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case UMLPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case UMLPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case UMLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case UMLPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case UMLPackage.PACKAGE:
				sequence_Package(context, (org.eclipse.uml2.uml.Package) semanticObject); 
				return; 
			case UMLPackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			case UMLPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case UMLPackage.PSEUDOSTATE:
				sequence_Pseudostate(context, (Pseudostate) semanticObject); 
				return; 
			case UMLPackage.REDEFINABLE_ELEMENT:
				sequence_RedefinableElement(context, (RedefinableElement) semanticObject); 
				return; 
			case UMLPackage.REGION:
				sequence_Region(context, (Region) semanticObject); 
				return; 
			case UMLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case UMLPackage.STATE_MACHINE:
				sequence_StateMachine(context, (StateMachine) semanticObject); 
				return; 
			}
		else if (epackage == UmlrtPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UmlrtPackage.CAPSULE:
				sequence_Capsule(context, (Capsule) semanticObject); 
				return; 
			case UmlrtPackage.CAPSULE_PART:
				sequence_CapsulePart(context, (CapsulePart) semanticObject); 
				return; 
			case UmlrtPackage.PROTOCOL:
				sequence_Protocol(context, (Protocol) semanticObject); 
				return; 
			case UmlrtPackage.PROTOCOL_CONTAINER:
				sequence_ProtocolContainer(context, (ProtocolContainer) semanticObject); 
				return; 
			case UmlrtPackage.RT_CONNECTOR:
				sequence_RTConnector(context, (RTConnector) semanticObject); 
				return; 
			case UmlrtPackage.RT_GUARD:
				sequence_RTGuard(context, (RTGuard) semanticObject); 
				return; 
			case UmlrtPackage.RT_MESSAGE_SET:
				sequence_RTMessageSet(context, (RTMessageSet) semanticObject); 
				return; 
			case UmlrtPackage.RT_PORT:
				sequence_RTPort(context, (RTPort) semanticObject); 
				return; 
			case UmlrtPackage.RT_PSEUDOSTATE:
				sequence_RTPseudostate(context, (RTPseudostate) semanticObject); 
				return; 
			case UmlrtPackage.RT_REDEFINED_ELEMENT:
				sequence_RTRedefinedElement(context, (RTRedefinedElement) semanticObject); 
				return; 
			case UmlrtPackage.RT_REGION:
				sequence_RTRegion(context, (RTRegion) semanticObject); 
				return; 
			case UmlrtPackage.RT_STATE:
				sequence_RTState(context, (RTState) semanticObject); 
				return; 
			case UmlrtPackage.RT_STATE_MACHINE:
				sequence_RTStateMachine(context, (RTStateMachine) semanticObject); 
				return; 
			case UmlrtPackage.RT_TRIGGER:
				sequence_RTTrigger(context, (RTTrigger) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Property returns CapsulePart
	 *     CapsulePart returns CapsulePart
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isNotification=UML_BOOLEAN 
	 *         isPublish=UML_BOOLEAN 
	 *         isWired=UML_BOOLEAN 
	 *         registration=PortRegistrationType 
	 *         registrationOverride=UML_STRING
	 *     )
	 */
	protected void sequence_CapsulePart(ISerializationContext context, CapsulePart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__IS_NOTIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__IS_NOTIFICATION));
			if (transientValues.isValueTransient(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__IS_PUBLISH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__IS_PUBLISH));
			if (transientValues.isValueTransient(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__IS_WIRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__IS_WIRED));
			if (transientValues.isValueTransient(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__REGISTRATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__REGISTRATION));
			if (transientValues.isValueTransient(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__REGISTRATION_OVERRIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlrtPackage.Literals.CAPSULE_PART__REGISTRATION_OVERRIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCapsulePartAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCapsulePartAccess().getIsNotificationUML_BOOLEANTerminalRuleCall_4_0(), semanticObject.isIsNotification());
		feeder.accept(grammarAccess.getCapsulePartAccess().getIsPublishUML_BOOLEANTerminalRuleCall_6_0(), semanticObject.isIsPublish());
		feeder.accept(grammarAccess.getCapsulePartAccess().getIsWiredUML_BOOLEANTerminalRuleCall_8_0(), semanticObject.isIsWired());
		feeder.accept(grammarAccess.getCapsulePartAccess().getRegistrationPortRegistrationTypeEnumRuleCall_10_0(), semanticObject.getRegistration());
		feeder.accept(grammarAccess.getCapsulePartAccess().getRegistrationOverrideUML_STRINGTerminalRuleCall_12_0(), semanticObject.getRegistrationOverride());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageableElement returns Capsule
	 *     Class returns Capsule
	 *     Capsule returns Capsule
	 *
	 * Constraint:
	 *     (name=ID ownedBehavior+=StateMachine*)
	 */
	protected void sequence_Capsule(ISerializationContext context, Capsule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageableElement returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Class(ISerializationContext context, org.eclipse.uml2.uml.Class semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_0_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Collaboration returns Collaboration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Collaboration(ISerializationContext context, Collaboration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCollaborationAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Connector
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Connector(ISerializationContext context, Connector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *     PackageableElement returns Model
	 *     Package returns Model
	 *
	 * Constraint:
	 *     (name=ID packagedElement+=PackageableElement*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageableElement returns Package
	 *     Package returns Package
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Package(ISerializationContext context, org.eclipse.uml2.uml.Package semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Port returns Port
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Port(ISerializationContext context, Port semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageableElement returns ProtocolContainer
	 *     Package returns ProtocolContainer
	 *     ProtocolContainer returns ProtocolContainer
	 *
	 * Constraint:
	 *     (name=ID (packagedElement+=Protocol | packagedElement+=RTMessageSet)*)
	 */
	protected void sequence_ProtocolContainer(ISerializationContext context, ProtocolContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Collaboration returns Protocol
	 *     Protocol returns Protocol
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Protocol(ISerializationContext context, Protocol semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pseudostate returns Pseudostate
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Pseudostate(ISerializationContext context, Pseudostate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPseudostateAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns RTConnector
	 *     RTConnector returns RTConnector
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RTConnector(ISerializationContext context, RTConnector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRTConnectorAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns RTGuard
	 *     RTGuard returns RTGuard
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RTGuard(ISerializationContext context, RTGuard semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRTGuardAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns RTMessageSet
	 *     RTMessageSet returns RTMessageSet
	 *
	 * Constraint:
	 *     (rtMsgKind=RTMessageKind name=ID)
	 */
	protected void sequence_RTMessageSet(ISerializationContext context, RTMessageSet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UmlrtPackage.Literals.RT_MESSAGE_SET__RT_MSG_KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UmlrtPackage.Literals.RT_MESSAGE_SET__RT_MSG_KIND));
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRTMessageSetAccess().getRtMsgKindRTMessageKindEnumRuleCall_1_0(), semanticObject.getRtMsgKind());
		feeder.accept(grammarAccess.getRTMessageSetAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Port returns RTPort
	 *     RTPort returns RTPort
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RTPort(ISerializationContext context, RTPort semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRTPortAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pseudostate returns RTPseudostate
	 *     RTPseudostate returns RTPseudostate
	 *
	 * Constraint:
	 *     ((kind=PseudostateKind | visibility=VisibilityKind)* name=ID)
	 */
	protected void sequence_RTPseudostate(ISerializationContext context, RTPseudostate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RedefinableElement returns RTRedefinedElement
	 *     RTRedefinedElement returns RTRedefinedElement
	 *
	 * Constraint:
	 *     (name=ID rootFragment=RedefinableElement?)
	 */
	protected void sequence_RTRedefinedElement(ISerializationContext context, RTRedefinedElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Region returns RTRegion
	 *     RTRegion returns RTRegion
	 *
	 * Constraint:
	 *     (visibility=VisibilityKind? name=ID (subvertex+=RTState | subvertex+=RTPseudostate)*)
	 */
	protected void sequence_RTRegion(ISerializationContext context, RTRegion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateMachine returns RTStateMachine
	 *     RTStateMachine returns RTStateMachine
	 *
	 * Constraint:
	 *     (visibility=VisibilityKind? name=ID isPassive=UML_BOOLEAN? region+=Region+)
	 */
	protected void sequence_RTStateMachine(ISerializationContext context, RTStateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns RTState
	 *     RTState returns RTState
	 *
	 * Constraint:
	 *     (visibility=VisibilityKind? name=ID)
	 */
	protected void sequence_RTState(ISerializationContext context, RTState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns RTTrigger
	 *     RTTrigger returns RTTrigger
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RTTrigger(ISerializationContext context, RTTrigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRTTriggerAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RedefinableElement returns RedefinableElement
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RedefinableElement(ISerializationContext context, RedefinableElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRedefinableElementAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Region returns Region
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Region(ISerializationContext context, Region semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateMachine returns StateMachine
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_StateMachine(ISerializationContext context, StateMachine semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
