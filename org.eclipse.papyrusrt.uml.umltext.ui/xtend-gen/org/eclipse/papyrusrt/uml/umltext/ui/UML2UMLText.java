package org.eclipse.papyrusrt.uml.umltext.ui;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * UML2UMLText : M2T Transformation
 * 
 * The reference grammar for output models can be found in:
 * 		org.eclipse.papyrusrt.uml.umltext.UMLText
 */
@SuppressWarnings("all")
public class UML2UMLText {
  /**
   * Transform Model
   * UML : Model
   * UMLText : rule Model
   */
  public static CharSequence generateModel(final Model _model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model ");
    {
      if (((!Objects.equal(_model.getName(), null)) && (_model.getName().length() > 0))) {
        String _name = _model.getName();
        _builder.append(_name, "");
      } else {
        _builder.append("DEFAULT_NAME");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<PackageableElement> _packagedElements = _model.getPackagedElements();
      final Function1<PackageableElement, Boolean> _function = (PackageableElement _packagedElement) -> {
        return Boolean.valueOf((_packagedElement instanceof org.eclipse.uml2.uml.Package));
      };
      Iterable<PackageableElement> _filter = IterableExtensions.<PackageableElement>filter(_packagedElements, _function);
      final Function1<PackageableElement, org.eclipse.uml2.uml.Package> _function_1 = (PackageableElement it) -> {
        return ((org.eclipse.uml2.uml.Package) it);
      };
      Iterable<org.eclipse.uml2.uml.Package> _map = IterableExtensions.<PackageableElement, org.eclipse.uml2.uml.Package>map(_filter, _function_1);
      for(final org.eclipse.uml2.uml.Package _package : _map) {
        _builder.append("\t");
        CharSequence _generatePackage = UML2UMLText.generatePackage(_package);
        _builder.append(_generatePackage, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Transform Package
   * UML : Package
   * UMLText : rule Package
   */
  public static CharSequence generatePackage(final org.eclipse.uml2.uml.Package _package) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    {
      if (((!Objects.equal(_package.getName(), null)) && (_package.getName().length() > 0))) {
        String _name = _package.getName();
        _builder.append(_name, "");
      } else {
        _builder.append("DEFAULT_NAME");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<PackageableElement> _packagedElements = _package.getPackagedElements();
      final Function1<PackageableElement, Boolean> _function = (PackageableElement _packagedElement) -> {
        return Boolean.valueOf((_packagedElement instanceof org.eclipse.uml2.uml.Class));
      };
      Iterable<PackageableElement> _filter = IterableExtensions.<PackageableElement>filter(_packagedElements, _function);
      final Function1<PackageableElement, org.eclipse.uml2.uml.Class> _function_1 = (PackageableElement it) -> {
        return ((org.eclipse.uml2.uml.Class) it);
      };
      Iterable<org.eclipse.uml2.uml.Class> _map = IterableExtensions.<PackageableElement, org.eclipse.uml2.uml.Class>map(_filter, _function_1);
      for(final org.eclipse.uml2.uml.Class _class : _map) {
        _builder.append("\t");
        CharSequence _generateClass = UML2UMLText.generateClass(_class);
        _builder.append(_generateClass, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Transform Class
   * UML : Class
   * UMLText : rule Class
   */
  public static CharSequence generateClass(final org.eclipse.uml2.uml.Class _class) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    {
      if (((!Objects.equal(_class.getName(), null)) && (_class.getName().length() > 0))) {
        String _name = _class.getName();
        _builder.append(_name, "");
      } else {
        _builder.append("DEFAULT_NAMEs");
      }
    }
    _builder.append("; \t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
