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
package net.sf.bibtexml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.bibtexml.FileType#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.bibtexml.BibtexmlPackage#getFileType()
 * @model extendedMetaData="name='file_._type' kind='elementOnly'"
 * @generated
 */
public interface FileType extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
     * The list contents are of type {@link net.sf.bibtexml.EntryType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' containment reference list.
     * @see net.sf.bibtexml.BibtexmlPackage#getFileType_Entry()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
     * @generated
     */
    EList<EntryType> getEntry();

} // FileType
