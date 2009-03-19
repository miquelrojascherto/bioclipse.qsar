/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.MastersthesisType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mastersthesis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getSchool <em>School</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getCrossref <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.MastersthesisTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MastersthesisTypeImpl extends EObjectImpl implements MastersthesisType {
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
     * The default value of the '{@link #getSchool() <em>School</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchool()
     * @generated
     * @ordered
     */
    protected static final String SCHOOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSchool() <em>School</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchool()
     * @generated
     * @ordered
     */
    protected String school = SCHOOL_EDEFAULT;

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
    protected MastersthesisTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BibtexmlPackage.Literals.MASTERSTHESIS_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__AUTHOR, oldAuthor, author));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSchool() {
        return school;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchool(String newSchool) {
        String oldSchool = school;
        school = newSchool;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__SCHOOL, oldSchool, school));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__YEAR, oldYear, year));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__TYPE, oldType, type));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__ADDRESS, oldAddress, address));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__MONTH, oldMonth, month));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__NOTE, oldNote, note));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__KEY, oldKey, key));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__CROSSREF, oldCrossref, crossref));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__DOI, oldDoi, doi));
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
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.MASTERSTHESIS_TYPE__URL, oldUrl, url));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BibtexmlPackage.MASTERSTHESIS_TYPE__AUTHOR:
                return getAuthor();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__TITLE:
                return getTitle();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__SCHOOL:
                return getSchool();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__YEAR:
                return getYear();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__TYPE:
                return getType();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__ADDRESS:
                return getAddress();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__MONTH:
                return getMonth();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__NOTE:
                return getNote();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__KEY:
                return getKey();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__CROSSREF:
                return getCrossref();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__DOI:
                return getDoi();
            case BibtexmlPackage.MASTERSTHESIS_TYPE__URL:
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
            case BibtexmlPackage.MASTERSTHESIS_TYPE__AUTHOR:
                setAuthor((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__TITLE:
                setTitle((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__SCHOOL:
                setSchool((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__YEAR:
                setYear((XMLGregorianCalendar)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__TYPE:
                setType((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__ADDRESS:
                setAddress((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__MONTH:
                setMonth(newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__NOTE:
                setNote((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__KEY:
                setKey((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__CROSSREF:
                setCrossref((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__DOI:
                setDoi((String)newValue);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__URL:
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
            case BibtexmlPackage.MASTERSTHESIS_TYPE__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__SCHOOL:
                setSchool(SCHOOL_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__YEAR:
                setYear(YEAR_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__MONTH:
                setMonth(MONTH_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__NOTE:
                setNote(NOTE_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__KEY:
                setKey(KEY_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__CROSSREF:
                setCrossref(CROSSREF_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__DOI:
                setDoi(DOI_EDEFAULT);
                return;
            case BibtexmlPackage.MASTERSTHESIS_TYPE__URL:
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
            case BibtexmlPackage.MASTERSTHESIS_TYPE__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__SCHOOL:
                return SCHOOL_EDEFAULT == null ? school != null : !SCHOOL_EDEFAULT.equals(school);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__YEAR:
                return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__ADDRESS:
                return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__MONTH:
                return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__NOTE:
                return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__KEY:
                return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__CROSSREF:
                return CROSSREF_EDEFAULT == null ? crossref != null : !CROSSREF_EDEFAULT.equals(crossref);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__DOI:
                return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
            case BibtexmlPackage.MASTERSTHESIS_TYPE__URL:
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
        result.append(", school: ");
        result.append(school);
        result.append(", year: ");
        result.append(year);
        result.append(", type: ");
        result.append(type);
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

} //MastersthesisTypeImpl
