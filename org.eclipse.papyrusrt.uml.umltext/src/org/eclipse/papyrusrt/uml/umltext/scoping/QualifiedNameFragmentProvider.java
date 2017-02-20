package org.eclipse.papyrusrt.uml.umltext.scoping;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IFragmentProvider;

import com.google.inject.Inject;

public class QualifiedNameFragmentProvider implements IFragmentProvider {

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Override
	public String getFragment(EObject obj, Fallback fallback) {
		QualifiedName qName = qualifiedNameProvider.getFullyQualifiedName(obj);
		return qName != null ? qName.toString() : fallback.getFragment(obj);
	}

	@Override
	public EObject getEObject(Resource resource, String fragment, Fallback fallback) {
		// TODO: Navigate more efficiently by splitting the fragment
		if (fragment != null) {
			Iterator<EObject> i = EcoreUtil.getAllContents(resource, false);
			while (i.hasNext()) {
				EObject eObject = i.next();
				String candidateFragment = (eObject.eIsProxy()) ? ((InternalEObject) eObject).eProxyURI().fragment()
						: getFragment(eObject, fallback);
				if (fragment.equals(candidateFragment))
					return eObject;
			}
		}
		return fallback.getEObject(fragment);
	}
}