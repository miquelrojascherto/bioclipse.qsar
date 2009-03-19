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
 * A representation of the model object '<em><b>Proceedings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getEditor <em>Editor</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getYear <em>Year</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getCrossref <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.ProceedingsType#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType()
 * @model extendedMetaData="name='proceedings_._type' kind='elementOnly'"
 * @generated
 */
public interface ProceedingsType extends EObject {
    /**
     * Returns the value of the '<em><b>Editor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [editor] Name(s) of editor(s), typed as indicated in the LaTeX book.
     *   If there is also an author field, then the editor field gives the
     *   editor of the book or collection in which the reference appears.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Editor</em>' attribute.
     * @see #setEditor(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Editor()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace'"
     * @generated
     */
    String getEditor();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getEditor <em>Editor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor</em>' attribute.
     * @see #getEditor()
     * @generated
     */
    void setEditor(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getTitle <em>Title</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Year()
     * @model dataType="org.eclipse.emf.ecore.xml.type.GYear" required="true"
     *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getYear();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getYear <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Year</em>' attribute.
     * @see #getYear()
     * @generated
     */
    void setYear(XMLGregorianCalendar value);

    /**
     * Returns the value of the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [volume] The volume of a journal or multivolume book.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Volume</em>' attribute.
     * @see #setVolume(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Volume()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
     * @generated
     */
    String getVolume();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getVolume <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Volume</em>' attribute.
     * @see #getVolume()
     * @generated
     */
    void setVolume(String value);

    /**
     * Returns the value of the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [number] The number of a journal, magazine, technical report, or of a
     *   work in a series.  An issue of a journal or magazine is usually
     *   identified by its volume and number; the organization that issues a
     *   technical report usually gives it a number; and sometimes books are
     *   given numbers in a named series.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Number</em>' attribute.
     * @see #setNumber(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Number()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
     * @generated
     */
    String getNumber();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number</em>' attribute.
     * @see #getNumber()
     * @generated
     */
    void setNumber(String value);

    /**
     * Returns the value of the '<em><b>Series</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [series] The name of a series or set of books.  When citing an entire
     *   book, the the title field gives its title and an optional series field
     *   gives the name of a series or multi-volume set in which the book is
     *   published.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Series</em>' attribute.
     * @see #setSeries(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Series()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
     * @generated
     */
    String getSeries();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getSeries <em>Series</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Series</em>' attribute.
     * @see #getSeries()
     * @generated
     */
    void setSeries(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Address()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getAddress <em>Address</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Month()
     * @model dataType="net.sf.bibtexml.MonthType"
     *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
     * @generated
     */
    Object getMonth();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getMonth <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Month</em>' attribute.
     * @see #getMonth()
     * @generated
     */
    void setMonth(Object value);

    /**
     * Returns the value of the '<em><b>Organization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [organization] The organization that sponsors a conference or that
     *   publishes a manual.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Organization</em>' attribute.
     * @see #setOrganization(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Organization()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
     * @generated
     */
    String getOrganization();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getOrganization <em>Organization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Organization</em>' attribute.
     * @see #getOrganization()
     * @generated
     */
    void setOrganization(String value);

    /**
     * Returns the value of the '<em><b>Publisher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [publisher] The publisher's name.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Publisher</em>' attribute.
     * @see #setPublisher(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Publisher()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
     * @generated
     */
    String getPublisher();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getPublisher <em>Publisher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publisher</em>' attribute.
     * @see #getPublisher()
     * @generated
     */
    void setPublisher(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Note()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
     * @generated
     */
    String getNote();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getNote <em>Note</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Key()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getKey <em>Key</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Crossref()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='crossref' namespace='##targetNamespace'"
     * @generated
     */
    String getCrossref();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getCrossref <em>Crossref</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Doi()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
     * @generated
     */
    String getDoi();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getDoi <em>Doi</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getProceedingsType_Url()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
     * @generated
     */
    String getUrl();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.ProceedingsType#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(String value);

} // ProceedingsType
