package org.eclipse.papyrusrt.uml.umltext.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider

/*
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class UMLTextUiModule extends AbstractUMLTextUiModule {
	
	def Class<? extends XtextDocumentProvider> bindXtextDocumentProvider() {
		UMLTextDocumentProvider
	}
	
	override bindIResourceForEditorInputFactory() {
		ResourceForUMLTextModelEditorInputFactory
	}
	
}