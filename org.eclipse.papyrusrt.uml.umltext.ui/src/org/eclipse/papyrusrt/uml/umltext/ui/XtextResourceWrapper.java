package org.eclipse.papyrusrt.uml.umltext.ui;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;

// TODO better have two resources that synchronize?

public class XtextResourceWrapper extends XtextResource {

	private WrappedXtextResourceSet xTextResourceSet;
	private Resource wrappedResource;

	public XtextResourceWrapper(Resource wrappedResource) {
		this.wrappedResource = wrappedResource;
		this.xTextResourceSet = new WrappedXtextResourceSet(wrappedResource.getResourceSet());
	}

	public void initializeResource() {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(getWrappedResourceSet());
		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				StringReader reader = new StringReader(getSerializer().serialize(getContents().get(0)));
				IParseResult result = getParser().parse(reader);
				updateInternalState(result);
			}
		});
	}
	
	@Override
	protected void doLinking() {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(getWrappedResourceSet());
		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				XtextResourceWrapper.super.doLinking();
			}
		});
	}

	@Override
	protected void clearInternalState() {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(getWrappedResourceSet());
		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				XtextResourceWrapper.super.clearInternalState();
			}
		});
	}
	
	@Override
	public String getEncoding() {
		return "UTF-8";
	}

	protected ResourceSet getWrappedResourceSet() {
		return xTextResourceSet.getWrappedResourceSet();
	}

	@Override
	protected void reattachModificationTracker(EObject element) {
		// don't attach modification tracker
	}

	@Override
	public ResourceSet getResourceSet() {
		return xTextResourceSet;
	}

	@Override
	public EList<Adapter> eAdapters() {
		return wrappedResource.eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return wrappedResource.eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		wrappedResource.eSetDeliver(deliver);
	}

	@Override
	public void eNotify(Notification notification) {
		wrappedResource.eNotify(notification);
	}

	@Override
	public URI getURI() {
		return wrappedResource.getURI();
	}

	@Override
	public void setURI(URI uri) {
		wrappedResource.setURI(uri);
	}

	@Override
	public long getTimeStamp() {
		return wrappedResource.getTimeStamp();
	}

	@Override
	public void setTimeStamp(long timeStamp) {
		wrappedResource.setTimeStamp(timeStamp);
	}

	@Override
	public EList<EObject> getContents() {
		return wrappedResource.getContents();
	}

	@Override
	public TreeIterator<EObject> getAllContents() {
		return super.getAllContents();
	}

	@Override
	public String getURIFragment(EObject eObject) {
		return wrappedResource.getURIFragment(eObject);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		return wrappedResource.getEObject(uriFragment);
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		wrappedResource.save(options);
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		wrappedResource.load(options);
	}

	@Override
	public boolean isTrackingModification() {
		return wrappedResource.isTrackingModification();
	}

	@Override
	public void setTrackingModification(boolean isTrackingModification) {
		wrappedResource.setTrackingModification(isTrackingModification);
	}

	@Override
	public boolean isModified() {
		return wrappedResource.isModified();
	}

	@Override
	public void setModified(boolean isModified) {
		wrappedResource.setModified(isModified);
	}

	@Override
	public boolean isLoaded() {
		return wrappedResource.isLoaded();
	}

	@Override
	public void delete(Map<?, ?> options) throws IOException {
		wrappedResource.delete(options);
	}

	@Override
	public EList<Diagnostic> getErrors() {
		return wrappedResource.getErrors();
	}

	@Override
	public EList<Diagnostic> getWarnings() {
		return wrappedResource.getWarnings();
	}

}
