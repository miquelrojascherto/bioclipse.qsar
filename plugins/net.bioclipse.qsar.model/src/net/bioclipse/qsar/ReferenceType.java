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
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.ReferenceType#getAuthors <em>Authors</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ReferenceType#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ReferenceType#getJournal <em>Journal</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ReferenceType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ReferenceType#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getReferenceType()
 * @model extendedMetaData="name='referenceType' kind='empty'"
 * @generated
 */
public interface ReferenceType extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * Returns the value of the '<em><b>Authors</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authors</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authors</em>' attribute.
     * @see #setAuthors(String)
     * @see net.bioclipse.qsar.QsarPackage#getReferenceType_Authors()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='authors'"
     * @generated
     */
    String getAuthors();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ReferenceType#getAuthors <em>Authors</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authors</em>' attribute.
     * @see #getAuthors()
     * @generated
     */
    void setAuthors(String value);

    /**
     * Returns the value of the '<em><b>Doi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Doi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Doi</em>' attribute.
     * @see #setDoi(String)
     * @see net.bioclipse.qsar.QsarPackage#getReferenceType_Doi()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='doi'"
     * @generated
     */
    String getDoi();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ReferenceType#getDoi <em>Doi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Doi</em>' attribute.
     * @see #getDoi()
     * @generated
     */
    void setDoi(String value);

    /**
     * Returns the value of the '<em><b>Journal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Journal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Journal</em>' attribute.
     * @see #setJournal(String)
     * @see net.bioclipse.qsar.QsarPackage#getReferenceType_Journal()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='journal'"
     * @generated
     */
    String getJournal();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ReferenceType#getJournal <em>Journal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Journal</em>' attribute.
     * @see #getJournal()
     * @generated
     */
    void setJournal(String value);

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see net.bioclipse.qsar.QsarPackage#getReferenceType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='title'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ReferenceType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Year</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Year</em>' attribute.
     * @see #setYear(String)
     * @see net.bioclipse.qsar.QsarPackage#getReferenceType_Year()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='year'"
     * @generated
     */
    String getYear();

    /**
     * Sets the value of the '{@link net.bioclipse.qsar.ReferenceType#getYear <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Year</em>' attribute.
     * @see #getYear()
     * @generated
     */
    void setYear(String value);

} // ReferenceType
