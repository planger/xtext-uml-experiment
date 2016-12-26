package org.eclipse.papyrusrt.uml.umltext.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.uml2.uml.Model;

public class UMLTextModelEditorInput implements IEditorInput {

	private Model model;
	private IEditorPart papyrusEditor;

	public UMLTextModelEditorInput(Model model, IEditorPart papyrusEditor) {
		this.model = model;
		this.papyrusEditor = papyrusEditor;
	}

	public Model getModel() {
		return model;
	}

	public Resource getResource() {
		return model.eResource();
	}

	public IFile getModelFile() {
		if (getResource() != null) {
			URI uri = getResource().getURI();
			uri = getResource().getResourceSet().getURIConverter().normalize(uri);
			String scheme = uri.scheme();
			if ("platform".equals(scheme) && uri.segmentCount() > 1 && "resource".equals(uri.segment(0))) {
				StringBuffer platformResourcePath = new StringBuffer();
				for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
					platformResourcePath.append('/');
					platformResourcePath.append(uri.segment(j));
				}
				return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformResourcePath.toString()));
			}
		}
		return null;
	}
	
	public IEditorPart getPapyrusEditor() {
		return papyrusEditor;
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
