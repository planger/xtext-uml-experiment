/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.uml.umltext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUMLTextValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/uml2/5.0.0/UML"));
		return result;
	}
	
}
