/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.umlrt.umlrt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrusrt.umlrt.umlrt.UmlrtPackage
 * @generated
 */
public interface UmlrtFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmlrtFactory eINSTANCE = org.eclipse.papyrusrt.umlrt.umlrt.impl.UmlrtFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Protocol Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol Container</em>'.
   * @generated
   */
  ProtocolContainer createProtocolContainer();

  /**
   * Returns a new object of class '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol</em>'.
   * @generated
   */
  Protocol createProtocol();

  /**
   * Returns a new object of class '<em>RT Message Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RT Message Set</em>'.
   * @generated
   */
  RTMessageSet createRTMessageSet();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UmlrtPackage getUmlrtPackage();

} //UmlrtFactory
