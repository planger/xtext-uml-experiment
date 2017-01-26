package org.eclipse.papyrusrt.uml.umltext.ui;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * UML2ReducedUML : M2M Transformation
 * 
 * The reference grammar metamodel for output models is the one generated
 * from the grammar in:
 * 		org.eclipse.papyrusrt.uml.umltext.UMLText
 */
@SuppressWarnings("all")
public class UML2ReducedUML {
  public static Model transformModel(final Model _model) {
    Model _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(_model, null));
      if (_notEquals) {
        EList<PackageableElement> _packagedElements = _model.getPackagedElements();
        int _size = _packagedElements.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          EList<PackageableElement> _packagedElements_1 = _model.getPackagedElements();
          final Function1<PackageableElement, Boolean> _function = (PackageableElement packagedElement) -> {
            return Boolean.valueOf((!(packagedElement instanceof org.eclipse.uml2.uml.Package)));
          };
          IterableExtensions.<PackageableElement>dropWhile(_packagedElements_1, _function);
          EList<PackageableElement> _packagedElements_2 = _model.getPackagedElements();
          final Function1<PackageableElement, org.eclipse.uml2.uml.Package> _function_1 = (PackageableElement packagedElement) -> {
            return ((org.eclipse.uml2.uml.Package) packagedElement);
          };
          List<org.eclipse.uml2.uml.Package> _map = ListExtensions.<PackageableElement, org.eclipse.uml2.uml.Package>map(_packagedElements_2, _function_1);
          Iterator<org.eclipse.uml2.uml.Package> _packageIterator = _map.iterator();
          while (_packageIterator.hasNext()) {
            {
              org.eclipse.uml2.uml.Package _currentPackage = _packageIterator.next();
              UML2ReducedUML.transformPackage(_currentPackage);
            }
          }
        }
      }
      _xblockexpression = _model;
    }
    return _xblockexpression;
  }
  
  public static org.eclipse.uml2.uml.Package transformPackage(final org.eclipse.uml2.uml.Package _package) {
    org.eclipse.uml2.uml.Package _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(_package, null));
      if (_notEquals) {
        EList<PackageableElement> _packagedElements = _package.getPackagedElements();
        int _size = _packagedElements.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          EList<PackageableElement> _packagedElements_1 = _package.getPackagedElements();
          final Function1<PackageableElement, Boolean> _function = (PackageableElement packagedElement) -> {
            return Boolean.valueOf((!(packagedElement instanceof org.eclipse.uml2.uml.Class)));
          };
          IterableExtensions.<PackageableElement>dropWhile(_packagedElements_1, _function);
          EList<PackageableElement> _packagedElements_2 = _package.getPackagedElements();
          final Function1<PackageableElement, org.eclipse.uml2.uml.Class> _function_1 = (PackageableElement packagedElement) -> {
            return ((org.eclipse.uml2.uml.Class) packagedElement);
          };
          List<org.eclipse.uml2.uml.Class> _map = ListExtensions.<PackageableElement, org.eclipse.uml2.uml.Class>map(_packagedElements_2, _function_1);
          Iterator<org.eclipse.uml2.uml.Class> _classIterator = _map.iterator();
          ArrayList<org.eclipse.uml2.uml.Class> _reducedClasses = new ArrayList<org.eclipse.uml2.uml.Class>();
          while (_classIterator.hasNext()) {
            {
              org.eclipse.uml2.uml.Class _currentClass = _classIterator.next();
              org.eclipse.uml2.uml.Class _reducedClass = UML2ReducedUML.transformClass(_currentClass);
              _reducedClasses.add(_reducedClass);
              _classIterator.remove();
            }
          }
          EList<PackageableElement> _packagedElements_3 = _package.getPackagedElements();
          _packagedElements_3.addAll(_reducedClasses);
        }
      }
      _xblockexpression = _package;
    }
    return _xblockexpression;
  }
  
  public static org.eclipse.uml2.uml.Class transformClass(final org.eclipse.uml2.uml.Class _class) {
    org.eclipse.uml2.uml.Class _xblockexpression = null;
    {
      org.eclipse.uml2.uml.Class _newClass = UMLFactory.eINSTANCE.createClass();
      boolean _notEquals = (!Objects.equal(_class, null));
      if (_notEquals) {
        if (((!Objects.equal(_class.getName(), null)) && (_class.getName().length() > 0))) {
          String _name = _class.getName();
          _newClass.setName(_name);
        } else {
          _newClass.setName("DEFAULT_NAME");
        }
      }
      _xblockexpression = _newClass;
    }
    return _xblockexpression;
  }
}
