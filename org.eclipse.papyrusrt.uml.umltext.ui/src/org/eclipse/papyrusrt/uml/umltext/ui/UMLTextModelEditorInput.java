package org.eclipse.papyrusrt.uml.umltext.ui;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.uml2.uml.Model;

public class UMLTextModelEditorInput implements IEditorInput {

	private Model model;

	public UMLTextModelEditorInput(Model model) {
		this.model = model;
	}

	public Model getModel() {
		return model;
	}

	public Resource getResource() {
		return model.eResource();
	}

	@Override
	public <T> T getAdapter(Class<T> adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return model.getLabel(true);
	}

	@Override
	public IPersistableElement getPersistable() {
		return new IPersistableElement() {

			@Override
			public void saveState(IMemento memento) {
				// TODO

			}

			@Override
			public String getFactoryId() {
				// TODO
				return "UMLTEXTID";
			}
		};
	}

	@Override
	public String getToolTipText() {
		return "A tooltext of UMLText Editor Input";
	}

}
