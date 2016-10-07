/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.umlrt.umlrt.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrusrt.umlrt.umlrt.Capsule;
import org.eclipse.papyrusrt.umlrt.umlrt.CapsulePart;
import org.eclipse.papyrusrt.umlrt.umlrt.PortRegistrationType;
import org.eclipse.papyrusrt.umlrt.umlrt.Protocol;
import org.eclipse.papyrusrt.umlrt.umlrt.ProtocolContainer;
import org.eclipse.papyrusrt.umlrt.umlrt.RTConnector;
import org.eclipse.papyrusrt.umlrt.umlrt.RTGuard;
import org.eclipse.papyrusrt.umlrt.umlrt.RTMessageKind;
import org.eclipse.papyrusrt.umlrt.umlrt.RTMessageSet;
import org.eclipse.papyrusrt.umlrt.umlrt.RTPort;
import org.eclipse.papyrusrt.umlrt.umlrt.RTPseudostate;
import org.eclipse.papyrusrt.umlrt.umlrt.RTRedefinedElement;
import org.eclipse.papyrusrt.umlrt.umlrt.RTRegion;
import org.eclipse.papyrusrt.umlrt.umlrt.RTState;
import org.eclipse.papyrusrt.umlrt.umlrt.RTStateMachine;
import org.eclipse.papyrusrt.umlrt.umlrt.RTTrigger;
import org.eclipse.papyrusrt.umlrt.umlrt.UmlrtFactory;
import org.eclipse.papyrusrt.umlrt.umlrt.UmlrtPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlrtPackageImpl extends EPackageImpl implements UmlrtPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capsuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capsulePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtConnectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtRedefinedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtMessageSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtStateMachineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtRegionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtPseudostateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtGuardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum portRegistrationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum rtMessageKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.papyrusrt.umlrt.umlrt.UmlrtPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UmlrtPackageImpl()
  {
    super(eNS_URI, UmlrtFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link UmlrtPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UmlrtPackage init()
  {
    if (isInited) return (UmlrtPackage)EPackage.Registry.INSTANCE.getEPackage(UmlrtPackage.eNS_URI);

    // Obtain or create and register package
    UmlrtPackageImpl theUmlrtPackage = (UmlrtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UmlrtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UmlrtPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();
    UMLPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theUmlrtPackage.createPackageContents();

    // Initialize created meta-data
    theUmlrtPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUmlrtPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UmlrtPackage.eNS_URI, theUmlrtPackage);
    return theUmlrtPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapsule()
  {
    return capsuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapsulePart()
  {
    return capsulePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapsulePart_IsNotification()
  {
    return (EAttribute)capsulePartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapsulePart_IsPublish()
  {
    return (EAttribute)capsulePartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapsulePart_IsWired()
  {
    return (EAttribute)capsulePartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapsulePart_Registration()
  {
    return (EAttribute)capsulePartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapsulePart_RegistrationOverride()
  {
    return (EAttribute)capsulePartEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocol()
  {
    return protocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTPort()
  {
    return rtPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTConnector()
  {
    return rtConnectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocolContainer()
  {
    return protocolContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTRedefinedElement()
  {
    return rtRedefinedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRTRedefinedElement_RootFragment()
  {
    return (EReference)rtRedefinedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTMessageSet()
  {
    return rtMessageSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRTMessageSet_RtMsgKind()
  {
    return (EAttribute)rtMessageSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTStateMachine()
  {
    return rtStateMachineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRTStateMachine_IsPassive()
  {
    return (EAttribute)rtStateMachineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTRegion()
  {
    return rtRegionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTState()
  {
    return rtStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTPseudostate()
  {
    return rtPseudostateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTTrigger()
  {
    return rtTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTGuard()
  {
    return rtGuardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPortRegistrationType()
  {
    return portRegistrationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRTMessageKind()
  {
    return rtMessageKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlrtFactory getUmlrtFactory()
  {
    return (UmlrtFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    capsuleEClass = createEClass(CAPSULE);

    capsulePartEClass = createEClass(CAPSULE_PART);
    createEAttribute(capsulePartEClass, CAPSULE_PART__IS_NOTIFICATION);
    createEAttribute(capsulePartEClass, CAPSULE_PART__IS_PUBLISH);
    createEAttribute(capsulePartEClass, CAPSULE_PART__IS_WIRED);
    createEAttribute(capsulePartEClass, CAPSULE_PART__REGISTRATION);
    createEAttribute(capsulePartEClass, CAPSULE_PART__REGISTRATION_OVERRIDE);

    protocolEClass = createEClass(PROTOCOL);

    rtPortEClass = createEClass(RT_PORT);

    rtConnectorEClass = createEClass(RT_CONNECTOR);

    protocolContainerEClass = createEClass(PROTOCOL_CONTAINER);

    rtRedefinedElementEClass = createEClass(RT_REDEFINED_ELEMENT);
    createEReference(rtRedefinedElementEClass, RT_REDEFINED_ELEMENT__ROOT_FRAGMENT);

    rtMessageSetEClass = createEClass(RT_MESSAGE_SET);
    createEAttribute(rtMessageSetEClass, RT_MESSAGE_SET__RT_MSG_KIND);

    rtStateMachineEClass = createEClass(RT_STATE_MACHINE);
    createEAttribute(rtStateMachineEClass, RT_STATE_MACHINE__IS_PASSIVE);

    rtRegionEClass = createEClass(RT_REGION);

    rtStateEClass = createEClass(RT_STATE);

    rtPseudostateEClass = createEClass(RT_PSEUDOSTATE);

    rtTriggerEClass = createEClass(RT_TRIGGER);

    rtGuardEClass = createEClass(RT_GUARD);

    // Create enums
    portRegistrationTypeEEnum = createEEnum(PORT_REGISTRATION_TYPE);
    rtMessageKindEEnum = createEEnum(RT_MESSAGE_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    capsuleEClass.getESuperTypes().add(theUMLPackage.getClass_());
    capsulePartEClass.getESuperTypes().add(theUMLPackage.getProperty());
    protocolEClass.getESuperTypes().add(theUMLPackage.getCollaboration());
    rtPortEClass.getESuperTypes().add(theUMLPackage.getPort());
    rtConnectorEClass.getESuperTypes().add(theUMLPackage.getConnector());
    protocolContainerEClass.getESuperTypes().add(theUMLPackage.getPackage());
    rtRedefinedElementEClass.getESuperTypes().add(theUMLPackage.getRedefinableElement());
    rtMessageSetEClass.getESuperTypes().add(theUMLPackage.getInterface());
    rtStateMachineEClass.getESuperTypes().add(theUMLPackage.getStateMachine());
    rtRegionEClass.getESuperTypes().add(theUMLPackage.getRegion());
    rtStateEClass.getESuperTypes().add(theUMLPackage.getState());
    rtPseudostateEClass.getESuperTypes().add(theUMLPackage.getPseudostate());
    rtTriggerEClass.getESuperTypes().add(theUMLPackage.getOperation());
    rtGuardEClass.getESuperTypes().add(theUMLPackage.getConstraint());

    // Initialize classes and features; add operations and parameters
    initEClass(capsuleEClass, Capsule.class, "Capsule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(capsulePartEClass, CapsulePart.class, "CapsulePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCapsulePart_IsNotification(), theTypesPackage.getBoolean(), "isNotification", null, 0, 1, CapsulePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapsulePart_IsPublish(), theTypesPackage.getBoolean(), "isPublish", null, 0, 1, CapsulePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapsulePart_IsWired(), theTypesPackage.getBoolean(), "isWired", null, 0, 1, CapsulePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapsulePart_Registration(), this.getPortRegistrationType(), "registration", null, 0, 1, CapsulePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapsulePart_RegistrationOverride(), theTypesPackage.getString(), "registrationOverride", null, 0, 1, CapsulePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rtPortEClass, RTPort.class, "RTPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rtConnectorEClass, RTConnector.class, "RTConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(protocolContainerEClass, ProtocolContainer.class, "ProtocolContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rtRedefinedElementEClass, RTRedefinedElement.class, "RTRedefinedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRTRedefinedElement_RootFragment(), theUMLPackage.getRedefinableElement(), null, "rootFragment", null, 0, 1, RTRedefinedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rtMessageSetEClass, RTMessageSet.class, "RTMessageSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRTMessageSet_RtMsgKind(), this.getRTMessageKind(), "rtMsgKind", null, 0, 1, RTMessageSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rtStateMachineEClass, RTStateMachine.class, "RTStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRTStateMachine_IsPassive(), theTypesPackage.getBoolean(), "isPassive", null, 0, 1, RTStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rtRegionEClass, RTRegion.class, "RTRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rtStateEClass, RTState.class, "RTState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rtPseudostateEClass, RTPseudostate.class, "RTPseudostate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rtTriggerEClass, RTTrigger.class, "RTTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rtGuardEClass, RTGuard.class, "RTGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(portRegistrationTypeEEnum, PortRegistrationType.class, "PortRegistrationType");
    addEEnumLiteral(portRegistrationTypeEEnum, PortRegistrationType.AUTOMATIC);
    addEEnumLiteral(portRegistrationTypeEEnum, PortRegistrationType.APPLICATION);
    addEEnumLiteral(portRegistrationTypeEEnum, PortRegistrationType.AUTOMATIC_LOCKED);

    initEEnum(rtMessageKindEEnum, RTMessageKind.class, "RTMessageKind");
    addEEnumLiteral(rtMessageKindEEnum, RTMessageKind.IN);
    addEEnumLiteral(rtMessageKindEEnum, RTMessageKind.OUT);
    addEEnumLiteral(rtMessageKindEEnum, RTMessageKind.IN_OUT);

    // Create resource
    createResource(eNS_URI);
  }

} //UmlrtPackageImpl
