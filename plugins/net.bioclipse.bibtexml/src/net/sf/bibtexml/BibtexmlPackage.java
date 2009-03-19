/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <![CDATA[
 * 
 *   This schema expresses XML markup similar to the BibTeX language
 *   specified for LaTeX, or actually its content model.
 *   For documentation on BibTeX, see
 *     http://www.ctan.org/tex-archive/biblio/bibtex/distribs/doc/
 * 
 *   Suggested invocation:
 * 
 *     <?xml version="1.0" encoding="UTF-8"?>
 *     <bibtex:file xmlns:bibtex="http://bibtexml.sf.net/
 *           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *           xsi:schemaLocation="http://bibtexml.sf.net/ bibtexml.xsd">
 *     ...
 *     </bibtex:file>
 * 
 *   Available from  http://bibtexml.sf.net/
 * 
 *   This code originally developed by
 *     Vidar Bronken Gundersen
 *     Zeger W. Hendrikse
 * 
 *   This program is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU General Public License.
 *   See  http://www.gnu.org/copyleft/gpl.html
 * 
 *   Todo:
 *     Make fully modular and reusable.
 * 
 *   ]]>
 * <!-- end-model-doc -->
 * @see net.sf.bibtexml.BibtexmlFactory
 * @model kind="package"
 * @generated
 */
public interface BibtexmlPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "bibtexml";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://bibtexml.sf.net/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "bibtexml";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    BibtexmlPackage eINSTANCE = net.sf.bibtexml.impl.BibtexmlPackageImpl.init();

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.ArticleTypeImpl <em>Article Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.ArticleTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getArticleType()
     * @generated
     */
    int ARTICLE_TYPE = 0;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Journal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__JOURNAL = 2;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__YEAR = 3;

    /**
     * The feature id for the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__VOLUME = 4;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__NUMBER = 5;

    /**
     * The feature id for the '<em><b>Pages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__PAGES = 6;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__MONTH = 7;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__NOTE = 8;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__KEY = 9;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE__CROSSREF = 10;

    /**
     * The number of structural features of the '<em>Article Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARTICLE_TYPE_FEATURE_COUNT = 11;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl <em>Bib Te XML Entries Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getBibTeXMLEntriesClass()
     * @generated
     */
    int BIB_TE_XML_ENTRIES_CLASS = 1;

    /**
     * The feature id for the '<em><b>Article</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__ARTICLE = 0;

    /**
     * The feature id for the '<em><b>Book</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__BOOK = 1;

    /**
     * The feature id for the '<em><b>Booklet</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__BOOKLET = 2;

    /**
     * The feature id for the '<em><b>Manual</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__MANUAL = 3;

    /**
     * The feature id for the '<em><b>Techreport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__TECHREPORT = 4;

    /**
     * The feature id for the '<em><b>Mastersthesis</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS = 5;

    /**
     * The feature id for the '<em><b>Phdthesis</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS = 6;

    /**
     * The feature id for the '<em><b>Inbook</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__INBOOK = 7;

    /**
     * The feature id for the '<em><b>Incollection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION = 8;

    /**
     * The feature id for the '<em><b>Proceedings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS = 9;

    /**
     * The feature id for the '<em><b>Inproceedings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS = 10;

    /**
     * The feature id for the '<em><b>Conference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__CONFERENCE = 11;

    /**
     * The feature id for the '<em><b>Unpublished</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED = 12;

    /**
     * The feature id for the '<em><b>Misc</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS__MISC = 13;

    /**
     * The number of structural features of the '<em>Bib Te XML Entries Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIB_TE_XML_ENTRIES_CLASS_FEATURE_COUNT = 14;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.BookletTypeImpl <em>Booklet Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.BookletTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getBookletType()
     * @generated
     */
    int BOOKLET_TYPE = 2;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Howpublished</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__HOWPUBLISHED = 2;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__ADDRESS = 3;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__MONTH = 4;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__YEAR = 5;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__NOTE = 6;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__KEY = 7;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE__CROSSREF = 8;

    /**
     * The number of structural features of the '<em>Booklet Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKLET_TYPE_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.BookTypeImpl <em>Book Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.BookTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getBookType()
     * @generated
     */
    int BOOK_TYPE = 3;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Editor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__EDITOR = 1;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__TITLE = 2;

    /**
     * The feature id for the '<em><b>Publisher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__PUBLISHER = 3;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__YEAR = 4;

    /**
     * The feature id for the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__VOLUME = 5;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__NUMBER = 6;

    /**
     * The feature id for the '<em><b>Series</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__SERIES = 7;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__ADDRESS = 8;

    /**
     * The feature id for the '<em><b>Edition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__EDITION = 9;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__MONTH = 10;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__NOTE = 11;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__KEY = 12;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE__CROSSREF = 13;

    /**
     * The number of structural features of the '<em>Book Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOK_TYPE_FEATURE_COUNT = 14;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.ConferenceTypeImpl <em>Conference Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.ConferenceTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getConferenceType()
     * @generated
     */
    int CONFERENCE_TYPE = 4;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Booktitle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__BOOKTITLE = 2;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__YEAR = 3;

    /**
     * The feature id for the '<em><b>Editor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__EDITOR = 4;

    /**
     * The feature id for the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__VOLUME = 5;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__NUMBER = 6;

    /**
     * The feature id for the '<em><b>Series</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__SERIES = 7;

    /**
     * The feature id for the '<em><b>Pages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__PAGES = 8;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__ADDRESS = 9;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__MONTH = 10;

    /**
     * The feature id for the '<em><b>Organization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__ORGANIZATION = 11;

    /**
     * The feature id for the '<em><b>Publisher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__PUBLISHER = 12;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__NOTE = 13;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__KEY = 14;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE__CROSSREF = 15;

    /**
     * The number of structural features of the '<em>Conference Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFERENCE_TYPE_FEATURE_COUNT = 16;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.DocumentRootImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 5;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ADDRESS = 3;

    /**
     * The feature id for the '<em><b>Annote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ANNOTE = 4;

    /**
     * The feature id for the '<em><b>Article</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ARTICLE = 5;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__AUTHOR = 6;

    /**
     * The feature id for the '<em><b>Book</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BOOK = 7;

    /**
     * The feature id for the '<em><b>Booklet</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BOOKLET = 8;

    /**
     * The feature id for the '<em><b>Booktitle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__BOOKTITLE = 9;

    /**
     * The feature id for the '<em><b>Chapter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CHAPTER = 10;

    /**
     * The feature id for the '<em><b>Conference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CONFERENCE = 11;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__CROSSREF = 12;

    /**
     * The feature id for the '<em><b>Edition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EDITION = 13;

    /**
     * The feature id for the '<em><b>Editor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__EDITOR = 14;

    /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ENTRY = 15;

    /**
     * The feature id for the '<em><b>File</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__FILE = 16;

    /**
     * The feature id for the '<em><b>Howpublished</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__HOWPUBLISHED = 17;

    /**
     * The feature id for the '<em><b>Inbook</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INBOOK = 18;

    /**
     * The feature id for the '<em><b>Incollection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INCOLLECTION = 19;

    /**
     * The feature id for the '<em><b>Inproceedings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INPROCEEDINGS = 20;

    /**
     * The feature id for the '<em><b>Institution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__INSTITUTION = 21;

    /**
     * The feature id for the '<em><b>Journal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__JOURNAL = 22;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__KEY = 23;

    /**
     * The feature id for the '<em><b>Manual</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MANUAL = 24;

    /**
     * The feature id for the '<em><b>Mastersthesis</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MASTERSTHESIS = 25;

    /**
     * The feature id for the '<em><b>Misc</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MISC = 26;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MONTH = 27;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NOTE = 28;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__NUMBER = 29;

    /**
     * The feature id for the '<em><b>Organization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ORGANIZATION = 30;

    /**
     * The feature id for the '<em><b>Pages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PAGES = 31;

    /**
     * The feature id for the '<em><b>Phdthesis</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PHDTHESIS = 32;

    /**
     * The feature id for the '<em><b>Proceedings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PROCEEDINGS = 33;

    /**
     * The feature id for the '<em><b>Publisher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__PUBLISHER = 34;

    /**
     * The feature id for the '<em><b>School</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SCHOOL = 35;

    /**
     * The feature id for the '<em><b>Series</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__SERIES = 36;

    /**
     * The feature id for the '<em><b>Techreport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TECHREPORT = 37;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TITLE = 38;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TYPE = 39;

    /**
     * The feature id for the '<em><b>Unpublished</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__UNPUBLISHED = 40;

    /**
     * The feature id for the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__VOLUME = 41;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__YEAR = 42;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 43;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.EntryTypeImpl <em>Entry Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.EntryTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getEntryType()
     * @generated
     */
    int ENTRY_TYPE = 6;

    /**
     * The feature id for the '<em><b>Article</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__ARTICLE = BIB_TE_XML_ENTRIES_CLASS__ARTICLE;

    /**
     * The feature id for the '<em><b>Book</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__BOOK = BIB_TE_XML_ENTRIES_CLASS__BOOK;

    /**
     * The feature id for the '<em><b>Booklet</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__BOOKLET = BIB_TE_XML_ENTRIES_CLASS__BOOKLET;

    /**
     * The feature id for the '<em><b>Manual</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__MANUAL = BIB_TE_XML_ENTRIES_CLASS__MANUAL;

    /**
     * The feature id for the '<em><b>Techreport</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__TECHREPORT = BIB_TE_XML_ENTRIES_CLASS__TECHREPORT;

    /**
     * The feature id for the '<em><b>Mastersthesis</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__MASTERSTHESIS = BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS;

    /**
     * The feature id for the '<em><b>Phdthesis</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__PHDTHESIS = BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS;

    /**
     * The feature id for the '<em><b>Inbook</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__INBOOK = BIB_TE_XML_ENTRIES_CLASS__INBOOK;

    /**
     * The feature id for the '<em><b>Incollection</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__INCOLLECTION = BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION;

    /**
     * The feature id for the '<em><b>Proceedings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__PROCEEDINGS = BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS;

    /**
     * The feature id for the '<em><b>Inproceedings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__INPROCEEDINGS = BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS;

    /**
     * The feature id for the '<em><b>Conference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__CONFERENCE = BIB_TE_XML_ENTRIES_CLASS__CONFERENCE;

    /**
     * The feature id for the '<em><b>Unpublished</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__UNPUBLISHED = BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED;

    /**
     * The feature id for the '<em><b>Misc</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__MISC = BIB_TE_XML_ENTRIES_CLASS__MISC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE__ID = BIB_TE_XML_ENTRIES_CLASS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entry Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_TYPE_FEATURE_COUNT = BIB_TE_XML_ENTRIES_CLASS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.FileTypeImpl <em>File Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.FileTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getFileType()
     * @generated
     */
    int FILE_TYPE = 7;

    /**
     * The feature id for the '<em><b>Entry</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_TYPE__ENTRY = 0;

    /**
     * The number of structural features of the '<em>File Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.InbookTypeImpl <em>Inbook Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.InbookTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getInbookType()
     * @generated
     */
    int INBOOK_TYPE = 8;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Editor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__EDITOR = 1;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__TITLE = 2;

    /**
     * The feature id for the '<em><b>Chapter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__CHAPTER = 3;

    /**
     * The feature id for the '<em><b>Pages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__PAGES = 4;

    /**
     * The feature id for the '<em><b>Pages1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__PAGES1 = 5;

    /**
     * The feature id for the '<em><b>Publisher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__PUBLISHER = 6;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__YEAR = 7;

    /**
     * The feature id for the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__VOLUME = 8;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__NUMBER = 9;

    /**
     * The feature id for the '<em><b>Series</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__SERIES = 10;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__TYPE = 11;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__ADDRESS = 12;

    /**
     * The feature id for the '<em><b>Edition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__EDITION = 13;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__MONTH = 14;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__NOTE = 15;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__KEY = 16;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE__CROSSREF = 17;

    /**
     * The number of structural features of the '<em>Inbook Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INBOOK_TYPE_FEATURE_COUNT = 18;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.IncollectionTypeImpl <em>Incollection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.IncollectionTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getIncollectionType()
     * @generated
     */
    int INCOLLECTION_TYPE = 9;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Booktitle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__BOOKTITLE = 2;

    /**
     * The feature id for the '<em><b>Publisher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__PUBLISHER = 3;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__YEAR = 4;

    /**
     * The feature id for the '<em><b>Editor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__EDITOR = 5;

    /**
     * The feature id for the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__VOLUME = 6;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__NUMBER = 7;

    /**
     * The feature id for the '<em><b>Series</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__SERIES = 8;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__TYPE = 9;

    /**
     * The feature id for the '<em><b>Chapter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__CHAPTER = 10;

    /**
     * The feature id for the '<em><b>Pages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__PAGES = 11;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__ADDRESS = 12;

    /**
     * The feature id for the '<em><b>Edition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__EDITION = 13;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__MONTH = 14;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__NOTE = 15;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__KEY = 16;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE__CROSSREF = 17;

    /**
     * The number of structural features of the '<em>Incollection Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCOLLECTION_TYPE_FEATURE_COUNT = 18;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.InproceedingsTypeImpl <em>Inproceedings Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.InproceedingsTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getInproceedingsType()
     * @generated
     */
    int INPROCEEDINGS_TYPE = 10;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Booktitle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__BOOKTITLE = 2;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__YEAR = 3;

    /**
     * The feature id for the '<em><b>Editor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__EDITOR = 4;

    /**
     * The feature id for the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__VOLUME = 5;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__NUMBER = 6;

    /**
     * The feature id for the '<em><b>Series</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__SERIES = 7;

    /**
     * The feature id for the '<em><b>Pages</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__PAGES = 8;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__ADDRESS = 9;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__MONTH = 10;

    /**
     * The feature id for the '<em><b>Organization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__ORGANIZATION = 11;

    /**
     * The feature id for the '<em><b>Publisher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__PUBLISHER = 12;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__NOTE = 13;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__KEY = 14;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE__CROSSREF = 15;

    /**
     * The number of structural features of the '<em>Inproceedings Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPROCEEDINGS_TYPE_FEATURE_COUNT = 16;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.ManualTypeImpl <em>Manual Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.ManualTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getManualType()
     * @generated
     */
    int MANUAL_TYPE = 11;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Organization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__ORGANIZATION = 2;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__ADDRESS = 3;

    /**
     * The feature id for the '<em><b>Edition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__EDITION = 4;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__MONTH = 5;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__YEAR = 6;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__NOTE = 7;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__KEY = 8;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE__CROSSREF = 9;

    /**
     * The number of structural features of the '<em>Manual Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANUAL_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.MastersthesisTypeImpl <em>Mastersthesis Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.MastersthesisTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMastersthesisType()
     * @generated
     */
    int MASTERSTHESIS_TYPE = 12;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>School</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__SCHOOL = 2;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__YEAR = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__TYPE = 4;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__ADDRESS = 5;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__MONTH = 6;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__NOTE = 7;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__KEY = 8;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE__CROSSREF = 9;

    /**
     * The number of structural features of the '<em>Mastersthesis Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MASTERSTHESIS_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.MiscTypeImpl <em>Misc Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.MiscTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMiscType()
     * @generated
     */
    int MISC_TYPE = 13;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Howpublished</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE__HOWPUBLISHED = 2;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE__MONTH = 3;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE__YEAR = 4;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE__NOTE = 5;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE__KEY = 6;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE__CROSSREF = 7;

    /**
     * The number of structural features of the '<em>Misc Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISC_TYPE_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.PhdthesisTypeImpl <em>Phdthesis Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.PhdthesisTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getPhdthesisType()
     * @generated
     */
    int PHDTHESIS_TYPE = 14;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>School</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__SCHOOL = 2;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__YEAR = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__TYPE = 4;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__ADDRESS = 5;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__MONTH = 6;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__NOTE = 7;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__KEY = 8;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE__CROSSREF = 9;

    /**
     * The number of structural features of the '<em>Phdthesis Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHDTHESIS_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.ProceedingsTypeImpl <em>Proceedings Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.ProceedingsTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getProceedingsType()
     * @generated
     */
    int PROCEEDINGS_TYPE = 15;

    /**
     * The feature id for the '<em><b>Editor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__EDITOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__YEAR = 2;

    /**
     * The feature id for the '<em><b>Volume</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__VOLUME = 3;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__NUMBER = 4;

    /**
     * The feature id for the '<em><b>Series</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__SERIES = 5;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__ADDRESS = 6;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__MONTH = 7;

    /**
     * The feature id for the '<em><b>Organization</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__ORGANIZATION = 8;

    /**
     * The feature id for the '<em><b>Publisher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__PUBLISHER = 9;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__NOTE = 10;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__KEY = 11;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE__CROSSREF = 12;

    /**
     * The number of structural features of the '<em>Proceedings Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEEDINGS_TYPE_FEATURE_COUNT = 13;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.TechreportTypeImpl <em>Techreport Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.TechreportTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getTechreportType()
     * @generated
     */
    int TECHREPORT_TYPE = 16;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Institution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__INSTITUTION = 2;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__YEAR = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__TYPE = 4;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__NUMBER = 5;

    /**
     * The feature id for the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__ADDRESS = 6;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__MONTH = 7;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__NOTE = 8;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__KEY = 9;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE__CROSSREF = 10;

    /**
     * The number of structural features of the '<em>Techreport Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHREPORT_TYPE_FEATURE_COUNT = 11;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.impl.UnpublishedTypeImpl <em>Unpublished Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.impl.UnpublishedTypeImpl
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getUnpublishedType()
     * @generated
     */
    int UNPUBLISHED_TYPE = 17;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNPUBLISHED_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNPUBLISHED_TYPE__TITLE = 1;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNPUBLISHED_TYPE__NOTE = 2;

    /**
     * The feature id for the '<em><b>Month</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNPUBLISHED_TYPE__MONTH = 3;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNPUBLISHED_TYPE__YEAR = 4;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNPUBLISHED_TYPE__KEY = 5;

    /**
     * The feature id for the '<em><b>Crossref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNPUBLISHED_TYPE__CROSSREF = 6;

    /**
     * The number of structural features of the '<em>Unpublished Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNPUBLISHED_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link net.sf.bibtexml.MonthStringType <em>Month String Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.MonthStringType
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMonthStringType()
     * @generated
     */
    int MONTH_STRING_TYPE = 18;

    /**
     * The meta object id for the '<em>Edition Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getEditionType()
     * @generated
     */
    int EDITION_TYPE = 19;

    /**
     * The meta object id for the '<em>Month String Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.MonthStringType
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMonthStringTypeObject()
     * @generated
     */
    int MONTH_STRING_TYPE_OBJECT = 20;

    /**
     * The meta object id for the '<em>Month Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMonthType()
     * @generated
     */
    int MONTH_TYPE = 21;

    /**
     * The meta object id for the '<em>Pages Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getPagesType()
     * @generated
     */
    int PAGES_TYPE = 22;


    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.ArticleType <em>Article Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Article Type</em>'.
     * @see net.sf.bibtexml.ArticleType
     * @generated
     */
    EClass getArticleType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.ArticleType#getAuthor()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.ArticleType#getTitle()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getJournal <em>Journal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Journal</em>'.
     * @see net.sf.bibtexml.ArticleType#getJournal()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Journal();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.ArticleType#getYear()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getVolume <em>Volume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volume</em>'.
     * @see net.sf.bibtexml.ArticleType#getVolume()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Volume();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.ArticleType#getNumber()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getPages <em>Pages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pages</em>'.
     * @see net.sf.bibtexml.ArticleType#getPages()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Pages();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.ArticleType#getMonth()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.ArticleType#getNote()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.ArticleType#getKey()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ArticleType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.ArticleType#getCrossref()
     * @see #getArticleType()
     * @generated
     */
    EAttribute getArticleType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.BibTeXMLEntriesClass <em>Bib Te XML Entries Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bib Te XML Entries Class</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass
     * @generated
     */
    EClass getBibTeXMLEntriesClass();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getArticle <em>Article</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Article</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getArticle()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Article();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getBook <em>Book</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Book</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getBook()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Book();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getBooklet <em>Booklet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Booklet</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getBooklet()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Booklet();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getManual <em>Manual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manual</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getManual()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Manual();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getTechreport <em>Techreport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Techreport</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getTechreport()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Techreport();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getMastersthesis <em>Mastersthesis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mastersthesis</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getMastersthesis()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Mastersthesis();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getPhdthesis <em>Phdthesis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Phdthesis</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getPhdthesis()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Phdthesis();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getInbook <em>Inbook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inbook</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getInbook()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Inbook();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getIncollection <em>Incollection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Incollection</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getIncollection()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Incollection();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getProceedings <em>Proceedings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Proceedings</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getProceedings()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Proceedings();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getInproceedings <em>Inproceedings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inproceedings</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getInproceedings()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Inproceedings();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getConference <em>Conference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conference</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getConference()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Conference();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getUnpublished <em>Unpublished</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Unpublished</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getUnpublished()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Unpublished();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getMisc <em>Misc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Misc</em>'.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass#getMisc()
     * @see #getBibTeXMLEntriesClass()
     * @generated
     */
    EReference getBibTeXMLEntriesClass_Misc();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.BookletType <em>Booklet Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Booklet Type</em>'.
     * @see net.sf.bibtexml.BookletType
     * @generated
     */
    EClass getBookletType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.BookletType#getAuthor()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.BookletType#getTitle()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getHowpublished <em>Howpublished</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Howpublished</em>'.
     * @see net.sf.bibtexml.BookletType#getHowpublished()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Howpublished();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.BookletType#getAddress()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.BookletType#getMonth()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.BookletType#getYear()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.BookletType#getNote()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.BookletType#getKey()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookletType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.BookletType#getCrossref()
     * @see #getBookletType()
     * @generated
     */
    EAttribute getBookletType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.BookType <em>Book Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Book Type</em>'.
     * @see net.sf.bibtexml.BookType
     * @generated
     */
    EClass getBookType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.BookType#getAuthor()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getEditor <em>Editor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editor</em>'.
     * @see net.sf.bibtexml.BookType#getEditor()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Editor();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.BookType#getTitle()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publisher</em>'.
     * @see net.sf.bibtexml.BookType#getPublisher()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Publisher();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.BookType#getYear()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getVolume <em>Volume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volume</em>'.
     * @see net.sf.bibtexml.BookType#getVolume()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Volume();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.BookType#getNumber()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getSeries <em>Series</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Series</em>'.
     * @see net.sf.bibtexml.BookType#getSeries()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Series();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.BookType#getAddress()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getEdition <em>Edition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edition</em>'.
     * @see net.sf.bibtexml.BookType#getEdition()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Edition();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.BookType#getMonth()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.BookType#getNote()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.BookType#getKey()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.BookType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.BookType#getCrossref()
     * @see #getBookType()
     * @generated
     */
    EAttribute getBookType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.ConferenceType <em>Conference Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conference Type</em>'.
     * @see net.sf.bibtexml.ConferenceType
     * @generated
     */
    EClass getConferenceType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.ConferenceType#getAuthor()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.ConferenceType#getTitle()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getBooktitle <em>Booktitle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Booktitle</em>'.
     * @see net.sf.bibtexml.ConferenceType#getBooktitle()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Booktitle();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.ConferenceType#getYear()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getEditor <em>Editor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editor</em>'.
     * @see net.sf.bibtexml.ConferenceType#getEditor()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Editor();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getVolume <em>Volume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volume</em>'.
     * @see net.sf.bibtexml.ConferenceType#getVolume()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Volume();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.ConferenceType#getNumber()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getSeries <em>Series</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Series</em>'.
     * @see net.sf.bibtexml.ConferenceType#getSeries()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Series();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getPages <em>Pages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pages</em>'.
     * @see net.sf.bibtexml.ConferenceType#getPages()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Pages();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.ConferenceType#getAddress()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.ConferenceType#getMonth()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getOrganization <em>Organization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Organization</em>'.
     * @see net.sf.bibtexml.ConferenceType#getOrganization()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Organization();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publisher</em>'.
     * @see net.sf.bibtexml.ConferenceType#getPublisher()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Publisher();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.ConferenceType#getNote()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.ConferenceType#getKey()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ConferenceType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.ConferenceType#getCrossref()
     * @see #getConferenceType()
     * @generated
     */
    EAttribute getConferenceType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see net.sf.bibtexml.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link net.sf.bibtexml.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link net.sf.bibtexml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link net.sf.bibtexml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getAddress()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getAnnote <em>Annote</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Annote</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getAnnote()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Annote();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getArticle <em>Article</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Article</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getArticle()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Article();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getAuthor()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Author();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getBook <em>Book</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Book</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getBook()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Book();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getBooklet <em>Booklet</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Booklet</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getBooklet()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Booklet();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getBooktitle <em>Booktitle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Booktitle</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getBooktitle()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Booktitle();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getChapter <em>Chapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Chapter</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getChapter()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Chapter();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getConference <em>Conference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conference</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getConference()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Conference();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getCrossref()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Crossref();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getEdition <em>Edition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edition</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getEdition()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Edition();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getEditor <em>Editor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editor</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getEditor()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Editor();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Entry</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getEntry()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Entry();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>File</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getFile()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_File();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getHowpublished <em>Howpublished</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Howpublished</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getHowpublished()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Howpublished();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getInbook <em>Inbook</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inbook</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getInbook()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Inbook();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getIncollection <em>Incollection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Incollection</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getIncollection()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Incollection();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getInproceedings <em>Inproceedings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inproceedings</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getInproceedings()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Inproceedings();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getInstitution <em>Institution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Institution</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getInstitution()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Institution();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getJournal <em>Journal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Journal</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getJournal()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Journal();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getKey()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Key();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getManual <em>Manual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Manual</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getManual()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Manual();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getMastersthesis <em>Mastersthesis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mastersthesis</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getMastersthesis()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Mastersthesis();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getMisc <em>Misc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Misc</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getMisc()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Misc();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getMonth()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getNote()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getNumber()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getOrganization <em>Organization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Organization</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getOrganization()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Organization();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getPages <em>Pages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pages</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getPages()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Pages();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getPhdthesis <em>Phdthesis</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Phdthesis</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getPhdthesis()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Phdthesis();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getProceedings <em>Proceedings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Proceedings</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getProceedings()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Proceedings();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publisher</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getPublisher()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Publisher();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getSchool <em>School</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>School</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getSchool()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_School();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getSeries <em>Series</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Series</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getSeries()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Series();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getTechreport <em>Techreport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Techreport</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getTechreport()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Techreport();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getTitle()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getType()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Type();

    /**
     * Returns the meta object for the containment reference '{@link net.sf.bibtexml.DocumentRoot#getUnpublished <em>Unpublished</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Unpublished</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getUnpublished()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Unpublished();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getVolume <em>Volume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volume</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getVolume()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Volume();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.DocumentRoot#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.DocumentRoot#getYear()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Year();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.EntryType <em>Entry Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry Type</em>'.
     * @see net.sf.bibtexml.EntryType
     * @generated
     */
    EClass getEntryType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.EntryType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see net.sf.bibtexml.EntryType#getId()
     * @see #getEntryType()
     * @generated
     */
    EAttribute getEntryType_Id();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.FileType <em>File Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Type</em>'.
     * @see net.sf.bibtexml.FileType
     * @generated
     */
    EClass getFileType();

    /**
     * Returns the meta object for the containment reference list '{@link net.sf.bibtexml.FileType#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entry</em>'.
     * @see net.sf.bibtexml.FileType#getEntry()
     * @see #getFileType()
     * @generated
     */
    EReference getFileType_Entry();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.InbookType <em>Inbook Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inbook Type</em>'.
     * @see net.sf.bibtexml.InbookType
     * @generated
     */
    EClass getInbookType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.InbookType#getAuthor()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getEditor <em>Editor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editor</em>'.
     * @see net.sf.bibtexml.InbookType#getEditor()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Editor();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.InbookType#getTitle()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getChapter <em>Chapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Chapter</em>'.
     * @see net.sf.bibtexml.InbookType#getChapter()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Chapter();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getPages <em>Pages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pages</em>'.
     * @see net.sf.bibtexml.InbookType#getPages()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Pages();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getPages1 <em>Pages1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pages1</em>'.
     * @see net.sf.bibtexml.InbookType#getPages1()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Pages1();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publisher</em>'.
     * @see net.sf.bibtexml.InbookType#getPublisher()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Publisher();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.InbookType#getYear()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getVolume <em>Volume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volume</em>'.
     * @see net.sf.bibtexml.InbookType#getVolume()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Volume();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.InbookType#getNumber()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getSeries <em>Series</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Series</em>'.
     * @see net.sf.bibtexml.InbookType#getSeries()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Series();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see net.sf.bibtexml.InbookType#getType()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Type();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.InbookType#getAddress()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getEdition <em>Edition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edition</em>'.
     * @see net.sf.bibtexml.InbookType#getEdition()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Edition();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.InbookType#getMonth()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.InbookType#getNote()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.InbookType#getKey()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InbookType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.InbookType#getCrossref()
     * @see #getInbookType()
     * @generated
     */
    EAttribute getInbookType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.IncollectionType <em>Incollection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Incollection Type</em>'.
     * @see net.sf.bibtexml.IncollectionType
     * @generated
     */
    EClass getIncollectionType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.IncollectionType#getAuthor()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.IncollectionType#getTitle()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getBooktitle <em>Booktitle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Booktitle</em>'.
     * @see net.sf.bibtexml.IncollectionType#getBooktitle()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Booktitle();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publisher</em>'.
     * @see net.sf.bibtexml.IncollectionType#getPublisher()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Publisher();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.IncollectionType#getYear()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getEditor <em>Editor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editor</em>'.
     * @see net.sf.bibtexml.IncollectionType#getEditor()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Editor();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getVolume <em>Volume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volume</em>'.
     * @see net.sf.bibtexml.IncollectionType#getVolume()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Volume();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.IncollectionType#getNumber()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getSeries <em>Series</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Series</em>'.
     * @see net.sf.bibtexml.IncollectionType#getSeries()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Series();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see net.sf.bibtexml.IncollectionType#getType()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Type();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getChapter <em>Chapter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Chapter</em>'.
     * @see net.sf.bibtexml.IncollectionType#getChapter()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Chapter();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getPages <em>Pages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pages</em>'.
     * @see net.sf.bibtexml.IncollectionType#getPages()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Pages();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.IncollectionType#getAddress()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getEdition <em>Edition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edition</em>'.
     * @see net.sf.bibtexml.IncollectionType#getEdition()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Edition();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.IncollectionType#getMonth()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.IncollectionType#getNote()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.IncollectionType#getKey()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.IncollectionType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.IncollectionType#getCrossref()
     * @see #getIncollectionType()
     * @generated
     */
    EAttribute getIncollectionType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.InproceedingsType <em>Inproceedings Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inproceedings Type</em>'.
     * @see net.sf.bibtexml.InproceedingsType
     * @generated
     */
    EClass getInproceedingsType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getAuthor()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getTitle()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getBooktitle <em>Booktitle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Booktitle</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getBooktitle()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Booktitle();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getYear()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getEditor <em>Editor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editor</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getEditor()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Editor();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getVolume <em>Volume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volume</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getVolume()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Volume();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getNumber()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getSeries <em>Series</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Series</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getSeries()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Series();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getPages <em>Pages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pages</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getPages()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Pages();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getAddress()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getMonth()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getOrganization <em>Organization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Organization</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getOrganization()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Organization();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publisher</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getPublisher()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Publisher();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getNote()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getKey()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.InproceedingsType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.InproceedingsType#getCrossref()
     * @see #getInproceedingsType()
     * @generated
     */
    EAttribute getInproceedingsType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.ManualType <em>Manual Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Manual Type</em>'.
     * @see net.sf.bibtexml.ManualType
     * @generated
     */
    EClass getManualType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.ManualType#getAuthor()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.ManualType#getTitle()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getOrganization <em>Organization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Organization</em>'.
     * @see net.sf.bibtexml.ManualType#getOrganization()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Organization();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.ManualType#getAddress()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getEdition <em>Edition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edition</em>'.
     * @see net.sf.bibtexml.ManualType#getEdition()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Edition();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.ManualType#getMonth()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.ManualType#getYear()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.ManualType#getNote()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.ManualType#getKey()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ManualType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.ManualType#getCrossref()
     * @see #getManualType()
     * @generated
     */
    EAttribute getManualType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.MastersthesisType <em>Mastersthesis Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mastersthesis Type</em>'.
     * @see net.sf.bibtexml.MastersthesisType
     * @generated
     */
    EClass getMastersthesisType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getAuthor()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getTitle()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getSchool <em>School</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>School</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getSchool()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_School();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getYear()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getType()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Type();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getAddress()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getMonth()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getNote()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getKey()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MastersthesisType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.MastersthesisType#getCrossref()
     * @see #getMastersthesisType()
     * @generated
     */
    EAttribute getMastersthesisType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.MiscType <em>Misc Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Misc Type</em>'.
     * @see net.sf.bibtexml.MiscType
     * @generated
     */
    EClass getMiscType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MiscType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.MiscType#getAuthor()
     * @see #getMiscType()
     * @generated
     */
    EAttribute getMiscType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MiscType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.MiscType#getTitle()
     * @see #getMiscType()
     * @generated
     */
    EAttribute getMiscType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MiscType#getHowpublished <em>Howpublished</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Howpublished</em>'.
     * @see net.sf.bibtexml.MiscType#getHowpublished()
     * @see #getMiscType()
     * @generated
     */
    EAttribute getMiscType_Howpublished();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MiscType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.MiscType#getMonth()
     * @see #getMiscType()
     * @generated
     */
    EAttribute getMiscType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MiscType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.MiscType#getYear()
     * @see #getMiscType()
     * @generated
     */
    EAttribute getMiscType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MiscType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.MiscType#getNote()
     * @see #getMiscType()
     * @generated
     */
    EAttribute getMiscType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MiscType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.MiscType#getKey()
     * @see #getMiscType()
     * @generated
     */
    EAttribute getMiscType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.MiscType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.MiscType#getCrossref()
     * @see #getMiscType()
     * @generated
     */
    EAttribute getMiscType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.PhdthesisType <em>Phdthesis Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Phdthesis Type</em>'.
     * @see net.sf.bibtexml.PhdthesisType
     * @generated
     */
    EClass getPhdthesisType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getAuthor()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getTitle()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getSchool <em>School</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>School</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getSchool()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_School();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getYear()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getType()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Type();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getAddress()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getMonth()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getNote()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getKey()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.PhdthesisType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.PhdthesisType#getCrossref()
     * @see #getPhdthesisType()
     * @generated
     */
    EAttribute getPhdthesisType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.ProceedingsType <em>Proceedings Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Proceedings Type</em>'.
     * @see net.sf.bibtexml.ProceedingsType
     * @generated
     */
    EClass getProceedingsType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getEditor <em>Editor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editor</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getEditor()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Editor();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getTitle()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getYear()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getVolume <em>Volume</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Volume</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getVolume()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Volume();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getNumber()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getSeries <em>Series</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Series</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getSeries()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Series();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getAddress()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getMonth()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getOrganization <em>Organization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Organization</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getOrganization()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Organization();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getPublisher <em>Publisher</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Publisher</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getPublisher()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Publisher();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getNote()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getKey()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.ProceedingsType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.ProceedingsType#getCrossref()
     * @see #getProceedingsType()
     * @generated
     */
    EAttribute getProceedingsType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.TechreportType <em>Techreport Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Techreport Type</em>'.
     * @see net.sf.bibtexml.TechreportType
     * @generated
     */
    EClass getTechreportType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.TechreportType#getAuthor()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.TechreportType#getTitle()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getInstitution <em>Institution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Institution</em>'.
     * @see net.sf.bibtexml.TechreportType#getInstitution()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Institution();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.TechreportType#getYear()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see net.sf.bibtexml.TechreportType#getType()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Type();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see net.sf.bibtexml.TechreportType#getNumber()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Number();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Address</em>'.
     * @see net.sf.bibtexml.TechreportType#getAddress()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Address();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.TechreportType#getMonth()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.TechreportType#getNote()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.TechreportType#getKey()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.TechreportType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.TechreportType#getCrossref()
     * @see #getTechreportType()
     * @generated
     */
    EAttribute getTechreportType_Crossref();

    /**
     * Returns the meta object for class '{@link net.sf.bibtexml.UnpublishedType <em>Unpublished Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unpublished Type</em>'.
     * @see net.sf.bibtexml.UnpublishedType
     * @generated
     */
    EClass getUnpublishedType();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.UnpublishedType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see net.sf.bibtexml.UnpublishedType#getAuthor()
     * @see #getUnpublishedType()
     * @generated
     */
    EAttribute getUnpublishedType_Author();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.UnpublishedType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.sf.bibtexml.UnpublishedType#getTitle()
     * @see #getUnpublishedType()
     * @generated
     */
    EAttribute getUnpublishedType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.UnpublishedType#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see net.sf.bibtexml.UnpublishedType#getNote()
     * @see #getUnpublishedType()
     * @generated
     */
    EAttribute getUnpublishedType_Note();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.UnpublishedType#getMonth <em>Month</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Month</em>'.
     * @see net.sf.bibtexml.UnpublishedType#getMonth()
     * @see #getUnpublishedType()
     * @generated
     */
    EAttribute getUnpublishedType_Month();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.UnpublishedType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.sf.bibtexml.UnpublishedType#getYear()
     * @see #getUnpublishedType()
     * @generated
     */
    EAttribute getUnpublishedType_Year();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.UnpublishedType#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see net.sf.bibtexml.UnpublishedType#getKey()
     * @see #getUnpublishedType()
     * @generated
     */
    EAttribute getUnpublishedType_Key();

    /**
     * Returns the meta object for the attribute '{@link net.sf.bibtexml.UnpublishedType#getCrossref <em>Crossref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crossref</em>'.
     * @see net.sf.bibtexml.UnpublishedType#getCrossref()
     * @see #getUnpublishedType()
     * @generated
     */
    EAttribute getUnpublishedType_Crossref();

    /**
     * Returns the meta object for enum '{@link net.sf.bibtexml.MonthStringType <em>Month String Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Month String Type</em>'.
     * @see net.sf.bibtexml.MonthStringType
     * @generated
     */
    EEnum getMonthStringType();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Edition Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Edition Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='edition_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Z].*'"
     * @generated
     */
    EDataType getEditionType();

    /**
     * Returns the meta object for data type '{@link net.sf.bibtexml.MonthStringType <em>Month String Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Month String Type Object</em>'.
     * @see net.sf.bibtexml.MonthStringType
     * @model instanceClass="net.sf.bibtexml.MonthStringType"
     *        extendedMetaData="name='monthStringType:Object' baseType='monthStringType'"
     * @generated
     */
    EDataType getMonthStringTypeObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Month Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Month Type</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     *        extendedMetaData="name='month_._type' memberTypes='monthStringType http://www.eclipse.org/emf/2003/XMLType#gMonth'"
     * @generated
     */
    EDataType getMonthType();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Pages Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Pages Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='pages_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]+((-{0,2}|\u2013|,)[0-9]+)*\\+?'"
     * @generated
     */
    EDataType getPagesType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    BibtexmlFactory getBibtexmlFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.ArticleTypeImpl <em>Article Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.ArticleTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getArticleType()
         * @generated
         */
        EClass ARTICLE_TYPE = eINSTANCE.getArticleType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__AUTHOR = eINSTANCE.getArticleType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__TITLE = eINSTANCE.getArticleType_Title();

        /**
         * The meta object literal for the '<em><b>Journal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__JOURNAL = eINSTANCE.getArticleType_Journal();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__YEAR = eINSTANCE.getArticleType_Year();

        /**
         * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__VOLUME = eINSTANCE.getArticleType_Volume();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__NUMBER = eINSTANCE.getArticleType_Number();

        /**
         * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__PAGES = eINSTANCE.getArticleType_Pages();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__MONTH = eINSTANCE.getArticleType_Month();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__NOTE = eINSTANCE.getArticleType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__KEY = eINSTANCE.getArticleType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ARTICLE_TYPE__CROSSREF = eINSTANCE.getArticleType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl <em>Bib Te XML Entries Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getBibTeXMLEntriesClass()
         * @generated
         */
        EClass BIB_TE_XML_ENTRIES_CLASS = eINSTANCE.getBibTeXMLEntriesClass();

        /**
         * The meta object literal for the '<em><b>Article</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__ARTICLE = eINSTANCE.getBibTeXMLEntriesClass_Article();

        /**
         * The meta object literal for the '<em><b>Book</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__BOOK = eINSTANCE.getBibTeXMLEntriesClass_Book();

        /**
         * The meta object literal for the '<em><b>Booklet</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__BOOKLET = eINSTANCE.getBibTeXMLEntriesClass_Booklet();

        /**
         * The meta object literal for the '<em><b>Manual</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__MANUAL = eINSTANCE.getBibTeXMLEntriesClass_Manual();

        /**
         * The meta object literal for the '<em><b>Techreport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__TECHREPORT = eINSTANCE.getBibTeXMLEntriesClass_Techreport();

        /**
         * The meta object literal for the '<em><b>Mastersthesis</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS = eINSTANCE.getBibTeXMLEntriesClass_Mastersthesis();

        /**
         * The meta object literal for the '<em><b>Phdthesis</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS = eINSTANCE.getBibTeXMLEntriesClass_Phdthesis();

        /**
         * The meta object literal for the '<em><b>Inbook</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__INBOOK = eINSTANCE.getBibTeXMLEntriesClass_Inbook();

        /**
         * The meta object literal for the '<em><b>Incollection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION = eINSTANCE.getBibTeXMLEntriesClass_Incollection();

        /**
         * The meta object literal for the '<em><b>Proceedings</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS = eINSTANCE.getBibTeXMLEntriesClass_Proceedings();

        /**
         * The meta object literal for the '<em><b>Inproceedings</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS = eINSTANCE.getBibTeXMLEntriesClass_Inproceedings();

        /**
         * The meta object literal for the '<em><b>Conference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__CONFERENCE = eINSTANCE.getBibTeXMLEntriesClass_Conference();

        /**
         * The meta object literal for the '<em><b>Unpublished</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED = eINSTANCE.getBibTeXMLEntriesClass_Unpublished();

        /**
         * The meta object literal for the '<em><b>Misc</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BIB_TE_XML_ENTRIES_CLASS__MISC = eINSTANCE.getBibTeXMLEntriesClass_Misc();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.BookletTypeImpl <em>Booklet Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.BookletTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getBookletType()
         * @generated
         */
        EClass BOOKLET_TYPE = eINSTANCE.getBookletType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__AUTHOR = eINSTANCE.getBookletType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__TITLE = eINSTANCE.getBookletType_Title();

        /**
         * The meta object literal for the '<em><b>Howpublished</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__HOWPUBLISHED = eINSTANCE.getBookletType_Howpublished();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__ADDRESS = eINSTANCE.getBookletType_Address();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__MONTH = eINSTANCE.getBookletType_Month();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__YEAR = eINSTANCE.getBookletType_Year();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__NOTE = eINSTANCE.getBookletType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__KEY = eINSTANCE.getBookletType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKLET_TYPE__CROSSREF = eINSTANCE.getBookletType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.BookTypeImpl <em>Book Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.BookTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getBookType()
         * @generated
         */
        EClass BOOK_TYPE = eINSTANCE.getBookType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__AUTHOR = eINSTANCE.getBookType_Author();

        /**
         * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__EDITOR = eINSTANCE.getBookType_Editor();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__TITLE = eINSTANCE.getBookType_Title();

        /**
         * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__PUBLISHER = eINSTANCE.getBookType_Publisher();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__YEAR = eINSTANCE.getBookType_Year();

        /**
         * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__VOLUME = eINSTANCE.getBookType_Volume();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__NUMBER = eINSTANCE.getBookType_Number();

        /**
         * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__SERIES = eINSTANCE.getBookType_Series();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__ADDRESS = eINSTANCE.getBookType_Address();

        /**
         * The meta object literal for the '<em><b>Edition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__EDITION = eINSTANCE.getBookType_Edition();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__MONTH = eINSTANCE.getBookType_Month();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__NOTE = eINSTANCE.getBookType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__KEY = eINSTANCE.getBookType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOK_TYPE__CROSSREF = eINSTANCE.getBookType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.ConferenceTypeImpl <em>Conference Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.ConferenceTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getConferenceType()
         * @generated
         */
        EClass CONFERENCE_TYPE = eINSTANCE.getConferenceType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__AUTHOR = eINSTANCE.getConferenceType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__TITLE = eINSTANCE.getConferenceType_Title();

        /**
         * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__BOOKTITLE = eINSTANCE.getConferenceType_Booktitle();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__YEAR = eINSTANCE.getConferenceType_Year();

        /**
         * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__EDITOR = eINSTANCE.getConferenceType_Editor();

        /**
         * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__VOLUME = eINSTANCE.getConferenceType_Volume();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__NUMBER = eINSTANCE.getConferenceType_Number();

        /**
         * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__SERIES = eINSTANCE.getConferenceType_Series();

        /**
         * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__PAGES = eINSTANCE.getConferenceType_Pages();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__ADDRESS = eINSTANCE.getConferenceType_Address();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__MONTH = eINSTANCE.getConferenceType_Month();

        /**
         * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__ORGANIZATION = eINSTANCE.getConferenceType_Organization();

        /**
         * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__PUBLISHER = eINSTANCE.getConferenceType_Publisher();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__NOTE = eINSTANCE.getConferenceType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__KEY = eINSTANCE.getConferenceType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFERENCE_TYPE__CROSSREF = eINSTANCE.getConferenceType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.DocumentRootImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

        /**
         * The meta object literal for the '<em><b>Annote</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__ANNOTE = eINSTANCE.getDocumentRoot_Annote();

        /**
         * The meta object literal for the '<em><b>Article</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ARTICLE = eINSTANCE.getDocumentRoot_Article();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__AUTHOR = eINSTANCE.getDocumentRoot_Author();

        /**
         * The meta object literal for the '<em><b>Book</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BOOK = eINSTANCE.getDocumentRoot_Book();

        /**
         * The meta object literal for the '<em><b>Booklet</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__BOOKLET = eINSTANCE.getDocumentRoot_Booklet();

        /**
         * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__BOOKTITLE = eINSTANCE.getDocumentRoot_Booktitle();

        /**
         * The meta object literal for the '<em><b>Chapter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__CHAPTER = eINSTANCE.getDocumentRoot_Chapter();

        /**
         * The meta object literal for the '<em><b>Conference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__CONFERENCE = eINSTANCE.getDocumentRoot_Conference();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__CROSSREF = eINSTANCE.getDocumentRoot_Crossref();

        /**
         * The meta object literal for the '<em><b>Edition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__EDITION = eINSTANCE.getDocumentRoot_Edition();

        /**
         * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__EDITOR = eINSTANCE.getDocumentRoot_Editor();

        /**
         * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ENTRY = eINSTANCE.getDocumentRoot_Entry();

        /**
         * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__FILE = eINSTANCE.getDocumentRoot_File();

        /**
         * The meta object literal for the '<em><b>Howpublished</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__HOWPUBLISHED = eINSTANCE.getDocumentRoot_Howpublished();

        /**
         * The meta object literal for the '<em><b>Inbook</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INBOOK = eINSTANCE.getDocumentRoot_Inbook();

        /**
         * The meta object literal for the '<em><b>Incollection</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INCOLLECTION = eINSTANCE.getDocumentRoot_Incollection();

        /**
         * The meta object literal for the '<em><b>Inproceedings</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__INPROCEEDINGS = eINSTANCE.getDocumentRoot_Inproceedings();

        /**
         * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__INSTITUTION = eINSTANCE.getDocumentRoot_Institution();

        /**
         * The meta object literal for the '<em><b>Journal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__JOURNAL = eINSTANCE.getDocumentRoot_Journal();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__KEY = eINSTANCE.getDocumentRoot_Key();

        /**
         * The meta object literal for the '<em><b>Manual</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MANUAL = eINSTANCE.getDocumentRoot_Manual();

        /**
         * The meta object literal for the '<em><b>Mastersthesis</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MASTERSTHESIS = eINSTANCE.getDocumentRoot_Mastersthesis();

        /**
         * The meta object literal for the '<em><b>Misc</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MISC = eINSTANCE.getDocumentRoot_Misc();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MONTH = eINSTANCE.getDocumentRoot_Month();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__NOTE = eINSTANCE.getDocumentRoot_Note();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__NUMBER = eINSTANCE.getDocumentRoot_Number();

        /**
         * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__ORGANIZATION = eINSTANCE.getDocumentRoot_Organization();

        /**
         * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__PAGES = eINSTANCE.getDocumentRoot_Pages();

        /**
         * The meta object literal for the '<em><b>Phdthesis</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PHDTHESIS = eINSTANCE.getDocumentRoot_Phdthesis();

        /**
         * The meta object literal for the '<em><b>Proceedings</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__PROCEEDINGS = eINSTANCE.getDocumentRoot_Proceedings();

        /**
         * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__PUBLISHER = eINSTANCE.getDocumentRoot_Publisher();

        /**
         * The meta object literal for the '<em><b>School</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__SCHOOL = eINSTANCE.getDocumentRoot_School();

        /**
         * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__SERIES = eINSTANCE.getDocumentRoot_Series();

        /**
         * The meta object literal for the '<em><b>Techreport</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__TECHREPORT = eINSTANCE.getDocumentRoot_Techreport();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

        /**
         * The meta object literal for the '<em><b>Unpublished</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__UNPUBLISHED = eINSTANCE.getDocumentRoot_Unpublished();

        /**
         * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__VOLUME = eINSTANCE.getDocumentRoot_Volume();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__YEAR = eINSTANCE.getDocumentRoot_Year();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.EntryTypeImpl <em>Entry Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.EntryTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getEntryType()
         * @generated
         */
        EClass ENTRY_TYPE = eINSTANCE.getEntryType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTRY_TYPE__ID = eINSTANCE.getEntryType_Id();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.FileTypeImpl <em>File Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.FileTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getFileType()
         * @generated
         */
        EClass FILE_TYPE = eINSTANCE.getFileType();

        /**
         * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FILE_TYPE__ENTRY = eINSTANCE.getFileType_Entry();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.InbookTypeImpl <em>Inbook Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.InbookTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getInbookType()
         * @generated
         */
        EClass INBOOK_TYPE = eINSTANCE.getInbookType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__AUTHOR = eINSTANCE.getInbookType_Author();

        /**
         * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__EDITOR = eINSTANCE.getInbookType_Editor();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__TITLE = eINSTANCE.getInbookType_Title();

        /**
         * The meta object literal for the '<em><b>Chapter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__CHAPTER = eINSTANCE.getInbookType_Chapter();

        /**
         * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__PAGES = eINSTANCE.getInbookType_Pages();

        /**
         * The meta object literal for the '<em><b>Pages1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__PAGES1 = eINSTANCE.getInbookType_Pages1();

        /**
         * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__PUBLISHER = eINSTANCE.getInbookType_Publisher();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__YEAR = eINSTANCE.getInbookType_Year();

        /**
         * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__VOLUME = eINSTANCE.getInbookType_Volume();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__NUMBER = eINSTANCE.getInbookType_Number();

        /**
         * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__SERIES = eINSTANCE.getInbookType_Series();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__TYPE = eINSTANCE.getInbookType_Type();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__ADDRESS = eINSTANCE.getInbookType_Address();

        /**
         * The meta object literal for the '<em><b>Edition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__EDITION = eINSTANCE.getInbookType_Edition();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__MONTH = eINSTANCE.getInbookType_Month();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__NOTE = eINSTANCE.getInbookType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__KEY = eINSTANCE.getInbookType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INBOOK_TYPE__CROSSREF = eINSTANCE.getInbookType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.IncollectionTypeImpl <em>Incollection Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.IncollectionTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getIncollectionType()
         * @generated
         */
        EClass INCOLLECTION_TYPE = eINSTANCE.getIncollectionType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__AUTHOR = eINSTANCE.getIncollectionType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__TITLE = eINSTANCE.getIncollectionType_Title();

        /**
         * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__BOOKTITLE = eINSTANCE.getIncollectionType_Booktitle();

        /**
         * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__PUBLISHER = eINSTANCE.getIncollectionType_Publisher();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__YEAR = eINSTANCE.getIncollectionType_Year();

        /**
         * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__EDITOR = eINSTANCE.getIncollectionType_Editor();

        /**
         * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__VOLUME = eINSTANCE.getIncollectionType_Volume();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__NUMBER = eINSTANCE.getIncollectionType_Number();

        /**
         * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__SERIES = eINSTANCE.getIncollectionType_Series();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__TYPE = eINSTANCE.getIncollectionType_Type();

        /**
         * The meta object literal for the '<em><b>Chapter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__CHAPTER = eINSTANCE.getIncollectionType_Chapter();

        /**
         * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__PAGES = eINSTANCE.getIncollectionType_Pages();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__ADDRESS = eINSTANCE.getIncollectionType_Address();

        /**
         * The meta object literal for the '<em><b>Edition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__EDITION = eINSTANCE.getIncollectionType_Edition();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__MONTH = eINSTANCE.getIncollectionType_Month();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__NOTE = eINSTANCE.getIncollectionType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__KEY = eINSTANCE.getIncollectionType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCOLLECTION_TYPE__CROSSREF = eINSTANCE.getIncollectionType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.InproceedingsTypeImpl <em>Inproceedings Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.InproceedingsTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getInproceedingsType()
         * @generated
         */
        EClass INPROCEEDINGS_TYPE = eINSTANCE.getInproceedingsType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__AUTHOR = eINSTANCE.getInproceedingsType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__TITLE = eINSTANCE.getInproceedingsType_Title();

        /**
         * The meta object literal for the '<em><b>Booktitle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__BOOKTITLE = eINSTANCE.getInproceedingsType_Booktitle();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__YEAR = eINSTANCE.getInproceedingsType_Year();

        /**
         * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__EDITOR = eINSTANCE.getInproceedingsType_Editor();

        /**
         * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__VOLUME = eINSTANCE.getInproceedingsType_Volume();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__NUMBER = eINSTANCE.getInproceedingsType_Number();

        /**
         * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__SERIES = eINSTANCE.getInproceedingsType_Series();

        /**
         * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__PAGES = eINSTANCE.getInproceedingsType_Pages();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__ADDRESS = eINSTANCE.getInproceedingsType_Address();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__MONTH = eINSTANCE.getInproceedingsType_Month();

        /**
         * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__ORGANIZATION = eINSTANCE.getInproceedingsType_Organization();

        /**
         * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__PUBLISHER = eINSTANCE.getInproceedingsType_Publisher();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__NOTE = eINSTANCE.getInproceedingsType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__KEY = eINSTANCE.getInproceedingsType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPROCEEDINGS_TYPE__CROSSREF = eINSTANCE.getInproceedingsType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.ManualTypeImpl <em>Manual Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.ManualTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getManualType()
         * @generated
         */
        EClass MANUAL_TYPE = eINSTANCE.getManualType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__AUTHOR = eINSTANCE.getManualType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__TITLE = eINSTANCE.getManualType_Title();

        /**
         * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__ORGANIZATION = eINSTANCE.getManualType_Organization();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__ADDRESS = eINSTANCE.getManualType_Address();

        /**
         * The meta object literal for the '<em><b>Edition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__EDITION = eINSTANCE.getManualType_Edition();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__MONTH = eINSTANCE.getManualType_Month();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__YEAR = eINSTANCE.getManualType_Year();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__NOTE = eINSTANCE.getManualType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__KEY = eINSTANCE.getManualType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANUAL_TYPE__CROSSREF = eINSTANCE.getManualType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.MastersthesisTypeImpl <em>Mastersthesis Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.MastersthesisTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMastersthesisType()
         * @generated
         */
        EClass MASTERSTHESIS_TYPE = eINSTANCE.getMastersthesisType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__AUTHOR = eINSTANCE.getMastersthesisType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__TITLE = eINSTANCE.getMastersthesisType_Title();

        /**
         * The meta object literal for the '<em><b>School</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__SCHOOL = eINSTANCE.getMastersthesisType_School();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__YEAR = eINSTANCE.getMastersthesisType_Year();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__TYPE = eINSTANCE.getMastersthesisType_Type();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__ADDRESS = eINSTANCE.getMastersthesisType_Address();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__MONTH = eINSTANCE.getMastersthesisType_Month();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__NOTE = eINSTANCE.getMastersthesisType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__KEY = eINSTANCE.getMastersthesisType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MASTERSTHESIS_TYPE__CROSSREF = eINSTANCE.getMastersthesisType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.MiscTypeImpl <em>Misc Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.MiscTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMiscType()
         * @generated
         */
        EClass MISC_TYPE = eINSTANCE.getMiscType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MISC_TYPE__AUTHOR = eINSTANCE.getMiscType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MISC_TYPE__TITLE = eINSTANCE.getMiscType_Title();

        /**
         * The meta object literal for the '<em><b>Howpublished</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MISC_TYPE__HOWPUBLISHED = eINSTANCE.getMiscType_Howpublished();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MISC_TYPE__MONTH = eINSTANCE.getMiscType_Month();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MISC_TYPE__YEAR = eINSTANCE.getMiscType_Year();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MISC_TYPE__NOTE = eINSTANCE.getMiscType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MISC_TYPE__KEY = eINSTANCE.getMiscType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MISC_TYPE__CROSSREF = eINSTANCE.getMiscType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.PhdthesisTypeImpl <em>Phdthesis Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.PhdthesisTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getPhdthesisType()
         * @generated
         */
        EClass PHDTHESIS_TYPE = eINSTANCE.getPhdthesisType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__AUTHOR = eINSTANCE.getPhdthesisType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__TITLE = eINSTANCE.getPhdthesisType_Title();

        /**
         * The meta object literal for the '<em><b>School</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__SCHOOL = eINSTANCE.getPhdthesisType_School();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__YEAR = eINSTANCE.getPhdthesisType_Year();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__TYPE = eINSTANCE.getPhdthesisType_Type();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__ADDRESS = eINSTANCE.getPhdthesisType_Address();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__MONTH = eINSTANCE.getPhdthesisType_Month();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__NOTE = eINSTANCE.getPhdthesisType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__KEY = eINSTANCE.getPhdthesisType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHDTHESIS_TYPE__CROSSREF = eINSTANCE.getPhdthesisType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.ProceedingsTypeImpl <em>Proceedings Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.ProceedingsTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getProceedingsType()
         * @generated
         */
        EClass PROCEEDINGS_TYPE = eINSTANCE.getProceedingsType();

        /**
         * The meta object literal for the '<em><b>Editor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__EDITOR = eINSTANCE.getProceedingsType_Editor();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__TITLE = eINSTANCE.getProceedingsType_Title();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__YEAR = eINSTANCE.getProceedingsType_Year();

        /**
         * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__VOLUME = eINSTANCE.getProceedingsType_Volume();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__NUMBER = eINSTANCE.getProceedingsType_Number();

        /**
         * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__SERIES = eINSTANCE.getProceedingsType_Series();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__ADDRESS = eINSTANCE.getProceedingsType_Address();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__MONTH = eINSTANCE.getProceedingsType_Month();

        /**
         * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__ORGANIZATION = eINSTANCE.getProceedingsType_Organization();

        /**
         * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__PUBLISHER = eINSTANCE.getProceedingsType_Publisher();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__NOTE = eINSTANCE.getProceedingsType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__KEY = eINSTANCE.getProceedingsType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROCEEDINGS_TYPE__CROSSREF = eINSTANCE.getProceedingsType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.TechreportTypeImpl <em>Techreport Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.TechreportTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getTechreportType()
         * @generated
         */
        EClass TECHREPORT_TYPE = eINSTANCE.getTechreportType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__AUTHOR = eINSTANCE.getTechreportType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__TITLE = eINSTANCE.getTechreportType_Title();

        /**
         * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__INSTITUTION = eINSTANCE.getTechreportType_Institution();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__YEAR = eINSTANCE.getTechreportType_Year();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__TYPE = eINSTANCE.getTechreportType_Type();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__NUMBER = eINSTANCE.getTechreportType_Number();

        /**
         * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__ADDRESS = eINSTANCE.getTechreportType_Address();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__MONTH = eINSTANCE.getTechreportType_Month();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__NOTE = eINSTANCE.getTechreportType_Note();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__KEY = eINSTANCE.getTechreportType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TECHREPORT_TYPE__CROSSREF = eINSTANCE.getTechreportType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.impl.UnpublishedTypeImpl <em>Unpublished Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.impl.UnpublishedTypeImpl
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getUnpublishedType()
         * @generated
         */
        EClass UNPUBLISHED_TYPE = eINSTANCE.getUnpublishedType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNPUBLISHED_TYPE__AUTHOR = eINSTANCE.getUnpublishedType_Author();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNPUBLISHED_TYPE__TITLE = eINSTANCE.getUnpublishedType_Title();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNPUBLISHED_TYPE__NOTE = eINSTANCE.getUnpublishedType_Note();

        /**
         * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNPUBLISHED_TYPE__MONTH = eINSTANCE.getUnpublishedType_Month();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNPUBLISHED_TYPE__YEAR = eINSTANCE.getUnpublishedType_Year();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNPUBLISHED_TYPE__KEY = eINSTANCE.getUnpublishedType_Key();

        /**
         * The meta object literal for the '<em><b>Crossref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UNPUBLISHED_TYPE__CROSSREF = eINSTANCE.getUnpublishedType_Crossref();

        /**
         * The meta object literal for the '{@link net.sf.bibtexml.MonthStringType <em>Month String Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.MonthStringType
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMonthStringType()
         * @generated
         */
        EEnum MONTH_STRING_TYPE = eINSTANCE.getMonthStringType();

        /**
         * The meta object literal for the '<em>Edition Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getEditionType()
         * @generated
         */
        EDataType EDITION_TYPE = eINSTANCE.getEditionType();

        /**
         * The meta object literal for the '<em>Month String Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.sf.bibtexml.MonthStringType
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMonthStringTypeObject()
         * @generated
         */
        EDataType MONTH_STRING_TYPE_OBJECT = eINSTANCE.getMonthStringTypeObject();

        /**
         * The meta object literal for the '<em>Month Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getMonthType()
         * @generated
         */
        EDataType MONTH_TYPE = eINSTANCE.getMonthType();

        /**
         * The meta object literal for the '<em>Pages Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see net.sf.bibtexml.impl.BibtexmlPackageImpl#getPagesType()
         * @generated
         */
        EDataType PAGES_TYPE = eINSTANCE.getPagesType();

    }

} //BibtexmlPackage
