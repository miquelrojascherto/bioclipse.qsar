/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.bibtexml.ArticleType;
import net.sf.bibtexml.BibTeXMLEntryType;
import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.BookType;
import net.sf.bibtexml.BookletType;
import net.sf.bibtexml.ConferenceType;
import net.sf.bibtexml.DocumentRoot;
import net.sf.bibtexml.FileType;
import net.sf.bibtexml.InbookType;
import net.sf.bibtexml.IncollectionType;
import net.sf.bibtexml.InproceedingsType;
import net.sf.bibtexml.ManualType;
import net.sf.bibtexml.MastersthesisType;
import net.sf.bibtexml.MiscType;
import net.sf.bibtexml.PhdthesisType;
import net.sf.bibtexml.ProceedingsType;
import net.sf.bibtexml.TechreportType;
import net.sf.bibtexml.UnpublishedType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getAnnote <em>Annote</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getArticle <em>Article</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getBook <em>Book</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getBooklet <em>Booklet</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getConference <em>Conference</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getCrossref <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getFile <em>File</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getHowpublished <em>Howpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getInbook <em>Inbook</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getIncollection <em>Incollection</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getInproceedings <em>Inproceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getManual <em>Manual</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getMastersthesis <em>Mastersthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getMisc <em>Misc</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getPhdthesis <em>Phdthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getProceedings <em>Proceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getSchool <em>School</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getTechreport <em>Techreport</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getUnpublished <em>Unpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.DocumentRootImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_EDEFAULT = null;

    /**
     * The default value of the '{@link #getAnnote() <em>Annote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnote()
     * @generated
     * @ordered
     */
    protected static final String ANNOTE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected static final String AUTHOR_EDEFAULT = null;

    /**
     * The default value of the '{@link #getBooktitle() <em>Booktitle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooktitle()
     * @generated
     * @ordered
     */
    protected static final String BOOKTITLE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getChapter() <em>Chapter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChapter()
     * @generated
     * @ordered
     */
    protected static final BigInteger CHAPTER_EDEFAULT = null;

    /**
     * The default value of the '{@link #getCrossref() <em>Crossref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrossref()
     * @generated
     * @ordered
     */
    protected static final String CROSSREF_EDEFAULT = null;

    /**
     * The default value of the '{@link #getDoi() <em>Doi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoi()
     * @generated
     * @ordered
     */
    protected static final String DOI_EDEFAULT = null;

    /**
     * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdition()
     * @generated
     * @ordered
     */
    protected static final String EDITION_EDEFAULT = null;

    /**
     * The default value of the '{@link #getEditor() <em>Editor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditor()
     * @generated
     * @ordered
     */
    protected static final String EDITOR_EDEFAULT = null;

    /**
     * The default value of the '{@link #getHowpublished() <em>Howpublished</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHowpublished()
     * @generated
     * @ordered
     */
    protected static final String HOWPUBLISHED_EDEFAULT = null;

    /**
     * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstitution()
     * @generated
     * @ordered
     */
    protected static final String INSTITUTION_EDEFAULT = null;

    /**
     * The default value of the '{@link #getJournal() <em>Journal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJournal()
     * @generated
     * @ordered
     */
    protected static final String JOURNAL_EDEFAULT = null;

    /**
     * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected static final String KEY_EDEFAULT = null;

    /**
     * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonth()
     * @generated
     * @ordered
     */
    protected static final Object MONTH_EDEFAULT = null;

    /**
     * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected static final String NOTE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected static final String NUMBER_EDEFAULT = null;

    /**
     * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrganization()
     * @generated
     * @ordered
     */
    protected static final String ORGANIZATION_EDEFAULT = null;

    /**
     * The default value of the '{@link #getPages() <em>Pages</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPages()
     * @generated
     * @ordered
     */
    protected static final String PAGES_EDEFAULT = null;

    /**
     * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublisher()
     * @generated
     * @ordered
     */
    protected static final String PUBLISHER_EDEFAULT = null;

    /**
     * The default value of the '{@link #getSchool() <em>School</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchool()
     * @generated
     * @ordered
     */
    protected static final String SCHOOL_EDEFAULT = null;

    /**
     * The default value of the '{@link #getSeries() <em>Series</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeries()
     * @generated
     * @ordered
     */
    protected static final String SERIES_EDEFAULT = null;

    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected static final String URL_EDEFAULT = null;

    /**
     * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVolume()
     * @generated
     * @ordered
     */
    protected static final String VOLUME_EDEFAULT = null;

    /**
     * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYear()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar YEAR_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BibtexmlPackage.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, BibtexmlPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BibtexmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BibtexmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAddress() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__ADDRESS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddress(String newAddress) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAnnote() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__ANNOTE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnnote(String newAnnote) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__ANNOTE, newAnnote);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArticleType getArticle() {
        return (ArticleType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__ARTICLE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetArticle(ArticleType newArticle, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__ARTICLE, newArticle, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArticle(ArticleType newArticle) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__ARTICLE, newArticle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuthor() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__AUTHOR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(String newAuthor) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__AUTHOR, newAuthor);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BookType getBook() {
        return (BookType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOK, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBook(BookType newBook, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOK, newBook, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBook(BookType newBook) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOK, newBook);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BookletType getBooklet() {
        return (BookletType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOKLET, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBooklet(BookletType newBooklet, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOKLET, newBooklet, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBooklet(BookletType newBooklet) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOKLET, newBooklet);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBooktitle() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOKTITLE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBooktitle(String newBooktitle) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__BOOKTITLE, newBooktitle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getChapter() {
        return (BigInteger)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__CHAPTER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChapter(BigInteger newChapter) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__CHAPTER, newChapter);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConferenceType getConference() {
        return (ConferenceType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__CONFERENCE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConference(ConferenceType newConference, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__CONFERENCE, newConference, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConference(ConferenceType newConference) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__CONFERENCE, newConference);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCrossref() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__CROSSREF, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCrossref(String newCrossref) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__CROSSREF, newCrossref);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDoi() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__DOI, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDoi(String newDoi) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__DOI, newDoi);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEdition() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__EDITION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEdition(String newEdition) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__EDITION, newEdition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEditor() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__EDITOR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditor(String newEditor) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__EDITOR, newEditor);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibTeXMLEntryType getEntry() {
        return (BibTeXMLEntryType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__ENTRY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntry(BibTeXMLEntryType newEntry, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__ENTRY, newEntry, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntry(BibTeXMLEntryType newEntry) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__ENTRY, newEntry);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileType getFile() {
        return (FileType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__FILE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__FILE, newFile, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFile(FileType newFile) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__FILE, newFile);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHowpublished() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__HOWPUBLISHED, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHowpublished(String newHowpublished) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__HOWPUBLISHED, newHowpublished);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InbookType getInbook() {
        return (InbookType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__INBOOK, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInbook(InbookType newInbook, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__INBOOK, newInbook, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInbook(InbookType newInbook) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__INBOOK, newInbook);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncollectionType getIncollection() {
        return (IncollectionType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__INCOLLECTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncollection(IncollectionType newIncollection, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__INCOLLECTION, newIncollection, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncollection(IncollectionType newIncollection) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__INCOLLECTION, newIncollection);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InproceedingsType getInproceedings() {
        return (InproceedingsType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__INPROCEEDINGS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInproceedings(InproceedingsType newInproceedings, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__INPROCEEDINGS, newInproceedings, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInproceedings(InproceedingsType newInproceedings) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__INPROCEEDINGS, newInproceedings);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInstitution() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__INSTITUTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstitution(String newInstitution) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__INSTITUTION, newInstitution);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJournal() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__JOURNAL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJournal(String newJournal) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__JOURNAL, newJournal);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKey() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__KEY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(String newKey) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__KEY, newKey);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManualType getManual() {
        return (ManualType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__MANUAL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManual(ManualType newManual, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__MANUAL, newManual, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setManual(ManualType newManual) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__MANUAL, newManual);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MastersthesisType getMastersthesis() {
        return (MastersthesisType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__MASTERSTHESIS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMastersthesis(MastersthesisType newMastersthesis, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__MASTERSTHESIS, newMastersthesis, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMastersthesis(MastersthesisType newMastersthesis) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__MASTERSTHESIS, newMastersthesis);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MiscType getMisc() {
        return (MiscType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__MISC, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMisc(MiscType newMisc, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__MISC, newMisc, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMisc(MiscType newMisc) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__MISC, newMisc);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMonth() {
        return getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__MONTH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMonth(Object newMonth) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__MONTH, newMonth);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNote() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__NOTE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNote(String newNote) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__NOTE, newNote);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNumber() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__NUMBER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumber(String newNumber) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__NUMBER, newNumber);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOrganization() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrganization(String newOrganization) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPages() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__PAGES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPages(String newPages) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__PAGES, newPages);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhdthesisType getPhdthesis() {
        return (PhdthesisType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__PHDTHESIS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhdthesis(PhdthesisType newPhdthesis, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__PHDTHESIS, newPhdthesis, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPhdthesis(PhdthesisType newPhdthesis) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__PHDTHESIS, newPhdthesis);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProceedingsType getProceedings() {
        return (ProceedingsType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__PROCEEDINGS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProceedings(ProceedingsType newProceedings, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__PROCEEDINGS, newProceedings, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProceedings(ProceedingsType newProceedings) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__PROCEEDINGS, newProceedings);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPublisher() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__PUBLISHER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPublisher(String newPublisher) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSchool() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__SCHOOL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchool(String newSchool) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__SCHOOL, newSchool);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSeries() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__SERIES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSeries(String newSeries) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__SERIES, newSeries);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TechreportType getTechreport() {
        return (TechreportType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__TECHREPORT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTechreport(TechreportType newTechreport, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__TECHREPORT, newTechreport, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTechreport(TechreportType newTechreport) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__TECHREPORT, newTechreport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTitle() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__TITLE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnpublishedType getUnpublished() {
        return (UnpublishedType)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__UNPUBLISHED, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUnpublished(UnpublishedType newUnpublished, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(BibtexmlPackage.Literals.DOCUMENT_ROOT__UNPUBLISHED, newUnpublished, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnpublished(UnpublishedType newUnpublished) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__UNPUBLISHED, newUnpublished);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUrl() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__URL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUrl(String newUrl) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__URL, newUrl);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVolume() {
        return (String)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__VOLUME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVolume(String newVolume) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__VOLUME, newVolume);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLGregorianCalendar getYear() {
        return (XMLGregorianCalendar)getMixed().get(BibtexmlPackage.Literals.DOCUMENT_ROOT__YEAR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setYear(XMLGregorianCalendar newYear) {
        ((FeatureMap.Internal)getMixed()).set(BibtexmlPackage.Literals.DOCUMENT_ROOT__YEAR, newYear);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BibtexmlPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__ARTICLE:
                return basicSetArticle(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__BOOK:
                return basicSetBook(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKLET:
                return basicSetBooklet(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__CONFERENCE:
                return basicSetConference(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__ENTRY:
                return basicSetEntry(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__FILE:
                return basicSetFile(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__INBOOK:
                return basicSetInbook(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__INCOLLECTION:
                return basicSetIncollection(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__INPROCEEDINGS:
                return basicSetInproceedings(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__MANUAL:
                return basicSetManual(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__MASTERSTHESIS:
                return basicSetMastersthesis(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__MISC:
                return basicSetMisc(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__PHDTHESIS:
                return basicSetPhdthesis(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__PROCEEDINGS:
                return basicSetProceedings(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__TECHREPORT:
                return basicSetTechreport(null, msgs);
            case BibtexmlPackage.DOCUMENT_ROOT__UNPUBLISHED:
                return basicSetUnpublished(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BibtexmlPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case BibtexmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case BibtexmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case BibtexmlPackage.DOCUMENT_ROOT__ADDRESS:
                return getAddress();
            case BibtexmlPackage.DOCUMENT_ROOT__ANNOTE:
                return getAnnote();
            case BibtexmlPackage.DOCUMENT_ROOT__ARTICLE:
                return getArticle();
            case BibtexmlPackage.DOCUMENT_ROOT__AUTHOR:
                return getAuthor();
            case BibtexmlPackage.DOCUMENT_ROOT__BOOK:
                return getBook();
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKLET:
                return getBooklet();
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKTITLE:
                return getBooktitle();
            case BibtexmlPackage.DOCUMENT_ROOT__CHAPTER:
                return getChapter();
            case BibtexmlPackage.DOCUMENT_ROOT__CONFERENCE:
                return getConference();
            case BibtexmlPackage.DOCUMENT_ROOT__CROSSREF:
                return getCrossref();
            case BibtexmlPackage.DOCUMENT_ROOT__DOI:
                return getDoi();
            case BibtexmlPackage.DOCUMENT_ROOT__EDITION:
                return getEdition();
            case BibtexmlPackage.DOCUMENT_ROOT__EDITOR:
                return getEditor();
            case BibtexmlPackage.DOCUMENT_ROOT__ENTRY:
                return getEntry();
            case BibtexmlPackage.DOCUMENT_ROOT__FILE:
                return getFile();
            case BibtexmlPackage.DOCUMENT_ROOT__HOWPUBLISHED:
                return getHowpublished();
            case BibtexmlPackage.DOCUMENT_ROOT__INBOOK:
                return getInbook();
            case BibtexmlPackage.DOCUMENT_ROOT__INCOLLECTION:
                return getIncollection();
            case BibtexmlPackage.DOCUMENT_ROOT__INPROCEEDINGS:
                return getInproceedings();
            case BibtexmlPackage.DOCUMENT_ROOT__INSTITUTION:
                return getInstitution();
            case BibtexmlPackage.DOCUMENT_ROOT__JOURNAL:
                return getJournal();
            case BibtexmlPackage.DOCUMENT_ROOT__KEY:
                return getKey();
            case BibtexmlPackage.DOCUMENT_ROOT__MANUAL:
                return getManual();
            case BibtexmlPackage.DOCUMENT_ROOT__MASTERSTHESIS:
                return getMastersthesis();
            case BibtexmlPackage.DOCUMENT_ROOT__MISC:
                return getMisc();
            case BibtexmlPackage.DOCUMENT_ROOT__MONTH:
                return getMonth();
            case BibtexmlPackage.DOCUMENT_ROOT__NOTE:
                return getNote();
            case BibtexmlPackage.DOCUMENT_ROOT__NUMBER:
                return getNumber();
            case BibtexmlPackage.DOCUMENT_ROOT__ORGANIZATION:
                return getOrganization();
            case BibtexmlPackage.DOCUMENT_ROOT__PAGES:
                return getPages();
            case BibtexmlPackage.DOCUMENT_ROOT__PHDTHESIS:
                return getPhdthesis();
            case BibtexmlPackage.DOCUMENT_ROOT__PROCEEDINGS:
                return getProceedings();
            case BibtexmlPackage.DOCUMENT_ROOT__PUBLISHER:
                return getPublisher();
            case BibtexmlPackage.DOCUMENT_ROOT__SCHOOL:
                return getSchool();
            case BibtexmlPackage.DOCUMENT_ROOT__SERIES:
                return getSeries();
            case BibtexmlPackage.DOCUMENT_ROOT__TECHREPORT:
                return getTechreport();
            case BibtexmlPackage.DOCUMENT_ROOT__TITLE:
                return getTitle();
            case BibtexmlPackage.DOCUMENT_ROOT__TYPE:
                return getType();
            case BibtexmlPackage.DOCUMENT_ROOT__UNPUBLISHED:
                return getUnpublished();
            case BibtexmlPackage.DOCUMENT_ROOT__URL:
                return getUrl();
            case BibtexmlPackage.DOCUMENT_ROOT__VOLUME:
                return getVolume();
            case BibtexmlPackage.DOCUMENT_ROOT__YEAR:
                return getYear();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BibtexmlPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ADDRESS:
                setAddress((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ANNOTE:
                setAnnote((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ARTICLE:
                setArticle((ArticleType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__AUTHOR:
                setAuthor((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__BOOK:
                setBook((BookType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKLET:
                setBooklet((BookletType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKTITLE:
                setBooktitle((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__CHAPTER:
                setChapter((BigInteger)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__CONFERENCE:
                setConference((ConferenceType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__CROSSREF:
                setCrossref((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__DOI:
                setDoi((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__EDITION:
                setEdition((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__EDITOR:
                setEditor((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ENTRY:
                setEntry((BibTeXMLEntryType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__FILE:
                setFile((FileType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__HOWPUBLISHED:
                setHowpublished((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__INBOOK:
                setInbook((InbookType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__INCOLLECTION:
                setIncollection((IncollectionType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__INPROCEEDINGS:
                setInproceedings((InproceedingsType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__INSTITUTION:
                setInstitution((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__JOURNAL:
                setJournal((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__KEY:
                setKey((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__MANUAL:
                setManual((ManualType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__MASTERSTHESIS:
                setMastersthesis((MastersthesisType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__MISC:
                setMisc((MiscType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__MONTH:
                setMonth(newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__NOTE:
                setNote((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__NUMBER:
                setNumber((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ORGANIZATION:
                setOrganization((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__PAGES:
                setPages((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__PHDTHESIS:
                setPhdthesis((PhdthesisType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__PROCEEDINGS:
                setProceedings((ProceedingsType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__PUBLISHER:
                setPublisher((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__SCHOOL:
                setSchool((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__SERIES:
                setSeries((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__TECHREPORT:
                setTechreport((TechreportType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__TITLE:
                setTitle((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__TYPE:
                setType((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__UNPUBLISHED:
                setUnpublished((UnpublishedType)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__URL:
                setUrl((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__VOLUME:
                setVolume((String)newValue);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__YEAR:
                setYear((XMLGregorianCalendar)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case BibtexmlPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ANNOTE:
                setAnnote(ANNOTE_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ARTICLE:
                setArticle((ArticleType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__BOOK:
                setBook((BookType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKLET:
                setBooklet((BookletType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKTITLE:
                setBooktitle(BOOKTITLE_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__CHAPTER:
                setChapter(CHAPTER_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__CONFERENCE:
                setConference((ConferenceType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__CROSSREF:
                setCrossref(CROSSREF_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__DOI:
                setDoi(DOI_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__EDITION:
                setEdition(EDITION_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__EDITOR:
                setEditor(EDITOR_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ENTRY:
                setEntry((BibTeXMLEntryType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__FILE:
                setFile((FileType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__HOWPUBLISHED:
                setHowpublished(HOWPUBLISHED_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__INBOOK:
                setInbook((InbookType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__INCOLLECTION:
                setIncollection((IncollectionType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__INPROCEEDINGS:
                setInproceedings((InproceedingsType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__INSTITUTION:
                setInstitution(INSTITUTION_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__JOURNAL:
                setJournal(JOURNAL_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__KEY:
                setKey(KEY_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__MANUAL:
                setManual((ManualType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__MASTERSTHESIS:
                setMastersthesis((MastersthesisType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__MISC:
                setMisc((MiscType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__MONTH:
                setMonth(MONTH_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__NOTE:
                setNote(NOTE_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__NUMBER:
                setNumber(NUMBER_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__ORGANIZATION:
                setOrganization(ORGANIZATION_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__PAGES:
                setPages(PAGES_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__PHDTHESIS:
                setPhdthesis((PhdthesisType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__PROCEEDINGS:
                setProceedings((ProceedingsType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__PUBLISHER:
                setPublisher(PUBLISHER_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__SCHOOL:
                setSchool(SCHOOL_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__SERIES:
                setSeries(SERIES_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__TECHREPORT:
                setTechreport((TechreportType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__UNPUBLISHED:
                setUnpublished((UnpublishedType)null);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__URL:
                setUrl(URL_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__VOLUME:
                setVolume(VOLUME_EDEFAULT);
                return;
            case BibtexmlPackage.DOCUMENT_ROOT__YEAR:
                setYear(YEAR_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BibtexmlPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case BibtexmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case BibtexmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case BibtexmlPackage.DOCUMENT_ROOT__ADDRESS:
                return ADDRESS_EDEFAULT == null ? getAddress() != null : !ADDRESS_EDEFAULT.equals(getAddress());
            case BibtexmlPackage.DOCUMENT_ROOT__ANNOTE:
                return ANNOTE_EDEFAULT == null ? getAnnote() != null : !ANNOTE_EDEFAULT.equals(getAnnote());
            case BibtexmlPackage.DOCUMENT_ROOT__ARTICLE:
                return getArticle() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__AUTHOR:
                return AUTHOR_EDEFAULT == null ? getAuthor() != null : !AUTHOR_EDEFAULT.equals(getAuthor());
            case BibtexmlPackage.DOCUMENT_ROOT__BOOK:
                return getBook() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKLET:
                return getBooklet() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__BOOKTITLE:
                return BOOKTITLE_EDEFAULT == null ? getBooktitle() != null : !BOOKTITLE_EDEFAULT.equals(getBooktitle());
            case BibtexmlPackage.DOCUMENT_ROOT__CHAPTER:
                return CHAPTER_EDEFAULT == null ? getChapter() != null : !CHAPTER_EDEFAULT.equals(getChapter());
            case BibtexmlPackage.DOCUMENT_ROOT__CONFERENCE:
                return getConference() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__CROSSREF:
                return CROSSREF_EDEFAULT == null ? getCrossref() != null : !CROSSREF_EDEFAULT.equals(getCrossref());
            case BibtexmlPackage.DOCUMENT_ROOT__DOI:
                return DOI_EDEFAULT == null ? getDoi() != null : !DOI_EDEFAULT.equals(getDoi());
            case BibtexmlPackage.DOCUMENT_ROOT__EDITION:
                return EDITION_EDEFAULT == null ? getEdition() != null : !EDITION_EDEFAULT.equals(getEdition());
            case BibtexmlPackage.DOCUMENT_ROOT__EDITOR:
                return EDITOR_EDEFAULT == null ? getEditor() != null : !EDITOR_EDEFAULT.equals(getEditor());
            case BibtexmlPackage.DOCUMENT_ROOT__ENTRY:
                return getEntry() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__FILE:
                return getFile() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__HOWPUBLISHED:
                return HOWPUBLISHED_EDEFAULT == null ? getHowpublished() != null : !HOWPUBLISHED_EDEFAULT.equals(getHowpublished());
            case BibtexmlPackage.DOCUMENT_ROOT__INBOOK:
                return getInbook() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__INCOLLECTION:
                return getIncollection() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__INPROCEEDINGS:
                return getInproceedings() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__INSTITUTION:
                return INSTITUTION_EDEFAULT == null ? getInstitution() != null : !INSTITUTION_EDEFAULT.equals(getInstitution());
            case BibtexmlPackage.DOCUMENT_ROOT__JOURNAL:
                return JOURNAL_EDEFAULT == null ? getJournal() != null : !JOURNAL_EDEFAULT.equals(getJournal());
            case BibtexmlPackage.DOCUMENT_ROOT__KEY:
                return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
            case BibtexmlPackage.DOCUMENT_ROOT__MANUAL:
                return getManual() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__MASTERSTHESIS:
                return getMastersthesis() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__MISC:
                return getMisc() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__MONTH:
                return MONTH_EDEFAULT == null ? getMonth() != null : !MONTH_EDEFAULT.equals(getMonth());
            case BibtexmlPackage.DOCUMENT_ROOT__NOTE:
                return NOTE_EDEFAULT == null ? getNote() != null : !NOTE_EDEFAULT.equals(getNote());
            case BibtexmlPackage.DOCUMENT_ROOT__NUMBER:
                return NUMBER_EDEFAULT == null ? getNumber() != null : !NUMBER_EDEFAULT.equals(getNumber());
            case BibtexmlPackage.DOCUMENT_ROOT__ORGANIZATION:
                return ORGANIZATION_EDEFAULT == null ? getOrganization() != null : !ORGANIZATION_EDEFAULT.equals(getOrganization());
            case BibtexmlPackage.DOCUMENT_ROOT__PAGES:
                return PAGES_EDEFAULT == null ? getPages() != null : !PAGES_EDEFAULT.equals(getPages());
            case BibtexmlPackage.DOCUMENT_ROOT__PHDTHESIS:
                return getPhdthesis() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__PROCEEDINGS:
                return getProceedings() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__PUBLISHER:
                return PUBLISHER_EDEFAULT == null ? getPublisher() != null : !PUBLISHER_EDEFAULT.equals(getPublisher());
            case BibtexmlPackage.DOCUMENT_ROOT__SCHOOL:
                return SCHOOL_EDEFAULT == null ? getSchool() != null : !SCHOOL_EDEFAULT.equals(getSchool());
            case BibtexmlPackage.DOCUMENT_ROOT__SERIES:
                return SERIES_EDEFAULT == null ? getSeries() != null : !SERIES_EDEFAULT.equals(getSeries());
            case BibtexmlPackage.DOCUMENT_ROOT__TECHREPORT:
                return getTechreport() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__TITLE:
                return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
            case BibtexmlPackage.DOCUMENT_ROOT__TYPE:
                return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
            case BibtexmlPackage.DOCUMENT_ROOT__UNPUBLISHED:
                return getUnpublished() != null;
            case BibtexmlPackage.DOCUMENT_ROOT__URL:
                return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
            case BibtexmlPackage.DOCUMENT_ROOT__VOLUME:
                return VOLUME_EDEFAULT == null ? getVolume() != null : !VOLUME_EDEFAULT.equals(getVolume());
            case BibtexmlPackage.DOCUMENT_ROOT__YEAR:
                return YEAR_EDEFAULT == null ? getYear() != null : !YEAR_EDEFAULT.equals(getYear());
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
