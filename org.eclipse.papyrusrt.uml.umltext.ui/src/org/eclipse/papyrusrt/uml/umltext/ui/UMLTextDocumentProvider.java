package org.eclipse.papyrusrt.uml.umltext.ui;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.IFragmentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class UMLTextDocumentProvider extends XtextDocumentProvider {
	
	@Inject
	private IParser parser;
	
	@Inject
	private ILinker linker;

	@Inject
	private IFragmentProvider fragmentProvider;
	
	@Inject
	@Named(Constants.LANGUAGE_NAME) 
	private String languageName;
	
	@Inject
	private ISerializer serializer;

	@Override
	protected void setupDocument(Object element, IDocument document) {
		// TODO Auto-generated method stub
		super.setupDocument(element, document);
	}

	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		if (element instanceof UMLTextModelEditorInput) {
			// we could set a content here if necessary
			XtextDocument document = createEmptyDocument();
			setDocumentContent(document, (UMLTextModelEditorInput) element);
			return document;
		}
		return super.createDocument(element);
	}

	protected void setDocumentContent(XtextDocument document, UMLTextModelEditorInput editorInput) throws CoreException {
		// TODO initialize with content if exists already?
		setDocumentResource(document, editorInput);
	}

	protected void setDocumentResource(XtextDocument xtextDocument, UMLTextModelEditorInput editorInput)
			throws CoreException {
		XtextResourceWrapper xtextResource = new XtextResourceWrapper(editorInput.getResource());
		xtextResource.setLanguageName(languageName);
		xtextResource.setFragmentProvider(fragmentProvider);
		xtextResource.setLinker(linker);
		xtextResource.setParser(parser);
		xtextResource.setSerializer(serializer);
		xtextResource.initializeResource();
		
		if (editorInput.getResource().getResourceSet() != null) {
			editorInput.getResource().getResourceSet().getResources().add(xtextResource);
		}
		xtextDocument.setInput(xtextResource);
	}

}
