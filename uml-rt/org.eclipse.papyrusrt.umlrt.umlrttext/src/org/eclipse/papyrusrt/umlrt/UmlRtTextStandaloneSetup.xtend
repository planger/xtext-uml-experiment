package org.eclipse.papyrusrt.umlrt

class UmlRtTextStandaloneSetup extends UmlRtTextStandaloneSetupGenerated {

	def static void doSetup() {
		new UmlRtTextStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
}
