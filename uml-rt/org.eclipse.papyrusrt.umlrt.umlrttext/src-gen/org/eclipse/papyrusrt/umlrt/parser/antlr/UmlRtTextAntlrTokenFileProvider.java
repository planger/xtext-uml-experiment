/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.umlrt.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UmlRtTextAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/eclipse/papyrusrt/umlrt/parser/antlr/internal/InternalUmlRtText.tokens");
	}
}