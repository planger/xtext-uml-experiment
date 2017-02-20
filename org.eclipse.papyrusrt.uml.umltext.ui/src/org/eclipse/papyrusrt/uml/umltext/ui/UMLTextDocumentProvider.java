package org.eclipse.papyrusrt.uml.umltext.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class UMLTextDocumentProvider extends XtextDocumentProvider {

	@Inject
	private ISerializer serializer;

	@Inject
	private Provider<UMLTextDocument> documentProvider;

	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		if (element instanceof UMLTextModelEditorInput) {
			UMLTextDocument document = createEmptyDocument();
			setDocumentContent(document, (UMLTextModelEditorInput) element);
			return document;
		}
		return super.createDocument(element);
	}

	@Override
	protected UMLTextDocument createEmptyDocument() {
		return documentProvider.get();
	}

	protected void setDocumentContent(UMLTextDocument document, UMLTextModelEditorInput editorInput)
			throws CoreException {
		document.set(serializer.serialize(editorInput.getModel()));
		setDocumentResource(document, editorInput, null);
		document.connectToUmlModel(editorInput.getModel());
		document.setPapyrusEditor(editorInput.getPapyrusEditor());
	}

	@Override
	public boolean isReadOnly(Object element) {
		if (element instanceof UMLTextModelEditorInput) {
			UMLTextModelEditorInput editorInput = (UMLTextModelEditorInput) element;
			return editorInput.getModelFile() != null && editorInput.getModelFile().isReadOnly();
		}
		return super.isReadOnly(element);
	}

	@Override
	public boolean isModifiable(Object element) {
		if (element instanceof UMLTextModelEditorInput) {
			UMLTextModelEditorInput editorInput = (UMLTextModelEditorInput) element;
			return !(editorInput.getModelFile() != null && editorInput.getModelFile().isReadOnly());
		}
		return super.isModifiable(element);
	}

	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite)
			throws CoreException {
		super.doSaveDocument(monitor, element, document, overwrite);
	}

}
