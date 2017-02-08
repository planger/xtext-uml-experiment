package org.eclipse.papyrus.uml.marte.ui.trasformations;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * UML2MarText
 * Given a UML model, it generates its textual representation
 * conforming to the MarText.ecore meta-model
 */
@SuppressWarnings("all")
public class UML2MarText {
  /**
   * [RULE] Model
   */
  protected static CharSequence _transform(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model ");
    String _legalName = UML2MarText.getLegalName(model);
    _builder.append(_legalName, "");
    _builder.append(" ");
    {
      boolean _hasOwnedComponents = UML2MarText.hasOwnedComponents(model);
      if (_hasOwnedComponents) {
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        {
          Iterable<Component> _ownedComponents = UML2MarText.getOwnedComponents(model);
          for(final Component component : _ownedComponents) {
            _builder.append("\t");
            CharSequence _transform = UML2MarText.transform(component);
            _builder.append(_transform, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * [RULE] Component
   */
  protected static CharSequence _transform(final Component component) {
    CharSequence _xifexpression = null;
    boolean _isHwProcessor = UML2MarText.isHwProcessor(component);
    if (_isHwProcessor) {
      CharSequence _xblockexpression = null;
      {
        String _name = component.getName();
        String _plus = ("YEAH " + _name);
        System.out.println(_plus);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("processor ");
        String _legalName = UML2MarText.getLegalName(component);
        _builder.append(_legalName, "");
        {
          boolean _hasOwnedComponents = UML2MarText.hasOwnedComponents(component);
          if (_hasOwnedComponents) {
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("cores: ");
            EList<Stereotype> _appliedStereotypes = component.getAppliedStereotypes();
            final Function1<Stereotype, Boolean> _function = (Stereotype appliedStereotype) -> {
              String _name_1 = appliedStereotype.getName();
              return Boolean.valueOf("HwProcessor".equals(_name_1));
            };
            Stereotype _findFirst = IterableExtensions.<Stereotype>findFirst(_appliedStereotypes, _function);
            Object _value = component.getValue(_findFirst, "nbCores");
            _builder.append(_value, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            {
              boolean _hasOwnedComponents_1 = UML2MarText.hasOwnedComponents(component);
              if (_hasOwnedComponents_1) {
                _builder.append("\t");
                _builder.append("caches: {");
                _builder.newLine();
                {
                  Iterable<Component> _ownedComponents = UML2MarText.getOwnedComponents(component);
                  for(final Component ownedCache : _ownedComponents) {
                    _builder.append("\t");
                    _builder.append("\t");
                    CharSequence _transform = UML2MarText.transform(ownedCache);
                    _builder.append(_transform, "\t\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("};");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("};");
          } else {
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
        _xblockexpression = _builder;
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _isHwCache = UML2MarText.isHwCache(component);
      if (_isHwCache) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("cache ");
        String _legalName = UML2MarText.getLegalName(component);
        _builder.append(_legalName, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("level: ");
        EList<Stereotype> _appliedStereotypes = component.getAppliedStereotypes();
        final Function1<Stereotype, Boolean> _function = (Stereotype appliedStereotype) -> {
          String _name = appliedStereotype.getName();
          return Boolean.valueOf("HwCache".equals(_name));
        };
        Stereotype _findFirst = IterableExtensions.<Stereotype>findFirst(_appliedStereotypes, _function);
        Object _value = component.getValue(_findFirst, "level");
        _builder.append(_value, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("};");
        _builder.newLine();
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("component ");
        String _legalName_1 = UML2MarText.getLegalName(component);
        _builder_1.append(_legalName_1, "");
        {
          boolean _hasOwnedComponents = UML2MarText.hasOwnedComponents(component);
          if (_hasOwnedComponents) {
            _builder_1.append(" {");
            _builder_1.newLineIfNotEmpty();
            {
              Iterable<Component> _ownedComponents = UML2MarText.getOwnedComponents(component);
              for(final Component ownedComponent : _ownedComponents) {
                _builder_1.append("\t");
                CharSequence _transform = UML2MarText.transform(ownedComponent);
                _builder_1.append(_transform, "\t");
                _builder_1.append(" ");
                _builder_1.newLineIfNotEmpty();
              }
            }
            _builder_1.append("};");
          } else {
            _builder_1.append(";");
          }
        }
        _builder_1.newLineIfNotEmpty();
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * [UTIL] hasLegalName(NamedElement namedElement) -> Boolean
   *  - true  : namedElement.name is neither empty nor null
   *  - false : otherwise
   */
  public static boolean hasLegalName(final NamedElement namedElement) {
    String _name = namedElement.getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_name);
    return (!_isNullOrEmpty);
  }
  
  /**
   * [UTIL] getLegalName(NamedElement namedElement) -> String
   * - namedElement.name : not empty or null
   * - default name : otherwise
   */
  public static String getLegalName(final NamedElement namedElement) {
    String _xifexpression = null;
    boolean _hasLegalName = UML2MarText.hasLegalName(namedElement);
    if (_hasLegalName) {
      _xifexpression = namedElement.getName();
    } else {
      _xifexpression = "default_name";
    }
    return _xifexpression;
  }
  
  /**
   * [UTIL] hasOwnedComponents(Element element) -> Boolean
   *  - true  : element.ownedElements contains Component instances
   *  - false : otherwise
   */
  public static boolean hasOwnedComponents(final Element element) {
    EList<Element> _ownedElements = element.getOwnedElements();
    final Function1<Element, Boolean> _function = (Element ownedElement) -> {
      return Boolean.valueOf((ownedElement instanceof Component));
    };
    Element _findFirst = IterableExtensions.<Element>findFirst(_ownedElements, _function);
    return (!Objects.equal(_findFirst, null));
  }
  
  /**
   * [UTIL] ownedComponents(Element element) -> Iterable<Component>
   */
  public static Iterable<Component> getOwnedComponents(final Element element) {
    EList<Element> _ownedElements = element.getOwnedElements();
    final Function1<Element, Boolean> _function = (Element ownedElement) -> {
      return Boolean.valueOf((ownedElement instanceof Component));
    };
    Iterable<Element> _filter = IterableExtensions.<Element>filter(_ownedElements, _function);
    final Function1<Element, Component> _function_1 = (Element ownedElement) -> {
      return ((Component) ownedElement);
    };
    return IterableExtensions.<Element, Component>map(_filter, _function_1);
  }
  
  /**
   * [UTILS] isHwProcessor(Component component) -> Boolean
   *  - true  : the component has a <<HwProcessor>> stereotype application
   *  - false : otherwise
   */
  public static boolean isHwProcessor(final Component component) {
    EList<Stereotype> _appliedStereotypes = component.getAppliedStereotypes();
    final Function1<Stereotype, Boolean> _function = (Stereotype appliedStereotype) -> {
      String _name = appliedStereotype.getName();
      return Boolean.valueOf("HwProcessor".equals(_name));
    };
    Stereotype _findFirst = IterableExtensions.<Stereotype>findFirst(_appliedStereotypes, _function);
    return (!Objects.equal(_findFirst, null));
  }
  
  /**
   * [UTILS] hasOwnedCaches(Component component) -> Boolean
   *  - true  : element.ownedElement contains <<HwCache>> Component instances
   * 	- false : otherwise
   */
  public static boolean hasOwnedCaches(final Component component) {
    Iterable<Component> _ownedComponents = UML2MarText.getOwnedComponents(component);
    final Function1<Component, Boolean> _function = (Component ownedComponent) -> {
      return Boolean.valueOf(UML2MarText.isHwCache(ownedComponent));
    };
    Component _findFirst = IterableExtensions.<Component>findFirst(_ownedComponents, _function);
    return (!Objects.equal(_findFirst, null));
  }
  
  /**
   * [UTILS] getOwnedCaches(Component component) -> Iterable<Component>
   */
  public static Iterable<Component> getOwnedCaches(final Component component) {
    Iterable<Component> _ownedComponents = UML2MarText.getOwnedComponents(component);
    final Function1<Component, Boolean> _function = (Component ownedComponent) -> {
      return Boolean.valueOf(UML2MarText.isHwCache(ownedComponent));
    };
    return IterableExtensions.<Component>filter(_ownedComponents, _function);
  }
  
  /**
   * [UTILS] isHwCache(Component component) -> Boolean
   *  - true  : element.ownedElements. contains <<HwProcessor>> Component instances
   *  - false : otherwise
   */
  public static boolean isHwCache(final Component component) {
    EList<Stereotype> _appliedStereotypes = component.getAppliedStereotypes();
    final Function1<Stereotype, Boolean> _function = (Stereotype appliedStereotype) -> {
      String _name = appliedStereotype.getName();
      return Boolean.valueOf("HwCache".equals(_name));
    };
    Stereotype _findFirst = IterableExtensions.<Stereotype>findFirst(_appliedStereotypes, _function);
    return (!Objects.equal(_findFirst, null));
  }
  
  public static CharSequence transform(final Element component) {
    if (component instanceof Component) {
      return _transform((Component)component);
    } else if (component instanceof Model) {
      return _transform((Model)component);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(component).toString());
    }
  }
}
