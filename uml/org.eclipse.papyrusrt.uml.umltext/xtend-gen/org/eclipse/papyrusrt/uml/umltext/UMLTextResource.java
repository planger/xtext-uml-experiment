/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.uml.umltext;

import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

/**
 * UMLTextResource
 * 	Creating an Xtext grammar using 'uml' as file extension will cause
 *  the default resource factory to be overwritten. The UML editor will
 *  therefore stop using ordinary UMLResources.
 * 
 *  In order to prevent this, we define our XtextResource extension that
 * 	just binds back the UMLResource Factory with the 'uml' extension.
 */
@SuppressWarnings("all")
public class UMLTextResource extends LazyLinkingResource {
  public UMLTextResource() {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
  }
}