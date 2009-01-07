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
import net.bioclipse.qsar.PreprocessingStepType;
import net.bioclipse.qsar.PreprocessingType;
import net.bioclipse.qsar.QsarFactory;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;

import net.bioclipse.qsar.ResponseType;
import net.bioclipse.qsar.ResponsesListType;
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
	private EClass preprocessingStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qsarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsesListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseTypeEClass = null;

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
	public EAttribute getDescriptorimplType_Name() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Namespace() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Reference() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Vendor() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptorimplType_Version() {
		return (EAttribute)descriptorimplTypeEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getDescriptorType_Namespace() {
		return (EAttribute)descriptorTypeEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMoleculeResourceType_Excluded() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_File() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Id() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Name() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Namespace() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_No2d() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_No3d() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_NoMols() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoleculeResourceType_Url() {
		return (EAttribute)moleculeResourceTypeEClass.getEStructuralFeatures().get(8);
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
	public EClass getPreprocessingStepType() {
		return preprocessingStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocessingStepType_Id() {
		return (EAttribute)preprocessingStepTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocessingStepType_Name() {
		return (EAttribute)preprocessingStepTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocessingStepType_Namespace() {
		return (EAttribute)preprocessingStepTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocessingStepType_Order() {
		return (EAttribute)preprocessingStepTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocessingStepType_Vendor() {
		return (EAttribute)preprocessingStepTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocessingType() {
		return preprocessingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreprocessingType_PreprocessingStep() {
		return (EReference)preprocessingTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getQsarType_Preprocessing() {
		return (EReference)qsarTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQsarType_Responselist() {
		return (EReference)qsarTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsesListType() {
		return responsesListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsesListType_Response() {
		return (EReference)responsesListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseType() {
		return responseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_Value() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_ArrayValues() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_MoleculeResource() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_ResourceIndex() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_StructureID() {
		return (EAttribute)responseTypeEClass.getEStructuralFeatures().get(4);
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
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__NAME);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__NAMESPACE);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__REFERENCE);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__VENDOR);
		createEAttribute(descriptorimplTypeEClass, DESCRIPTORIMPL_TYPE__VERSION);

		descriptorlistTypeEClass = createEClass(DESCRIPTORLIST_TYPE);
		createEReference(descriptorlistTypeEClass, DESCRIPTORLIST_TYPE__DESCRIPTOR);

		descriptorTypeEClass = createEClass(DESCRIPTOR_TYPE);
		createEReference(descriptorTypeEClass, DESCRIPTOR_TYPE__PARAMETER);
		createEReference(descriptorTypeEClass, DESCRIPTOR_TYPE__DESCRIPTORIMPL);
		createEAttribute(descriptorTypeEClass, DESCRIPTOR_TYPE__ID);
		createEAttribute(descriptorTypeEClass, DESCRIPTOR_TYPE__NAMESPACE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__QSAR);

		moleculelistTypeEClass = createEClass(MOLECULELIST_TYPE);
		createEReference(moleculelistTypeEClass, MOLECULELIST_TYPE__MOLECULE_RESOURCE);

		moleculeResourceTypeEClass = createEClass(MOLECULE_RESOURCE_TYPE);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__EXCLUDED);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__FILE);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__ID);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__NAME);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__NAMESPACE);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__NO2D);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__NO3D);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__NO_MOLS);
		createEAttribute(moleculeResourceTypeEClass, MOLECULE_RESOURCE_TYPE__URL);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__KEY);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__VALUE);

		preprocessingStepTypeEClass = createEClass(PREPROCESSING_STEP_TYPE);
		createEAttribute(preprocessingStepTypeEClass, PREPROCESSING_STEP_TYPE__ID);
		createEAttribute(preprocessingStepTypeEClass, PREPROCESSING_STEP_TYPE__NAME);
		createEAttribute(preprocessingStepTypeEClass, PREPROCESSING_STEP_TYPE__NAMESPACE);
		createEAttribute(preprocessingStepTypeEClass, PREPROCESSING_STEP_TYPE__ORDER);
		createEAttribute(preprocessingStepTypeEClass, PREPROCESSING_STEP_TYPE__VENDOR);

		preprocessingTypeEClass = createEClass(PREPROCESSING_TYPE);
		createEReference(preprocessingTypeEClass, PREPROCESSING_TYPE__PREPROCESSING_STEP);

		qsarTypeEClass = createEClass(QSAR_TYPE);
		createEReference(qsarTypeEClass, QSAR_TYPE__MOLECULELIST);
		createEReference(qsarTypeEClass, QSAR_TYPE__DESCRIPTORLIST);
		createEReference(qsarTypeEClass, QSAR_TYPE__DESCRIPTORIMPL);
		createEReference(qsarTypeEClass, QSAR_TYPE__PREPROCESSING);
		createEReference(qsarTypeEClass, QSAR_TYPE__RESPONSELIST);

		responsesListTypeEClass = createEClass(RESPONSES_LIST_TYPE);
		createEReference(responsesListTypeEClass, RESPONSES_LIST_TYPE__RESPONSE);

		responseTypeEClass = createEClass(RESPONSE_TYPE);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__VALUE);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__ARRAY_VALUES);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__MOLECULE_RESOURCE);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__RESOURCE_INDEX);
		createEAttribute(responseTypeEClass, RESPONSE_TYPE__STRUCTURE_ID);
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
		initEAttribute(getDescriptorimplType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Reference(), theXMLTypePackage.getString(), "reference", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Vendor(), theXMLTypePackage.getString(), "vendor", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorimplType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, DescriptorimplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorlistTypeEClass, DescriptorlistType.class, "DescriptorlistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptorlistType_Descriptor(), this.getDescriptorType(), null, "descriptor", null, 0, -1, DescriptorlistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorTypeEClass, DescriptorType.class, "DescriptorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptorType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptorType_Descriptorimpl(), this.getDescriptorimplType(), null, "descriptorimpl", null, 1, 1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptorType_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1, DescriptorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Qsar(), this.getQsarType(), null, "qsar", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(moleculelistTypeEClass, MoleculelistType.class, "MoleculelistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoleculelistType_MoleculeResource(), this.getMoleculeResourceType(), null, "moleculeResource", null, 0, -1, MoleculelistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moleculeResourceTypeEClass, MoleculeResourceType.class, "MoleculeResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoleculeResourceType_Excluded(), theXMLTypePackage.getBoolean(), "excluded", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_File(), theXMLTypePackage.getString(), "file", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_No2d(), theXMLTypePackage.getInt(), "no2d", "-1", 0, 1, MoleculeResourceType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_No3d(), theXMLTypePackage.getInt(), "no3d", "-1", 0, 1, MoleculeResourceType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_NoMols(), theXMLTypePackage.getInt(), "noMols", "-1", 0, 1, MoleculeResourceType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoleculeResourceType_Url(), theXMLTypePackage.getString(), "url", null, 0, 1, MoleculeResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preprocessingStepTypeEClass, PreprocessingStepType.class, "PreprocessingStepType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreprocessingStepType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, PreprocessingStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreprocessingStepType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PreprocessingStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreprocessingStepType_Namespace(), theXMLTypePackage.getString(), "namespace", null, 0, 1, PreprocessingStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreprocessingStepType_Order(), theXMLTypePackage.getString(), "order", null, 0, 1, PreprocessingStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreprocessingStepType_Vendor(), theXMLTypePackage.getString(), "vendor", null, 0, 1, PreprocessingStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preprocessingTypeEClass, PreprocessingType.class, "PreprocessingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreprocessingType_PreprocessingStep(), this.getPreprocessingStepType(), null, "preprocessingStep", null, 0, -1, PreprocessingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qsarTypeEClass, QsarType.class, "QsarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQsarType_Moleculelist(), this.getMoleculelistType(), null, "moleculelist", null, 0, 1, QsarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQsarType_Descriptorlist(), this.getDescriptorlistType(), null, "descriptorlist", null, 0, 1, QsarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQsarType_Descriptorimpl(), this.getDescriptorimplType(), null, "descriptorimpl", null, 0, -1, QsarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQsarType_Preprocessing(), this.getPreprocessingType(), null, "preprocessing", null, 0, 1, QsarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQsarType_Responselist(), this.getResponsesListType(), null, "responselist", null, 0, 1, QsarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsesListTypeEClass, ResponsesListType.class, "ResponsesListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponsesListType_Response(), this.getResponseType(), null, "response", null, 0, -1, ResponsesListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseTypeEClass, ResponseType.class, "ResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseType_Value(), theXMLTypePackage.getFloat(), "value", null, 0, 1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseType_ArrayValues(), theXMLTypePackage.getString(), "arrayValues", null, 0, 1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseType_MoleculeResource(), theXMLTypePackage.getString(), "moleculeResource", null, 1, 1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseType_ResourceIndex(), theXMLTypePackage.getInt(), "resourceIndex", null, 0, 1, ResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseType_StructureID(), theXMLTypePackage.getString(), "structureID", null, 0, 1, ResponseType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getDescriptorimplType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "reference"
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
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMoleculeResourceType_Excluded(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "excluded"
		   });		
		addAnnotation
		  (getMoleculeResourceType_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
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
		  (getMoleculeResourceType_No2d(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "no2d"
		   });		
		addAnnotation
		  (getMoleculeResourceType_No3d(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "no3d"
		   });		
		addAnnotation
		  (getMoleculeResourceType_NoMols(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "noMols"
		   });		
		addAnnotation
		  (getMoleculeResourceType_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url"
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
		  (preprocessingStepTypeEClass, 
		   source, 
		   new String[] {
			 "name", "preprocessingStepType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPreprocessingStepType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPreprocessingStepType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getPreprocessingStepType_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namespace"
		   });		
		addAnnotation
		  (getPreprocessingStepType_Order(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "order"
		   });		
		addAnnotation
		  (getPreprocessingStepType_Vendor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vendor"
		   });		
		addAnnotation
		  (preprocessingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "preprocessingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPreprocessingType_PreprocessingStep(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preprocessingStep",
			 "namespace", "##targetNamespace"
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
		addAnnotation
		  (getQsarType_Preprocessing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preprocessing",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQsarType_Responselist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "responselist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (responsesListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "responsesListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResponsesListType_Response(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "response",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (responseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "responseType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResponseType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponseType_ArrayValues(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "arrayValues",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponseType_MoleculeResource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "moleculeResource"
		   });		
		addAnnotation
		  (getResponseType_ResourceIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resourceIndex"
		   });		
		addAnnotation
		  (getResponseType_StructureID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "structureID"
		   });
	}

} //QsarPackageImpl
