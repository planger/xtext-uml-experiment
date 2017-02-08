/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrus.uml.marte.marText;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.uml.marte.marText.MarTextPackage
 * @generated
 */
public interface MarTextFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MarTextFactory eINSTANCE = org.eclipse.papyrus.uml.marte.marText.impl.MarTextFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Hw Processor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hw Processor</em>'.
   * @generated
   */
  HwProcessor createHwProcessor();

  /**
   * Returns a new object of class '<em>Hw Cache</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hw Cache</em>'.
   * @generated
   */
  HwCache createHwCache();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MarTextPackage getMarTextPackage();

} //MarTextFactory
