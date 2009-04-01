/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.impl;

import net.sf.bibtexml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibtexmlFactoryImpl extends EFactoryImpl implements BibtexmlFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BibtexmlFactory init() {
        try {
            BibtexmlFactory theBibtexmlFactory = (BibtexmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://bibtexml.sf.net/"); 
            if (theBibtexmlFactory != null) {
                return theBibtexmlFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BibtexmlFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibtexmlFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case BibtexmlPackage.ARTICLE_TYPE: return createArticleType();
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS: return createBibTeXMLEntriesClass();
            case BibtexmlPackage.BIB_TE_XML_ENTRY_TYPE: return createBibTeXMLEntryType();
            case BibtexmlPackage.BOOKLET_TYPE: return createBookletType();
            case BibtexmlPackage.BOOK_TYPE: return createBookType();
            case BibtexmlPackage.CONFERENCE_TYPE: return createConferenceType();
            case BibtexmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case BibtexmlPackage.FILE_TYPE: return createFileType();
            case BibtexmlPackage.INBOOK_TYPE: return createInbookType();
            case BibtexmlPackage.INCOLLECTION_TYPE: return createIncollectionType();
            case BibtexmlPackage.INPROCEEDINGS_TYPE: return createInproceedingsType();
            case BibtexmlPackage.MANUAL_TYPE: return createManualType();
            case BibtexmlPackage.MASTERSTHESIS_TYPE: return createMastersthesisType();
            case BibtexmlPackage.MISC_TYPE: return createMiscType();
            case BibtexmlPackage.PHDTHESIS_TYPE: return createPhdthesisType();
            case BibtexmlPackage.PROCEEDINGS_TYPE: return createProceedingsType();
            case BibtexmlPackage.TECHREPORT_TYPE: return createTechreportType();
            case BibtexmlPackage.UNPUBLISHED_TYPE: return createUnpublishedType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case BibtexmlPackage.MONTH_STRING_TYPE:
                return createMonthStringTypeFromString(eDataType, initialValue);
            case BibtexmlPackage.EDITION_TYPE:
                return createEditionTypeFromString(eDataType, initialValue);
            case BibtexmlPackage.MONTH_STRING_TYPE_OBJECT:
                return createMonthStringTypeObjectFromString(eDataType, initialValue);
            case BibtexmlPackage.MONTH_TYPE:
                return createMonthTypeFromString(eDataType, initialValue);
            case BibtexmlPackage.PAGES_TYPE:
                return createPagesTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case BibtexmlPackage.MONTH_STRING_TYPE:
                return convertMonthStringTypeToString(eDataType, instanceValue);
            case BibtexmlPackage.EDITION_TYPE:
                return convertEditionTypeToString(eDataType, instanceValue);
            case BibtexmlPackage.MONTH_STRING_TYPE_OBJECT:
                return convertMonthStringTypeObjectToString(eDataType, instanceValue);
            case BibtexmlPackage.MONTH_TYPE:
                return convertMonthTypeToString(eDataType, instanceValue);
            case BibtexmlPackage.PAGES_TYPE:
                return convertPagesTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArticleType createArticleType() {
        ArticleTypeImpl articleType = new ArticleTypeImpl();
        return articleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibTeXMLEntriesClass createBibTeXMLEntriesClass() {
        BibTeXMLEntriesClassImpl bibTeXMLEntriesClass = new BibTeXMLEntriesClassImpl();
        return bibTeXMLEntriesClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibTeXMLEntryType createBibTeXMLEntryType() {
        BibTeXMLEntryTypeImpl bibTeXMLEntryType = new BibTeXMLEntryTypeImpl();
        return bibTeXMLEntryType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BookletType createBookletType() {
        BookletTypeImpl bookletType = new BookletTypeImpl();
        return bookletType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BookType createBookType() {
        BookTypeImpl bookType = new BookTypeImpl();
        return bookType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConferenceType createConferenceType() {
        ConferenceTypeImpl conferenceType = new ConferenceTypeImpl();
        return conferenceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileType createFileType() {
        FileTypeImpl fileType = new FileTypeImpl();
        return fileType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InbookType createInbookType() {
        InbookTypeImpl inbookType = new InbookTypeImpl();
        return inbookType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncollectionType createIncollectionType() {
        IncollectionTypeImpl incollectionType = new IncollectionTypeImpl();
        return incollectionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InproceedingsType createInproceedingsType() {
        InproceedingsTypeImpl inproceedingsType = new InproceedingsTypeImpl();
        return inproceedingsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManualType createManualType() {
        ManualTypeImpl manualType = new ManualTypeImpl();
        return manualType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MastersthesisType createMastersthesisType() {
        MastersthesisTypeImpl mastersthesisType = new MastersthesisTypeImpl();
        return mastersthesisType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MiscType createMiscType() {
        MiscTypeImpl miscType = new MiscTypeImpl();
        return miscType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhdthesisType createPhdthesisType() {
        PhdthesisTypeImpl phdthesisType = new PhdthesisTypeImpl();
        return phdthesisType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProceedingsType createProceedingsType() {
        ProceedingsTypeImpl proceedingsType = new ProceedingsTypeImpl();
        return proceedingsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TechreportType createTechreportType() {
        TechreportTypeImpl techreportType = new TechreportTypeImpl();
        return techreportType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnpublishedType createUnpublishedType() {
        UnpublishedTypeImpl unpublishedType = new UnpublishedTypeImpl();
        return unpublishedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonthStringType createMonthStringTypeFromString(EDataType eDataType, String initialValue) {
        MonthStringType result = MonthStringType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMonthStringTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createEditionTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEditionTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonthStringType createMonthStringTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createMonthStringTypeFromString(BibtexmlPackage.Literals.MONTH_STRING_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMonthStringTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMonthStringTypeToString(BibtexmlPackage.Literals.MONTH_STRING_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createMonthTypeFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createMonthStringTypeFromString(BibtexmlPackage.Literals.MONTH_STRING_TYPE, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GMONTH, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMonthTypeToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (BibtexmlPackage.Literals.MONTH_STRING_TYPE.isInstance(instanceValue)) {
            try {
                String value = convertMonthStringTypeToString(BibtexmlPackage.Literals.MONTH_STRING_TYPE, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (XMLTypePackage.Literals.GMONTH.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GMONTH, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createPagesTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPagesTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibtexmlPackage getBibtexmlPackage() {
        return (BibtexmlPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static BibtexmlPackage getPackage() {
        return BibtexmlPackage.eINSTANCE;
    }

} //BibtexmlFactoryImpl
