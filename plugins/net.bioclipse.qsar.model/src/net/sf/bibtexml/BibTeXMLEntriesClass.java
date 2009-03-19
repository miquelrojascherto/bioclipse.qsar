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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bib Te XML Entries Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getArticle <em>Article</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getBook <em>Book</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getBooklet <em>Booklet</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getManual <em>Manual</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getTechreport <em>Techreport</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getMastersthesis <em>Mastersthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getPhdthesis <em>Phdthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getInbook <em>Inbook</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getIncollection <em>Incollection</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getProceedings <em>Proceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getInproceedings <em>Inproceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getConference <em>Conference</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getUnpublished <em>Unpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.BibTeXMLEntriesClass#getMisc <em>Misc</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass()
 * @model extendedMetaData="name='BibTeXML.entries.class' kind='elementOnly'"
 * @generated
 */
public interface BibTeXMLEntriesClass extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Article()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='article' namespace='##targetNamespace'"
     * @generated
     */
    ArticleType getArticle();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getArticle <em>Article</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Article</em>' containment reference.
     * @see #getArticle()
     * @generated
     */
    void setArticle(ArticleType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Book()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='book' namespace='##targetNamespace'"
     * @generated
     */
    BookType getBook();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getBook <em>Book</em>}' containment reference.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Booklet()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='booklet' namespace='##targetNamespace'"
     * @generated
     */
    BookletType getBooklet();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getBooklet <em>Booklet</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Booklet</em>' containment reference.
     * @see #getBooklet()
     * @generated
     */
    void setBooklet(BookletType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Manual()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='manual' namespace='##targetNamespace'"
     * @generated
     */
    ManualType getManual();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getManual <em>Manual</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manual</em>' containment reference.
     * @see #getManual()
     * @generated
     */
    void setManual(ManualType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Techreport()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='techreport' namespace='##targetNamespace'"
     * @generated
     */
    TechreportType getTechreport();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getTechreport <em>Techreport</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Techreport</em>' containment reference.
     * @see #getTechreport()
     * @generated
     */
    void setTechreport(TechreportType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Mastersthesis()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mastersthesis' namespace='##targetNamespace'"
     * @generated
     */
    MastersthesisType getMastersthesis();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getMastersthesis <em>Mastersthesis</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mastersthesis</em>' containment reference.
     * @see #getMastersthesis()
     * @generated
     */
    void setMastersthesis(MastersthesisType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Phdthesis()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='phdthesis' namespace='##targetNamespace'"
     * @generated
     */
    PhdthesisType getPhdthesis();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getPhdthesis <em>Phdthesis</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phdthesis</em>' containment reference.
     * @see #getPhdthesis()
     * @generated
     */
    void setPhdthesis(PhdthesisType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Inbook()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inbook' namespace='##targetNamespace'"
     * @generated
     */
    InbookType getInbook();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getInbook <em>Inbook</em>}' containment reference.
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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Incollection()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='incollection' namespace='##targetNamespace'"
     * @generated
     */
    IncollectionType getIncollection();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getIncollection <em>Incollection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incollection</em>' containment reference.
     * @see #getIncollection()
     * @generated
     */
    void setIncollection(IncollectionType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Proceedings()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='proceedings' namespace='##targetNamespace'"
     * @generated
     */
    ProceedingsType getProceedings();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getProceedings <em>Proceedings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proceedings</em>' containment reference.
     * @see #getProceedings()
     * @generated
     */
    void setProceedings(ProceedingsType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Inproceedings()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='inproceedings' namespace='##targetNamespace'"
     * @generated
     */
    InproceedingsType getInproceedings();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getInproceedings <em>Inproceedings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inproceedings</em>' containment reference.
     * @see #getInproceedings()
     * @generated
     */
    void setInproceedings(InproceedingsType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Conference()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='conference' namespace='##targetNamespace'"
     * @generated
     */
    ConferenceType getConference();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getConference <em>Conference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conference</em>' containment reference.
     * @see #getConference()
     * @generated
     */
    void setConference(ConferenceType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Unpublished()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='unpublished' namespace='##targetNamespace'"
     * @generated
     */
    UnpublishedType getUnpublished();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getUnpublished <em>Unpublished</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unpublished</em>' containment reference.
     * @see #getUnpublished()
     * @generated
     */
    void setUnpublished(UnpublishedType value);

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
     * @see net.sf.bibtexml.BibtexmlPackage#getBibTeXMLEntriesClass_Misc()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='misc' namespace='##targetNamespace'"
     * @generated
     */
    MiscType getMisc();

    /**
     * Sets the value of the '{@link net.sf.bibtexml.BibTeXMLEntriesClass#getMisc <em>Misc</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Misc</em>' containment reference.
     * @see #getMisc()
     * @generated
     */
    void setMisc(MiscType value);

} // BibTeXMLEntriesClass
