/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.umlrt.umlrt;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrusrt.umlrt.umlrt.UmlrtFactory
 * @model kind="package"
 * @generated
 */
public interface UmlrtPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "umlrt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/papyrus/umlrt-test";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "umlrt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmlrtPackage eINSTANCE = org.eclipse.papyrusrt.umlrt.umlrt.impl.UmlrtPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.papyrusrt.umlrt.umlrt.impl.ProtocolContainerImpl <em>Protocol Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.ProtocolContainerImpl
   * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.UmlrtPackageImpl#getProtocolContainer()
   * @generated
   */
  int PROTOCOL_CONTAINER = 0;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__EANNOTATIONS = UMLPackage.PACKAGE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNED_COMMENT = UMLPackage.PACKAGE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNED_ELEMENT = UMLPackage.PACKAGE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNER = UMLPackage.PACKAGE__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__CLIENT_DEPENDENCY = UMLPackage.PACKAGE__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__NAME = UMLPackage.PACKAGE__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__NAME_EXPRESSION = UMLPackage.PACKAGE__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__NAMESPACE = UMLPackage.PACKAGE__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__QUALIFIED_NAME = UMLPackage.PACKAGE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__VISIBILITY = UMLPackage.PACKAGE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNED_RULE = UMLPackage.PACKAGE__OWNED_RULE;

  /**
   * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__ELEMENT_IMPORT = UMLPackage.PACKAGE__ELEMENT_IMPORT;

  /**
   * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__PACKAGE_IMPORT = UMLPackage.PACKAGE__PACKAGE_IMPORT;

  /**
   * The feature id for the '<em><b>Owned Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNED_MEMBER = UMLPackage.PACKAGE__OWNED_MEMBER;

  /**
   * The feature id for the '<em><b>Imported Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__IMPORTED_MEMBER = UMLPackage.PACKAGE__IMPORTED_MEMBER;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__MEMBER = UMLPackage.PACKAGE__MEMBER;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNING_TEMPLATE_PARAMETER = UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__TEMPLATE_PARAMETER = UMLPackage.PACKAGE__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__TEMPLATE_BINDING = UMLPackage.PACKAGE__TEMPLATE_BINDING;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNED_TEMPLATE_SIGNATURE = UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE;

  /**
   * The feature id for the '<em><b>URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__URI = UMLPackage.PACKAGE__URI;

  /**
   * The feature id for the '<em><b>Nested Package</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__NESTED_PACKAGE = UMLPackage.PACKAGE__NESTED_PACKAGE;

  /**
   * The feature id for the '<em><b>Nesting Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__NESTING_PACKAGE = UMLPackage.PACKAGE__NESTING_PACKAGE;

  /**
   * The feature id for the '<em><b>Owned Stereotype</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNED_STEREOTYPE = UMLPackage.PACKAGE__OWNED_STEREOTYPE;

  /**
   * The feature id for the '<em><b>Owned Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__OWNED_TYPE = UMLPackage.PACKAGE__OWNED_TYPE;

  /**
   * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__PACKAGE_MERGE = UMLPackage.PACKAGE__PACKAGE_MERGE;

  /**
   * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__PACKAGED_ELEMENT = UMLPackage.PACKAGE__PACKAGED_ELEMENT;

  /**
   * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER__PROFILE_APPLICATION = UMLPackage.PACKAGE__PROFILE_APPLICATION;

  /**
   * The number of structural features of the '<em>Protocol Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_CONTAINER_FEATURE_COUNT = UMLPackage.PACKAGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.papyrusrt.umlrt.umlrt.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.ProtocolImpl
   * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.UmlrtPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__EANNOTATIONS = UMLPackage.COLLABORATION__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_COMMENT = UMLPackage.COLLABORATION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_ELEMENT = UMLPackage.COLLABORATION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNER = UMLPackage.COLLABORATION__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__CLIENT_DEPENDENCY = UMLPackage.COLLABORATION__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = UMLPackage.COLLABORATION__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME_EXPRESSION = UMLPackage.COLLABORATION__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAMESPACE = UMLPackage.COLLABORATION__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__QUALIFIED_NAME = UMLPackage.COLLABORATION__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__VISIBILITY = UMLPackage.COLLABORATION__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_RULE = UMLPackage.COLLABORATION__OWNED_RULE;

  /**
   * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__ELEMENT_IMPORT = UMLPackage.COLLABORATION__ELEMENT_IMPORT;

  /**
   * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__PACKAGE_IMPORT = UMLPackage.COLLABORATION__PACKAGE_IMPORT;

  /**
   * The feature id for the '<em><b>Owned Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_MEMBER = UMLPackage.COLLABORATION__OWNED_MEMBER;

  /**
   * The feature id for the '<em><b>Imported Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__IMPORTED_MEMBER = UMLPackage.COLLABORATION__IMPORTED_MEMBER;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__MEMBER = UMLPackage.COLLABORATION__MEMBER;

  /**
   * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__IS_LEAF = UMLPackage.COLLABORATION__IS_LEAF;

  /**
   * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__REDEFINED_ELEMENT = UMLPackage.COLLABORATION__REDEFINED_ELEMENT;

  /**
   * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__REDEFINITION_CONTEXT = UMLPackage.COLLABORATION__REDEFINITION_CONTEXT;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNING_TEMPLATE_PARAMETER = UMLPackage.COLLABORATION__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__TEMPLATE_PARAMETER = UMLPackage.COLLABORATION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__PACKAGE = UMLPackage.COLLABORATION__PACKAGE;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__TEMPLATE_BINDING = UMLPackage.COLLABORATION__TEMPLATE_BINDING;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_TEMPLATE_SIGNATURE = UMLPackage.COLLABORATION__OWNED_TEMPLATE_SIGNATURE;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__FEATURE = UMLPackage.COLLABORATION__FEATURE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__ATTRIBUTE = UMLPackage.COLLABORATION__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__COLLABORATION_USE = UMLPackage.COLLABORATION__COLLABORATION_USE;

  /**
   * The feature id for the '<em><b>General</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__GENERAL = UMLPackage.COLLABORATION__GENERAL;

  /**
   * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__GENERALIZATION = UMLPackage.COLLABORATION__GENERALIZATION;

  /**
   * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__POWERTYPE_EXTENT = UMLPackage.COLLABORATION__POWERTYPE_EXTENT;

  /**
   * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__INHERITED_MEMBER = UMLPackage.COLLABORATION__INHERITED_MEMBER;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__IS_ABSTRACT = UMLPackage.COLLABORATION__IS_ABSTRACT;

  /**
   * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__IS_FINAL_SPECIALIZATION = UMLPackage.COLLABORATION__IS_FINAL_SPECIALIZATION;

  /**
   * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_USE_CASE = UMLPackage.COLLABORATION__OWNED_USE_CASE;

  /**
   * The feature id for the '<em><b>Use Case</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__USE_CASE = UMLPackage.COLLABORATION__USE_CASE;

  /**
   * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__REDEFINED_CLASSIFIER = UMLPackage.COLLABORATION__REDEFINED_CLASSIFIER;

  /**
   * The feature id for the '<em><b>Representation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__REPRESENTATION = UMLPackage.COLLABORATION__REPRESENTATION;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__SUBSTITUTION = UMLPackage.COLLABORATION__SUBSTITUTION;

  /**
   * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_ATTRIBUTE = UMLPackage.COLLABORATION__OWNED_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_CONNECTOR = UMLPackage.COLLABORATION__OWNED_CONNECTOR;

  /**
   * The feature id for the '<em><b>Part</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__PART = UMLPackage.COLLABORATION__PART;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__ROLE = UMLPackage.COLLABORATION__ROLE;

  /**
   * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__CLASSIFIER_BEHAVIOR = UMLPackage.COLLABORATION__CLASSIFIER_BEHAVIOR;

  /**
   * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__INTERFACE_REALIZATION = UMLPackage.COLLABORATION__INTERFACE_REALIZATION;

  /**
   * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__OWNED_BEHAVIOR = UMLPackage.COLLABORATION__OWNED_BEHAVIOR;

  /**
   * The feature id for the '<em><b>Collaboration Role</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__COLLABORATION_ROLE = UMLPackage.COLLABORATION__COLLABORATION_ROLE;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = UMLPackage.COLLABORATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.papyrusrt.umlrt.umlrt.impl.RTMessageSetImpl <em>RT Message Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.RTMessageSetImpl
   * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.UmlrtPackageImpl#getRTMessageSet()
   * @generated
   */
  int RT_MESSAGE_SET = 2;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__EANNOTATIONS = UMLPackage.INTERFACE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_COMMENT = UMLPackage.INTERFACE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_ELEMENT = UMLPackage.INTERFACE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNER = UMLPackage.INTERFACE__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__CLIENT_DEPENDENCY = UMLPackage.INTERFACE__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__NAME = UMLPackage.INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__NAME_EXPRESSION = UMLPackage.INTERFACE__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__NAMESPACE = UMLPackage.INTERFACE__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__QUALIFIED_NAME = UMLPackage.INTERFACE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__VISIBILITY = UMLPackage.INTERFACE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_RULE = UMLPackage.INTERFACE__OWNED_RULE;

  /**
   * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__ELEMENT_IMPORT = UMLPackage.INTERFACE__ELEMENT_IMPORT;

  /**
   * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__PACKAGE_IMPORT = UMLPackage.INTERFACE__PACKAGE_IMPORT;

  /**
   * The feature id for the '<em><b>Owned Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_MEMBER = UMLPackage.INTERFACE__OWNED_MEMBER;

  /**
   * The feature id for the '<em><b>Imported Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__IMPORTED_MEMBER = UMLPackage.INTERFACE__IMPORTED_MEMBER;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__MEMBER = UMLPackage.INTERFACE__MEMBER;

  /**
   * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__IS_LEAF = UMLPackage.INTERFACE__IS_LEAF;

  /**
   * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__REDEFINED_ELEMENT = UMLPackage.INTERFACE__REDEFINED_ELEMENT;

  /**
   * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__REDEFINITION_CONTEXT = UMLPackage.INTERFACE__REDEFINITION_CONTEXT;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNING_TEMPLATE_PARAMETER = UMLPackage.INTERFACE__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__TEMPLATE_PARAMETER = UMLPackage.INTERFACE__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__PACKAGE = UMLPackage.INTERFACE__PACKAGE;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__TEMPLATE_BINDING = UMLPackage.INTERFACE__TEMPLATE_BINDING;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_TEMPLATE_SIGNATURE = UMLPackage.INTERFACE__OWNED_TEMPLATE_SIGNATURE;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__FEATURE = UMLPackage.INTERFACE__FEATURE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__ATTRIBUTE = UMLPackage.INTERFACE__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__COLLABORATION_USE = UMLPackage.INTERFACE__COLLABORATION_USE;

  /**
   * The feature id for the '<em><b>General</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__GENERAL = UMLPackage.INTERFACE__GENERAL;

  /**
   * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__GENERALIZATION = UMLPackage.INTERFACE__GENERALIZATION;

  /**
   * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__POWERTYPE_EXTENT = UMLPackage.INTERFACE__POWERTYPE_EXTENT;

  /**
   * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__INHERITED_MEMBER = UMLPackage.INTERFACE__INHERITED_MEMBER;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__IS_ABSTRACT = UMLPackage.INTERFACE__IS_ABSTRACT;

  /**
   * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__IS_FINAL_SPECIALIZATION = UMLPackage.INTERFACE__IS_FINAL_SPECIALIZATION;

  /**
   * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_USE_CASE = UMLPackage.INTERFACE__OWNED_USE_CASE;

  /**
   * The feature id for the '<em><b>Use Case</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__USE_CASE = UMLPackage.INTERFACE__USE_CASE;

  /**
   * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__REDEFINED_CLASSIFIER = UMLPackage.INTERFACE__REDEFINED_CLASSIFIER;

  /**
   * The feature id for the '<em><b>Representation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__REPRESENTATION = UMLPackage.INTERFACE__REPRESENTATION;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__SUBSTITUTION = UMLPackage.INTERFACE__SUBSTITUTION;

  /**
   * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__NESTED_CLASSIFIER = UMLPackage.INTERFACE__NESTED_CLASSIFIER;

  /**
   * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_ATTRIBUTE = UMLPackage.INTERFACE__OWNED_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_RECEPTION = UMLPackage.INTERFACE__OWNED_RECEPTION;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__PROTOCOL = UMLPackage.INTERFACE__PROTOCOL;

  /**
   * The feature id for the '<em><b>Redefined Interface</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__REDEFINED_INTERFACE = UMLPackage.INTERFACE__REDEFINED_INTERFACE;

  /**
   * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET__OWNED_OPERATION = UMLPackage.INTERFACE__OWNED_OPERATION;

  /**
   * The number of structural features of the '<em>RT Message Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RT_MESSAGE_SET_FEATURE_COUNT = UMLPackage.INTERFACE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.papyrusrt.umlrt.umlrt.ProtocolContainer <em>Protocol Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol Container</em>'.
   * @see org.eclipse.papyrusrt.umlrt.umlrt.ProtocolContainer
   * @generated
   */
  EClass getProtocolContainer();

  /**
   * Returns the meta object for class '{@link org.eclipse.papyrusrt.umlrt.umlrt.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see org.eclipse.papyrusrt.umlrt.umlrt.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for class '{@link org.eclipse.papyrusrt.umlrt.umlrt.RTMessageSet <em>RT Message Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RT Message Set</em>'.
   * @see org.eclipse.papyrusrt.umlrt.umlrt.RTMessageSet
   * @generated
   */
  EClass getRTMessageSet();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UmlrtFactory getUmlrtFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.papyrusrt.umlrt.umlrt.impl.ProtocolContainerImpl <em>Protocol Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.ProtocolContainerImpl
     * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.UmlrtPackageImpl#getProtocolContainer()
     * @generated
     */
    EClass PROTOCOL_CONTAINER = eINSTANCE.getProtocolContainer();

    /**
     * The meta object literal for the '{@link org.eclipse.papyrusrt.umlrt.umlrt.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.ProtocolImpl
     * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.UmlrtPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '{@link org.eclipse.papyrusrt.umlrt.umlrt.impl.RTMessageSetImpl <em>RT Message Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.RTMessageSetImpl
     * @see org.eclipse.papyrusrt.umlrt.umlrt.impl.UmlrtPackageImpl#getRTMessageSet()
     * @generated
     */
    EClass RT_MESSAGE_SET = eINSTANCE.getRTMessageSet();

  }

} //UmlrtPackage
