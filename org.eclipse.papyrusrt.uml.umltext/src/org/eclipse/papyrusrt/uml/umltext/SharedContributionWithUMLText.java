package org.eclipse.papyrusrt.uml.umltext;

import org.eclipse.papyrusrt.uml.umltext.services.resourceloading.ProjectResourceSetInitializer;
import org.eclipse.xtext.ui.resource.IResourceSetInitializer;

import com.google.inject.Binder;
import com.google.inject.Module;

public class SharedContributionWithUMLText implements Module {

	@Override
	public void configure(Binder binder) {
		binder.bind(IResourceSetInitializer.class).to(ProjectResourceSetInitializer.class);
	}

}
