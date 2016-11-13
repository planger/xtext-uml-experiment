package org.eclipse.papyrusrt.umlrt.ui.editor.model;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class UmlRtTextDocumentProvider extends XtextDocumentProvider {

	/**
	 * <?xml version="1.0" encoding="UTF-8"?>
	 * <uml:Model xmi:version="20131001" xmlns:xmi=
	 * "http://www.omg.org/spec/XMI/20131001" xmlns:uml=
	 * "http://www.eclipse.org/uml2/5.0.0/UML" xmi:id="_-o4zoKOFEeaQnLWMlk4gFQ"
	 * name="Lorenzo"/>
	 **/
	
	/**
	 * Whenever we have to save the document, we actually convert it to its
	 * ecore representation first and then serialize
	 **/
	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException {
		
		/**
		 * Document contiene il testo presente nell'editor. Possiamo dunque
		 * estrarre il testo e parsarlo tramite parser prodotto da xtext. Una
		 * volta ottenuto il parseResult, possiamo trasformare il modello
		 * correntemente conforme al metamodello ecore nell'equivalente conforme
		 * al metamodello UML.
		 **/
		
		// parsing
		// ecore - profile (direttamente su modello uml)
		
		
//		/** Initialize the model **/
//		UmlrtPackage.eINSTANCE.eClass();
//		/** Register the XMI Resource Factory for the .umlrt extension **/
//		Resource.Factory.Registry resourceFactoryRegistry = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> extensionToFactoryMap = resourceFactoryRegistry.getExtensionToFactoryMap();
//		extensionToFactoryMap.put(".uml", new XMIResourceFactoryImpl());
//		/** Obtain a Resource Set **/
//		ResourceSet resourceSet = new ResourceSetImpl();
//		/* Get the Resource */
//		Resource resource = resourceSet.getResource(URI.createURI("/exampleProj/test.umlrttext"), true); 
//		/* Get the first model element and cast it to Profile */
//		Model model = (Model) resource.getContents().get(0);
//
//		/** **/
//		if (document.get().contains("model Lorenzo")) {
//			model.setName("Lorenzo");
//
//			org.eclipse.uml2.uml.Package _package_ = UMLFactory.eINSTANCE.createPackage();
//			_package_.setName("testPackage");
//			_package_.setURI("http://www.test-package.com");
//			model.getPackagedElements().add(_package_);
//
//		} else if (document.get().contains("model SomeoneElse")) {
//			model.setName("NotLorenzo");
//		}
//		/** Save the Resource **/
//		try {
//			resource.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		System.out.println("doSaveDocument(monitor, element, document, overwrite)");
		super.doSaveDocument(monitor, element, document, overwrite);		
	}

	/**
	 * The content of the document consists in the Xtext representation of the
	 * actual model
	 **/
	@Override
	protected boolean setDocumentContent(IDocument document, IEditorInput editorInput, String encoding)
			throws CoreException {

		/**
		 * Per poter inizializzare il contenuto del nostro editor, possiamo
		 * recuperare la risorsa innanzitutto. Una volta ottenuto accesso al
		 * modello, possiamo semplicemente eseguire una M2M dall'originale a
		 * Ecore ed una M2T transformation per generare il codice.
		 **/

//		if (editorInput instanceof FileEditorInput) {
//			FileEditorInput fileEditorInput = (FileEditorInput) editorInput;
//			String fileEditorInputContent = ""; 
//			try {
//				InputStream fileEditorInputStream = fileEditorInput.getFile().getContents();
//				int currentCharacter; 
//				while((currentCharacter = fileEditorInputStream.read()) != -1) {
//					fileEditorInputContent += (char)currentCharacter;
//				}
//				if(!fileEditorInputContent.contentEquals("")) {
//					System.out.println(fileEditorInputContent);
//					if (fileEditorInputContent.contains("Lorenzo")) {
//						document.set("Person { };");
//					} else {
//						document.set("Ciao, io sono un document che non serve assolutamente a nulla.");
//					}
//				}
//			} catch (CoreException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			return true;
//		} else {
//			return super.setDocumentContent(document, editorInput, encoding); 
//		}
		System.out.println("setDocumentContent(document, editorInput, encoding)");
		return super.setDocumentContent(document, editorInput, encoding);
	}

}
