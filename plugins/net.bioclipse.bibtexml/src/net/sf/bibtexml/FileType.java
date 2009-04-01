/**
 * <copyright>
 * </copyright>
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
     * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
     * The list contents are of type {@link net.sf.bibtexml.BibTeXMLEntryType}.
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
    EList<BibTeXMLEntryType> getEntry();

} // FileType
