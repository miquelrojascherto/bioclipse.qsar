/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.InproceedingsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inproceedings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getBooktitle <em>Booktitle</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InproceedingsTypeImpl#getCrossref <em>Crossref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InproceedingsTypeImpl extends EObjectImpl implements InproceedingsType {
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
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected String author = AUTHOR_EDEFAULT;

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
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

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
     * The cached value of the '{@link #getBooktitle() <em>Booktitle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooktitle()
     * @generated
     * @ordered
     */
    protected String booktitle = BOOKTITLE_EDEFAULT;

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
     * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYear()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar year = YEAR_EDEFAULT;

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
     * The cached value of the '{@link #getEditor() <em>Editor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditor()
     * @generated
     * @ordered
     */
    protected String editor = EDITOR_EDEFAULT;

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
     * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVolume()
     * @generated
     * @ordered
     */
    protected String volume = VOLUME_EDEFAULT;

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
     * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected String number = NUMBER_EDEFAULT;

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
     * The cached value of the '{@link #getSeries() <em>Series</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeries()
     * @generated
     * @ordered
     */
    protected String series = SERIES_EDEFAULT;

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
     * The cached value of the '{@link #getPages() <em>Pages</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPages()
     * @generated
     * @ordered
     */
    protected String pages = PAGES_EDEFAULT;

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
     * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected String address = ADDRESS_EDEFAULT;

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
     * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonth()
     * @generated
     * @ordered
     */
    protected Object month = MONTH_EDEFAULT;

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
     * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrganization()
     * @generated
     * @ordered
     */
    protected String organization = ORGANIZATION_EDEFAULT;

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
     * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublisher()
     * @generated
     * @ordered
     */
    protected String publisher = PUBLISHER_EDEFAULT;

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
     * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected String note = NOTE_EDEFAULT;

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
     * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected String key = KEY_EDEFAULT;

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
     * The cached value of the '{@link #getCrossref() <em>Crossref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrossref()
     * @generated
     * @ordered
     */
    protected String crossref = CROSSREF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InproceedingsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BibtexmlPackage.Literals.INPROCEEDINGS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(String newAuthor) {
        String oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBooktitle() {
        return booktitle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBooktitle(String newBooktitle) {
        String oldBooktitle = booktitle;
        booktitle = newBooktitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__BOOKTITLE, oldBooktitle, booktitle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setYear(XMLGregorianCalendar newYear) {
        XMLGregorianCalendar oldYear = year;
        year = newYear;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__YEAR, oldYear, year));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEditor() {
        return editor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditor(String newEditor) {
        String oldEditor = editor;
        editor = newEditor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__EDITOR, oldEditor, editor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVolume() {
        return volume;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVolume(String newVolume) {
        String oldVolume = volume;
        volume = newVolume;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__VOLUME, oldVolume, volume));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNumber() {
        return number;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumber(String newNumber) {
        String oldNumber = number;
        number = newNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__NUMBER, oldNumber, number));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSeries() {
        return series;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSeries(String newSeries) {
        String oldSeries = series;
        series = newSeries;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__SERIES, oldSeries, series));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPages() {
        return pages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPages(String newPages) {
        String oldPages = pages;
        pages = newPages;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__PAGES, oldPages, pages));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddress(String newAddress) {
        String oldAddress = address;
        address = newAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__ADDRESS, oldAddress, address));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMonth() {
        return month;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMonth(Object newMonth) {
        Object oldMonth = month;
        month = newMonth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__MONTH, oldMonth, month));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrganization(String newOrganization) {
        String oldOrganization = organization;
        organization = newOrganization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__ORGANIZATION, oldOrganization, organization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPublisher(String newPublisher) {
        String oldPublisher = publisher;
        publisher = newPublisher;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__PUBLISHER, oldPublisher, publisher));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNote() {
        return note;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNote(String newNote) {
        String oldNote = note;
        note = newNote;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__NOTE, oldNote, note));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(String newKey) {
        String oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__KEY, oldKey, key));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCrossref() {
        return crossref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCrossref(String newCrossref) {
        String oldCrossref = crossref;
        crossref = newCrossref;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INPROCEEDINGS_TYPE__CROSSREF, oldCrossref, crossref));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BibtexmlPackage.INPROCEEDINGS_TYPE__AUTHOR:
                return getAuthor();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__TITLE:
                return getTitle();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__BOOKTITLE:
                return getBooktitle();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__YEAR:
                return getYear();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__EDITOR:
                return getEditor();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__VOLUME:
                return getVolume();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__NUMBER:
                return getNumber();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__SERIES:
                return getSeries();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__PAGES:
                return getPages();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__ADDRESS:
                return getAddress();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__MONTH:
                return getMonth();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__ORGANIZATION:
                return getOrganization();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__PUBLISHER:
                return getPublisher();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__NOTE:
                return getNote();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__KEY:
                return getKey();
            case BibtexmlPackage.INPROCEEDINGS_TYPE__CROSSREF:
                return getCrossref();
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
            case BibtexmlPackage.INPROCEEDINGS_TYPE__AUTHOR:
                setAuthor((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__TITLE:
                setTitle((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__BOOKTITLE:
                setBooktitle((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__YEAR:
                setYear((XMLGregorianCalendar)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__EDITOR:
                setEditor((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__VOLUME:
                setVolume((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__NUMBER:
                setNumber((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__SERIES:
                setSeries((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__PAGES:
                setPages((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__ADDRESS:
                setAddress((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__MONTH:
                setMonth(newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__ORGANIZATION:
                setOrganization((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__PUBLISHER:
                setPublisher((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__NOTE:
                setNote((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__KEY:
                setKey((String)newValue);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__CROSSREF:
                setCrossref((String)newValue);
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
            case BibtexmlPackage.INPROCEEDINGS_TYPE__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__BOOKTITLE:
                setBooktitle(BOOKTITLE_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__YEAR:
                setYear(YEAR_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__EDITOR:
                setEditor(EDITOR_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__VOLUME:
                setVolume(VOLUME_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__NUMBER:
                setNumber(NUMBER_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__SERIES:
                setSeries(SERIES_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__PAGES:
                setPages(PAGES_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__MONTH:
                setMonth(MONTH_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__ORGANIZATION:
                setOrganization(ORGANIZATION_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__PUBLISHER:
                setPublisher(PUBLISHER_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__NOTE:
                setNote(NOTE_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__KEY:
                setKey(KEY_EDEFAULT);
                return;
            case BibtexmlPackage.INPROCEEDINGS_TYPE__CROSSREF:
                setCrossref(CROSSREF_EDEFAULT);
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
            case BibtexmlPackage.INPROCEEDINGS_TYPE__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__BOOKTITLE:
                return BOOKTITLE_EDEFAULT == null ? booktitle != null : !BOOKTITLE_EDEFAULT.equals(booktitle);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__YEAR:
                return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__EDITOR:
                return EDITOR_EDEFAULT == null ? editor != null : !EDITOR_EDEFAULT.equals(editor);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__VOLUME:
                return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__NUMBER:
                return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__SERIES:
                return SERIES_EDEFAULT == null ? series != null : !SERIES_EDEFAULT.equals(series);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__PAGES:
                return PAGES_EDEFAULT == null ? pages != null : !PAGES_EDEFAULT.equals(pages);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__ADDRESS:
                return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__MONTH:
                return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__ORGANIZATION:
                return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__PUBLISHER:
                return PUBLISHER_EDEFAULT == null ? publisher != null : !PUBLISHER_EDEFAULT.equals(publisher);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__NOTE:
                return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__KEY:
                return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
            case BibtexmlPackage.INPROCEEDINGS_TYPE__CROSSREF:
                return CROSSREF_EDEFAULT == null ? crossref != null : !CROSSREF_EDEFAULT.equals(crossref);
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
        result.append(" (author: ");
        result.append(author);
        result.append(", title: ");
        result.append(title);
        result.append(", booktitle: ");
        result.append(booktitle);
        result.append(", year: ");
        result.append(year);
        result.append(", editor: ");
        result.append(editor);
        result.append(", volume: ");
        result.append(volume);
        result.append(", number: ");
        result.append(number);
        result.append(", series: ");
        result.append(series);
        result.append(", pages: ");
        result.append(pages);
        result.append(", address: ");
        result.append(address);
        result.append(", month: ");
        result.append(month);
        result.append(", organization: ");
        result.append(organization);
        result.append(", publisher: ");
        result.append(publisher);
        result.append(", note: ");
        result.append(note);
        result.append(", key: ");
        result.append(key);
        result.append(", crossref: ");
        result.append(crossref);
        result.append(')');
        return result.toString();
    }

} //InproceedingsTypeImpl
