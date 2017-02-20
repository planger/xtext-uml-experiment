package org.eclipse.papyrusrt.uml.umltext.services.resourceloading;

import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.services.resourceloading.OnDemandLoadingModelSetServiceFactory;

public class UMLTextOnDemandLoadingModelSetServiceFactory extends OnDemandLoadingModelSetServiceFactory {

	@Override
	protected ModelSet createModelSet() {
		return new UMLTextOnDemandLoadingModelSet();
	}

}
