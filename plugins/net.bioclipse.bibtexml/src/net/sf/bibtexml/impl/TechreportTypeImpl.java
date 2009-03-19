/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.TechreportType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Techreport Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getCrossref <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.TechreportTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechreportTypeImpl extends EObjectImpl implements TechreportType {
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
     * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstitution()
     * @generated
     * @ordered
     */
    protected static final String INSTITUTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstitution()
     * @generated
     * @ordered
     */
    protected String institution = INSTITUTION_EDEFAULT;

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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

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
     * The default value of the '{@link #getDoi() <em>Doi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoi()
     * @generated
     * @ordered
     */
    protected static final String DOI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDoi() <em>Doi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoi()
     * @generated
     * @ordered
     */
    protected String doi = DOI_EDEFAULT;

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
     * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected String url = URL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TechreportTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BibtexmlPackage.Literals.TECHREPORT_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__AUTHOR, oldAuthor, author));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstitution(String newInstitution) {
        String oldInstitution = institution;
        institution = newInstitution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__INSTITUTION, oldInstitution, institution));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__YEAR, oldYear, year));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__TYPE, oldType, type));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__NUMBER, oldNumber, number));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__ADDRESS, oldAddress, address));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__MONTH, oldMonth, month));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__NOTE, oldNote, note));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__KEY, oldKey, key));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__CROSSREF, oldCrossref, crossref));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDoi() {
        return doi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDoi(String newDoi) {
        String oldDoi = doi;
        doi = newDoi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__DOI, oldDoi, doi));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUrl(String newUrl) {
        String oldUrl = url;
        url = newUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.TECHREPORT_TYPE__URL, oldUrl, url));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BibtexmlPackage.TECHREPORT_TYPE__AUTHOR:
                return getAuthor();
            case BibtexmlPackage.TECHREPORT_TYPE__TITLE:
                return getTitle();
            case BibtexmlPackage.TECHREPORT_TYPE__INSTITUTION:
                return getInstitution();
            case BibtexmlPackage.TECHREPORT_TYPE__YEAR:
                return getYear();
            case BibtexmlPackage.TECHREPORT_TYPE__TYPE:
                return getType();
            case BibtexmlPackage.TECHREPORT_TYPE__NUMBER:
                return getNumber();
            case BibtexmlPackage.TECHREPORT_TYPE__ADDRESS:
                return getAddress();
            case BibtexmlPackage.TECHREPORT_TYPE__MONTH:
                return getMonth();
            case BibtexmlPackage.TECHREPORT_TYPE__NOTE:
                return getNote();
            case BibtexmlPackage.TECHREPORT_TYPE__KEY:
                return getKey();
            case BibtexmlPackage.TECHREPORT_TYPE__CROSSREF:
                return getCrossref();
            case BibtexmlPackage.TECHREPORT_TYPE__DOI:
                return getDoi();
            case BibtexmlPackage.TECHREPORT_TYPE__URL:
                return getUrl();
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
            case BibtexmlPackage.TECHREPORT_TYPE__AUTHOR:
                setAuthor((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__TITLE:
                setTitle((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__INSTITUTION:
                setInstitution((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__YEAR:
                setYear((XMLGregorianCalendar)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__TYPE:
                setType((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__NUMBER:
                setNumber((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__ADDRESS:
                setAddress((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__MONTH:
                setMonth(newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__NOTE:
                setNote((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__KEY:
                setKey((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__CROSSREF:
                setCrossref((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__DOI:
                setDoi((String)newValue);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__URL:
                setUrl((String)newValue);
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
            case BibtexmlPackage.TECHREPORT_TYPE__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__INSTITUTION:
                setInstitution(INSTITUTION_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__YEAR:
                setYear(YEAR_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__NUMBER:
                setNumber(NUMBER_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__MONTH:
                setMonth(MONTH_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__NOTE:
                setNote(NOTE_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__KEY:
                setKey(KEY_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__CROSSREF:
                setCrossref(CROSSREF_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__DOI:
                setDoi(DOI_EDEFAULT);
                return;
            case BibtexmlPackage.TECHREPORT_TYPE__URL:
                setUrl(URL_EDEFAULT);
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
            case BibtexmlPackage.TECHREPORT_TYPE__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case BibtexmlPackage.TECHREPORT_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case BibtexmlPackage.TECHREPORT_TYPE__INSTITUTION:
                return INSTITUTION_EDEFAULT == null ? institution != null : !INSTITUTION_EDEFAULT.equals(institution);
            case BibtexmlPackage.TECHREPORT_TYPE__YEAR:
                return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
            case BibtexmlPackage.TECHREPORT_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case BibtexmlPackage.TECHREPORT_TYPE__NUMBER:
                return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
            case BibtexmlPackage.TECHREPORT_TYPE__ADDRESS:
                return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
            case BibtexmlPackage.TECHREPORT_TYPE__MONTH:
                return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
            case BibtexmlPackage.TECHREPORT_TYPE__NOTE:
                return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
            case BibtexmlPackage.TECHREPORT_TYPE__KEY:
                return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
            case BibtexmlPackage.TECHREPORT_TYPE__CROSSREF:
                return CROSSREF_EDEFAULT == null ? crossref != null : !CROSSREF_EDEFAULT.equals(crossref);
            case BibtexmlPackage.TECHREPORT_TYPE__DOI:
                return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
            case BibtexmlPackage.TECHREPORT_TYPE__URL:
                return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
        result.append(", institution: ");
        result.append(institution);
        result.append(", year: ");
        result.append(year);
        result.append(", type: ");
        result.append(type);
        result.append(", number: ");
        result.append(number);
        result.append(", address: ");
        result.append(address);
        result.append(", month: ");
        result.append(month);
        result.append(", note: ");
        result.append(note);
        result.append(", key: ");
        result.append(key);
        result.append(", crossref: ");
        result.append(crossref);
        result.append(", doi: ");
        result.append(doi);
        result.append(", url: ");
        result.append(url);
        result.append(')');
        return result.toString();
    }

} //TechreportTypeImpl
