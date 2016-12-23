/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.uml.umltext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.papyrusrt.uml.umltext.parser.antlr.internal.InternalUMLTextParser;
import org.eclipse.papyrusrt.uml.umltext.services.UMLTextGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class UMLTextParser extends AbstractAntlrParser {

	@Inject
	private UMLTextGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUMLTextParser createParser(XtextTokenStream stream) {
		return new InternalUMLTextParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public UMLTextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UMLTextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}