/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phdthesis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getSchool <em>School</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getYear <em>Year</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getCrossref <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.PhdthesisType#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType()
 * @model extendedMetaData="name='phdthesis_._type' kind='elementOnly'"
 * @generated
 */
public interface PhdthesisType extends EObject {
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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Author()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
     * @generated
     */
    String getAuthor();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getAuthor <em>Author</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>School</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [school] The name of the school where a thesis was written
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>School</em>' attribute.
     * @see #setSchool(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_School()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='school' namespace='##targetNamespace'"
     * @generated
     */
    String getSchool();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getSchool <em>School</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>School</em>' attribute.
     * @see #getSchool()
     * @generated
     */
    void setSchool(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Year()
     * @model dataType="org.eclipse.emf.ecore.xml.type.GYear" required="true"
     *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getYear();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getYear <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Year</em>' attribute.
     * @see #getYear()
     * @generated
     */
    void setYear(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [type] The type of a technical report-for example, ``Research Note''.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [address] Usually the address of the publisher or other type of
     *   institution  For major publishing houses, van~Leunen recommends
     *   omitting the information entirely.  For small publishers, on the other
     *   hand, you can help the reader by giving the complete address.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Address</em>' attribute.
     * @see #setAddress(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Address()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getAddress <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address</em>' attribute.
     * @see #getAddress()
     * @generated
     */
    void setAddress(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Month()
     * @model dataType="net.sf.bibtexml.MonthType"
     *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
     * @generated
     */
    Object getMonth();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getMonth <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Month</em>' attribute.
     * @see #getMonth()
     * @generated
     */
    void setMonth(Object value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Note()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
     * @generated
     */
    String getNote();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getNote <em>Note</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Key()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getKey <em>Key</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Crossref()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='crossref' namespace='##targetNamespace'"
     * @generated
     */
    String getCrossref();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getCrossref <em>Crossref</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Doi()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
     * @generated
     */
    String getDoi();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getDoi <em>Doi</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getPhdthesisType_Url()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
     * @generated
     */
    String getUrl();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.PhdthesisType#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(String value);

} // PhdthesisType
