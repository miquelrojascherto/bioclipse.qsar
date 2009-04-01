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
 * A representation of the model object '<em><b>Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.StructureType#isChanged <em>Changed</em>}</li>
 *   <li>{@link net.bioclipse.qsar.StructureType#getId <em>Id</em>}</li>
 *   <li>{@link net.bioclipse.qsar.StructureType#getInchi <em>Inchi</em>}</li>
 *   <li>{@link net.bioclipse.qsar.StructureType#getResourceid <em>Resourceid</em>}</li>
 *   <li>{@link net.bioclipse.qsar.StructureType#getResourceindex <em>Resourceindex</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getStructureType()
 * @model extendedMetaData="name='structureType' kind='empty'"
 * @generated
 */
public interface StructureType extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * Returns the value of the '<em><b>Changed</b></em>' attribute.
     * The default value is <code>"true"</code>.
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
     * @see net.bioclipse.qsar.QsarPackage#getStructureType_Changed()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" transient="true"
     *        extendedMetaData="kind='attribute' name='changed'"
     * @generated
     */
    boolean isChanged();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.StructureType#isChanged <em>Changed</em>}' attribute.
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
     * Unsets the value of the '{@link net.bioclipse.qsar.StructureType#isChanged <em>Changed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChanged()
     * @see #isChanged()
     * @see #setChanged(boolean)
     * @generated
     */
    void unsetChanged();

    /**
     * Returns whether the value of the '{@link net.bioclipse.qsar.StructureType#isChanged <em>Changed</em>}' attribute is set.
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
     * @see net.bioclipse.qsar.QsarPackage#getStructureType_Id()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.StructureType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Inchi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inchi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inchi</em>' attribute.
     * @see #setInchi(String)
     * @see net.bioclipse.qsar.QsarPackage#getStructureType_Inchi()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='inchi'"
     * @generated
     */
    String getInchi();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.StructureType#getInchi <em>Inchi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inchi</em>' attribute.
     * @see #getInchi()
     * @generated
     */
    void setInchi(String value);

    /**
     * Returns the value of the '<em><b>Resourceid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resourceid</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resourceid</em>' attribute.
     * @see #setResourceid(String)
     * @see net.bioclipse.qsar.QsarPackage#getStructureType_Resourceid()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='resourceid'"
     * @generated
     */
    String getResourceid();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.StructureType#getResourceid <em>Resourceid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resourceid</em>' attribute.
     * @see #getResourceid()
     * @generated
     */
    void setResourceid(String value);

    /**
     * Returns the value of the '<em><b>Resourceindex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resourceindex</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resourceindex</em>' attribute.
     * @see #isSetResourceindex()
     * @see #unsetResourceindex()
     * @see #setResourceindex(int)
     * @see net.bioclipse.qsar.QsarPackage#getStructureType_Resourceindex()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='resourceindex'"
     * @generated
     */
    int getResourceindex();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.StructureType#getResourceindex <em>Resourceindex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resourceindex</em>' attribute.
     * @see #isSetResourceindex()
     * @see #unsetResourceindex()
     * @see #getResourceindex()
     * @generated
     */
    void setResourceindex(int value);

    /**
     * Unsets the value of the '{@link net.bioclipse.qsar.StructureType#getResourceindex <em>Resourceindex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResourceindex()
     * @see #getResourceindex()
     * @see #setResourceindex(int)
     * @generated
     */
    void unsetResourceindex();

    /**
     * Returns whether the value of the '{@link net.bioclipse.qsar.StructureType#getResourceindex <em>Resourceindex</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resourceindex</em>' attribute is set.
     * @see #unsetResourceindex()
     * @see #getResourceindex()
     * @see #setResourceindex(int)
     * @generated
     */
    boolean isSetResourceindex();

} // StructureType
