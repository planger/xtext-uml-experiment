/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.umlrt.ide.contentassist.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.papyrusrt.umlrt.ide.contentassist.antlr.internal.InternalUmlRtTextParser;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class UmlRtTextTokenSource extends AbstractIndentationTokenSource {

	public UmlRtTextTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalUmlRtTextParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalUmlRtTextParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalUmlRtTextParser.RULE_END;
	}

	@Override
	protected boolean shouldEmitPendingEndTokens() {
		return false;
	}
}
