/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.sf.bibtexml.BibtexmlFactory;
import net.sf.bibtexml.InbookType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inbook Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InbookTypeTest extends TestCase {

    /**
     * The fixture for this Inbook Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InbookType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(InbookTypeTest.class);
    }

    /**
     * Constructs a new Inbook Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InbookTypeTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Inbook Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(InbookType fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Inbook Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InbookType getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(BibtexmlFactory.eINSTANCE.createInbookType());
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

} //InbookTypeTest
