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
package net.sf.bibtexml.util;

import net.sf.bibtexml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.bibtexml.BibtexmlPackage
 * @generated
 */
public class BibtexmlAdapterFactory extends AdapterFactoryImpl {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static BibtexmlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibtexmlAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BibtexmlPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BibtexmlSwitch<Adapter> modelSwitch =
        new BibtexmlSwitch<Adapter>() {
            @Override
            public Adapter caseArticleType(ArticleType object) {
                return createArticleTypeAdapter();
            }
            @Override
            public Adapter caseBibTeXMLEntriesClass(BibTeXMLEntriesClass object) {
                return createBibTeXMLEntriesClassAdapter();
            }
            @Override
            public Adapter caseBookletType(BookletType object) {
                return createBookletTypeAdapter();
            }
            @Override
            public Adapter caseBookType(BookType object) {
                return createBookTypeAdapter();
            }
            @Override
            public Adapter caseConferenceType(ConferenceType object) {
                return createConferenceTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseEntryType(EntryType object) {
                return createEntryTypeAdapter();
            }
            @Override
            public Adapter caseFileType(FileType object) {
                return createFileTypeAdapter();
            }
            @Override
            public Adapter caseInbookType(InbookType object) {
                return createInbookTypeAdapter();
            }
            @Override
            public Adapter caseIncollectionType(IncollectionType object) {
                return createIncollectionTypeAdapter();
            }
            @Override
            public Adapter caseInproceedingsType(InproceedingsType object) {
                return createInproceedingsTypeAdapter();
            }
            @Override
            public Adapter caseManualType(ManualType object) {
                return createManualTypeAdapter();
            }
            @Override
            public Adapter caseMastersthesisType(MastersthesisType object) {
                return createMastersthesisTypeAdapter();
            }
            @Override
            public Adapter caseMiscType(MiscType object) {
                return createMiscTypeAdapter();
            }
            @Override
            public Adapter casePhdthesisType(PhdthesisType object) {
                return createPhdthesisTypeAdapter();
            }
            @Override
            public Adapter caseProceedingsType(ProceedingsType object) {
                return createProceedingsTypeAdapter();
            }
            @Override
            public Adapter caseTechreportType(TechreportType object) {
                return createTechreportTypeAdapter();
            }
            @Override
            public Adapter caseUnpublishedType(UnpublishedType object) {
                return createUnpublishedTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.ArticleType <em>Article Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.ArticleType
     * @generated
     */
    public Adapter createArticleTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.BibTeXMLEntriesClass <em>Bib Te XML Entries Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.BibTeXMLEntriesClass
     * @generated
     */
    public Adapter createBibTeXMLEntriesClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.BookletType <em>Booklet Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.BookletType
     * @generated
     */
    public Adapter createBookletTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.BookType <em>Book Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.BookType
     * @generated
     */
    public Adapter createBookTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.ConferenceType <em>Conference Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.ConferenceType
     * @generated
     */
    public Adapter createConferenceTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.EntryType <em>Entry Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.EntryType
     * @generated
     */
    public Adapter createEntryTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.FileType <em>File Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.FileType
     * @generated
     */
    public Adapter createFileTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.InbookType <em>Inbook Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.InbookType
     * @generated
     */
    public Adapter createInbookTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.IncollectionType <em>Incollection Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.IncollectionType
     * @generated
     */
    public Adapter createIncollectionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.InproceedingsType <em>Inproceedings Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.InproceedingsType
     * @generated
     */
    public Adapter createInproceedingsTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.ManualType <em>Manual Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.ManualType
     * @generated
     */
    public Adapter createManualTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.MastersthesisType <em>Mastersthesis Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.MastersthesisType
     * @generated
     */
    public Adapter createMastersthesisTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.MiscType <em>Misc Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.MiscType
     * @generated
     */
    public Adapter createMiscTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.PhdthesisType <em>Phdthesis Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.PhdthesisType
     * @generated
     */
    public Adapter createPhdthesisTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.ProceedingsType <em>Proceedings Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.ProceedingsType
     * @generated
     */
    public Adapter createProceedingsTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.TechreportType <em>Techreport Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.TechreportType
     * @generated
     */
    public Adapter createTechreportTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link net.sf.bibtexml.UnpublishedType <em>Unpublished Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see net.sf.bibtexml.UnpublishedType
     * @generated
     */
    public Adapter createUnpublishedTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //BibtexmlAdapterFactory
