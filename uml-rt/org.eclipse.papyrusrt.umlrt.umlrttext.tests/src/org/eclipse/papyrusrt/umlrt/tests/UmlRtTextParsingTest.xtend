package org.eclipse.papyrusrt.umlrt.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(UmlRtTextInjectorProvider)
class UmlRtTextParsingTest{
	
	@Before
	def void initializePluginRegistry() {
		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/5.0.0/UML", UMLPackage.eINSTANCE)
	}

	@Inject
	ParseHelper<Model> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			protocol test {}
		''')
		
		assertThat(result, isA(Package))
		
		var model = result as Model
		val packagedElement = model.packagedElements.get(0)
		assertThat(packagedElement, instanceOf(Package))
		
		val umlPackage = packagedElement as Package
		assertThat(umlPackage.name, equalTo("test"))
	}

}
