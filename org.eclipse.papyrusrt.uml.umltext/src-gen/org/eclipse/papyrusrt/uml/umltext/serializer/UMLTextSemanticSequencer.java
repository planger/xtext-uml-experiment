/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.uml.umltext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrusrt.uml.umltext.services.UMLTextGrammarAccess;
import org.eclipse.papyrusrt.uml.xUML.Protocol;
import org.eclipse.papyrusrt.uml.xUML.XUMLPackage;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UMLTextSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UMLTextGrammarAccess grammarAccess;
	
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
			case UMLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case UMLPackage.PACKAGE:
				sequence_Package(context, (org.eclipse.uml2.uml.Package) semanticObject); 
				return; 
			}
		else if (epackage == XUMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XUMLPackage.PROTOCOL:
				sequence_Protocol(context, (Protocol) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     PackagableElement returns Class
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
		feeder.accept(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID packagedElement+=Package*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Package returns Package
	 *
	 * Constraint:
	 *     (name=ID packagedElement+=PackagableElement*)
	 */
	protected void sequence_Package(ISerializationContext context, org.eclipse.uml2.uml.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackagableElement returns Protocol
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
		feeder.accept(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
