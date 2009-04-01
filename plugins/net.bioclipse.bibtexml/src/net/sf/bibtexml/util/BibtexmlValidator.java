/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.util;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.bibtexml.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.sf.bibtexml.BibtexmlPackage
 * @generated
 */
public class BibtexmlValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final BibtexmlValidator INSTANCE = new BibtexmlValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "net.sf.bibtexml";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * The cached base package validator.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMLTypeValidator xmlTypeValidator;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibtexmlValidator() {
        super();
        xmlTypeValidator = XMLTypeValidator.INSTANCE;
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
      return BibtexmlPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case BibtexmlPackage.ARTICLE_TYPE:
                return validateArticleType((ArticleType)value, diagnostics, context);
            case BibtexmlPackage.BIB_TE_XML_ENTRIES_CLASS:
                return validateBibTeXMLEntriesClass((BibTeXMLEntriesClass)value, diagnostics, context);
            case BibtexmlPackage.BIB_TE_XML_ENTRY_TYPE:
                return validateBibTeXMLEntryType((BibTeXMLEntryType)value, diagnostics, context);
            case BibtexmlPackage.BOOKLET_TYPE:
                return validateBookletType((BookletType)value, diagnostics, context);
            case BibtexmlPackage.BOOK_TYPE:
                return validateBookType((BookType)value, diagnostics, context);
            case BibtexmlPackage.CONFERENCE_TYPE:
                return validateConferenceType((ConferenceType)value, diagnostics, context);
            case BibtexmlPackage.DOCUMENT_ROOT:
                return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
            case BibtexmlPackage.FILE_TYPE:
                return validateFileType((FileType)value, diagnostics, context);
            case BibtexmlPackage.INBOOK_TYPE:
                return validateInbookType((InbookType)value, diagnostics, context);
            case BibtexmlPackage.INCOLLECTION_TYPE:
                return validateIncollectionType((IncollectionType)value, diagnostics, context);
            case BibtexmlPackage.INPROCEEDINGS_TYPE:
                return validateInproceedingsType((InproceedingsType)value, diagnostics, context);
            case BibtexmlPackage.MANUAL_TYPE:
                return validateManualType((ManualType)value, diagnostics, context);
            case BibtexmlPackage.MASTERSTHESIS_TYPE:
                return validateMastersthesisType((MastersthesisType)value, diagnostics, context);
            case BibtexmlPackage.MISC_TYPE:
                return validateMiscType((MiscType)value, diagnostics, context);
            case BibtexmlPackage.PHDTHESIS_TYPE:
                return validatePhdthesisType((PhdthesisType)value, diagnostics, context);
            case BibtexmlPackage.PROCEEDINGS_TYPE:
                return validateProceedingsType((ProceedingsType)value, diagnostics, context);
            case BibtexmlPackage.TECHREPORT_TYPE:
                return validateTechreportType((TechreportType)value, diagnostics, context);
            case BibtexmlPackage.UNPUBLISHED_TYPE:
                return validateUnpublishedType((UnpublishedType)value, diagnostics, context);
            case BibtexmlPackage.MONTH_STRING_TYPE:
                return validateMonthStringType((MonthStringType)value, diagnostics, context);
            case BibtexmlPackage.EDITION_TYPE:
                return validateEditionType((String)value, diagnostics, context);
            case BibtexmlPackage.MONTH_STRING_TYPE_OBJECT:
                return validateMonthStringTypeObject((MonthStringType)value, diagnostics, context);
            case BibtexmlPackage.MONTH_TYPE:
                return validateMonthType(value, diagnostics, context);
            case BibtexmlPackage.PAGES_TYPE:
                return validatePagesType((String)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateArticleType(ArticleType articleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(articleType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBibTeXMLEntriesClass(BibTeXMLEntriesClass bibTeXMLEntriesClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(bibTeXMLEntriesClass, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBibTeXMLEntryType(BibTeXMLEntryType bibTeXMLEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(bibTeXMLEntryType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBookletType(BookletType bookletType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(bookletType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBookType(BookType bookType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(bookType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConferenceType(ConferenceType conferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(conferenceType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(fileType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateInbookType(InbookType inbookType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(inbookType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateIncollectionType(IncollectionType incollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(incollectionType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateInproceedingsType(InproceedingsType inproceedingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(inproceedingsType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateManualType(ManualType manualType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(manualType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMastersthesisType(MastersthesisType mastersthesisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(mastersthesisType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMiscType(MiscType miscType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(miscType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePhdthesisType(PhdthesisType phdthesisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(phdthesisType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateProceedingsType(ProceedingsType proceedingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(proceedingsType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTechreportType(TechreportType techreportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(techreportType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUnpublishedType(UnpublishedType unpublishedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(unpublishedType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMonthStringType(MonthStringType monthStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEditionType(String editionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateEditionType_Pattern(editionType, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validateEditionType_Pattern
     */
    public static final  PatternMatcher [][] EDITION_TYPE__PATTERN__VALUES =
        new PatternMatcher [][] {
            new PatternMatcher [] {
                XMLTypeUtil.createPatternMatcher("[A-Z].*")
            }
        };

    /**
     * Validates the Pattern constraint of '<em>Edition Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateEditionType_Pattern(String editionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validatePattern(BibtexmlPackage.Literals.EDITION_TYPE, editionType, EDITION_TYPE__PATTERN__VALUES, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMonthStringTypeObject(MonthStringType monthStringTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMonthType(Object monthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validateMonthType_MemberTypes(monthType, diagnostics, context);
        return result;
    }

    /**
     * Validates the MemberTypes constraint of '<em>Month Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMonthType_MemberTypes(Object monthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (diagnostics != null) {
            BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
            if (BibtexmlPackage.Literals.MONTH_STRING_TYPE.isInstance(monthType)) {
                if (validateMonthStringType((MonthStringType)monthType, tempDiagnostics, context)) return true;
            }
            if (XMLTypePackage.Literals.GMONTH.isInstance(monthType)) {
                if (xmlTypeValidator.validateGMonth((XMLGregorianCalendar)monthType, tempDiagnostics, context)) return true;
            }
            for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
                diagnostics.add(diagnostic);
            }
        }
        else {
            if (BibtexmlPackage.Literals.MONTH_STRING_TYPE.isInstance(monthType)) {
                if (validateMonthStringType((MonthStringType)monthType, null, context)) return true;
            }
            if (XMLTypePackage.Literals.GMONTH.isInstance(monthType)) {
                if (xmlTypeValidator.validateGMonth((XMLGregorianCalendar)monthType, null, context)) return true;
            }
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePagesType(String pagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        boolean result = validatePagesType_Pattern(pagesType, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @see #validatePagesType_Pattern
     */
    public static final  PatternMatcher [][] PAGES_TYPE__PATTERN__VALUES =
        new PatternMatcher [][] {
            new PatternMatcher [] {
                XMLTypeUtil.createPatternMatcher("[0-9]+((-{0,2}|\u2013|,)[0-9]+)*\\+?")
            }
        };

    /**
     * Validates the Pattern constraint of '<em>Pages Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePagesType_Pattern(String pagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validatePattern(BibtexmlPackage.Literals.PAGES_TYPE, pagesType, PAGES_TYPE__PATTERN__VALUES, diagnostics, context);
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //BibtexmlValidator
