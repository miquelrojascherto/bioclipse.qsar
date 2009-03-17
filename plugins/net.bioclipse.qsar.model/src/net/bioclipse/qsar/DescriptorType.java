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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.DescriptorType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorType#isChanged <em>Changed</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorType#getId <em>Id</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorType#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getDescriptorType()
 * @model extendedMetaData="name='descriptorType' kind='elementOnly'"
 * @generated
 */
public interface DescriptorType extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
     * The list contents are of type {@link net.bioclipse.qsar.ParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see net.bioclipse.qsar.QsarPackage#getDescriptorType_Parameter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='parameter'"
     * @generated
     */
    EList<ParameterType> getParameter();

    /**
     * Returns the value of the '<em><b>Changed</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changed</em>' attribute.
     * @see #isSetChanged()
     * @see #unsetChanged()
     * @see #setChanged(boolean)
     * @see net.bioclipse.qsar.QsarPackage#getDescriptorType_Changed()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" transient="true"
     *        extendedMetaData="kind='attribute' name='changed'"
     * @generated
     */
    boolean isChanged();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.DescriptorType#isChanged <em>Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changed</em>' attribute.
     * @see #isSetChanged()
     * @see #unsetChanged()
     * @see #isChanged()
     * @generated
     */
    void setChanged(boolean value);

    /**
     * Unsets the value of the '{@link net.bioclipse.qsar.DescriptorType#isChanged <em>Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChanged()
     * @see #isChanged()
     * @see #setChanged(boolean)
     * @generated
     */
    void unsetChanged();

    /**
     * Returns whether the value of the '{@link net.bioclipse.qsar.DescriptorType#isChanged <em>Changed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changed</em>' attribute is set.
     * @see #unsetChanged()
     * @see #isChanged()
     * @see #setChanged(boolean)
     * @generated
     */
    boolean isSetChanged();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see net.bioclipse.qsar.QsarPackage#getDescriptorType_Id()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.DescriptorType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' attribute.
     * @see #setNamespace(String)
     * @see net.bioclipse.qsar.QsarPackage#getDescriptorType_Namespace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='namespace'"
     * @generated
     */
    String getNamespace();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.DescriptorType#getNamespace <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' attribute.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(String value);

    /**
     * Returns the value of the '<em><b>Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provider</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provider</em>' attribute.
     * @see #setProvider(String)
     * @see net.bioclipse.qsar.QsarPackage#getDescriptorType_Provider()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='provider'"
     * @generated
     */
    String getProvider();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.DescriptorType#getProvider <em>Provider</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provider</em>' attribute.
     * @see #getProvider()
     * @generated
     */
    void setProvider(String value);

} // DescriptorType
