package org.eclipse.papyrusrt.uml.umltext.services.resourceloading;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrusrt.uml.umltext.UMLTextStandaloneSetup;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResourceFactory;

import com.google.inject.Injector;

public class UMLTextResourceSet extends SynchronizedXtextResourceSet {

	@Override
	public Resource createResource(URI uri, String contentType) {
		try {
			return super.createResource(uri, contentType);
		} catch(Exception e) {
			Injector injector = new UMLTextStandaloneSetup().createInjector();
			XtextResourceFactory factory = injector.getInstance(XtextResourceFactory.class);
			Resource resource = factory.createResource(uri);
			getResources().add(resource);
			return resource;
		}
	}
}
