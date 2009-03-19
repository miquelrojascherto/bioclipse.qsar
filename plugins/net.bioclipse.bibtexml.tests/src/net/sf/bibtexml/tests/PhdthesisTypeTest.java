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
import net.sf.bibtexml.PhdthesisType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Phdthesis Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhdthesisTypeTest extends TestCase {

    /**
     * The fixture for this Phdthesis Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhdthesisType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PhdthesisTypeTest.class);
    }

    /**
     * Constructs a new Phdthesis Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhdthesisTypeTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Phdthesis Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(PhdthesisType fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Phdthesis Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhdthesisType getFixture() {
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
        setFixture(BibtexmlFactory.eINSTANCE.createPhdthesisType());
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

} //PhdthesisTypeTest
