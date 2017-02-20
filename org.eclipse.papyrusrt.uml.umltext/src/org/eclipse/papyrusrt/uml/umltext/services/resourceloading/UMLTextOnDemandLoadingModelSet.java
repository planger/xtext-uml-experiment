package org.eclipse.papyrusrt.uml.umltext.services.resourceloading;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.services.resourceloading.OnDemandLoadingModelSet;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrusrt.uml.umltext.UMLTextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceFactory;

import com.google.inject.Injector;

public class UMLTextOnDemandLoadingModelSet extends OnDemandLoadingModelSet {
	
	@Override
	public Resource createResource(URI uri, String contentType) {
		if(uri.fileExtension().contentEquals(UmlModel.UML_FILE_EXTENSION)) {
			Injector injector = new UMLTextStandaloneSetup().createInjector();
			XtextResourceFactory factory = injector.getInstance(XtextResourceFactory.class);
			Resource resource = factory.createResource(uri);
			getResources().add(resource);
			return setResourceOptions(resource);
		}
		return super.createResource(uri, contentType);
	}
	
	@Override
	public Resource getResource(URI uri, boolean loadOnDemand) throws WrappedException {
		return super.getResource(uri, loadOnDemand);
	}
	
}
