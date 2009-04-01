/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bib Te XML Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntryType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntryType()
 * @model extendedMetaData="name='BibTeXML.entryType' kind='elementOnly'"
 * @generated
 */
public interface BibTeXMLEntryType extends BibTeXMLEntriesClass {
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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntryType_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntryType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // BibTeXMLEntryType
