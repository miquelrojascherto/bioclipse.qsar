/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.impl;

import net.sf.bibtexml.ArticleType;
import net.sf.bibtexml.BibTeXMLEntriesClass;
import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.BookType;
import net.sf.bibtexml.BookletType;
import net.sf.bibtexml.ConferenceType;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bib Te XML Entries Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getArticle <em>Article</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getBook <em>Book</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getBooklet <em>Booklet</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getManual <em>Manual</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getTechreport <em>Techreport</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getMastersthesis <em>Mastersthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getPhdthesis <em>Phdthesis</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getInbook <em>Inbook</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getIncollection <em>Incollection</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getProceedings <em>Proceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getInproceedings <em>Inproceedings</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getConference <em>Conference</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getUnpublished <em>Unpublished</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.BibTeXMLEntriesClassImpl#getMisc <em>Misc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibTeXMLEntriesClassImpl extends EObjectImpl implements BibTeXMLEntriesClass {
    /**
     * The cached value of the '{@link #getArticle() <em>Article</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArticle()
     * @generated
     * @ordered
     */
    protected ArticleType article;

    /**
     * The cached value of the '{@link #getBook() <em>Book</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBook()
     * @generated
     * @ordered
     */
    protected BookType book;

    /**
     * The cached value of the '{@link #getBooklet() <em>Booklet</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooklet()
     * @generated
     * @ordered
     */
    protected BookletType booklet;

    /**
     * The cached value of the '{@link #getManual() <em>Manual</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManual()
     * @generated
     * @ordered
     */
    protected ManualType manual;

    /**
     * The cached value of the '{@link #getTechreport() <em>Techreport</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTechreport()
     * @generated
     * @ordered
     */
    protected TechreportType techreport;

    /**
     * The cached value of the '{@link #getMastersthesis() <em>Mastersthesis</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMastersthesis()
     * @generated
     * @ordered
     */
    protected MastersthesisType mastersthesis;

    /**
     * The cached value of the '{@link #getPhdthesis() <em>Phdthesis</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhdthesis()
     * @generated
     * @ordered
     */
    protected PhdthesisType phdthesis;

    /**
     * The cached value of the '{@link #getInbook() <em>Inbook</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInbook()
     * @generated
     * @ordered
     */
    protected InbookType inbook;

    /**
     * The cached value of the '{@link #getIncollection() <em>Incollection</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncollection()
     * @generated
     * @ordered
     */
    protected IncollectionType incollection;

    /**
     * The cached value of the '{@link #getProceedings() <em>Proceedings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProceedings()
     * @generated
     * @ordered
     */
    protected ProceedingsType proceedings;

    /**
     * The cached value of the '{@link #getInproceedings() <em>Inproceedings</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInproceedings()
     * @generated
     * @ordered
     */
    protected InproceedingsType inproceedings;

    /**
     * The cached value of the '{@link #getConference() <em>Conference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConference()
     * @generated
     * @ordered
     */
    protected ConferenceType conference;

    /**
     * The cached value of the '{@link #getUnpublished() <em>Unpublished</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnpublished()
     * @generated
     * @ordered
     */
    protected UnpublishedType unpublished;

    /**
     * The cached value of the '{@link #getMisc() <em>Misc</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMisc()
     * @generated
     * @ordered
     */
    protected MiscType misc;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BibTeXMLEntriesClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BibtexmlPackage.Literals.BIB_TE_XML_ENTRIES_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArticleType getArticle() {
        return article;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetArticle(ArticleType newArticle, NotificationChain msgs) {
        ArticleType oldArticle = article;
        article = newArticle;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE, oldArticle, newArticle);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArticle(ArticleType newArticle) {
        if (newArticle != article) {
            NotificationChain msgs = null;
            if (article != null)
                msgs = ((InternalEObject)article).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE, null, msgs);
            if (newArticle != null)
                msgs = ((InternalEObject)newArticle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE, null, msgs);
            msgs = basicSetArticle(newArticle, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE, newArticle, newArticle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BookType getBook() {
        return book;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBook(BookType newBook, NotificationChain msgs) {
        BookType oldBook = book;
        book = newBook;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK, oldBook, newBook);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBook(BookType newBook) {
        if (newBook != book) {
            NotificationChain msgs = null;
            if (book != null)
                msgs = ((InternalEObject)book).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK, null, msgs);
            if (newBook != null)
                msgs = ((InternalEObject)newBook).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK, null, msgs);
            msgs = basicSetBook(newBook, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK, newBook, newBook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BookletType getBooklet() {
        return booklet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBooklet(BookletType newBooklet, NotificationChain msgs) {
        BookletType oldBooklet = booklet;
        booklet = newBooklet;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET, oldBooklet, newBooklet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBooklet(BookletType newBooklet) {
        if (newBooklet != booklet) {
            NotificationChain msgs = null;
            if (booklet != null)
                msgs = ((InternalEObject)booklet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET, null, msgs);
            if (newBooklet != null)
                msgs = ((InternalEObject)newBooklet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET, null, msgs);
            msgs = basicSetBooklet(newBooklet, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET, newBooklet, newBooklet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManualType getManual() {
        return manual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManual(ManualType newManual, NotificationChain msgs) {
        ManualType oldManual = manual;
        manual = newManual;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL, oldManual, newManual);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setManual(ManualType newManual) {
        if (newManual != manual) {
            NotificationChain msgs = null;
            if (manual != null)
                msgs = ((InternalEObject)manual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL, null, msgs);
            if (newManual != null)
                msgs = ((InternalEObject)newManual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL, null, msgs);
            msgs = basicSetManual(newManual, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL, newManual, newManual));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TechreportType getTechreport() {
        return techreport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTechreport(TechreportType newTechreport, NotificationChain msgs) {
        TechreportType oldTechreport = techreport;
        techreport = newTechreport;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT, oldTechreport, newTechreport);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTechreport(TechreportType newTechreport) {
        if (newTechreport != techreport) {
            NotificationChain msgs = null;
            if (techreport != null)
                msgs = ((InternalEObject)techreport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT, null, msgs);
            if (newTechreport != null)
                msgs = ((InternalEObject)newTechreport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT, null, msgs);
            msgs = basicSetTechreport(newTechreport, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT, newTechreport, newTechreport));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MastersthesisType getMastersthesis() {
        return mastersthesis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMastersthesis(MastersthesisType newMastersthesis, NotificationChain msgs) {
        MastersthesisType oldMastersthesis = mastersthesis;
        mastersthesis = newMastersthesis;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS, oldMastersthesis, newMastersthesis);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMastersthesis(MastersthesisType newMastersthesis) {
        if (newMastersthesis != mastersthesis) {
            NotificationChain msgs = null;
            if (mastersthesis != null)
                msgs = ((InternalEObject)mastersthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS, null, msgs);
            if (newMastersthesis != null)
                msgs = ((InternalEObject)newMastersthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS, null, msgs);
            msgs = basicSetMastersthesis(newMastersthesis, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS, newMastersthesis, newMastersthesis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhdthesisType getPhdthesis() {
        return phdthesis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhdthesis(PhdthesisType newPhdthesis, NotificationChain msgs) {
        PhdthesisType oldPhdthesis = phdthesis;
        phdthesis = newPhdthesis;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS, oldPhdthesis, newPhdthesis);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPhdthesis(PhdthesisType newPhdthesis) {
        if (newPhdthesis != phdthesis) {
            NotificationChain msgs = null;
            if (phdthesis != null)
                msgs = ((InternalEObject)phdthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS, null, msgs);
            if (newPhdthesis != null)
                msgs = ((InternalEObject)newPhdthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS, null, msgs);
            msgs = basicSetPhdthesis(newPhdthesis, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS, newPhdthesis, newPhdthesis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InbookType getInbook() {
        return inbook;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInbook(InbookType newInbook, NotificationChain msgs) {
        InbookType oldInbook = inbook;
        inbook = newInbook;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK, oldInbook, newInbook);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInbook(InbookType newInbook) {
        if (newInbook != inbook) {
            NotificationChain msgs = null;
            if (inbook != null)
                msgs = ((InternalEObject)inbook).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK, null, msgs);
            if (newInbook != null)
                msgs = ((InternalEObject)newInbook).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK, null, msgs);
            msgs = basicSetInbook(newInbook, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK, newInbook, newInbook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncollectionType getIncollection() {
        return incollection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncollection(IncollectionType newIncollection, NotificationChain msgs) {
        IncollectionType oldIncollection = incollection;
        incollection = newIncollection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION, oldIncollection, newIncollection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncollection(IncollectionType newIncollection) {
        if (newIncollection != incollection) {
            NotificationChain msgs = null;
            if (incollection != null)
                msgs = ((InternalEObject)incollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION, null, msgs);
            if (newIncollection != null)
                msgs = ((InternalEObject)newIncollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION, null, msgs);
            msgs = basicSetIncollection(newIncollection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION, newIncollection, newIncollection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProceedingsType getProceedings() {
        return proceedings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProceedings(ProceedingsType newProceedings, NotificationChain msgs) {
        ProceedingsType oldProceedings = proceedings;
        proceedings = newProceedings;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS, oldProceedings, newProceedings);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProceedings(ProceedingsType newProceedings) {
        if (newProceedings != proceedings) {
            NotificationChain msgs = null;
            if (proceedings != null)
                msgs = ((InternalEObject)proceedings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS, null, msgs);
            if (newProceedings != null)
                msgs = ((InternalEObject)newProceedings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS, null, msgs);
            msgs = basicSetProceedings(newProceedings, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS, newProceedings, newProceedings));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InproceedingsType getInproceedings() {
        return inproceedings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInproceedings(InproceedingsType newInproceedings, NotificationChain msgs) {
        InproceedingsType oldInproceedings = inproceedings;
        inproceedings = newInproceedings;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS, oldInproceedings, newInproceedings);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInproceedings(InproceedingsType newInproceedings) {
        if (newInproceedings != inproceedings) {
            NotificationChain msgs = null;
            if (inproceedings != null)
                msgs = ((InternalEObject)inproceedings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS, null, msgs);
            if (newInproceedings != null)
                msgs = ((InternalEObject)newInproceedings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS, null, msgs);
            msgs = basicSetInproceedings(newInproceedings, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS, newInproceedings, newInproceedings));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConferenceType getConference() {
        return conference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConference(ConferenceType newConference, NotificationChain msgs) {
        ConferenceType oldConference = conference;
        conference = newConference;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE, oldConference, newConference);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConference(ConferenceType newConference) {
        if (newConference != conference) {
            NotificationChain msgs = null;
            if (conference != null)
                msgs = ((InternalEObject)conference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE, null, msgs);
            if (newConference != null)
                msgs = ((InternalEObject)newConference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE, null, msgs);
            msgs = basicSetConference(newConference, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE, newConference, newConference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnpublishedType getUnpublished() {
        return unpublished;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUnpublished(UnpublishedType newUnpublished, NotificationChain msgs) {
        UnpublishedType oldUnpublished = unpublished;
        unpublished = newUnpublished;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED, oldUnpublished, newUnpublished);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnpublished(UnpublishedType newUnpublished) {
        if (newUnpublished != unpublished) {
            NotificationChain msgs = null;
            if (unpublished != null)
                msgs = ((InternalEObject)unpublished).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED, null, msgs);
            if (newUnpublished != null)
                msgs = ((InternalEObject)newUnpublished).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED, null, msgs);
            msgs = basicSetUnpublished(newUnpublished, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED, newUnpublished, newUnpublished));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MiscType getMisc() {
        return misc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMisc(MiscType newMisc, NotificationChain msgs) {
        MiscType oldMisc = misc;
        misc = newMisc;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC, oldMisc, newMisc);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMisc(MiscType newMisc) {
        if (newMisc != misc) {
            NotificationChain msgs = null;
            if (misc != null)
                msgs = ((InternalEObject)misc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC, null, msgs);
            if (newMisc != null)
                msgs = ((InternalEObject)newMisc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC, null, msgs);
            msgs = basicSetMisc(newMisc, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC, newMisc, newMisc));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE:
                return basicSetArticle(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK:
                return basicSetBook(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET:
                return basicSetBooklet(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL:
                return basicSetManual(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT:
                return basicSetTechreport(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS:
                return basicSetMastersthesis(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS:
                return basicSetPhdthesis(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK:
                return basicSetInbook(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION:
                return basicSetIncollection(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS:
                return basicSetProceedings(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS:
                return basicSetInproceedings(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE:
                return basicSetConference(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED:
                return basicSetUnpublished(null, msgs);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC:
                return basicSetMisc(null, msgs);
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
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE:
                return getArticle();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK:
                return getBook();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET:
                return getBooklet();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL:
                return getManual();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT:
                return getTechreport();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS:
                return getMastersthesis();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS:
                return getPhdthesis();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK:
                return getInbook();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION:
                return getIncollection();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS:
                return getProceedings();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS:
                return getInproceedings();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE:
                return getConference();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED:
                return getUnpublished();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC:
                return getMisc();
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
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE:
                setArticle((ArticleType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK:
                setBook((BookType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET:
                setBooklet((BookletType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL:
                setManual((ManualType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT:
                setTechreport((TechreportType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS:
                setMastersthesis((MastersthesisType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS:
                setPhdthesis((PhdthesisType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK:
                setInbook((InbookType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION:
                setIncollection((IncollectionType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS:
                setProceedings((ProceedingsType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS:
                setInproceedings((InproceedingsType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE:
                setConference((ConferenceType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED:
                setUnpublished((UnpublishedType)newValue);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC:
                setMisc((MiscType)newValue);
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
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE:
                setArticle((ArticleType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK:
                setBook((BookType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET:
                setBooklet((BookletType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL:
                setManual((ManualType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT:
                setTechreport((TechreportType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS:
                setMastersthesis((MastersthesisType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS:
                setPhdthesis((PhdthesisType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK:
                setInbook((InbookType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION:
                setIncollection((IncollectionType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS:
                setProceedings((ProceedingsType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS:
                setInproceedings((InproceedingsType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE:
                setConference((ConferenceType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED:
                setUnpublished((UnpublishedType)null);
                return;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC:
                setMisc((MiscType)null);
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
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__ARTICLE:
                return article != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOK:
                return book != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__BOOKLET:
                return booklet != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MANUAL:
                return manual != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__TECHREPORT:
                return techreport != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS:
                return mastersthesis != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS:
                return phdthesis != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INBOOK:
                return inbook != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION:
                return incollection != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS:
                return proceedings != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS:
                return inproceedings != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__CONFERENCE:
                return conference != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED:
                return unpublished != null;
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS__MISC:
                return misc != null;
        }
        return super.eIsSet(featureID);
    }

} //BibTeXMLEntriesClassImpl
