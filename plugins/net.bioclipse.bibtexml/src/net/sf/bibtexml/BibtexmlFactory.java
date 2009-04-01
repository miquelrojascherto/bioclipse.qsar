/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.bibtexml.BibtexmlPackage
 * @generated
 */
public interface BibtexmlFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    BibtexmlFactory eINSTANCE = net.sf.bibtexml.impl.BibtexmlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Article Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Article Type</em>'.
     * @generated
     */
    ArticleType createArticleType();

    /**
     * Returns a new object of class '<em>Bib Te XML Entries Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bib Te XML Entries Class</em>'.
     * @generated
     */
    BibTeXMLEntriesClass createBibTeXMLEntriesClass();

    /**
     * Returns a new object of class '<em>Bib Te XML Entry Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bib Te XML Entry Type</em>'.
     * @generated
     */
    BibTeXMLEntryType createBibTeXMLEntryType();

    /**
     * Returns a new object of class '<em>Booklet Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Booklet Type</em>'.
     * @generated
     */
    BookletType createBookletType();

    /**
     * Returns a new object of class '<em>Book Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Book Type</em>'.
     * @generated
     */
    BookType createBookType();

    /**
     * Returns a new object of class '<em>Conference Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conference Type</em>'.
     * @generated
     */
    ConferenceType createConferenceType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>File Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Type</em>'.
     * @generated
     */
    FileType createFileType();

    /**
     * Returns a new object of class '<em>Inbook Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inbook Type</em>'.
     * @generated
     */
    InbookType createInbookType();

    /**
     * Returns a new object of class '<em>Incollection Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Incollection Type</em>'.
     * @generated
     */
    IncollectionType createIncollectionType();

    /**
     * Returns a new object of class '<em>Inproceedings Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inproceedings Type</em>'.
     * @generated
     */
    InproceedingsType createInproceedingsType();

    /**
     * Returns a new object of class '<em>Manual Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Manual Type</em>'.
     * @generated
     */
    ManualType createManualType();

    /**
     * Returns a new object of class '<em>Mastersthesis Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mastersthesis Type</em>'.
     * @generated
     */
    MastersthesisType createMastersthesisType();

    /**
     * Returns a new object of class '<em>Misc Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Misc Type</em>'.
     * @generated
     */
    MiscType createMiscType();

    /**
     * Returns a new object of class '<em>Phdthesis Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phdthesis Type</em>'.
     * @generated
     */
    PhdthesisType createPhdthesisType();

    /**
     * Returns a new object of class '<em>Proceedings Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Proceedings Type</em>'.
     * @generated
     */
    ProceedingsType createProceedingsType();

    /**
     * Returns a new object of class '<em>Techreport Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Techreport Type</em>'.
     * @generated
     */
    TechreportType createTechreportType();

    /**
     * Returns a new object of class '<em>Unpublished Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unpublished Type</em>'.
     * @generated
     */
    UnpublishedType createUnpublishedType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    BibtexmlPackage getBibtexmlPackage();

} //BibtexmlFactory
