package org.eclipse.papyrusrt.uml.umltext.ui

import com.google.inject.Inject
import java.io.InputStream
import java.io.StringReader
import java.util.ArrayList
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jface.text.IDocument
import org.eclipse.papyrusrt.uml.umltext.parser.antlr.UMLTextParser
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IFileEditorInput
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider
import org.eclipse.xtext.util.StringInputStream

/*
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class UMLTextUiModule extends AbstractUMLTextUiModule {

}