package org.eclipse.papyrusrt.uml.umltext.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;

public class OpenInUMLTextEditorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Object selectedElement = HandlerUtil.getCurrentStructuredSelection(event).getFirstElement();
		if (selectedElement instanceof IAdaptable) {
			EObject selectedEObject = (EObject) ((IAdaptable) selectedElement).getAdapter(EObject.class);
			if (selectedEObject instanceof Element) {
				Element selectedUmlElement = (Element) selectedEObject;
				Model model = selectedUmlElement.getModel();
				IEditorPart papyrusEditor = HandlerUtil.getActiveEditor(event);
				UMLTextModelEditorInput editorInput = new UMLTextModelEditorInput(model, papyrusEditor);
				try {
					HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().openEditor(editorInput,
							UMLTextEditor.EDITOR_ID, true);
				} catch (PartInitException e) {
					// TODO handle error
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}
