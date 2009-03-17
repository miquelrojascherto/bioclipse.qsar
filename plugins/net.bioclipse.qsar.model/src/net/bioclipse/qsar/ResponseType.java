/**
 *  Copyright (c) 2009 Ola Spjuth
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package net.bioclipse.qsar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getArrayValues <em>Array Values</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getStructureID <em>Structure ID</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getResponseType()
 * @model extendedMetaData="name='responseType' kind='elementOnly'"
 * @generated
 */
public interface ResponseType extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #setValue(float)
     * @see net.bioclipse.qsar.QsarPackage#getResponseType_Value()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
     *        extendedMetaData="kind='element' name='value'"
     * @generated
     */
    float getValue();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue(float value);

    /**
     * Unsets the value of the '{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(float)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(float)
     * @generated
     */
    boolean isSetValue();

    /**
     * Returns the value of the '<em><b>Array Values</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Array Values</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Array Values</em>' attribute.
     * @see #setArrayValues(String)
     * @see net.bioclipse.qsar.QsarPackage#getResponseType_ArrayValues()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='arrayValues'"
     * @generated
     */
    String getArrayValues();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getArrayValues <em>Array Values</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Array Values</em>' attribute.
     * @see #getArrayValues()
     * @generated
     */
    void setArrayValues(String value);

    /**
     * Returns the value of the '<em><b>Structure ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structure ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structure ID</em>' attribute.
     * @see #setStructureID(String)
     * @see net.bioclipse.qsar.QsarPackage#getResponseType_StructureID()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='structureID'"
     * @generated
     */
    String getStructureID();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getStructureID <em>Structure ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Structure ID</em>' attribute.
     * @see #getStructureID()
     * @generated
     */
    void setStructureID(String value);

    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see #setUnit(String)
     * @see net.bioclipse.qsar.QsarPackage#getResponseType_Unit()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='unit'"
     * @generated
     */
    String getUnit();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #getUnit()
     * @generated
     */
    void setUnit(String value);

} // ResponseType
