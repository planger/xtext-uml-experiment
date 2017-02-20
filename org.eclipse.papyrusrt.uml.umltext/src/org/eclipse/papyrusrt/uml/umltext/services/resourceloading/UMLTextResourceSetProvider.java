package org.eclipse.papyrusrt.uml.umltext.services.resourceloading;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.refactoring.impl.RefactoringResourceSetProvider;

@SuppressWarnings("restriction")
public class UMLTextResourceSetProvider extends RefactoringResourceSetProvider {

	@Override
	public ResourceSet get(IProject project) {
		return super.get(project);
	}
}
