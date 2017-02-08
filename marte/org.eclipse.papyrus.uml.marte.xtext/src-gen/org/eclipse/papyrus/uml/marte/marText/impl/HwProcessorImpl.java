/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrus.uml.marte.marText.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.uml.marte.marText.HwProcessor;
import org.eclipse.papyrus.uml.marte.marText.MarTextPackage;

import org.eclipse.uml2.uml.internal.impl.ComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.uml.marte.marText.impl.HwProcessorImpl#getNbCores <em>Nb Cores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwProcessorImpl extends ComponentImpl implements HwProcessor
{
  /**
   * The default value of the '{@link #getNbCores() <em>Nb Cores</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbCores()
   * @generated
   * @ordered
   */
  protected static final int NB_CORES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNbCores() <em>Nb Cores</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbCores()
   * @generated
   * @ordered
   */
  protected int nbCores = NB_CORES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HwProcessorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MarTextPackage.Literals.HW_PROCESSOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNbCores()
  {
    return nbCores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNbCores(int newNbCores)
  {
    int oldNbCores = nbCores;
    nbCores = newNbCores;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarTextPackage.HW_PROCESSOR__NB_CORES, oldNbCores, nbCores));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MarTextPackage.HW_PROCESSOR__NB_CORES:
        return getNbCores();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MarTextPackage.HW_PROCESSOR__NB_CORES:
        setNbCores((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MarTextPackage.HW_PROCESSOR__NB_CORES:
        setNbCores(NB_CORES_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MarTextPackage.HW_PROCESSOR__NB_CORES:
        return nbCores != NB_CORES_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nbCores: ");
    result.append(nbCores);
    result.append(')');
    return result.toString();
  }

} //HwProcessorImpl
