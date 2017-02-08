/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrus.uml.marte.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.papyrus.uml.marte.parser.antlr.internal.InternalMarTextParser;
import org.eclipse.papyrus.uml.marte.services.MarTextGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MarTextParser extends AbstractAntlrParser {

	@Inject
	private MarTextGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMarTextParser createParser(XtextTokenStream stream) {
		return new InternalMarTextParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MarTextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MarTextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
