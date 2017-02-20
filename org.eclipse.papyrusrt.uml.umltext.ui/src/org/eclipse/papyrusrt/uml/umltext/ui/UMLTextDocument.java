package org.eclipse.papyrusrt.uml.umltext.ui;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.Model;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.model.DocumentTokenSource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer;

import com.google.inject.Inject;

public class UMLTextDocument extends XtextDocument implements ResourceSetListener {

	private Model umlModel;

	private XtextResource xtextResource;

	private IEditorPart papyrusEditor;

	@Inject
	private ISerializer serializer;

	@Inject
	public UMLTextDocument(DocumentTokenSource tokenSource, ITextEditComposer composer) {
		super(tokenSource, composer);
	}

	@Override
	public void setInput(XtextResource resource) {
		this.xtextResource = resource;
		super.setInput(resource);
	}

	public void connectToUmlModel(Model model) {
		detachFromEditingDomain();
		this.umlModel = model;
		attachToEditingDomain();
	}

	protected void attachToEditingDomain() {
		if (getEditingDomain() != null) {
			getEditingDomain().addResourceSetListener(this);
		}
	}

	protected void detachFromEditingDomain() {
		if (getEditingDomain() != null) {
			getEditingDomain().removeResourceSetListener(this);
		}
	}

	protected TransactionalEditingDomain getEditingDomain() {
		if (xtextResource == null) {
			return null;
		}
		return TransactionUtil.getEditingDomain(xtextResource);
	}

	public void setPapyrusEditor(IEditorPart papyrusEditor) {
		this.papyrusEditor = papyrusEditor;
	}

	public Model getUmlModel() {
		return umlModel;
	}

	public Model getXtextModel() {
		if (!xtextResource.getContents().isEmpty() && xtextResource.getContents().get(0) instanceof Model) {
			return (Model) xtextResource.getContents().get(0);
		}
		return null;
	}

	public IEditorPart getPapyrusEditor() {
		return papyrusEditor;
	}

	public void setContentFromInput() {
		this.set(serializer.serialize(getUmlModel()));
	}

	@Override
	public void disposeInput() {
		TransactionalEditingDomain editingDomain = getEditingDomain();
		if(editingDomain != null)
			editingDomain.removeResourceSetListener(this);
		super.disposeInput();
	}

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		for (Resource resource : event.getEditingDomain().getResourceSet().getResources()) {
			if (umlModel.eResource() != null && umlModel.eResource().getURI().equals(resource.getURI())) {
				umlModel = (Model) resource.getContents().get(0);
			}
		}
		this.setContentFromInput();
	}

	@Override
	public NotificationFilter getFilter() {
		return NotificationFilter.ANY;
	}

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		return null;
	}

	@Override
	public boolean isAggregatePrecommitListener() {
		return false;
	}

	@Override
	public boolean isPrecommitOnly() {
		return false;
	}

	@Override
	public boolean isPostcommitOnly() {
		return true;
	}

}
