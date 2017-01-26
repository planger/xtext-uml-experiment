package org.eclipse.papyrusrt.uml.umltext.ui;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * ReducedUML2UML : M2M Transformation
 * 
 * The reference grammar metamodel for input models is the one generated
 * from the grammar in:
 * 		org.eclipse.papyrusrt.uml.umltext.UMLText
 */
@SuppressWarnings("all")
public class ReducedUML2UML {
  protected static Element _transform(final Model _model) {
    Model _xblockexpression = null;
    {
      EList<PackageableElement> _packagedElements = _model.getPackagedElements();
      for (final PackageableElement _packagedElement : _packagedElements) {
        ReducedUML2UML.transform(_packagedElement);
      }
      _xblockexpression = ((Model) _model);
    }
    return _xblockexpression;
  }
  
  protected static Element _transform(final org.eclipse.uml2.uml.Package _package) {
    org.eclipse.uml2.uml.Package _xblockexpression = null;
    {
      EList<PackageableElement> _packagedElements = _package.getPackagedElements();
      for (final PackageableElement _packagedElement : _packagedElements) {
        ReducedUML2UML.transform(_packagedElement);
      }
      _xblockexpression = ((org.eclipse.uml2.uml.Package) _package);
    }
    return _xblockexpression;
  }
  
  protected static Element _transform(final org.eclipse.uml2.uml.Class _class) {
    return ((org.eclipse.uml2.uml.Class) _class);
  }
  
  protected static Element _transform(final Element _object) {
    return ((Element) _object);
  }
  
  public static Element transform(final Element _class) {
    if (_class instanceof org.eclipse.uml2.uml.Class) {
      return _transform((org.eclipse.uml2.uml.Class)_class);
    } else if (_class instanceof Model) {
      return _transform((Model)_class);
    } else if (_class instanceof org.eclipse.uml2.uml.Package) {
      return _transform((org.eclipse.uml2.uml.Package)_class);
    } else if (_class != null) {
      return _transform(_class);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(_class).toString());
    }
  }
}
