package org.eclipse.papyrusrt.umlrt

import java.io.IOException
import java.io.Reader
import java.io.Writer
import org.antlr.runtime.CharStream
import org.eclipse.emf.ecore.EObject
import org.eclipse.papyrusrt.umlrt.parser.antlr.UmlRtTextParser
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.parsetree.reconstr.ITokenStream
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializationContext
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.serializer.acceptor.ISequenceAcceptor
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor
import org.eclipse.xtext.serializer.impl.Serializer
import org.eclipse.xtext.util.ReplaceRegion

class UmlRtTextRuntimeModule extends AbstractUmlRtTextRuntimeModule {
	
	override Class<? extends ISerializer> bindISerializer(){
		return TestSerializer; 
	}
	
	override bindIParser() {
		return TestParser;
	}
	
	

}


class TestParser extends UmlRtTextParser {
	
	override parse(ParserRule rule, Reader reader) {
		super.parse(rule, reader)
	}
	
	override parse(RuleCall ruleCall, Reader reader, int initialLookAhead) {
		super.parse(ruleCall, reader, initialLookAhead)
	}
	
	override protected parse(String ruleName, CharStream in) {
		super.parse(ruleName, in)
	}
	
	override doParse(CharSequence sequence) {
		super.doParse(sequence)
	}
	
	override doParse(Reader reader) {
		super.doParse(reader)
	}
	
	override protected doParse(String ruleName, CharStream in, NodeModelBuilder nodeModelBuilder, int initialLookAhead) {
		super.doParse(ruleName, in, nodeModelBuilder, initialLookAhead)
	}
	
	override protected doReparse(IParseResult previousParseResult, ReplaceRegion replaceRegion) {
		super.doReparse(previousParseResult, replaceRegion)
	}
	
}

class TestSerializer extends Serializer {
	
	override serialize(EObject obj) {
		super.serialize(obj); 
	}
	
	override protected serialize(ISerializationContext context, EObject semanticObject, ISequenceAcceptor tokens, Acceptor errors) {
		super.serialize(context, semanticObject, tokens, errors)
	}
	
	override protected serialize(EObject obj, Appendable appendable, SaveOptions options) throws IOException {
		super.serialize(obj, appendable, options)
	}
	
	override protected serialize(EObject semanticObject, EObject context, ISequenceAcceptor tokens, Acceptor errors) {
		super.serialize(semanticObject, context, tokens, errors)
	}
	
	override protected serialize(EObject obj, ITokenStream tokenStream, SaveOptions options) throws IOException {
		super.serialize(obj, tokenStream, options)
	}
	
	override serialize(EObject obj, SaveOptions options) {
		super.serialize(obj, options)
	}
	
	override serialize(EObject obj, Writer writer, SaveOptions options) throws IOException {
		super.serialize(obj, writer, options)
	}
	
	override serializeToRegions(EObject obj) {
		super.serializeToRegions(obj)
	}
	
	override serializeReplacement(EObject obj, SaveOptions options) {
		super.serializeReplacement(obj, options)
	}
		
}