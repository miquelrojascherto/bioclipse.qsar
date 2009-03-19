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

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getAnnote <em>Annote</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getArticle <em>Article</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getBook <em>Book</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getBooklet <em>Booklet</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getChapter <em>Chapter</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getConference <em>Conference</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getCrossref <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getEdition <em>Edition</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getEditor <em>Editor</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getEntry <em>Entry</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getFile <em>File</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getHowpublished <em>Howpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getInbook <em>Inbook</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getIncollection <em>Incollection</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getInproceedings <em>Inproceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getInstitution <em>Institution</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getJournal <em>Journal</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getManual <em>Manual</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getMastersthesis <em>Mastersthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getMisc <em>Misc</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getOrganization <em>Organization</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getPages <em>Pages</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getPhdthesis <em>Phdthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getProceedings <em>Proceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getSchool <em>School</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getTechreport <em>Techreport</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getUnpublished <em>Unpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getUrl <em>Url</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Address()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getAddress <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address</em>' attribute.
     * @see #getAddress()
     * @generated
     */
    void setAddress(String value);

    /**
     * Returns the value of the '<em><b>Annote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [annote] An annotation  It is not used by the standard bibliography
     *   styles, but may be used by others that produce an annotated
     *   bibliography.
     * 
     *       Annotation is not used by the standard bibliography styles,
     *       if you prefer otherwise, incude it in BibTeXML.common.fields.class
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Annote</em>' attribute.
     * @see #setAnnote(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Annote()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='annote' namespace='##targetNamespace'"
     * @generated
     */
    String getAnnote();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getAnnote <em>Annote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Annote</em>' attribute.
     * @see #getAnnote()
     * @generated
     */
    void setAnnote(String value);

    /**
     * Returns the value of the '<em><b>Article</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Article</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Article</em>' containment reference.
     * @see #setArticle(ArticleType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Article()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='article' namespace='##targetNamespace'"
     * @generated
     */
    ArticleType getArticle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getArticle <em>Article</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Article</em>' containment reference.
     * @see #getArticle()
     * @generated
     */
    void setArticle(ArticleType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Author()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
     * @generated
     */
    String getAuthor();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Author</em>' attribute.
     * @see #getAuthor()
     * @generated
     */
    void setAuthor(String value);

    /**
     * Returns the value of the '<em><b>Book</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Book</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Book</em>' containment reference.
     * @see #setBook(BookType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Book()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='book' namespace='##targetNamespace'"
     * @generated
     */
    BookType getBook();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getBook <em>Book</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Book</em>' containment reference.
     * @see #getBook()
     * @generated
     */
    void setBook(BookType value);

    /**
     * Returns the value of the '<em><b>Booklet</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Booklet</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Booklet</em>' containment reference.
     * @see #setBooklet(BookletType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Booklet()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='booklet' namespace='##targetNamespace'"
     * @generated
     */
    BookletType getBooklet();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getBooklet <em>Booklet</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Booklet</em>' containment reference.
     * @see #getBooklet()
     * @generated
     */
    void setBooklet(BookletType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Booktitle()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='booktitle' namespace='##targetNamespace'"
     * @generated
     */
    String getBooktitle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getBooktitle <em>Booktitle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Booktitle</em>' attribute.
     * @see #getBooktitle()
     * @generated
     */
    void setBooktitle(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Chapter()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='chapter' namespace='##targetNamespace'"
     * @generated
     */
    BigInteger getChapter();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getChapter <em>Chapter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chapter</em>' attribute.
     * @see #getChapter()
     * @generated
     */
    void setChapter(BigInteger value);

    /**
     * Returns the value of the '<em><b>Conference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conference</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conference</em>' containment reference.
     * @see #setConference(ConferenceType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Conference()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='conference' namespace='##targetNamespace'"
     * @generated
     */
    ConferenceType getConference();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getConference <em>Conference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conference</em>' containment reference.
     * @see #getConference()
     * @generated
     */
    void setConference(ConferenceType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Crossref()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='crossref' namespace='##targetNamespace'"
     * @generated
     */
    String getCrossref();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getCrossref <em>Crossref</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Doi()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doi' namespace='##targetNamespace'"
     * @generated
     */
    String getDoi();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getDoi <em>Doi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Doi</em>' attribute.
     * @see #getDoi()
     * @generated
     */
    void setDoi(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Edition()
     * @model unique="false" dataType="net.sf.bibtexml.EditionType" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='edition' namespace='##targetNamespace'"
     * @generated
     */
    String getEdition();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getEdition <em>Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Edition</em>' attribute.
     * @see #getEdition()
     * @generated
     */
    void setEdition(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Editor()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='editor' namespace='##targetNamespace'"
     * @generated
     */
    String getEditor();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getEditor <em>Editor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Editor</em>' attribute.
     * @see #getEditor()
     * @generated
     */
    void setEditor(String value);

    /**
     * Returns the value of the '<em><b>Entry</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' containment reference.
     * @see #setEntry(EntryType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Entry()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
     * @generated
     */
    EntryType getEntry();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getEntry <em>Entry</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entry</em>' containment reference.
     * @see #getEntry()
     * @generated
     */
    void setEntry(EntryType value);

    /**
     * Returns the value of the '<em><b>File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File</em>' containment reference.
     * @see #setFile(FileType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_File()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='file' namespace='##targetNamespace'"
     * @generated
     */
    FileType getFile();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getFile <em>File</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File</em>' containment reference.
     * @see #getFile()
     * @generated
     */
    void setFile(FileType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Howpublished()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='howpublished' namespace='##targetNamespace'"
     * @generated
     */
    String getHowpublished();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getHowpublished <em>Howpublished</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Howpublished</em>' attribute.
     * @see #getHowpublished()
     * @generated
     */
    void setHowpublished(String value);

    /**
     * Returns the value of the '<em><b>Inbook</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inbook</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inbook</em>' containment reference.
     * @see #setInbook(InbookType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Inbook()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inbook' namespace='##targetNamespace'"
     * @generated
     */
    InbookType getInbook();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getInbook <em>Inbook</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inbook</em>' containment reference.
     * @see #getInbook()
     * @generated
     */
    void setInbook(InbookType value);

    /**
     * Returns the value of the '<em><b>Incollection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incollection</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incollection</em>' containment reference.
     * @see #setIncollection(IncollectionType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Incollection()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='incollection' namespace='##targetNamespace'"
     * @generated
     */
    IncollectionType getIncollection();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getIncollection <em>Incollection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incollection</em>' containment reference.
     * @see #getIncollection()
     * @generated
     */
    void setIncollection(IncollectionType value);

    /**
     * Returns the value of the '<em><b>Inproceedings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inproceedings</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inproceedings</em>' containment reference.
     * @see #setInproceedings(InproceedingsType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Inproceedings()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inproceedings' namespace='##targetNamespace'"
     * @generated
     */
    InproceedingsType getInproceedings();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getInproceedings <em>Inproceedings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inproceedings</em>' containment reference.
     * @see #getInproceedings()
     * @generated
     */
    void setInproceedings(InproceedingsType value);

    /**
     * Returns the value of the '<em><b>Institution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [institution] The sponsoring institution of a technical report.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Institution</em>' attribute.
     * @see #setInstitution(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Institution()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='institution' namespace='##targetNamespace'"
     * @generated
     */
    String getInstitution();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getInstitution <em>Institution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Institution</em>' attribute.
     * @see #getInstitution()
     * @generated
     */
    void setInstitution(String value);

    /**
     * Returns the value of the '<em><b>Journal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * [journal] A journal name.  Abbreviations are provided for many
     *   journals; see the Local Guide.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Journal</em>' attribute.
     * @see #setJournal(String)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Journal()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='journal' namespace='##targetNamespace'"
     * @generated
     */
    String getJournal();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getJournal <em>Journal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Journal</em>' attribute.
     * @see #getJournal()
     * @generated
     */
    void setJournal(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Key()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
     * @generated
     */
    String getKey();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #getKey()
     * @generated
     */
    void setKey(String value);

    /**
     * Returns the value of the '<em><b>Manual</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manual</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manual</em>' containment reference.
     * @see #setManual(ManualType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Manual()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='manual' namespace='##targetNamespace'"
     * @generated
     */
    ManualType getManual();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getManual <em>Manual</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manual</em>' containment reference.
     * @see #getManual()
     * @generated
     */
    void setManual(ManualType value);

    /**
     * Returns the value of the '<em><b>Mastersthesis</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mastersthesis</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mastersthesis</em>' containment reference.
     * @see #setMastersthesis(MastersthesisType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Mastersthesis()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='mastersthesis' namespace='##targetNamespace'"
     * @generated
     */
    MastersthesisType getMastersthesis();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getMastersthesis <em>Mastersthesis</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mastersthesis</em>' containment reference.
     * @see #getMastersthesis()
     * @generated
     */
    void setMastersthesis(MastersthesisType value);

    /**
     * Returns the value of the '<em><b>Misc</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Misc</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Misc</em>' containment reference.
     * @see #setMisc(MiscType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Misc()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='misc' namespace='##targetNamespace'"
     * @generated
     */
    MiscType getMisc();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getMisc <em>Misc</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Misc</em>' containment reference.
     * @see #getMisc()
     * @generated
     */
    void setMisc(MiscType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Month()
     * @model unique="false" dataType="net.sf.bibtexml.MonthType" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='month' namespace='##targetNamespace'"
     * @generated
     */
    Object getMonth();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getMonth <em>Month</em>}' attribute.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Note()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
     * @generated
     */
    String getNote();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getNote <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Note</em>' attribute.
     * @see #getNote()
     * @generated
     */
    void setNote(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Number()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
     * @generated
     */
    String getNumber();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number</em>' attribute.
     * @see #getNumber()
     * @generated
     */
    void setNumber(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Organization()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
     * @generated
     */
    String getOrganization();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getOrganization <em>Organization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Organization</em>' attribute.
     * @see #getOrganization()
     * @generated
     */
    void setOrganization(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Pages()
     * @model unique="false" dataType="net.sf.bibtexml.PagesType" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pages' namespace='##targetNamespace'"
     * @generated
     */
    String getPages();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getPages <em>Pages</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pages</em>' attribute.
     * @see #getPages()
     * @generated
     */
    void setPages(String value);

    /**
     * Returns the value of the '<em><b>Phdthesis</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phdthesis</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phdthesis</em>' containment reference.
     * @see #setPhdthesis(PhdthesisType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Phdthesis()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='phdthesis' namespace='##targetNamespace'"
     * @generated
     */
    PhdthesisType getPhdthesis();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getPhdthesis <em>Phdthesis</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phdthesis</em>' containment reference.
     * @see #getPhdthesis()
     * @generated
     */
    void setPhdthesis(PhdthesisType value);

    /**
     * Returns the value of the '<em><b>Proceedings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Proceedings</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Proceedings</em>' containment reference.
     * @see #setProceedings(ProceedingsType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Proceedings()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='proceedings' namespace='##targetNamespace'"
     * @generated
     */
    ProceedingsType getProceedings();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getProceedings <em>Proceedings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proceedings</em>' containment reference.
     * @see #getProceedings()
     * @generated
     */
    void setProceedings(ProceedingsType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Publisher()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
     * @generated
     */
    String getPublisher();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getPublisher <em>Publisher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Publisher</em>' attribute.
     * @see #getPublisher()
     * @generated
     */
    void setPublisher(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_School()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='school' namespace='##targetNamespace'"
     * @generated
     */
    String getSchool();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getSchool <em>School</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>School</em>' attribute.
     * @see #getSchool()
     * @generated
     */
    void setSchool(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Series()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
     * @generated
     */
    String getSeries();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getSeries <em>Series</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Series</em>' attribute.
     * @see #getSeries()
     * @generated
     */
    void setSeries(String value);

    /**
     * Returns the value of the '<em><b>Techreport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Techreport</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Techreport</em>' containment reference.
     * @see #setTechreport(TechreportType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Techreport()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='techreport' namespace='##targetNamespace'"
     * @generated
     */
    TechreportType getTechreport();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getTechreport <em>Techreport</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Techreport</em>' containment reference.
     * @see #getTechreport()
     * @generated
     */
    void setTechreport(TechreportType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Title()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Type()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Unpublished</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unpublished</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unpublished</em>' containment reference.
     * @see #setUnpublished(UnpublishedType)
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Unpublished()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='unpublished' namespace='##targetNamespace'"
     * @generated
     */
    UnpublishedType getUnpublished();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getUnpublished <em>Unpublished</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unpublished</em>' containment reference.
     * @see #getUnpublished()
     * @generated
     */
    void setUnpublished(UnpublishedType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Url()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
     * @generated
     */
    String getUrl();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Volume()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='volume' namespace='##targetNamespace'"
     * @generated
     */
    String getVolume();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getVolume <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Volume</em>' attribute.
     * @see #getVolume()
     * @generated
     */
    void setVolume(String value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getDocumentRoot_Year()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.GYear" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='year' namespace='##targetNamespace'"
     * @generated
     */
    XMLGregorianCalendar getYear();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.DocumentRoot#getYear <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Year</em>' attribute.
     * @see #getYear()
     * @generated
     */
    void setYear(XMLGregorianCalendar value);

} // DocumentRoot
