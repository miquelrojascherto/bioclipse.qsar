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

import java.util.List;

import net.sf.bibtexml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.bibtexml.BibtexmlPackage
 * @generated
 */
public class BibtexmlSwitch<T> {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static BibtexmlPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibtexmlSwitch() {
        if (modelPackage == null) {
            modelPackage = BibtexmlPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case BibtexmlPackage.ARTICLE_TYPE: {
                ArticleType articleType = (ArticleType)theEObject;
                T result = caseArticleType(articleType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS: {
                BibTeXMLEntriesClass bibTeXMLEntriesClass = (BibTeXMLEntriesClass)theEObject;
                T result = caseBibTeXMLEntriesClass(bibTeXMLEntriesClass);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.BOOKLET_TYPE: {
                BookletType bookletType = (BookletType)theEObject;
                T result = caseBookletType(bookletType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.BOOK_TYPE: {
                BookType bookType = (BookType)theEObject;
                T result = caseBookType(bookType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.CONFERENCE_TYPE: {
                ConferenceType conferenceType = (ConferenceType)theEObject;
                T result = caseConferenceType(conferenceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.ENTRY_TYPE: {
                EntryType entryType = (EntryType)theEObject;
                T result = caseEntryType(entryType);
                if (result == null) result = caseBibTeXMLEntriesClass(entryType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.FILE_TYPE: {
                FileType fileType = (FileType)theEObject;
                T result = caseFileType(fileType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.INBOOK_TYPE: {
                InbookType inbookType = (InbookType)theEObject;
                T result = caseInbookType(inbookType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.INCOLLECTION_TYPE: {
                IncollectionType incollectionType = (IncollectionType)theEObject;
                T result = caseIncollectionType(incollectionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.INPROCEEDINGS_TYPE: {
                InproceedingsType inproceedingsType = (InproceedingsType)theEObject;
                T result = caseInproceedingsType(inproceedingsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.MANUAL_TYPE: {
                ManualType manualType = (ManualType)theEObject;
                T result = caseManualType(manualType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.MASTERSTHESIS_TYPE: {
                MastersthesisType mastersthesisType = (MastersthesisType)theEObject;
                T result = caseMastersthesisType(mastersthesisType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.MISC_TYPE: {
                MiscType miscType = (MiscType)theEObject;
                T result = caseMiscType(miscType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.PHDTHESIS_TYPE: {
                PhdthesisType phdthesisType = (PhdthesisType)theEObject;
                T result = casePhdthesisType(phdthesisType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.PROCEEDINGS_TYPE: {
                ProceedingsType proceedingsType = (ProceedingsType)theEObject;
                T result = caseProceedingsType(proceedingsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.TECHREPORT_TYPE: {
                TechreportType techreportType = (TechreportType)theEObject;
                T result = caseTechreportType(techreportType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BibtexmlPackage.UNPUBLISHED_TYPE: {
                UnpublishedType unpublishedType = (UnpublishedType)theEObject;
                T result = caseUnpublishedType(unpublishedType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Article Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Article Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArticleType(ArticleType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bib Te XML Entries Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bib Te XML Entries Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBibTeXMLEntriesClass(BibTeXMLEntriesClass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Booklet Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Booklet Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBookletType(BookletType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Book Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Book Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBookType(BookType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conference Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conference Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConferenceType(ConferenceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentRoot(DocumentRoot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entry Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entry Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntryType(EntryType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileType(FileType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inbook Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inbook Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInbookType(InbookType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Incollection Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Incollection Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIncollectionType(IncollectionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inproceedings Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inproceedings Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInproceedingsType(InproceedingsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Manual Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Manual Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseManualType(ManualType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mastersthesis Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mastersthesis Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMastersthesisType(MastersthesisType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Misc Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Misc Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMiscType(MiscType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phdthesis Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phdthesis Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhdthesisType(PhdthesisType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Proceedings Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Proceedings Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProceedingsType(ProceedingsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Techreport Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Techreport Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTechreportType(TechreportType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unpublished Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unpublished Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnpublishedType(UnpublishedType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //BibtexmlSwitch
