package org.eclipse.papyrusrt.uml.umltext.ui;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.resource.XtextResourceSet;

public class WrappedXtextResourceSet extends XtextResourceSet {

	private ResourceSet wrappedResourceSet;

	public WrappedXtextResourceSet(ResourceSet wrappedResourceSet) {
		this.wrappedResourceSet = wrappedResourceSet;
	}
	
	@Override
	protected void initializeDefaultLoadOptions() {
		// don't initialize with XtextPlatformResourceURIHandler (see super.initializeDefaultLoadOptions())
	}

	@Override
	public EList<Adapter> eAdapters() {
		return wrappedResourceSet.eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return wrappedResourceSet.eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		wrappedResourceSet.eSetDeliver(deliver);
	}

	@Override
	public void eNotify(Notification notification) {
		wrappedResourceSet.eNotify(notification);
	}

	@Override
	public EList<Resource> getResources() {
		return wrappedResourceSet.getResources();
	}

	@Override
	public TreeIterator<Notifier> getAllContents() {
		return wrappedResourceSet.getAllContents();
	}

	@Override
	public EList<AdapterFactory> getAdapterFactories() {
		return wrappedResourceSet.getAdapterFactories();
	}

	@Override
	public Map<Object, Object> getLoadOptions() {
		return wrappedResourceSet.getLoadOptions();
	}

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		return wrappedResourceSet.getEObject(uri, loadOnDemand);
	}

	@Override
	public Resource getResource(URI uri, boolean loadOnDemand) {
		return wrappedResourceSet.getResource(uri, loadOnDemand);
	}

	@Override
	public Resource createResource(URI uri) {
		return wrappedResourceSet.createResource(uri);
	}

	@Override
	public Resource createResource(URI uri, String contentType) {
		return wrappedResourceSet.createResource(uri, contentType);
	}

	@Override
	public Registry getResourceFactoryRegistry() {
		return wrappedResourceSet.getResourceFactoryRegistry();
	}

	@Override
	public void setResourceFactoryRegistry(Registry resourceFactoryRegistry) {
		wrappedResourceSet.setResourceFactoryRegistry(resourceFactoryRegistry);
	}

	@Override
	public URIConverter getURIConverter() {
		return wrappedResourceSet.getURIConverter();
	}

	@Override
	public void setURIConverter(URIConverter converter) {
		wrappedResourceSet.setURIConverter(converter);
	}

	@Override
	public org.eclipse.emf.ecore.EPackage.Registry getPackageRegistry() {
		return wrappedResourceSet.getPackageRegistry();
	}

	@Override
	public void setPackageRegistry(org.eclipse.emf.ecore.EPackage.Registry packageRegistry) {
		wrappedResourceSet.setPackageRegistry(packageRegistry);
	}

	public ResourceSet getWrappedResourceSet() {
		return wrappedResourceSet;
	}

}
