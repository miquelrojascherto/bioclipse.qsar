/**
 * Copyright (c) 2007-2008 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * www.eclipse.org•À½epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>
 * 
 * Contributors:
 *     Ola Spjuth - initial API and implementation
 * 
 *
 * $Id$
 */
package net.bioclipse.qsar.impl;

import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.DescriptorimplType;
import net.bioclipse.qsar.DescriptorlistType;
import net.bioclipse.qsar.DocumentRoot;
import net.bioclipse.qsar.MoleculeResourceType;
import net.bioclipse.qsar.MoleculelistType;
import net.bioclipse.qsar.ParameterType;
import net.bioclipse.qsar.QsarFactory;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QsarPackageImpl extends EPackageImpl implements QsarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorimplTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorlistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moleculelistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moleculeResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qsarTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.bioclipse.qsar.QsarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QsarPackageImpl() {
		super(eNS_URI, QsarFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QsarPackage init() {
		if (isInited) return (QsarPackage)EPackage.Registry.INSTANCE.getEPackage(QsarPackage.eNS_URI);

		// Obtain or create and register package
		QsarPackageImpl theQsarPackage = (QsarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof QsarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new QsarPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQsarPackage.createPackageContents();

		// Initialize created meta-data
		theQsarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQsarPackage.freeze();

		return theQsarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptorimplType() {
		return descriptorimplTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Id() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Jar() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Name() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Namespace() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Path() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Reference() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Type() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Url() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Vendor() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Version() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptorlistType() {
		return descriptorlistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptorlistType_Descriptor() {
		return (EReference)descriptorlistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptorType() {
		return descriptorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptorType_Parameter() {
		return (EReference)descriptorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptorType_Descriptorimpl() {
		return (EReference)descriptorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorType_Id() {
		return (EAttribute)descriptorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorType_Name() {
		return (EAttribute)descriptorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorType_Namespace() {
		return (EAttribute)descriptorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Qsar() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoleculelistType() {
		return moleculelistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoleculelistType_MoleculeResource() {
		return (EReference)moleculelistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoleculeResourceType() {
		return moleculeResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Url() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Path() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Smiles() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Id() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Name() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Namespace() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Key() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Value() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQsarType() {
		return qsarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQsarType_Moleculelist() {
		return (EReference)qsarTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQsarType_Descriptorlist() {
		return (EReference)qsarTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQsarType_Descriptorimpl() {
		return (EReference)qsarTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QsarFactory getQsarFactory() {
		return (QsarFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		descriptorimplTypeEClass = createEClass(DESCRIPTORIMPL_TYPE);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__ID);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__JAR);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__NAME);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__NAMESPACE);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__PATH);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__REFERENCE);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__TYPE);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__URL);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__VENDOR);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__VERSION);

		descriptorlistTypeEClass = createEClass(DESCRIPTORLIST_TYPE);
		createEReference(descriptorlistTypeEClass, DESCRIPTORLIST_TYPE__DESCRIPTOR);

		descriptorTypeEClass = createEClass(DESCRIPTOR_TYPE);
		createEReference(descriptorTypeEClass, DESCRIPTOR_TYPE__PARAMETER);
		createEReference(descriptorTypeEClass, DESCRIPTOR_TYPE__DESCRIPTORIMPL);
		createEAttribute(descriptorTypeEClass, DESCRIPTOR_TYPE__ID);
		createEAttribute(descriptorTypeEClass, DESCRIPTOR_TYPE__NAME);
		createEAttribute(descriptorTypeEClass, DESCRIPTOR_TYPE__NAMESPACE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__QSAR);

		moleculelistTypeEClass = createEClass(MOLECULELIST_TYPE);
		createEReference(moleculelistTypeEClass, MOLECULELIST_TYPE__MOLECULE_RESOURCE);

		moleculeResourceTypeEClass = createEClass(MOLECULE_RESOURCE_TYPE);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__URL);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__PATH);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__SMILES);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__ID);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__NAME);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__NAMESPACE);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__KEY);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__VALUE);

		qsarTypeEClass = createEClass(QSAR_TYPE);
		createEReference(qsarTypeEClass, QSAR_TYPE__MOLECULELIST);
		createEReference(qsarTypeEClass, QSAR_TYPE__DESCRIPTORLIST);
		createEReference(qsarTypeEClass, QSAR_TYPE__DESCRIPTORIMPL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(descriptorimplTypeEClass, DescriptorimplType.class, "DescriptorimplType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptorimplType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Jar(), theXMLTypePackage.getString(), "jar", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Reference(), theXMLTypePackage.getString(), "reference", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Vendor(), theXMLTypePackage.getString(), "vendor", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorlistTypeEClass, DescriptorlistType.class, "DescriptorlistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptorlistType_Descriptor(), this.getDescriptorType(), null, "descriptor", null, 0, -1, DescriptorlistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorTypeEClass, DescriptorType.class, "DescriptorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptorType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptorType_Descriptorimpl(), this.getDescriptorimplType(), null, "descriptorimpl", null, 1, 1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorType_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Qsar(), this.getQsarType(), null, "qsar", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(moleculelistTypeEClass, MoleculelistType.class, "MoleculelistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoleculelistType_MoleculeResource(), this.getMoleculeResourceType(), null, "moleculeResource", null, 0, -1, MoleculelistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moleculeResourceTypeEClass, MoleculeResourceType.class, "MoleculeResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoleculeResourceType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Smiles(), theXMLTypePackage.getString(), "smiles", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qsarTypeEClass, QsarType.class, "QsarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQsarType_Moleculelist(), this.getMoleculelistType(), null, "moleculelist", null, 0, 1, QsarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQsarType_Descriptorlist(), this.getDescriptorlistType(), null, "descriptorlist", null, 0, 1, QsarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQsarType_Descriptorimpl(), this.getDescriptorimplType(), null, "descriptorimpl", null, 0, -1, QsarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (descriptorimplTypeEClass, 
		   source, 
		   new String[] {
			 "name", "descriptorimplType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDescriptorimplType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDescriptorimplType_Jar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "jar"
		   });		
		addAnnotation
		  (getDescriptorimplType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getDescriptorimplType_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespace"
		   });		
		addAnnotation
		  (getDescriptorimplType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getDescriptorimplType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "reference"
		   });		
		addAnnotation
		  (getDescriptorimplType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (getDescriptorimplType_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url"
		   });		
		addAnnotation
		  (getDescriptorimplType_Vendor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vendor"
		   });		
		addAnnotation
		  (getDescriptorimplType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (descriptorlistTypeEClass, 
		   source, 
		   new String[] {
			 "name", "descriptorlistType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDescriptorlistType_Descriptor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "descriptor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (descriptorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "descriptorType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDescriptorType_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDescriptorType_Descriptorimpl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "descriptorimpl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDescriptorType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDescriptorType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getDescriptorType_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Qsar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "qsar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (moleculelistTypeEClass, 
		   source, 
		   new String[] {
			 "name", "moleculelistType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMoleculelistType_MoleculeResource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "moleculeResource",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (moleculeResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "moleculeResourceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMoleculeResourceType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMoleculeResourceType_Path(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "path",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMoleculeResourceType_Smiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "smiles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMoleculeResourceType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getMoleculeResourceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getMoleculeResourceType_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespace"
		   });		
		addAnnotation
		  (parameterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "parameterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getParameterType_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getParameterType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (qsarTypeEClass, 
		   source, 
		   new String[] {
			 "name", "qsarType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQsarType_Moleculelist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "moleculelist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQsarType_Descriptorlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "descriptorlist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQsarType_Descriptorimpl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "descriptorimpl",
			 "namespace", "##targetNamespace"
		   });
	}

} //QsarPackageImpl
