package org.eclipse.papyrusrt.uml.umltext.services.resourceloading;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.uml.tools.model.ExtendedUmlModel;

public class UMLTextUmlModel extends ExtendedUmlModel {
	
	@Override
	public void loadModel(URI uriWithoutExtension) {
		super.loadModel(uriWithoutExtension);
	}
	
	@Override
	public void saveModel() throws IOException {
		super.saveModel();
	}
}
