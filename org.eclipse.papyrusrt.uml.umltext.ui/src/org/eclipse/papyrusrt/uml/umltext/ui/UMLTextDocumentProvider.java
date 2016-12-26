package org.eclipse.papyrusrt.uml.umltext.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.IDocument;
import org.eclipse.uml2.uml.Model;
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
		if (document instanceof UMLTextDocument) {
			SubMonitor subMonitor = SubMonitor.convert(monitor, 2);
			UMLTextDocument umlTextDocument = (UMLTextDocument) document;
			Model umlModel = umlTextDocument.getUmlModel();
			Model xtextModel = umlTextDocument.getXtextModel();
			Resource umlResource = umlModel.eResource();
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlModel);
			if (xtextModel != null && umlResource != null && editingDomain != null) {
				Model newModel = EcoreUtil.copy(xtextModel);
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain, "Text edit") {
					@Override
					protected void doExecute() {
						EcoreUtil.replace(umlModel, newModel);
						umlTextDocument.connectToUmlModel(newModel);
						subMonitor.worked(1);
					}
				});
				//umlTextDocument.getPapyrusEditor().doSave(subMonitor.split(1));
			}
			return;
		}
		super.doSaveDocument(monitor, element, document, overwrite);
	}

}
