/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.uml.umltext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.papyrusrt.uml.umltext.ui.internal.UmltextActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class UMLTextUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UmltextActivator.getInstance().getInjector("org.eclipse.papyrusrt.uml.umltext.UMLText");
	}

}
