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
import net.sf.bibtexml.ProceedingsType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Proceedings Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProceedingsTypeTest extends TestCase {

    /**
     * The fixture for this Proceedings Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProceedingsType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ProceedingsTypeTest.class);
    }

    /**
     * Constructs a new Proceedings Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProceedingsTypeTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Proceedings Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ProceedingsType fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Proceedings Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProceedingsType getFixture() {
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
        setFixture(BibtexmlFactory.eINSTANCE.createProceedingsType());
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

} //ProceedingsTypeTest
