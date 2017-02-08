package org.eclipse.papyrus.uml.marte.ui.trasformations;

import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.uml.marte.marText.HwCache;
import org.eclipse.papyrus.uml.marte.marText.HwProcessor;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * MarText2UML
 * Given a MarText and a UML model, it propagates the
 * differences from the first to the latter.
 */
@SuppressWarnings("all")
public class MarText2UML {
  /**
   * Resource set
   */
  private final static ResourceSetImpl resourceSet = new ResourceSetImpl();
  
  /**
   * MARTE profile URI
   */
  private final static URI marteProfileURI = URI.createURI(
    "platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.profile.uml");
  
  /**
   * MARTE profile resource
   */
  private final static UMLResource marteProfileResource = ((UMLResource) MarText2UML.resourceSet.getResource(MarText2UML.marteProfileURI, true));
  
  /**
   * MARTE Profile
   */
  private final static Profile marteProfile = ((Profile) IterableExtensions.<EObject>findFirst(MarText2UML.marteProfileResource.getContents(), ((Function1<EObject, Boolean>) (EObject containedElement) -> {
    return Boolean.valueOf(((containedElement instanceof Profile) && "MARTE".equals(((Profile) containedElement).getName())));
  })));
  
  /**
   * Supported profiles
   */
  private final static HashMap<String, Profile> supportedProfiles = new Function0<HashMap<String, Profile>>() {
    public HashMap<String, Profile> apply() {
      EList<Element> _allOwnedElements = MarText2UML.marteProfile.allOwnedElements();
      final Function1<Element, Boolean> _function = (Element ownedElement) -> {
        return Boolean.valueOf(((ownedElement instanceof Profile) && "HwComputing".equals(((Profile) ownedElement).getName())));
      };
      Element _findFirst = IterableExtensions.<Element>findFirst(_allOwnedElements, _function);
      Pair<String, Profile> _of = Pair.<String, Profile>of("HwComputing", 
        ((Profile) _findFirst));
      EList<Element> _allOwnedElements_1 = MarText2UML.marteProfile.allOwnedElements();
      final Function1<Element, Boolean> _function_1 = (Element ownedElement) -> {
        return Boolean.valueOf(((ownedElement instanceof Profile) && "HwMemory".equals(((Profile) ownedElement).getName())));
      };
      Element _findFirst_1 = IterableExtensions.<Element>findFirst(_allOwnedElements_1, _function_1);
      Pair<String, Profile> _of_1 = Pair.<String, Profile>of("HwMemory", ((Profile) _findFirst_1));
      return CollectionLiterals.<String, Profile>newHashMap(_of, _of_1);
    }
  }.apply();
  
  /**
   * Supported stereotypes
   */
  private final static HashMap<String, Stereotype> supportedStereotypes = new Function0<HashMap<String, Stereotype>>() {
    public HashMap<String, Stereotype> apply() {
      Profile _get = MarText2UML.supportedProfiles.get("HwComputing");
      EList<Element> _allOwnedElements = _get.allOwnedElements();
      final Function1<Element, Boolean> _function = (Element ownedElement) -> {
        return Boolean.valueOf(((ownedElement instanceof Stereotype) && "HwProcessor".equals(((Stereotype) ownedElement).getName())));
      };
      Element _findFirst = IterableExtensions.<Element>findFirst(_allOwnedElements, _function);
      Pair<String, Stereotype> _of = Pair.<String, Stereotype>of("HwProcessor", 
        ((Stereotype) _findFirst));
      Profile _get_1 = MarText2UML.supportedProfiles.get("HwMemory");
      EList<Element> _allOwnedElements_1 = _get_1.allOwnedElements();
      final Function1<Element, Boolean> _function_1 = (Element ownedElement) -> {
        return Boolean.valueOf(((ownedElement instanceof Stereotype) && "HwCache".equals(((Stereotype) ownedElement).getName())));
      };
      Element _findFirst_1 = IterableExtensions.<Element>findFirst(_allOwnedElements_1, _function_1);
      Pair<String, Stereotype> _of_1 = Pair.<String, Stereotype>of("HwCache", 
        ((Stereotype) _findFirst_1));
      return CollectionLiterals.<String, Stereotype>newHashMap(_of, _of_1);
    }
  }.apply();
  
  /**
   * Used Profiles (keeps track of the required profiles throughout the transformation)
   */
  private final static HashSet<Object> appliedProfiles = CollectionLiterals.<Object>newHashSet();
  
  /**
   * [RULE] Model
   */
  public static void transform(final Model umlModel, final Model marTextModel) {
    MarText2UML.appliedProfiles.clear();
    EList<Profile> _appliedProfiles = umlModel.getAppliedProfiles();
    List<Profile> _list = IterableExtensions.<Profile>toList(_appliedProfiles);
    final Consumer<Profile> _function = (Profile umlModelProfile) -> {
      umlModel.unapplyProfile(umlModelProfile);
    };
    _list.forEach(_function);
    String _legalName = MarText2UML.getLegalName(marTextModel);
    umlModel.setName(_legalName);
    final Iterable<Component> umlModelComponents = MarText2UML.getOwnedComponents(umlModel);
    final Iterable<Component> marTextModelComponents = MarText2UML.getOwnedComponents(marTextModel);
    final Function1<Component, Boolean> _function_1 = (Component umlModelComponent) -> {
      final Function1<Component, Boolean> _function_2 = (Component marTextModelComponent) -> {
        String _qualifiedName = umlModelComponent.getQualifiedName();
        String _qualifiedName_1 = marTextModelComponent.getQualifiedName();
        return Boolean.valueOf(_qualifiedName.equals(_qualifiedName_1));
      };
      Component _findFirst = IterableExtensions.<Component>findFirst(marTextModelComponents, _function_2);
      return Boolean.valueOf((!Objects.equal(_findFirst, null)));
    };
    Iterable<Component> _filter = IterableExtensions.<Component>filter(umlModelComponents, _function_1);
    final Function1<Component, Pair<Component, Component>> _function_2 = (Component sharedComponent) -> {
      final Function1<Component, Boolean> _function_3 = (Component marTextModelComponent) -> {
        String _qualifiedName = sharedComponent.getQualifiedName();
        String _qualifiedName_1 = marTextModelComponent.getQualifiedName();
        return Boolean.valueOf(_qualifiedName.equals(_qualifiedName_1));
      };
      Component _findFirst = IterableExtensions.<Component>findFirst(marTextModelComponents, _function_3);
      return Pair.<Component, Component>of(sharedComponent, _findFirst);
    };
    Iterable<Pair<Component, Component>> _map = IterableExtensions.<Component, Pair<Component, Component>>map(_filter, _function_2);
    final List<Pair<Component, Component>> sharedComponents = IterableExtensions.<Pair<Component, Component>>toList(_map);
    final Function1<Component, Boolean> _function_3 = (Component marTextModelComponent) -> {
      final Function1<Component, Boolean> _function_4 = (Component umlModelComponent) -> {
        String _qualifiedName = umlModelComponent.getQualifiedName();
        String _qualifiedName_1 = marTextModelComponent.getQualifiedName();
        return Boolean.valueOf(_qualifiedName.equals(_qualifiedName_1));
      };
      Component _findFirst = IterableExtensions.<Component>findFirst(umlModelComponents, _function_4);
      return Boolean.valueOf(Objects.equal(_findFirst, null));
    };
    Iterable<Component> _filter_1 = IterableExtensions.<Component>filter(marTextModelComponents, _function_3);
    final List<Component> insertedComponents = IterableExtensions.<Component>toList(_filter_1);
    final Function1<Component, Boolean> _function_4 = (Component umlModelComponent) -> {
      final Function1<Component, Boolean> _function_5 = (Component marTextModelComponent) -> {
        String _qualifiedName = umlModelComponent.getQualifiedName();
        String _qualifiedName_1 = marTextModelComponent.getQualifiedName();
        return Boolean.valueOf(_qualifiedName.equals(_qualifiedName_1));
      };
      Component _findFirst = IterableExtensions.<Component>findFirst(marTextModelComponents, _function_5);
      return Boolean.valueOf(Objects.equal(_findFirst, null));
    };
    Iterable<Component> _filter_2 = IterableExtensions.<Component>filter(umlModelComponents, _function_4);
    final List<Component> removedComponents = IterableExtensions.<Component>toList(_filter_2);
    final Consumer<Component> _function_5 = (Component removedComponent) -> {
      removedComponent.destroy();
    };
    removedComponents.forEach(_function_5);
    final Consumer<Pair<Component, Component>> _function_6 = (Pair<Component, Component> sharedComponent) -> {
      Component _key = sharedComponent.getKey();
      Component _value = sharedComponent.getValue();
      MarText2UML.transform(_key, _value);
    };
    sharedComponents.forEach(_function_6);
    final Consumer<Component> _function_7 = (Component insertedComponent) -> {
      String _name = insertedComponent.getName();
      PackageableElement _createPackagedElement = umlModel.createPackagedElement(_name, UMLPackage.Literals.COMPONENT);
      MarText2UML.transform(
        ((Component) _createPackagedElement), insertedComponent);
    };
    insertedComponents.forEach(_function_7);
  }
  
  /**
   * [RULE] Component
   */
  public static void transform(final Component umlComponent, final Component marTextComponent) {
    String _legalName = MarText2UML.getLegalName(marTextComponent);
    umlComponent.setName(_legalName);
    if ((marTextComponent instanceof HwProcessor)) {
      if ((MarText2UML.appliedProfiles.add("HwComputing") && 
        Objects.equal(umlComponent.getModel().getProfileApplication(MarText2UML.supportedProfiles.get("HwComputing")), null))) {
        Model _model = umlComponent.getModel();
        Profile _get = MarText2UML.supportedProfiles.get("HwComputing");
        _model.applyProfile(_get);
      }
      Stereotype _get_1 = MarText2UML.supportedStereotypes.get("HwProcessor");
      EObject _stereotypeApplication = umlComponent.getStereotypeApplication(_get_1);
      boolean _equals = Objects.equal(_stereotypeApplication, null);
      if (_equals) {
        Stereotype _get_2 = MarText2UML.supportedStereotypes.get("HwProcessor");
        umlComponent.applyStereotype(_get_2);
      }
      EList<Stereotype> _appliedStereotypes = umlComponent.getAppliedStereotypes();
      final Function1<Stereotype, Boolean> _function = (Stereotype appliedStereotype) -> {
        String _name = appliedStereotype.getName();
        return Boolean.valueOf("HwProcessor".equals(_name));
      };
      Stereotype _findFirst = IterableExtensions.<Stereotype>findFirst(_appliedStereotypes, _function);
      int _nbCores = ((HwProcessor)marTextComponent).getNbCores();
      String _string = Integer.valueOf(_nbCores).toString();
      umlComponent.setValue(_findFirst, "nbCores", _string);
    } else {
      if ((marTextComponent instanceof HwCache)) {
        if ((MarText2UML.appliedProfiles.add("HwMemory") && 
          Objects.equal(umlComponent.getModel().getProfileApplication(MarText2UML.supportedProfiles.get("HwMemory")), null))) {
          Model _model_1 = umlComponent.getModel();
          Profile _get_3 = MarText2UML.supportedProfiles.get("HwMemory");
          _model_1.applyProfile(_get_3);
        }
        Stereotype _get_4 = MarText2UML.supportedStereotypes.get("HwCache");
        EObject _stereotypeApplication_1 = umlComponent.getStereotypeApplication(_get_4);
        boolean _equals_1 = Objects.equal(_stereotypeApplication_1, null);
        if (_equals_1) {
          Stereotype _get_5 = MarText2UML.supportedStereotypes.get("HwCache");
          umlComponent.applyStereotype(_get_5);
        }
        EList<Stereotype> _appliedStereotypes_1 = umlComponent.getAppliedStereotypes();
        final Function1<Stereotype, Boolean> _function_1 = (Stereotype appliedStereotype) -> {
          String _name = appliedStereotype.getName();
          return Boolean.valueOf("HwCache".equals(_name));
        };
        Stereotype _findFirst_1 = IterableExtensions.<Stereotype>findFirst(_appliedStereotypes_1, _function_1);
        int _level = ((HwCache)marTextComponent).getLevel();
        String _string_1 = Integer.valueOf(_level).toString();
        umlComponent.setValue(_findFirst_1, "level", _string_1);
      } else {
        EList<Stereotype> _appliedStereotypes_2 = umlComponent.getAppliedStereotypes();
        final Function1<Stereotype, Boolean> _function_2 = (Stereotype appliedStereotype) -> {
          Set<String> _keySet = MarText2UML.supportedStereotypes.keySet();
          String _name = appliedStereotype.getName();
          return Boolean.valueOf(_keySet.contains(_name));
        };
        Iterable<Stereotype> _filter = IterableExtensions.<Stereotype>filter(_appliedStereotypes_2, _function_2);
        final List<Stereotype> unusedStereotypes = IterableExtensions.<Stereotype>toList(_filter);
        final Consumer<Stereotype> _function_3 = (Stereotype unusedStereotype) -> {
          umlComponent.unapplyStereotype(unusedStereotype);
        };
        unusedStereotypes.forEach(_function_3);
      }
    }
    final Iterable<Component> umlSubcomponents = MarText2UML.getOwnedComponents(umlComponent);
    final Iterable<Component> marTextSubcomponents = MarText2UML.getOwnedComponents(marTextComponent);
    final Function1<Component, Boolean> _function_4 = (Component umlSubomponent) -> {
      final Function1<Component, Boolean> _function_5 = (Component marTextSubcomponent) -> {
        String _qualifiedName = umlSubomponent.getQualifiedName();
        String _qualifiedName_1 = marTextSubcomponent.getQualifiedName();
        return Boolean.valueOf(_qualifiedName.equals(_qualifiedName_1));
      };
      Component _findFirst_2 = IterableExtensions.<Component>findFirst(marTextSubcomponents, _function_5);
      return Boolean.valueOf((!Objects.equal(_findFirst_2, null)));
    };
    Iterable<Component> _filter_1 = IterableExtensions.<Component>filter(umlSubcomponents, _function_4);
    final Function1<Component, Pair<Component, Component>> _function_5 = (Component sharedComponent) -> {
      final Function1<Component, Boolean> _function_6 = (Component marTextSubcomponent) -> {
        String _qualifiedName = sharedComponent.getQualifiedName();
        String _qualifiedName_1 = marTextSubcomponent.getQualifiedName();
        return Boolean.valueOf(_qualifiedName.equals(_qualifiedName_1));
      };
      Component _findFirst_2 = IterableExtensions.<Component>findFirst(marTextSubcomponents, _function_6);
      return Pair.<Component, Component>of(sharedComponent, _findFirst_2);
    };
    Iterable<Pair<Component, Component>> _map = IterableExtensions.<Component, Pair<Component, Component>>map(_filter_1, _function_5);
    final List<Pair<Component, Component>> sharedComponents = IterableExtensions.<Pair<Component, Component>>toList(_map);
    final Function1<Component, Boolean> _function_6 = (Component marTextSubcomponent) -> {
      final Function1<Component, Boolean> _function_7 = (Component umlSubcomponent) -> {
        String _qualifiedName = umlSubcomponent.getQualifiedName();
        String _qualifiedName_1 = marTextSubcomponent.getQualifiedName();
        return Boolean.valueOf(_qualifiedName.equals(_qualifiedName_1));
      };
      Component _findFirst_2 = IterableExtensions.<Component>findFirst(umlSubcomponents, _function_7);
      return Boolean.valueOf(Objects.equal(_findFirst_2, null));
    };
    Iterable<Component> _filter_2 = IterableExtensions.<Component>filter(marTextSubcomponents, _function_6);
    final List<Component> insertedComponents = IterableExtensions.<Component>toList(_filter_2);
    final Function1<Component, Boolean> _function_7 = (Component umlSubcomponent) -> {
      final Function1<Component, Boolean> _function_8 = (Component marTextSubcomponent) -> {
        String _qualifiedName = umlSubcomponent.getQualifiedName();
        String _qualifiedName_1 = marTextSubcomponent.getQualifiedName();
        return Boolean.valueOf(_qualifiedName.equals(_qualifiedName_1));
      };
      Component _findFirst_2 = IterableExtensions.<Component>findFirst(marTextSubcomponents, _function_8);
      return Boolean.valueOf(Objects.equal(_findFirst_2, null));
    };
    Iterable<Component> _filter_3 = IterableExtensions.<Component>filter(umlSubcomponents, _function_7);
    final List<Component> removedComponents = IterableExtensions.<Component>toList(_filter_3);
    final Consumer<Component> _function_8 = (Component removedComponent) -> {
      removedComponent.destroy();
    };
    removedComponents.forEach(_function_8);
    final Consumer<Pair<Component, Component>> _function_9 = (Pair<Component, Component> sharedComponent) -> {
      Component _key = sharedComponent.getKey();
      Component _value = sharedComponent.getValue();
      MarText2UML.transform(_key, _value);
    };
    sharedComponents.forEach(_function_9);
    final Consumer<Component> _function_10 = (Component insertedComponent) -> {
      String _name = insertedComponent.getName();
      PackageableElement _createPackagedElement = umlComponent.createPackagedElement(_name, 
        UMLPackage.Literals.COMPONENT);
      MarText2UML.transform(
        ((Component) _createPackagedElement), insertedComponent);
    };
    insertedComponents.forEach(_function_10);
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
   *  - namedElement.name : not empty or null
   *  - default name : otherwise
   */
  public static String getLegalName(final NamedElement namedElement) {
    String _xifexpression = null;
    boolean _hasLegalName = MarText2UML.hasLegalName(namedElement);
    if (_hasLegalName) {
      _xifexpression = namedElement.getName();
    } else {
      _xifexpression = "default_name";
    }
    return _xifexpression;
  }
  
  /**
   * [UTIL] hasOwnedComponents(Element element) -> Boolean
   *   - true  : element.ownedElements contains Component instances
   *   - false : otherwise
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
   * [UTIL] getOwnedComponents(Element element) -> Iterable<Component>
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
}
