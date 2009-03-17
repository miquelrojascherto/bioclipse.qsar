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
package net.bioclipse.qsar.impl;

import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.ReferenceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.impl.ReferenceTypeImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.ReferenceTypeImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.ReferenceTypeImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.ReferenceTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.bioclipse.qsar.impl.ReferenceTypeImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceTypeImpl extends EObjectImpl implements ReferenceType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * The default value of the '{@link #getAuthors() <em>Authors</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthors()
     * @generated
     * @ordered
     */
    protected static final String AUTHORS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuthors() <em>Authors</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthors()
     * @generated
     * @ordered
     */
    protected String authors = AUTHORS_EDEFAULT;

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
     * The default value of the '{@link #getJournal() <em>Journal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJournal()
     * @generated
     * @ordered
     */
    protected static final String JOURNAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJournal() <em>Journal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJournal()
     * @generated
     * @ordered
     */
    protected String journal = JOURNAL_EDEFAULT;

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
     * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYear()
     * @generated
     * @ordered
     */
    protected static final String YEAR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYear()
     * @generated
     * @ordered
     */
    protected String year = YEAR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QsarPackage.Literals.REFERENCE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthors(String newAuthors) {
        String oldAuthors = authors;
        authors = newAuthors;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.REFERENCE_TYPE__AUTHORS, oldAuthors, authors));
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
            eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.REFERENCE_TYPE__DOI, oldDoi, doi));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJournal() {
        return journal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJournal(String newJournal) {
        String oldJournal = journal;
        journal = newJournal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.REFERENCE_TYPE__JOURNAL, oldJournal, journal));
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
            eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.REFERENCE_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getYear() {
        return year;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setYear(String newYear) {
        String oldYear = year;
        year = newYear;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QsarPackage.REFERENCE_TYPE__YEAR, oldYear, year));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case QsarPackage.REFERENCE_TYPE__AUTHORS:
                return getAuthors();
            case QsarPackage.REFERENCE_TYPE__DOI:
                return getDoi();
            case QsarPackage.REFERENCE_TYPE__JOURNAL:
                return getJournal();
            case QsarPackage.REFERENCE_TYPE__TITLE:
                return getTitle();
            case QsarPackage.REFERENCE_TYPE__YEAR:
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
            case QsarPackage.REFERENCE_TYPE__AUTHORS:
                setAuthors((String)newValue);
                return;
            case QsarPackage.REFERENCE_TYPE__DOI:
                setDoi((String)newValue);
                return;
            case QsarPackage.REFERENCE_TYPE__JOURNAL:
                setJournal((String)newValue);
                return;
            case QsarPackage.REFERENCE_TYPE__TITLE:
                setTitle((String)newValue);
                return;
            case QsarPackage.REFERENCE_TYPE__YEAR:
                setYear((String)newValue);
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
            case QsarPackage.REFERENCE_TYPE__AUTHORS:
                setAuthors(AUTHORS_EDEFAULT);
                return;
            case QsarPackage.REFERENCE_TYPE__DOI:
                setDoi(DOI_EDEFAULT);
                return;
            case QsarPackage.REFERENCE_TYPE__JOURNAL:
                setJournal(JOURNAL_EDEFAULT);
                return;
            case QsarPackage.REFERENCE_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case QsarPackage.REFERENCE_TYPE__YEAR:
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
            case QsarPackage.REFERENCE_TYPE__AUTHORS:
                return AUTHORS_EDEFAULT == null ? authors != null : !AUTHORS_EDEFAULT.equals(authors);
            case QsarPackage.REFERENCE_TYPE__DOI:
                return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
            case QsarPackage.REFERENCE_TYPE__JOURNAL:
                return JOURNAL_EDEFAULT == null ? journal != null : !JOURNAL_EDEFAULT.equals(journal);
            case QsarPackage.REFERENCE_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case QsarPackage.REFERENCE_TYPE__YEAR:
                return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
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
        result.append(" (authors: ");
        result.append(authors);
        result.append(", doi: ");
        result.append(doi);
        result.append(", journal: ");
        result.append(journal);
        result.append(", title: ");
        result.append(title);
        result.append(", year: ");
        result.append(year);
        result.append(')');
        return result.toString();
    }

} //ReferenceTypeImpl
