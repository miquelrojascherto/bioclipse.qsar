/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incollection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getYear <em>Year</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getEditor <em>Editor</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getChapter <em>Chapter</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getPages <em>Pages</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getEdition <em>Edition</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.IncollectionType#getCrossref <em>Crossref</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType()
 * @model extendedMetaData="name='incollection_._type' kind='elementOnly'"
 * @generated
 */
public interface IncollectionType extends EObject {
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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Author()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
     * @generated
     */
    String getAuthor();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getAuthor <em>Author</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Title()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Booktitle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [booktitle] Title of a book, part of which is being cited.  See the
     *   LaTeX book for how to type titles.  For book entries, use the title
     *   field instead.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Booktitle</em>' attribute.
     * @see #setBooktitle(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Booktitle()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='booktitle' namespace='##targetNamespace'"
     * @generated
     */
    String getBooktitle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getBooktitle <em>Booktitle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Booktitle</em>' attribute.
     * @see #getBooktitle()
     * @generated
     */
    void setBooktitle(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Publisher()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
     * @generated
     */
    String getPublisher();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getPublisher <em>Publisher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publisher</em>' attribute.
     * @see #getPublisher()
     * @generated
     */
    void setPublisher(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Year()
     * @model dataType="org.eclipse.emf.ecore.xml.type.GYear" required="true"
     *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getYear();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getYear <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Year</em>' attribute.
     * @see #getYear()
     * @generated
     */
    void setYear(XMLGregorianCalendar value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Editor()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace'"
     * @generated
     */
    String getEditor();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getEditor <em>Editor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor</em>' attribute.
     * @see #getEditor()
     * @generated
     */
    void setEditor(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Volume()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
     * @generated
     */
    String getVolume();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getVolume <em>Volume</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Number()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
     * @generated
     */
    String getNumber();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getNumber <em>Number</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Series()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
     * @generated
     */
    String getSeries();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getSeries <em>Series</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Series</em>' attribute.
     * @see #getSeries()
     * @generated
     */
    void setSeries(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Chapter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [chapter] A chapter (or section or whatever) number.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Chapter</em>' attribute.
     * @see #setChapter(BigInteger)
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Chapter()
     * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
     *        extendedMetaData="kind='element' name='chapter' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getChapter();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getChapter <em>Chapter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chapter</em>' attribute.
     * @see #getChapter()
     * @generated
     */
    void setChapter(BigInteger value);

    /**
     * Returns the value of the '<em><b>Pages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [pages] One or more page numbers or range of numbers, such as 42-111
     *   or 7,41,73-97 or 43+ (the `+' in this last example indicates pages
     *   following that don't form a simple range).  To make it easier to
     *   maintain Scribe-compatible databases, the standard styles convert a
     *   single dash (as in 7-33) to the double dash used in TeX to denote
     *   number ranges (as in 7-33).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pages</em>' attribute.
     * @see #setPages(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Pages()
     * @model dataType="net.sf.bibtexml.PagesType"
     *        extendedMetaData="kind='element' name='pages' namespace='##targetNamespace'"
     * @generated
     */
    String getPages();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getPages <em>Pages</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pages</em>' attribute.
     * @see #getPages()
     * @generated
     */
    void setPages(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Address()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getAddress <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address</em>' attribute.
     * @see #getAddress()
     * @generated
     */
    void setAddress(String value);

    /**
     * Returns the value of the '<em><b>Edition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [edition] The edition of a book-for example, ``Second''.  This
     *   should be an ordinal, and should have the first letter capitalized, as
     *   shown here; the standard styles convert to lower case when necessary.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Edition</em>' attribute.
     * @see #setEdition(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Edition()
     * @model dataType="net.sf.bibtexml.EditionType"
     *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace'"
     * @generated
     */
    String getEdition();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getEdition <em>Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Edition</em>' attribute.
     * @see #getEdition()
     * @generated
     */
    void setEdition(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Month()
     * @model dataType="net.sf.bibtexml.MonthType"
     *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
     * @generated
     */
    Object getMonth();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getMonth <em>Month</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Note()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
     * @generated
     */
    String getNote();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getNote <em>Note</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Key()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getKey <em>Key</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getIncollectionType_Crossref()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='crossref' namespace='##targetNamespace'"
     * @generated
     */
    String getCrossref();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.IncollectionType#getCrossref <em>Crossref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crossref</em>' attribute.
     * @see #getCrossref()
     * @generated
     */
    void setCrossref(String value);

} // IncollectionType
