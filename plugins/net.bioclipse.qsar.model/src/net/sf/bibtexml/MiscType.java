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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Misc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.bibtexml.MiscType#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getHowpublished <em>Howpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getYear <em>Year</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getCrossref <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.MiscType#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.bibtexml.BibtexmlPackage#getMiscType()
 * @model extendedMetaData="name='misc_._type' kind='elementOnly'"
 * @generated
 */
public interface MiscType extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * Returns the value of the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [author] The name(s) of the author(s),
     *   in the format described in the LaTeX book.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Author</em>' attribute.
     * @see #setAuthor(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Author()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
     * @generated
     */
    String getAuthor();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Author</em>' attribute.
     * @see #getAuthor()
     * @generated
     */
    void setAuthor(String value);

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [title] The work's title, typed as explained in the LaTeX book.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Howpublished</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [howpublished] How something strange has been published.
     *   The first word should be capitalized.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Howpublished</em>' attribute.
     * @see #setHowpublished(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Howpublished()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='howpublished' namespace='##targetNamespace'"
     * @generated
     */
    String getHowpublished();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getHowpublished <em>Howpublished</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Howpublished</em>' attribute.
     * @see #getHowpublished()
     * @generated
     */
    void setHowpublished(String value);

    /**
     * Returns the value of the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [month] The month in which the work was published or, for an
     *   unpublished work, in which it was written. You should use the
     *   standard three-letter abbreviation, as described in Appendix B.1.3 of
     *   the LaTeX book.
     *   The schema also allows a two digit month format, e.g. 05 (for May).
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Month</em>' attribute.
     * @see #setMonth(Object)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Month()
     * @model dataType="net.sf.bibtexml.MonthType"
     *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
     * @generated
     */
    Object getMonth();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getMonth <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Month</em>' attribute.
     * @see #getMonth()
     * @generated
     */
    void setMonth(Object value);

    /**
     * Returns the value of the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [year] The year of publication or, for an unpublished work, the year
     *   it was written.  Generally it should consist of four numerals, such as
     *   1984, although the standard styles can handle any year whose last four
     *   nonpunctuation characters are numerals, such as `(about 1984)'.
     *   The schema will restrict validation of the year to four numerals,
     *   as such a type is pre-defined in XML Schema.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Year</em>' attribute.
     * @see #setYear(XMLGregorianCalendar)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Year()
     * @model dataType="org.eclipse.emf.ecore.xml.type.GYear"
     *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getYear();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getYear <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Year</em>' attribute.
     * @see #getYear()
     * @generated
     */
    void setYear(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [note] Any additional information that can help the reader.
     *   The first word should be capitalized.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Note</em>' attribute.
     * @see #setNote(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Note()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
     * @generated
     */
    String getNote();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getNote <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Note</em>' attribute.
     * @see #getNote()
     * @generated
     */
    void setNote(String value);

    /**
     * Returns the value of the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [key] Used for alphabetizing, cross referencing, and creating a label
     *   when the ``author'' information (described in Section [ref: ] is
     *   missing. This field should not be confused with the key that appears
     *   in the \cite command and at the beginning of the database entry.
     * 
     *   In addition to the fields listed above, each entry type also has
     *   an optional key field, used in some styles for alphabetizing, or
     *   for forming a \bibitem label. You should include a key field for
     *   any entry whose ``author'' information is missing;
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Key</em>' attribute.
     * @see #setKey(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Key()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #getKey()
     * @generated
     */
    void setKey(String value);

    /**
     * Returns the value of the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [crossref] The database key of the entry being cross referenced.
     *   BibTEX has a new cross-referencing feature, explained by an example.
     *     @INPROCEEDINGS(no-gnats,
     *         crossref = "gg-proceedings",
     *     @PROCEEDINGS(gg-proceedings,
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Crossref</em>' attribute.
     * @see #setCrossref(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Crossref()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='crossref' namespace='##targetNamespace'"
     * @generated
     */
    String getCrossref();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getCrossref <em>Crossref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crossref</em>' attribute.
     * @see #getCrossref()
     * @generated
     */
    void setCrossref(String value);

    /**
     * Returns the value of the '<em><b>Doi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [DOI] The work's Digital Object Identifier.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Doi</em>' attribute.
     * @see #setDoi(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Doi()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
     * @generated
     */
    String getDoi();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getDoi <em>Doi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Doi</em>' attribute.
     * @see #getDoi()
     * @generated
     */
    void setDoi(String value);

    /**
     * Returns the value of the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [URL] The work's Universal Resource Locator.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Url</em>' attribute.
     * @see #setUrl(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getMiscType_Url()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
     * @generated
     */
    String getUrl();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.MiscType#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(String value);

} // MiscType
