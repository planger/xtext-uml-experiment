/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.umlrt.ui;

import com.google.inject.Injector;
import org.eclipse.papyrusrt.umlrt.umlrttext.ui.internal.UmlrttextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UmlRtTextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return UmlrttextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return UmlrttextActivator.getInstance().getInjector(UmlrttextActivator.ORG_ECLIPSE_PAPYRUSRT_UMLRT_UMLRTTEXT);
	}
	
}
