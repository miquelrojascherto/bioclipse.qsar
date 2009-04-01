/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.tests;

import junit.textui.TestRunner;

import net.sf.bibtexml.BibTeXMLEntryType;
import net.sf.bibtexml.BibtexmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bib Te XML Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibTeXMLEntryTypeTest extends BibTeXMLEntriesClassTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(BibTeXMLEntryTypeTest.class);
    }

    /**
     * Constructs a new Bib Te XML Entry Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibTeXMLEntryTypeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Bib Te XML Entry Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected BibTeXMLEntryType getFixture() {
        return (BibTeXMLEntryType)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(BibtexmlFactory.eINSTANCE.createBibTeXMLEntryType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //BibTeXMLEntryTypeTest
