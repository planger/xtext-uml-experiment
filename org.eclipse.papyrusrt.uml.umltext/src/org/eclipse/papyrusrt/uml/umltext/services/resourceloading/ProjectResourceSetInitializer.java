package org.eclipse.papyrusrt.uml.umltext.services.resourceloading;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetInitializer;

public class ProjectResourceSetInitializer implements IResourceSetInitializer {

	@Override
	public void initialize(ResourceSet resourceSet, IProject project) {		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLTextResourceFactory());
	}

}
