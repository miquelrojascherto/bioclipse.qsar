/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.sf.bibtexml.BibtexmlFactory;
import net.sf.bibtexml.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getAddress() <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getAnnote() <em>Annote</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getArticle() <em>Article</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getAuthor() <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getBook() <em>Book</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getBooklet() <em>Booklet</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getBooktitle() <em>Booktitle</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getChapter() <em>Chapter</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getConference() <em>Conference</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getCrossref() <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getDoi() <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getEdition() <em>Edition</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getEditor() <em>Editor</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getEntry() <em>Entry</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getFile() <em>File</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getHowpublished() <em>Howpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getInbook() <em>Inbook</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getIncollection() <em>Incollection</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getInproceedings() <em>Inproceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getInstitution() <em>Institution</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getJournal() <em>Journal</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getKey() <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getManual() <em>Manual</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getMastersthesis() <em>Mastersthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getMisc() <em>Misc</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getMonth() <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getNote() <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getNumber() <em>Number</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getOrganization() <em>Organization</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getPages() <em>Pages</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getPhdthesis() <em>Phdthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getProceedings() <em>Proceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getPublisher() <em>Publisher</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getSchool() <em>School</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getSeries() <em>Series</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getTechreport() <em>Techreport</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getTitle() <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getType() <em>Type</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getUnpublished() <em>Unpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getUrl() <em>Url</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getVolume() <em>Volume</em>}</li>
 *   <li>{@link net.sf.bibtexml.DocumentRoot#getYear() <em>Year</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DocumentRootTest extends TestCase {

    /**
     * The fixture for this Document Root test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRoot fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DocumentRootTest.class);
    }

    /**
     * Constructs a new Document Root test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRootTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Document Root test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(DocumentRoot fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Document Root test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRoot getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(BibtexmlFactory.eINSTANCE.createDocumentRoot());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getAddress() <em>Address</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getAddress()
     * @generated
     */
    public void testGetAddress() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setAddress(java.lang.String) <em>Address</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setAddress(java.lang.String)
     * @generated
     */
    public void testSetAddress() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getAnnote() <em>Annote</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getAnnote()
     * @generated
     */
    public void testGetAnnote() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setAnnote(java.lang.String) <em>Annote</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setAnnote(java.lang.String)
     * @generated
     */
    public void testSetAnnote() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getArticle() <em>Article</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getArticle()
     * @generated
     */
    public void testGetArticle() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setArticle(net.sf.bibtexml.ArticleType) <em>Article</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setArticle(net.sf.bibtexml.ArticleType)
     * @generated
     */
    public void testSetArticle() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getAuthor() <em>Author</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getAuthor()
     * @generated
     */
    public void testGetAuthor() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setAuthor(java.lang.String) <em>Author</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setAuthor(java.lang.String)
     * @generated
     */
    public void testSetAuthor() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getBook() <em>Book</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getBook()
     * @generated
     */
    public void testGetBook() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setBook(net.sf.bibtexml.BookType) <em>Book</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setBook(net.sf.bibtexml.BookType)
     * @generated
     */
    public void testSetBook() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getBooklet() <em>Booklet</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getBooklet()
     * @generated
     */
    public void testGetBooklet() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setBooklet(net.sf.bibtexml.BookletType) <em>Booklet</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setBooklet(net.sf.bibtexml.BookletType)
     * @generated
     */
    public void testSetBooklet() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getBooktitle() <em>Booktitle</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getBooktitle()
     * @generated
     */
    public void testGetBooktitle() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setBooktitle(java.lang.String) <em>Booktitle</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setBooktitle(java.lang.String)
     * @generated
     */
    public void testSetBooktitle() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getChapter() <em>Chapter</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getChapter()
     * @generated
     */
    public void testGetChapter() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setChapter(java.math.BigInteger) <em>Chapter</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setChapter(java.math.BigInteger)
     * @generated
     */
    public void testSetChapter() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getConference() <em>Conference</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getConference()
     * @generated
     */
    public void testGetConference() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setConference(net.sf.bibtexml.ConferenceType) <em>Conference</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setConference(net.sf.bibtexml.ConferenceType)
     * @generated
     */
    public void testSetConference() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getCrossref() <em>Crossref</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getCrossref()
     * @generated
     */
    public void testGetCrossref() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setCrossref(java.lang.String) <em>Crossref</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setCrossref(java.lang.String)
     * @generated
     */
    public void testSetCrossref() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getDoi() <em>Doi</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getDoi()
     * @generated
     */
    public void testGetDoi() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setDoi(java.lang.String) <em>Doi</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setDoi(java.lang.String)
     * @generated
     */
    public void testSetDoi() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getEdition() <em>Edition</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getEdition()
     * @generated
     */
    public void testGetEdition() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setEdition(java.lang.String) <em>Edition</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setEdition(java.lang.String)
     * @generated
     */
    public void testSetEdition() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getEditor() <em>Editor</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getEditor()
     * @generated
     */
    public void testGetEditor() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setEditor(java.lang.String) <em>Editor</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setEditor(java.lang.String)
     * @generated
     */
    public void testSetEditor() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getEntry() <em>Entry</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getEntry()
     * @generated
     */
    public void testGetEntry() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setEntry(net.sf.bibtexml.BibTeXMLEntryType) <em>Entry</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setEntry(net.sf.bibtexml.BibTeXMLEntryType)
     * @generated
     */
    public void testSetEntry() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getFile() <em>File</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getFile()
     * @generated
     */
    public void testGetFile() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setFile(net.sf.bibtexml.FileType) <em>File</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setFile(net.sf.bibtexml.FileType)
     * @generated
     */
    public void testSetFile() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getHowpublished() <em>Howpublished</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getHowpublished()
     * @generated
     */
    public void testGetHowpublished() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setHowpublished(java.lang.String) <em>Howpublished</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setHowpublished(java.lang.String)
     * @generated
     */
    public void testSetHowpublished() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getInbook() <em>Inbook</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getInbook()
     * @generated
     */
    public void testGetInbook() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setInbook(net.sf.bibtexml.InbookType) <em>Inbook</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setInbook(net.sf.bibtexml.InbookType)
     * @generated
     */
    public void testSetInbook() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getIncollection() <em>Incollection</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getIncollection()
     * @generated
     */
    public void testGetIncollection() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setIncollection(net.sf.bibtexml.IncollectionType) <em>Incollection</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setIncollection(net.sf.bibtexml.IncollectionType)
     * @generated
     */
    public void testSetIncollection() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getInproceedings() <em>Inproceedings</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getInproceedings()
     * @generated
     */
    public void testGetInproceedings() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setInproceedings(net.sf.bibtexml.InproceedingsType) <em>Inproceedings</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setInproceedings(net.sf.bibtexml.InproceedingsType)
     * @generated
     */
    public void testSetInproceedings() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getInstitution() <em>Institution</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getInstitution()
     * @generated
     */
    public void testGetInstitution() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setInstitution(java.lang.String) <em>Institution</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setInstitution(java.lang.String)
     * @generated
     */
    public void testSetInstitution() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getJournal() <em>Journal</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getJournal()
     * @generated
     */
    public void testGetJournal() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setJournal(java.lang.String) <em>Journal</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setJournal(java.lang.String)
     * @generated
     */
    public void testSetJournal() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getKey() <em>Key</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getKey()
     * @generated
     */
    public void testGetKey() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setKey(java.lang.String) <em>Key</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setKey(java.lang.String)
     * @generated
     */
    public void testSetKey() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getManual() <em>Manual</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getManual()
     * @generated
     */
    public void testGetManual() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setManual(net.sf.bibtexml.ManualType) <em>Manual</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setManual(net.sf.bibtexml.ManualType)
     * @generated
     */
    public void testSetManual() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getMastersthesis() <em>Mastersthesis</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getMastersthesis()
     * @generated
     */
    public void testGetMastersthesis() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setMastersthesis(net.sf.bibtexml.MastersthesisType) <em>Mastersthesis</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setMastersthesis(net.sf.bibtexml.MastersthesisType)
     * @generated
     */
    public void testSetMastersthesis() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getMisc() <em>Misc</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getMisc()
     * @generated
     */
    public void testGetMisc() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setMisc(net.sf.bibtexml.MiscType) <em>Misc</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setMisc(net.sf.bibtexml.MiscType)
     * @generated
     */
    public void testSetMisc() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getMonth() <em>Month</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getMonth()
     * @generated
     */
    public void testGetMonth() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setMonth(java.lang.Object) <em>Month</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setMonth(java.lang.Object)
     * @generated
     */
    public void testSetMonth() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getNote() <em>Note</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getNote()
     * @generated
     */
    public void testGetNote() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setNote(java.lang.String) <em>Note</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setNote(java.lang.String)
     * @generated
     */
    public void testSetNote() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getNumber() <em>Number</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getNumber()
     * @generated
     */
    public void testGetNumber() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setNumber(java.lang.String) <em>Number</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setNumber(java.lang.String)
     * @generated
     */
    public void testSetNumber() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getOrganization() <em>Organization</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getOrganization()
     * @generated
     */
    public void testGetOrganization() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setOrganization(java.lang.String) <em>Organization</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setOrganization(java.lang.String)
     * @generated
     */
    public void testSetOrganization() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getPages() <em>Pages</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getPages()
     * @generated
     */
    public void testGetPages() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setPages(java.lang.String) <em>Pages</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setPages(java.lang.String)
     * @generated
     */
    public void testSetPages() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getPhdthesis() <em>Phdthesis</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getPhdthesis()
     * @generated
     */
    public void testGetPhdthesis() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setPhdthesis(net.sf.bibtexml.PhdthesisType) <em>Phdthesis</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setPhdthesis(net.sf.bibtexml.PhdthesisType)
     * @generated
     */
    public void testSetPhdthesis() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getProceedings() <em>Proceedings</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getProceedings()
     * @generated
     */
    public void testGetProceedings() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setProceedings(net.sf.bibtexml.ProceedingsType) <em>Proceedings</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setProceedings(net.sf.bibtexml.ProceedingsType)
     * @generated
     */
    public void testSetProceedings() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getPublisher() <em>Publisher</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getPublisher()
     * @generated
     */
    public void testGetPublisher() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setPublisher(java.lang.String) <em>Publisher</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setPublisher(java.lang.String)
     * @generated
     */
    public void testSetPublisher() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getSchool() <em>School</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getSchool()
     * @generated
     */
    public void testGetSchool() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setSchool(java.lang.String) <em>School</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setSchool(java.lang.String)
     * @generated
     */
    public void testSetSchool() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getSeries() <em>Series</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getSeries()
     * @generated
     */
    public void testGetSeries() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setSeries(java.lang.String) <em>Series</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setSeries(java.lang.String)
     * @generated
     */
    public void testSetSeries() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getTechreport() <em>Techreport</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getTechreport()
     * @generated
     */
    public void testGetTechreport() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setTechreport(net.sf.bibtexml.TechreportType) <em>Techreport</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setTechreport(net.sf.bibtexml.TechreportType)
     * @generated
     */
    public void testSetTechreport() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getTitle() <em>Title</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getTitle()
     * @generated
     */
    public void testGetTitle() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setTitle(java.lang.String) <em>Title</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setTitle(java.lang.String)
     * @generated
     */
    public void testSetTitle() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getType() <em>Type</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getType()
     * @generated
     */
    public void testGetType() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setType(java.lang.String) <em>Type</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setType(java.lang.String)
     * @generated
     */
    public void testSetType() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getUnpublished() <em>Unpublished</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getUnpublished()
     * @generated
     */
    public void testGetUnpublished() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setUnpublished(net.sf.bibtexml.UnpublishedType) <em>Unpublished</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setUnpublished(net.sf.bibtexml.UnpublishedType)
     * @generated
     */
    public void testSetUnpublished() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getUrl() <em>Url</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getUrl()
     * @generated
     */
    public void testGetUrl() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setUrl(java.lang.String) <em>Url</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setUrl(java.lang.String)
     * @generated
     */
    public void testSetUrl() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getVolume() <em>Volume</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getVolume()
     * @generated
     */
    public void testGetVolume() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setVolume(java.lang.String) <em>Volume</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setVolume(java.lang.String)
     * @generated
     */
    public void testSetVolume() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#getYear() <em>Year</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#getYear()
     * @generated
     */
    public void testGetYear() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link net.sf.bibtexml.DocumentRoot#setYear(javax.xml.datatype.XMLGregorianCalendar) <em>Year</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.bibtexml.DocumentRoot#setYear(javax.xml.datatype.XMLGregorianCalendar)
     * @generated
     */
    public void testSetYear() {
        // TODO: implement this feature setter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

} //DocumentRootTest
