/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.umlrt.ui.tests;

import com.google.inject.Injector;
import org.eclipse.papyrusrt.umlrt.umlrttext.ui.internal.UmlrttextActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class UmlRtTextUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UmlrttextActivator.getInstance().getInjector("org.eclipse.papyrusrt.umlrt.UmlRtText");
	}

}
