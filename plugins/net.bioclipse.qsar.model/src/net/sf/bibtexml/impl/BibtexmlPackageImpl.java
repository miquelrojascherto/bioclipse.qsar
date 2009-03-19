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
package net.sf.bibtexml.impl;

import net.bioclipse.qsar.QsarPackage;

import net.bioclipse.qsar.impl.QsarPackageImpl;

import net.sf.bibtexml.ArticleType;
import net.sf.bibtexml.BibTeXMLEntriesClass;
import net.sf.bibtexml.BibtexmlFactory;
import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.BookType;
import net.sf.bibtexml.BookletType;
import net.sf.bibtexml.ConferenceType;
import net.sf.bibtexml.DocumentRoot;
import net.sf.bibtexml.EntryType;
import net.sf.bibtexml.FileType;
import net.sf.bibtexml.InbookType;
import net.sf.bibtexml.IncollectionType;
import net.sf.bibtexml.InproceedingsType;
import net.sf.bibtexml.ManualType;
import net.sf.bibtexml.MastersthesisType;
import net.sf.bibtexml.MiscType;
import net.sf.bibtexml.MonthStringType;
import net.sf.bibtexml.PhdthesisType;
import net.sf.bibtexml.ProceedingsType;
import net.sf.bibtexml.TechreportType;
import net.sf.bibtexml.UnpublishedType;

import net.sf.bibtexml.util.BibtexmlValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibtexmlPackageImpl extends EPackageImpl implements BibtexmlPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass articleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bibTeXMLEntriesClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bookletTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bookTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conferenceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entryTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inbookTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass incollectionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inproceedingsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass manualTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mastersthesisTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass miscTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass phdthesisTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass proceedingsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass techreportTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unpublishedTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum monthStringTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType editionTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType monthStringTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType monthTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType pagesTypeEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see net.sf.bibtexml.BibtexmlPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private BibtexmlPackageImpl() {
        super(eNS_URI, BibtexmlFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this
     * model, and for any others upon which it depends.  Simple
     * dependencies are satisfied by calling this method on all
     * dependent packages before doing anything else.  This method drives
     * initialization for interdependent packages directly, in parallel
     * with this package, itself.
     * <p>Of this package and its interdependencies, all packages which
     * have not yet been registered by their URI values are first created
     * and registered.  The packages are then initialized in two steps:
     * meta-model objects for all of the packages are created before any
     * are initialized, since one package's meta-model objects may refer to
     * those of another.
     * <p>Invocation of this method will not affect any packages that have
     * already been initialized.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static BibtexmlPackage init() {
        if (isInited) return (BibtexmlPackage)EPackage.Registry.INSTANCE.getEPackage(BibtexmlPackage.eNS_URI);

        // Obtain or create and register package
        BibtexmlPackageImpl theBibtexmlPackage = (BibtexmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof BibtexmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new BibtexmlPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        QsarPackageImpl theQsarPackage = (QsarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QsarPackage.eNS_URI) instanceof QsarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QsarPackage.eNS_URI) : QsarPackage.eINSTANCE);

        // Create package meta-data objects
        theBibtexmlPackage.createPackageContents();
        theQsarPackage.createPackageContents();

        // Initialize created meta-data
        theBibtexmlPackage.initializePackageContents();
        theQsarPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theBibtexmlPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return BibtexmlValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theBibtexmlPackage.freeze();

        return theBibtexmlPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getArticleType() {
        return articleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Author() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Title() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Journal() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Year() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Volume() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Number() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Pages() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Month() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Note() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Key() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Crossref() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Doi() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArticleType_Url() {
        return (EAttribute)articleTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBibTeXMLEntriesClass() {
        return bibTeXMLEntriesClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Article() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Book() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Booklet() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Manual() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Techreport() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Mastersthesis() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Phdthesis() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Inbook() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Incollection() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Proceedings() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Inproceedings() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Conference() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Unpublished() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBibTeXMLEntriesClass_Misc() {
        return (EReference)bibTeXMLEntriesClassEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBookletType() {
        return bookletTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Author() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Title() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Howpublished() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Address() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Month() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Year() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Note() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Key() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Crossref() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Doi() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookletType_Url() {
        return (EAttribute)bookletTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBookType() {
        return bookTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Author() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Editor() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Title() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Publisher() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Year() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Volume() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Number() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Series() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Address() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Edition() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Month() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Note() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Key() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Crossref() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Doi() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBookType_Url() {
        return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConferenceType() {
        return conferenceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Author() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Title() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Booktitle() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Year() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Editor() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Volume() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Number() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Series() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Pages() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Address() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Month() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Organization() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Publisher() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Note() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Key() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Crossref() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Doi() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConferenceType_Url() {
        return (EAttribute)conferenceTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Address() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Annote() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Article() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Author() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Book() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Booklet() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Booktitle() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Chapter() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Conference() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Crossref() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Doi() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Edition() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Editor() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Entry() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_File() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Howpublished() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Inbook() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Incollection() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Inproceedings() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Institution() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Journal() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Key() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Manual() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Mastersthesis() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Misc() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Month() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Note() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Number() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Organization() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Pages() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Phdthesis() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Proceedings() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Publisher() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_School() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Series() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Techreport() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Title() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Type() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Unpublished() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Url() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Volume() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Year() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntryType() {
        return entryTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntryType_Id() {
        return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFileType() {
        return fileTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFileType_Entry() {
        return (EReference)fileTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInbookType() {
        return inbookTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Author() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Editor() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Title() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Chapter() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Pages() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Pages1() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Publisher() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Year() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Volume() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Number() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Series() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Type() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Address() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Edition() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Month() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Note() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Key() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Crossref() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Doi() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInbookType_Url() {
        return (EAttribute)inbookTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIncollectionType() {
        return incollectionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Author() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Title() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Booktitle() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Publisher() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Year() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Editor() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Volume() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Number() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Series() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Type() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Chapter() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Pages() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Address() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Edition() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Month() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Note() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Key() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Crossref() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Doi() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncollectionType_Url() {
        return (EAttribute)incollectionTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInproceedingsType() {
        return inproceedingsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Author() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Title() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Booktitle() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Year() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Editor() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Volume() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Number() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Series() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Pages() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Address() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Month() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Organization() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Publisher() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Note() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Key() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Crossref() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Doi() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInproceedingsType_Url() {
        return (EAttribute)inproceedingsTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getManualType() {
        return manualTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Author() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Title() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Organization() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Address() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Edition() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Month() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Year() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Note() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Key() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Crossref() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Doi() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManualType_Url() {
        return (EAttribute)manualTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMastersthesisType() {
        return mastersthesisTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Author() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Title() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_School() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Year() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Type() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Address() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Month() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Note() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Key() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Crossref() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Doi() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMastersthesisType_Url() {
        return (EAttribute)mastersthesisTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMiscType() {
        return miscTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Author() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Title() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Howpublished() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Month() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Year() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Note() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Key() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Crossref() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Doi() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMiscType_Url() {
        return (EAttribute)miscTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhdthesisType() {
        return phdthesisTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Author() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Title() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_School() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Year() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Type() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Address() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Month() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Note() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Key() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Crossref() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Doi() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhdthesisType_Url() {
        return (EAttribute)phdthesisTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProceedingsType() {
        return proceedingsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Editor() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Title() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Year() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Volume() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Number() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Series() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Address() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Month() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Organization() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Publisher() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Note() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Key() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Crossref() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Doi() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProceedingsType_Url() {
        return (EAttribute)proceedingsTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTechreportType() {
        return techreportTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Author() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Title() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Institution() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Year() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Type() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Number() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Address() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Month() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Note() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Key() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Crossref() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Doi() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTechreportType_Url() {
        return (EAttribute)techreportTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUnpublishedType() {
        return unpublishedTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Author() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Title() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Note() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Month() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Year() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Key() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Crossref() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Doi() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnpublishedType_Url() {
        return (EAttribute)unpublishedTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMonthStringType() {
        return monthStringTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEditionType() {
        return editionTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMonthStringTypeObject() {
        return monthStringTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMonthType() {
        return monthTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPagesType() {
        return pagesTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibtexmlFactory getBibtexmlFactory() {
        return (BibtexmlFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        articleTypeEClass = createEClass(ARTICLE_TYPE);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__AUTHOR);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__TITLE);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__JOURNAL);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__YEAR);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__VOLUME);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__NUMBER);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__PAGES);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__MONTH);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__NOTE);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__KEY);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__CROSSREF);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__DOI);
        createEAttribute(articleTypeEClass, ARTICLE_TYPE__URL);

        bibTeXMLEntriesClassEClass = createEClass(BIB_TE_XML_ENTRIES_CLASS);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__ARTICLE);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__BOOK);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__BOOKLET);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__MANUAL);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__TECHREPORT);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__MASTERSTHESIS);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__PHDTHESIS);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__INBOOK);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__INCOLLECTION);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__PROCEEDINGS);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__INPROCEEDINGS);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__CONFERENCE);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__UNPUBLISHED);
        createEReference(bibTeXMLEntriesClassEClass, BIB_TE_XML_ENTRIES_CLASS__MISC);

        bookletTypeEClass = createEClass(BOOKLET_TYPE);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__AUTHOR);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__TITLE);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__HOWPUBLISHED);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__ADDRESS);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__MONTH);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__YEAR);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__NOTE);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__KEY);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__CROSSREF);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__DOI);
        createEAttribute(bookletTypeEClass, BOOKLET_TYPE__URL);

        bookTypeEClass = createEClass(BOOK_TYPE);
        createEAttribute(bookTypeEClass, BOOK_TYPE__AUTHOR);
        createEAttribute(bookTypeEClass, BOOK_TYPE__EDITOR);
        createEAttribute(bookTypeEClass, BOOK_TYPE__TITLE);
        createEAttribute(bookTypeEClass, BOOK_TYPE__PUBLISHER);
        createEAttribute(bookTypeEClass, BOOK_TYPE__YEAR);
        createEAttribute(bookTypeEClass, BOOK_TYPE__VOLUME);
        createEAttribute(bookTypeEClass, BOOK_TYPE__NUMBER);
        createEAttribute(bookTypeEClass, BOOK_TYPE__SERIES);
        createEAttribute(bookTypeEClass, BOOK_TYPE__ADDRESS);
        createEAttribute(bookTypeEClass, BOOK_TYPE__EDITION);
        createEAttribute(bookTypeEClass, BOOK_TYPE__MONTH);
        createEAttribute(bookTypeEClass, BOOK_TYPE__NOTE);
        createEAttribute(bookTypeEClass, BOOK_TYPE__KEY);
        createEAttribute(bookTypeEClass, BOOK_TYPE__CROSSREF);
        createEAttribute(bookTypeEClass, BOOK_TYPE__DOI);
        createEAttribute(bookTypeEClass, BOOK_TYPE__URL);

        conferenceTypeEClass = createEClass(CONFERENCE_TYPE);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__AUTHOR);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__TITLE);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__BOOKTITLE);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__YEAR);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__EDITOR);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__VOLUME);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__NUMBER);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__SERIES);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__PAGES);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__ADDRESS);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__MONTH);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__ORGANIZATION);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__PUBLISHER);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__NOTE);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__KEY);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__CROSSREF);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__DOI);
        createEAttribute(conferenceTypeEClass, CONFERENCE_TYPE__URL);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__ANNOTE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ARTICLE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUTHOR);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BOOK);
        createEReference(documentRootEClass, DOCUMENT_ROOT__BOOKLET);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__BOOKTITLE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__CHAPTER);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CONFERENCE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__CROSSREF);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__DOI);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__EDITION);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__EDITOR);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ENTRY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FILE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__HOWPUBLISHED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INBOOK);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INCOLLECTION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INPROCEEDINGS);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__INSTITUTION);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__JOURNAL);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MANUAL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MASTERSTHESIS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MISC);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MONTH);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__NOTE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__NUMBER);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__PAGES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PHDTHESIS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PROCEEDINGS);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__PUBLISHER);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__SCHOOL);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERIES);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TECHREPORT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__TYPE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__UNPUBLISHED);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__URL);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__VOLUME);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__YEAR);

        entryTypeEClass = createEClass(ENTRY_TYPE);
        createEAttribute(entryTypeEClass, ENTRY_TYPE__ID);

        fileTypeEClass = createEClass(FILE_TYPE);
        createEReference(fileTypeEClass, FILE_TYPE__ENTRY);

        inbookTypeEClass = createEClass(INBOOK_TYPE);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__AUTHOR);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__EDITOR);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__TITLE);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__CHAPTER);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__PAGES);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__PAGES1);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__PUBLISHER);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__YEAR);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__VOLUME);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__NUMBER);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__SERIES);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__TYPE);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__ADDRESS);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__EDITION);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__MONTH);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__NOTE);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__KEY);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__CROSSREF);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__DOI);
        createEAttribute(inbookTypeEClass, INBOOK_TYPE__URL);

        incollectionTypeEClass = createEClass(INCOLLECTION_TYPE);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__AUTHOR);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__TITLE);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__BOOKTITLE);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__PUBLISHER);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__YEAR);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__EDITOR);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__VOLUME);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__NUMBER);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__SERIES);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__TYPE);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__CHAPTER);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__PAGES);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__ADDRESS);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__EDITION);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__MONTH);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__NOTE);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__KEY);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__CROSSREF);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__DOI);
        createEAttribute(incollectionTypeEClass, INCOLLECTION_TYPE__URL);

        inproceedingsTypeEClass = createEClass(INPROCEEDINGS_TYPE);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__AUTHOR);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__TITLE);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__BOOKTITLE);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__YEAR);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__EDITOR);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__VOLUME);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__NUMBER);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__SERIES);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__PAGES);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__ADDRESS);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__MONTH);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__ORGANIZATION);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__PUBLISHER);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__NOTE);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__KEY);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__CROSSREF);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__DOI);
        createEAttribute(inproceedingsTypeEClass, INPROCEEDINGS_TYPE__URL);

        manualTypeEClass = createEClass(MANUAL_TYPE);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__AUTHOR);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__TITLE);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__ORGANIZATION);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__ADDRESS);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__EDITION);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__MONTH);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__YEAR);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__NOTE);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__KEY);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__CROSSREF);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__DOI);
        createEAttribute(manualTypeEClass, MANUAL_TYPE__URL);

        mastersthesisTypeEClass = createEClass(MASTERSTHESIS_TYPE);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__AUTHOR);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__TITLE);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__SCHOOL);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__YEAR);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__TYPE);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__ADDRESS);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__MONTH);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__NOTE);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__KEY);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__CROSSREF);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__DOI);
        createEAttribute(mastersthesisTypeEClass, MASTERSTHESIS_TYPE__URL);

        miscTypeEClass = createEClass(MISC_TYPE);
        createEAttribute(miscTypeEClass, MISC_TYPE__AUTHOR);
        createEAttribute(miscTypeEClass, MISC_TYPE__TITLE);
        createEAttribute(miscTypeEClass, MISC_TYPE__HOWPUBLISHED);
        createEAttribute(miscTypeEClass, MISC_TYPE__MONTH);
        createEAttribute(miscTypeEClass, MISC_TYPE__YEAR);
        createEAttribute(miscTypeEClass, MISC_TYPE__NOTE);
        createEAttribute(miscTypeEClass, MISC_TYPE__KEY);
        createEAttribute(miscTypeEClass, MISC_TYPE__CROSSREF);
        createEAttribute(miscTypeEClass, MISC_TYPE__DOI);
        createEAttribute(miscTypeEClass, MISC_TYPE__URL);

        phdthesisTypeEClass = createEClass(PHDTHESIS_TYPE);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__AUTHOR);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__TITLE);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__SCHOOL);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__YEAR);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__TYPE);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__ADDRESS);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__MONTH);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__NOTE);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__KEY);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__CROSSREF);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__DOI);
        createEAttribute(phdthesisTypeEClass, PHDTHESIS_TYPE__URL);

        proceedingsTypeEClass = createEClass(PROCEEDINGS_TYPE);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__EDITOR);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__TITLE);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__YEAR);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__VOLUME);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__NUMBER);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__SERIES);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__ADDRESS);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__MONTH);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__ORGANIZATION);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__PUBLISHER);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__NOTE);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__KEY);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__CROSSREF);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__DOI);
        createEAttribute(proceedingsTypeEClass, PROCEEDINGS_TYPE__URL);

        techreportTypeEClass = createEClass(TECHREPORT_TYPE);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__AUTHOR);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__TITLE);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__INSTITUTION);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__YEAR);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__TYPE);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__NUMBER);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__ADDRESS);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__MONTH);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__NOTE);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__KEY);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__CROSSREF);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__DOI);
        createEAttribute(techreportTypeEClass, TECHREPORT_TYPE__URL);

        unpublishedTypeEClass = createEClass(UNPUBLISHED_TYPE);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__AUTHOR);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__TITLE);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__NOTE);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__MONTH);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__YEAR);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__KEY);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__CROSSREF);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__DOI);
        createEAttribute(unpublishedTypeEClass, UNPUBLISHED_TYPE__URL);

        // Create enums
        monthStringTypeEEnum = createEEnum(MONTH_STRING_TYPE);

        // Create data types
        editionTypeEDataType = createEDataType(EDITION_TYPE);
        monthStringTypeObjectEDataType = createEDataType(MONTH_STRING_TYPE_OBJECT);
        monthTypeEDataType = createEDataType(MONTH_TYPE);
        pagesTypeEDataType = createEDataType(PAGES_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        entryTypeEClass.getESuperTypes().add(this.getBibTeXMLEntriesClass());

        // Initialize classes and features; add operations and parameters
        initEClass(articleTypeEClass, ArticleType.class, "ArticleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getArticleType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Journal(), theXMLTypePackage.getString(), "journal", null, 1, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Volume(), theXMLTypePackage.getString(), "volume", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Pages(), this.getPagesType(), "pages", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Month(), this.getMonthType(), "month", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArticleType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, ArticleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bibTeXMLEntriesClassEClass, BibTeXMLEntriesClass.class, "BibTeXMLEntriesClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBibTeXMLEntriesClass_Article(), this.getArticleType(), null, "article", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Book(), this.getBookType(), null, "book", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Booklet(), this.getBookletType(), null, "booklet", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Manual(), this.getManualType(), null, "manual", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Techreport(), this.getTechreportType(), null, "techreport", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Mastersthesis(), this.getMastersthesisType(), null, "mastersthesis", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Phdthesis(), this.getPhdthesisType(), null, "phdthesis", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Inbook(), this.getInbookType(), null, "inbook", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Incollection(), this.getIncollectionType(), null, "incollection", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Proceedings(), this.getProceedingsType(), null, "proceedings", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Inproceedings(), this.getInproceedingsType(), null, "inproceedings", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Conference(), this.getConferenceType(), null, "conference", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Unpublished(), this.getUnpublishedType(), null, "unpublished", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBibTeXMLEntriesClass_Misc(), this.getMiscType(), null, "misc", null, 0, 1, BibTeXMLEntriesClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bookletTypeEClass, BookletType.class, "BookletType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBookletType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Howpublished(), theXMLTypePackage.getString(), "howpublished", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Month(), this.getMonthType(), "month", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Year(), theXMLTypePackage.getGYear(), "year", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookletType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, BookletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bookTypeEClass, BookType.class, "BookType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBookType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Editor(), theXMLTypePackage.getString(), "editor", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Publisher(), theXMLTypePackage.getString(), "publisher", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Volume(), theXMLTypePackage.getString(), "volume", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Series(), theXMLTypePackage.getString(), "series", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Edition(), this.getEditionType(), "edition", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Month(), this.getMonthType(), "month", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBookType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conferenceTypeEClass, ConferenceType.class, "ConferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConferenceType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Booktitle(), theXMLTypePackage.getString(), "booktitle", null, 1, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Editor(), theXMLTypePackage.getString(), "editor", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Volume(), theXMLTypePackage.getString(), "volume", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Series(), theXMLTypePackage.getString(), "series", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Pages(), this.getPagesType(), "pages", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Month(), this.getMonthType(), "month", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Organization(), theXMLTypePackage.getString(), "organization", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Publisher(), theXMLTypePackage.getString(), "publisher", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConferenceType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, ConferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Address(), theXMLTypePackage.getString(), "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Annote(), theXMLTypePackage.getString(), "annote", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Article(), this.getArticleType(), null, "article", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Author(), theXMLTypePackage.getString(), "author", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Book(), this.getBookType(), null, "book", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Booklet(), this.getBookletType(), null, "booklet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Booktitle(), theXMLTypePackage.getString(), "booktitle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Chapter(), theXMLTypePackage.getPositiveInteger(), "chapter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Conference(), this.getConferenceType(), null, "conference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Doi(), theXMLTypePackage.getString(), "doi", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Edition(), this.getEditionType(), "edition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Editor(), theXMLTypePackage.getString(), "editor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Entry(), this.getEntryType(), null, "entry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_File(), this.getFileType(), null, "file", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Howpublished(), theXMLTypePackage.getString(), "howpublished", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Inbook(), this.getInbookType(), null, "inbook", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Incollection(), this.getIncollectionType(), null, "incollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Inproceedings(), this.getInproceedingsType(), null, "inproceedings", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Institution(), theXMLTypePackage.getString(), "institution", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Journal(), theXMLTypePackage.getString(), "journal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Key(), theXMLTypePackage.getString(), "key", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Manual(), this.getManualType(), null, "manual", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Mastersthesis(), this.getMastersthesisType(), null, "mastersthesis", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Misc(), this.getMiscType(), null, "misc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Month(), this.getMonthType(), "month", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Note(), theXMLTypePackage.getString(), "note", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Number(), theXMLTypePackage.getString(), "number", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Organization(), theXMLTypePackage.getString(), "organization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Pages(), this.getPagesType(), "pages", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Phdthesis(), this.getPhdthesisType(), null, "phdthesis", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Proceedings(), this.getProceedingsType(), null, "proceedings", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Publisher(), theXMLTypePackage.getString(), "publisher", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_School(), theXMLTypePackage.getString(), "school", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Series(), theXMLTypePackage.getString(), "series", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Techreport(), this.getTechreportType(), null, "techreport", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Title(), theXMLTypePackage.getString(), "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Type(), theXMLTypePackage.getString(), "type", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Unpublished(), this.getUnpublishedType(), null, "unpublished", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Url(), theXMLTypePackage.getString(), "url", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Volume(), theXMLTypePackage.getString(), "volume", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Year(), theXMLTypePackage.getGYear(), "year", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEntryType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fileTypeEClass, FileType.class, "FileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFileType_Entry(), this.getEntryType(), null, "entry", null, 0, -1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inbookTypeEClass, InbookType.class, "InbookType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInbookType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Editor(), theXMLTypePackage.getString(), "editor", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Chapter(), theXMLTypePackage.getPositiveInteger(), "chapter", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Pages(), this.getPagesType(), "pages", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Pages1(), this.getPagesType(), "pages1", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Publisher(), theXMLTypePackage.getString(), "publisher", null, 1, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Volume(), theXMLTypePackage.getString(), "volume", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Series(), theXMLTypePackage.getString(), "series", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Edition(), this.getEditionType(), "edition", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Month(), this.getMonthType(), "month", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInbookType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, InbookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(incollectionTypeEClass, IncollectionType.class, "IncollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIncollectionType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Booktitle(), theXMLTypePackage.getString(), "booktitle", null, 1, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Publisher(), theXMLTypePackage.getString(), "publisher", null, 1, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Editor(), theXMLTypePackage.getString(), "editor", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Volume(), theXMLTypePackage.getString(), "volume", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Series(), theXMLTypePackage.getString(), "series", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Chapter(), theXMLTypePackage.getPositiveInteger(), "chapter", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Pages(), this.getPagesType(), "pages", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Edition(), this.getEditionType(), "edition", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Month(), this.getMonthType(), "month", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIncollectionType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, IncollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(inproceedingsTypeEClass, InproceedingsType.class, "InproceedingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInproceedingsType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Booktitle(), theXMLTypePackage.getString(), "booktitle", null, 1, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Editor(), theXMLTypePackage.getString(), "editor", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Volume(), theXMLTypePackage.getString(), "volume", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Series(), theXMLTypePackage.getString(), "series", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Pages(), this.getPagesType(), "pages", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Month(), this.getMonthType(), "month", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Organization(), theXMLTypePackage.getString(), "organization", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Publisher(), theXMLTypePackage.getString(), "publisher", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInproceedingsType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, InproceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(manualTypeEClass, ManualType.class, "ManualType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getManualType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Organization(), theXMLTypePackage.getString(), "organization", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Edition(), this.getEditionType(), "edition", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Month(), this.getMonthType(), "month", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Year(), theXMLTypePackage.getGYear(), "year", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManualType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, ManualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mastersthesisTypeEClass, MastersthesisType.class, "MastersthesisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMastersthesisType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_School(), theXMLTypePackage.getString(), "school", null, 1, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Month(), this.getMonthType(), "month", null, 0, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMastersthesisType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, MastersthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(miscTypeEClass, MiscType.class, "MiscType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMiscType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Howpublished(), theXMLTypePackage.getString(), "howpublished", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Month(), this.getMonthType(), "month", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Year(), theXMLTypePackage.getGYear(), "year", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMiscType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, MiscType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(phdthesisTypeEClass, PhdthesisType.class, "PhdthesisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPhdthesisType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_School(), theXMLTypePackage.getString(), "school", null, 1, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Month(), this.getMonthType(), "month", null, 0, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhdthesisType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, PhdthesisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(proceedingsTypeEClass, ProceedingsType.class, "ProceedingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProceedingsType_Editor(), theXMLTypePackage.getString(), "editor", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Volume(), theXMLTypePackage.getString(), "volume", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Series(), theXMLTypePackage.getString(), "series", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Month(), this.getMonthType(), "month", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Organization(), theXMLTypePackage.getString(), "organization", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Publisher(), theXMLTypePackage.getString(), "publisher", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProceedingsType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, ProceedingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(techreportTypeEClass, TechreportType.class, "TechreportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTechreportType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Institution(), theXMLTypePackage.getString(), "institution", null, 1, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Year(), theXMLTypePackage.getGYear(), "year", null, 1, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Month(), this.getMonthType(), "month", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Note(), theXMLTypePackage.getString(), "note", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechreportType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, TechreportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(unpublishedTypeEClass, UnpublishedType.class, "UnpublishedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUnpublishedType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnpublishedType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnpublishedType_Note(), theXMLTypePackage.getString(), "note", null, 1, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnpublishedType_Month(), this.getMonthType(), "month", null, 0, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnpublishedType_Year(), theXMLTypePackage.getGYear(), "year", null, 0, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnpublishedType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnpublishedType_Crossref(), theXMLTypePackage.getString(), "crossref", null, 0, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnpublishedType_Doi(), theXMLTypePackage.getString(), "doi", null, 0, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnpublishedType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, UnpublishedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(monthStringTypeEEnum, MonthStringType.class, "MonthStringType");
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.JAN);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.FEB);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.MAR);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.APR);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.MAY);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.JUN);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.JUL);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.AUG);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.SEP);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.OCT);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.NOV);
        addEEnumLiteral(monthStringTypeEEnum, MonthStringType.DEC);

        // Initialize data types
        initEDataType(editionTypeEDataType, String.class, "EditionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(monthStringTypeObjectEDataType, MonthStringType.class, "MonthStringTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(monthTypeEDataType, Object.class, "MonthType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(pagesTypeEDataType, String.class, "PagesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
        addAnnotation
          (articleTypeEClass, 
           source, 
           new String[] {
             "name", "article_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getArticleType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Journal(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "journal",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Volume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "volume",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Pages(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pages",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getArticleType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (bibTeXMLEntriesClassEClass, 
           source, 
           new String[] {
             "name", "BibTeXML.entries.class",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Article(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "article",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Book(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "book",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Booklet(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "booklet",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Manual(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "manual",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Techreport(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "techreport",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Mastersthesis(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "mastersthesis",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Phdthesis(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "phdthesis",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Inbook(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inbook",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Incollection(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "incollection",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Proceedings(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "proceedings",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Inproceedings(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inproceedings",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Conference(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "conference",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Unpublished(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "unpublished",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getBibTeXMLEntriesClass_Misc(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "misc",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (bookletTypeEClass, 
           source, 
           new String[] {
             "name", "booklet_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getBookletType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Howpublished(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "howpublished",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookletType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (bookTypeEClass, 
           source, 
           new String[] {
             "name", "book_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getBookType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Editor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "editor",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Publisher(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "publisher",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Volume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "volume",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Series(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "series",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Edition(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "edition",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getBookType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (conferenceTypeEClass, 
           source, 
           new String[] {
             "name", "conference_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getConferenceType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Booktitle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "booktitle",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Editor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "editor",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Volume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "volume",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Series(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "series",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Pages(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pages",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Organization(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "organization",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Publisher(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "publisher",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getConferenceType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (documentRootEClass, 
           source, 
           new String[] {
             "name", "",
             "kind", "mixed"
           });		
        addAnnotation
          (getDocumentRoot_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });		
        addAnnotation
          (getDocumentRoot_XMLNSPrefixMap(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xmlns:prefix"
           });		
        addAnnotation
          (getDocumentRoot_XSISchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xsi:schemaLocation"
           });			
        addAnnotation
          (getDocumentRoot_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Annote(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "annote",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Article(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "article",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Book(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "book",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Booklet(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "booklet",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Booktitle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "booktitle",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Chapter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "chapter",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Conference(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "conference",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Edition(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "edition",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Editor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "editor",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Entry(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "entry",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_File(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "file",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Howpublished(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "howpublished",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Inbook(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inbook",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Incollection(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "incollection",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Inproceedings(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "inproceedings",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Institution(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "institution",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Journal(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "journal",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Manual(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "manual",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Mastersthesis(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "mastersthesis",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Misc(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "misc",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Organization(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "organization",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Pages(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pages",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Phdthesis(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "phdthesis",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Proceedings(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "proceedings",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Publisher(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "publisher",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_School(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "school",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Series(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "series",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Techreport(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "techreport",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Type(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "type",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Unpublished(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "unpublished",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Volume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "volume",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getDocumentRoot_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (editionTypeEDataType, 
           source, 
           new String[] {
             "name", "edition_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "pattern", "[A-Z].*"
           });		
        addAnnotation
          (entryTypeEClass, 
           source, 
           new String[] {
             "name", "entry_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getEntryType_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });		
        addAnnotation
          (fileTypeEClass, 
           source, 
           new String[] {
             "name", "file_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getFileType_Entry(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "entry",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (inbookTypeEClass, 
           source, 
           new String[] {
             "name", "inbook_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getInbookType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Editor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "editor",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Chapter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "chapter",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Pages(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pages",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Pages1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pages",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Publisher(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "publisher",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Volume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "volume",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Series(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "series",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Type(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "type",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Edition(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "edition",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInbookType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (incollectionTypeEClass, 
           source, 
           new String[] {
             "name", "incollection_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getIncollectionType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Booktitle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "booktitle",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Publisher(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "publisher",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Editor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "editor",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Volume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "volume",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Series(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "series",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Type(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "type",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Chapter(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "chapter",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Pages(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pages",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Edition(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "edition",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getIncollectionType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (inproceedingsTypeEClass, 
           source, 
           new String[] {
             "name", "inproceedings_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getInproceedingsType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Booktitle(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "booktitle",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Editor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "editor",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Volume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "volume",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Series(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "series",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Pages(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pages",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Organization(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "organization",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Publisher(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "publisher",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getInproceedingsType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (manualTypeEClass, 
           source, 
           new String[] {
             "name", "manual_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getManualType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Organization(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "organization",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Edition(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "edition",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getManualType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (mastersthesisTypeEClass, 
           source, 
           new String[] {
             "name", "mastersthesis_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getMastersthesisType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_School(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "school",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Type(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "type",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMastersthesisType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (miscTypeEClass, 
           source, 
           new String[] {
             "name", "misc_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getMiscType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Howpublished(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "howpublished",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getMiscType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (monthStringTypeEEnum, 
           source, 
           new String[] {
             "name", "monthStringType"
           });		
        addAnnotation
          (monthStringTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "monthStringType:Object",
             "baseType", "monthStringType"
           });		
        addAnnotation
          (monthTypeEDataType, 
           source, 
           new String[] {
             "name", "month_._type",
             "memberTypes", "monthStringType http://www.eclipse.org/emf/2003/XMLType#gMonth"
           });		
        addAnnotation
          (pagesTypeEDataType, 
           source, 
           new String[] {
             "name", "pages_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
             "pattern", "[0-9]+((-{0,2}|\u2013|,)[0-9]+)*\\+?"
           });		
        addAnnotation
          (phdthesisTypeEClass, 
           source, 
           new String[] {
             "name", "phdthesis_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getPhdthesisType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_School(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "school",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Type(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "type",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getPhdthesisType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (proceedingsTypeEClass, 
           source, 
           new String[] {
             "name", "proceedings_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getProceedingsType_Editor(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "editor",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Volume(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "volume",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Series(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "series",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Organization(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "organization",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Publisher(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "publisher",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getProceedingsType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (techreportTypeEClass, 
           source, 
           new String[] {
             "name", "techreport_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getTechreportType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Institution(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "institution",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Type(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "type",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Number(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "number",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Address(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "address",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getTechreportType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (unpublishedTypeEClass, 
           source, 
           new String[] {
             "name", "unpublished_._type",
             "kind", "elementOnly"
           });			
        addAnnotation
          (getUnpublishedType_Author(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "author",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getUnpublishedType_Title(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "title",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getUnpublishedType_Note(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "note",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getUnpublishedType_Month(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "month",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getUnpublishedType_Year(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "year",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getUnpublishedType_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getUnpublishedType_Crossref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "crossref",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getUnpublishedType_Doi(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "doi",
             "namespace", "##targetNamespace"
           });			
        addAnnotation
          (getUnpublishedType_Url(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "url",
             "namespace", "##targetNamespace"
           });
    }

} //BibtexmlPackageImpl
