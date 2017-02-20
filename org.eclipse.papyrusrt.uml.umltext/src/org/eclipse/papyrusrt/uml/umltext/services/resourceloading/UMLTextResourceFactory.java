package org.eclipse.papyrusrt.uml.umltext.services.resourceloading;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrusrt.uml.umltext.UMLTextStandaloneSetup;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class UMLTextResourceFactory extends UMLResourceFactoryImpl implements IResourceFactory {

	@Override
	public Resource createResource(URI uri) {
		if(uri.fileExtension().contentEquals(UmlModel.UML_FILE_EXTENSION)) {
			Injector injector = new UMLTextStandaloneSetup().createInjector();
			XtextResourceFactory factory = injector.getInstance(XtextResourceFactory.class);
			Resource resource = factory.createResource(uri);
			if(!isXMI(resource)) {
				return resource;
			}
		}
		return super.createResource(uri);
	}

	protected boolean isXMI(Resource resource) {
		try {
			resource.load(null);
			EList<Diagnostic> errors = resource.getErrors();
			return !errors.isEmpty() && isXMISyntaxError(errors.get(0));
		} catch (IOException e) {
		}
		return true;
	}
	
	protected boolean isXMISyntaxError(Diagnostic diagnostic) {
		return diagnostic instanceof XtextSyntaxDiagnostic && diagnostic.getLine() == 1 && diagnostic.getMessage().startsWith("mismatched input '<' expecting");
	}
}
