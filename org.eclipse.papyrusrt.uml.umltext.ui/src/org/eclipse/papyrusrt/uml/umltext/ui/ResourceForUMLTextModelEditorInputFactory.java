package org.eclipse.papyrusrt.uml.umltext.ui;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;

public class ResourceForUMLTextModelEditorInputFactory extends ResourceForIEditorInputFactory {
	
	@Override
	public Resource createResource(IEditorInput editorInput) {
		try {
			if (editorInput instanceof UMLTextModelEditorInput) {
				IStorage storage = ((UMLTextModelEditorInput) editorInput).getModelFile();
				Resource result = createResource(storage);
				if (result != null)
					return result;
			}
			if(editorInput instanceof FileEditorInput)
				return createResource(((FileEditorInput) editorInput).getStorage());
		} catch (CoreException e) {
			throw new WrappedException(e);
		}
		throw new IllegalArgumentException("Couldn't create EMF Resource for input " + editorInput);
	}

}
