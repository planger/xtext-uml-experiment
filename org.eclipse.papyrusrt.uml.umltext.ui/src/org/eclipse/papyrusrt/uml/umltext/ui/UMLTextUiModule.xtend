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

	/*
	 * Bind our UMLText document provider using dependency injection 
	 */
	def java.lang.Class<? extends XtextDocumentProvider> bindXtextDocumentProvider() {
		UMLTextDocumentProvider
	}

}

/* 
 * UMLText Document Provider
 * It manages the text editor lifecycle (from the document creation starting from a resource to its storage) 
 */
class UMLTextDocumentProvider extends XtextDocumentProvider {
	
	/* 
	 * UMLText Parser (automatically bound by Xtext through dependency injection)
	 * 	This parser is user to obtain the model corresponding to the current
	 * 	textual content of the editor as part of its translation to UML. 
	 */
	@Inject
	UMLTextParser parser

	/*
	 * Set Document from InputStream
	 *  This method inserts the textual content corresponding to the processed
	 * 	UML model resource into the editor. In particular, it simply applies
	 *  a model-to-text transformation to the current UML model resource and
	 * 	propagates the result to the ordinary XtextDocumentProvider.setDocumentContent
	 * 	method. This will then manage to insert the textual representation into the
	 *  editor. 
	 * 
	 * 	[Note] 
	 * 	I suppose to receive the editorInput URI inside the document from the
	 * 	setDocumentContent(IDocument, IEditorInput, String) method below.
	 * 			 
	 */
	override protected setDocumentContent(IDocument document, InputStream contentStream, String encoding) throws CoreException {
			
			println("UMLTextDocumentProvider.setDocumentContent(IDocument document, InputStream contentStream, String encoding)")
			
			/*
			 * Retrieve UML Model Resource
			 */
			var localResourceSet = new ResourceSetImpl
			localResourceSet.packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE)
			localResourceSet.resourceFactoryRegistry.extensionToFactoryMap.put(UMLResource.FILE_EXTENSION,	UMLResource.Factory.INSTANCE)
			var umlResource = localResourceSet.getResource(URI.createURI("platform:/resource/" + document.get), true) as UMLResource

			/* 
			 * Run UML2UMLText Transformation : M2T
			 * Note : This will generate the textual model corresponding to our current UML Model Resource.
			 * 		  In case of UML Profiles, we would first need to run a M2M transformation to cope with 
			 * 		  stereotyped UML elements. We are just applying a reduction transformation at the moment
			 * 		  in order to filter out those elements not covered by the grammar.
			 */
			var documentContent = UML2UMLText.generateModel(UML2ReducedUML.transformModel(umlResource.contents.get(0) as Model) as Model).toString

			/* 
			 * Delegate the actual content insert to superclass 
			 * (note that we changed the inputStream)
			 */
			super.setDocumentContent(document, new StringInputStream(documentContent), encoding)

		}
		
		/* 
		 * Set Document from IEditorInput
		 * 	We only use this method to pass the resource URI to the one above, which will actually perform the document content insertion.
		 *  The resource URI will be passed through document, which is supposed to be empty and filled up with the content. 
		 * 	Therefore, passing data using it should not be a problem in this context.   
		 */
		override protected setDocumentContent(IDocument document, IEditorInput editorInput,	String encoding) throws CoreException {
			
			/** Insert editorInput resource URI if it an IFileEditorInput instance **/
			if (editorInput instanceof IFileEditorInput) {
				document.set((editorInput as IFileEditorInput).file.fullPath.toString)
			}
			
			/** Delegate to superclass method **/
			super.setDocumentContent(document, editorInput, encoding)
			
		}

		/*
		 * Do Save Document
		 * 	It takes the current content of the editor, transforms it to the corresponding UML model and invoke
		 * 	its save as UML Resource.
		 */
		override protected doSaveDocument(IProgressMonitor monitor, Object element, IDocument document,	boolean overwrite) throws CoreException {
			if (element instanceof IFileEditorInput) {

				/*
				 * Retrieve FileEditorInput file
				 */
				var file = (element as IFileEditorInput).file

				/*
				 * Retrieve UML Model Resource 
				 */
				var localResourceSet = new ResourceSetImpl
				localResourceSet.packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE)
				localResourceSet.resourceFactoryRegistry.extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE)
				var resource = localResourceSet.getResource(URI.createURI("platform:/resource/" + file.fullPath.toString), true)

				/*
				 * Clear Resource content
				 * 	At the moment, we are not managing to update the current content but rather
				 * 	resetting and re-creating from scratch each time.
				 */
				resource.contents.clear
				resource.allContents.dropWhile[batman|true]

				/* 
				 * Parse document content and transform the resulting model to UML (UMLText2UML)
				 * 	We do not need further transformations as our grammar
				 *	currently produces UML models. However, we would need 
				 * 	to run a M2M transformation from the parsed model to UML
				 * 	whenever using grammars describing UML Profiles. The produced
				 * 	parse tree would indeed contain Ecore elements, i.e. instances
				 * 	of those metaclasses that we have defined in order to manage
				 * 	stereotyped UML elements. 
				 * 
				 *	In this example, we can use a transformation only processing those
				 * 	model elements covered in the grammar, i.e. Models, Packages or Classes.
				 */
				resource.contents.add(UML2ReducedUML.transformModel(parser.parse(new StringReader(document.get)).rootASTElement as Model))
				 
				/*
				 * Save UML Resource
				 */
				resource.save(null)
				
			} else {
				
				/*
				 * Delegate to superclass if element is not a FileEditorInput instance
				 */
				super.doSaveDocument(monitor, element, document, overwrite)
			}
		}

	}

	/*
	 * UML2UMLText : M2T Transformation
	 * 
	 * The reference grammar for output models can be found in:
	 * 		org.eclipse.papyrusrt.uml.umltext.UMLText
	 */
	class UML2UMLText {

		/* 
		 * Transform Model 
		 * UML : Model 
		 * UMLText : rule Model 
		 */
		def static generateModel(Model _model) {
			'''
				model «IF _model.name != null && _model.name.length > 0»«_model.name»«ELSE»DEFAULT_NAME«ENDIF» {
					«FOR _package : _model.packagedElements
				.filter(_packagedElement | _packagedElement instanceof Package)
				.map[it | it as Package]»
						«generatePackage(_package)»
					«ENDFOR»			
				}
			'''
		}

		/*
		 * Transform Package 
		 * UML : Package
		 * UMLText : rule Package 
		 */
		def static generatePackage(
			Package _package) {
			'''
				package «IF _package.name != null && _package.name.length > 0»«_package.name»«ELSE»DEFAULT_NAME«ENDIF» {
					«FOR _class : _package.packagedElements
				.filter(_packagedElement | _packagedElement instanceof Class)
				.map[it|it as Class]»
						«generateClass(_class)»
					«ENDFOR»
				}
			'''
		}

		/* 
		 * Transform Class
		 * UML : Class
		 * UMLText : rule Class 
		 */
		def static generateClass(Class _class) {
			'''
				class «IF _class.name != null && _class.name.length > 0»«_class.name»«ELSE»DEFAULT_NAMEs«ENDIF»; 		
			'''
		}

	}

	/* 
	 * UML2ReducedUML : M2M Transformation
	 * 
	 * The reference grammar metamodel for output models is the one generated
	 * from the grammar in:
	 * 		org.eclipse.papyrusrt.uml.umltext.UMLText
	 * 
	 */
	class UML2ReducedUML {

		def static transformModel(Model _model) {
			if (_model != null) {
				if (_model.packagedElements.size > 0) {
					_model.packagedElements.dropWhile [ packagedElement | !(packagedElement instanceof Package)]
					var _packageIterator = _model.packagedElements.map [ packagedElement | packagedElement as Package].iterator
					while (_packageIterator.hasNext) {
						var _currentPackage = _packageIterator.next
						transformPackage(_currentPackage)
					}
				}
			}
			_model
		}

		def static transformPackage(Package _package) {
			if (_package != null) {
				if (_package.packagedElements.size > 0) {
					_package.packagedElements.dropWhile [ packagedElement | !(packagedElement instanceof Class)]
					var _classIterator = _package.packagedElements.map [ packagedElement | packagedElement as Class].iterator
					var _reducedClasses = new ArrayList<Class>
					while (_classIterator.hasNext) {
						var _currentClass = _classIterator.next
						var _reducedClass = transformClass(_currentClass)
						_reducedClasses.add(_reducedClass)
						_classIterator.remove
					}
					_package.packagedElements.addAll(_reducedClasses)
				}
			}
			_package
		}

		def static transformClass(Class _class) {
			var _newClass = UMLFactory.eINSTANCE.createClass()
			if (_class != null) {
				if (_class.name != null && _class.name.length > 0) {
					_newClass.name = _class.name	
				} else {
					_newClass.name = "DEFAULT_NAME"
				}
			}
			_newClass
		}

	}
	