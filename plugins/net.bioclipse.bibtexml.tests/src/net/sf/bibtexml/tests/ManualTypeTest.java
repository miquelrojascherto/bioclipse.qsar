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
import net.sf.bibtexml.ManualType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manual Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManualTypeTest extends TestCase {

    /**
     * The fixture for this Manual Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ManualType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ManualTypeTest.class);
    }

    /**
     * Constructs a new Manual Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManualTypeTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Manual Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ManualType fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Manual Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ManualType getFixture() {
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
        setFixture(BibtexmlFactory.eINSTANCE.createManualType());
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

} //ManualTypeTest
