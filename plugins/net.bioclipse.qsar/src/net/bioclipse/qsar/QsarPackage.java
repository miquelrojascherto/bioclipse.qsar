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
package net.bioclipse.qsar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.bioclipse.qsar.QsarFactory
 * @model kind="package"
 * @generated
 */
public interface QsarPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qsar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bioclipse.net/qsar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qsar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QsarPackage eINSTANCE = net.bioclipse.qsar.impl.QsarPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bioclipse.qsar.impl.DescriptorimplTypeImpl <em>Descriptorimpl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bioclipse.qsar.impl.DescriptorimplTypeImpl
	 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorimplType()
	 * @generated
	 */
	int DESCRIPTORIMPL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORIMPL_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORIMPL_TYPE__JAR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORIMPL_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORIMPL_TYPE__NAMESPACE = 3;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORIMPL_TYPE__PLUGIN = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORIMPL_TYPE__URL = 5;

	/**
	 * The number of structural features of the '<em>Descriptorimpl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORIMPL_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.bioclipse.qsar.impl.DescriptorlistTypeImpl <em>Descriptorlist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bioclipse.qsar.impl.DescriptorlistTypeImpl
	 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorlistType()
	 * @generated
	 */
	int DESCRIPTORLIST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORLIST_TYPE__DESCRIPTOR = 0;

	/**
	 * The number of structural features of the '<em>Descriptorlist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTORLIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.bioclipse.qsar.impl.DescriptorTypeImpl <em>Descriptor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bioclipse.qsar.impl.DescriptorTypeImpl
	 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorType()
	 * @generated
	 */
	int DESCRIPTOR_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_TYPE__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Descriptorimpl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_TYPE__DESCRIPTORIMPL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_TYPE__NAMESPACE = 4;

	/**
	 * The number of structural features of the '<em>Descriptor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.bioclipse.qsar.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bioclipse.qsar.impl.DocumentRootImpl
	 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Qsar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QSAR = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.bioclipse.qsar.impl.MoleculelistTypeImpl <em>Moleculelist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bioclipse.qsar.impl.MoleculelistTypeImpl
	 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getMoleculelistType()
	 * @generated
	 */
	int MOLECULELIST_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Molecule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULELIST_TYPE__MOLECULE = 0;

	/**
	 * The number of structural features of the '<em>Moleculelist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULELIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.bioclipse.qsar.impl.MoleculeTypeImpl <em>Molecule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bioclipse.qsar.impl.MoleculeTypeImpl
	 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getMoleculeType()
	 * @generated
	 */
	int MOLECULE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE_TYPE__URL = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE_TYPE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Smiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE_TYPE__SMILES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Molecule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.bioclipse.qsar.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bioclipse.qsar.impl.ParameterTypeImpl
	 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.bioclipse.qsar.impl.QsarTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bioclipse.qsar.impl.QsarTypeImpl
	 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getQsarType()
	 * @generated
	 */
	int QSAR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Moleculelist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSAR_TYPE__MOLECULELIST = 0;

	/**
	 * The feature id for the '<em><b>Descriptorlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSAR_TYPE__DESCRIPTORLIST = 1;

	/**
	 * The feature id for the '<em><b>Descriptorimpl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSAR_TYPE__DESCRIPTORIMPL = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSAR_TYPE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link net.bioclipse.qsar.DescriptorimplType <em>Descriptorimpl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptorimpl Type</em>'.
	 * @see net.bioclipse.qsar.DescriptorimplType
	 * @generated
	 */
	EClass getDescriptorimplType();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorimplType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bioclipse.qsar.DescriptorimplType#getId()
	 * @see #getDescriptorimplType()
	 * @generated
	 */
	EAttribute getDescriptorimplType_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorimplType#getJar <em>Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jar</em>'.
	 * @see net.bioclipse.qsar.DescriptorimplType#getJar()
	 * @see #getDescriptorimplType()
	 * @generated
	 */
	EAttribute getDescriptorimplType_Jar();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorimplType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bioclipse.qsar.DescriptorimplType#getName()
	 * @see #getDescriptorimplType()
	 * @generated
	 */
	EAttribute getDescriptorimplType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorimplType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see net.bioclipse.qsar.DescriptorimplType#getNamespace()
	 * @see #getDescriptorimplType()
	 * @generated
	 */
	EAttribute getDescriptorimplType_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorimplType#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin</em>'.
	 * @see net.bioclipse.qsar.DescriptorimplType#getPlugin()
	 * @see #getDescriptorimplType()
	 * @generated
	 */
	EAttribute getDescriptorimplType_Plugin();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorimplType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.bioclipse.qsar.DescriptorimplType#getUrl()
	 * @see #getDescriptorimplType()
	 * @generated
	 */
	EAttribute getDescriptorimplType_Url();

	/**
	 * Returns the meta object for class '{@link net.bioclipse.qsar.DescriptorlistType <em>Descriptorlist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptorlist Type</em>'.
	 * @see net.bioclipse.qsar.DescriptorlistType
	 * @generated
	 */
	EClass getDescriptorlistType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.DescriptorlistType#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptor</em>'.
	 * @see net.bioclipse.qsar.DescriptorlistType#getDescriptor()
	 * @see #getDescriptorlistType()
	 * @generated
	 */
	EReference getDescriptorlistType_Descriptor();

	/**
	 * Returns the meta object for class '{@link net.bioclipse.qsar.DescriptorType <em>Descriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor Type</em>'.
	 * @see net.bioclipse.qsar.DescriptorType
	 * @generated
	 */
	EClass getDescriptorType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.DescriptorType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see net.bioclipse.qsar.DescriptorType#getParameter()
	 * @see #getDescriptorType()
	 * @generated
	 */
	EReference getDescriptorType_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link net.bioclipse.qsar.DescriptorType#getDescriptorimpl <em>Descriptorimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Descriptorimpl</em>'.
	 * @see net.bioclipse.qsar.DescriptorType#getDescriptorimpl()
	 * @see #getDescriptorType()
	 * @generated
	 */
	EReference getDescriptorType_Descriptorimpl();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bioclipse.qsar.DescriptorType#getId()
	 * @see #getDescriptorType()
	 * @generated
	 */
	EAttribute getDescriptorType_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bioclipse.qsar.DescriptorType#getName()
	 * @see #getDescriptorType()
	 * @generated
	 */
	EAttribute getDescriptorType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see net.bioclipse.qsar.DescriptorType#getNamespace()
	 * @see #getDescriptorType()
	 * @generated
	 */
	EAttribute getDescriptorType_Namespace();

	/**
	 * Returns the meta object for class '{@link net.bioclipse.qsar.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.bioclipse.qsar.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.bioclipse.qsar.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.bioclipse.qsar.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.bioclipse.qsar.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.bioclipse.qsar.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.bioclipse.qsar.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.bioclipse.qsar.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.bioclipse.qsar.DocumentRoot#getQsar <em>Qsar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qsar</em>'.
	 * @see net.bioclipse.qsar.DocumentRoot#getQsar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Qsar();

	/**
	 * Returns the meta object for class '{@link net.bioclipse.qsar.MoleculelistType <em>Moleculelist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moleculelist Type</em>'.
	 * @see net.bioclipse.qsar.MoleculelistType
	 * @generated
	 */
	EClass getMoleculelistType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.MoleculelistType#getMolecule <em>Molecule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule</em>'.
	 * @see net.bioclipse.qsar.MoleculelistType#getMolecule()
	 * @see #getMoleculelistType()
	 * @generated
	 */
	EReference getMoleculelistType_Molecule();

	/**
	 * Returns the meta object for class '{@link net.bioclipse.qsar.MoleculeType <em>Molecule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molecule Type</em>'.
	 * @see net.bioclipse.qsar.MoleculeType
	 * @generated
	 */
	EClass getMoleculeType();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MoleculeType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.bioclipse.qsar.MoleculeType#getUrl()
	 * @see #getMoleculeType()
	 * @generated
	 */
	EAttribute getMoleculeType_Url();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MoleculeType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see net.bioclipse.qsar.MoleculeType#getPath()
	 * @see #getMoleculeType()
	 * @generated
	 */
	EAttribute getMoleculeType_Path();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MoleculeType#getSmiles <em>Smiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smiles</em>'.
	 * @see net.bioclipse.qsar.MoleculeType#getSmiles()
	 * @see #getMoleculeType()
	 * @generated
	 */
	EAttribute getMoleculeType_Smiles();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MoleculeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bioclipse.qsar.MoleculeType#getId()
	 * @see #getMoleculeType()
	 * @generated
	 */
	EAttribute getMoleculeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MoleculeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bioclipse.qsar.MoleculeType#getName()
	 * @see #getMoleculeType()
	 * @generated
	 */
	EAttribute getMoleculeType_Name();

	/**
	 * Returns the meta object for class '{@link net.bioclipse.qsar.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see net.bioclipse.qsar.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ParameterType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.bioclipse.qsar.ParameterType#getKey()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Key();

	/**
	 * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ParameterType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.bioclipse.qsar.ParameterType#getValue()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Value();

	/**
	 * Returns the meta object for class '{@link net.bioclipse.qsar.QsarType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see net.bioclipse.qsar.QsarType
	 * @generated
	 */
	EClass getQsarType();

	/**
	 * Returns the meta object for the containment reference '{@link net.bioclipse.qsar.QsarType#getMoleculelist <em>Moleculelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Moleculelist</em>'.
	 * @see net.bioclipse.qsar.QsarType#getMoleculelist()
	 * @see #getQsarType()
	 * @generated
	 */
	EReference getQsarType_Moleculelist();

	/**
	 * Returns the meta object for the containment reference '{@link net.bioclipse.qsar.QsarType#getDescriptorlist <em>Descriptorlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Descriptorlist</em>'.
	 * @see net.bioclipse.qsar.QsarType#getDescriptorlist()
	 * @see #getQsarType()
	 * @generated
	 */
	EReference getQsarType_Descriptorlist();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.QsarType#getDescriptorimpl <em>Descriptorimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptorimpl</em>'.
	 * @see net.bioclipse.qsar.QsarType#getDescriptorimpl()
	 * @see #getQsarType()
	 * @generated
	 */
	EReference getQsarType_Descriptorimpl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QsarFactory getQsarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bioclipse.qsar.impl.DescriptorimplTypeImpl <em>Descriptorimpl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bioclipse.qsar.impl.DescriptorimplTypeImpl
		 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorimplType()
		 * @generated
		 */
		EClass DESCRIPTORIMPL_TYPE = eINSTANCE.getDescriptorimplType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTORIMPL_TYPE__ID = eINSTANCE.getDescriptorimplType_Id();

		/**
		 * The meta object literal for the '<em><b>Jar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTORIMPL_TYPE__JAR = eINSTANCE.getDescriptorimplType_Jar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTORIMPL_TYPE__NAME = eINSTANCE.getDescriptorimplType_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTORIMPL_TYPE__NAMESPACE = eINSTANCE.getDescriptorimplType_Namespace();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTORIMPL_TYPE__PLUGIN = eINSTANCE.getDescriptorimplType_Plugin();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTORIMPL_TYPE__URL = eINSTANCE.getDescriptorimplType_Url();

		/**
		 * The meta object literal for the '{@link net.bioclipse.qsar.impl.DescriptorlistTypeImpl <em>Descriptorlist Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bioclipse.qsar.impl.DescriptorlistTypeImpl
		 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorlistType()
		 * @generated
		 */
		EClass DESCRIPTORLIST_TYPE = eINSTANCE.getDescriptorlistType();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTORLIST_TYPE__DESCRIPTOR = eINSTANCE.getDescriptorlistType_Descriptor();

		/**
		 * The meta object literal for the '{@link net.bioclipse.qsar.impl.DescriptorTypeImpl <em>Descriptor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bioclipse.qsar.impl.DescriptorTypeImpl
		 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorType()
		 * @generated
		 */
		EClass DESCRIPTOR_TYPE = eINSTANCE.getDescriptorType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR_TYPE__PARAMETER = eINSTANCE.getDescriptorType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Descriptorimpl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR_TYPE__DESCRIPTORIMPL = eINSTANCE.getDescriptorType_Descriptorimpl();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR_TYPE__ID = eINSTANCE.getDescriptorType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR_TYPE__NAME = eINSTANCE.getDescriptorType_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR_TYPE__NAMESPACE = eINSTANCE.getDescriptorType_Namespace();

		/**
		 * The meta object literal for the '{@link net.bioclipse.qsar.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bioclipse.qsar.impl.DocumentRootImpl
		 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Qsar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QSAR = eINSTANCE.getDocumentRoot_Qsar();

		/**
		 * The meta object literal for the '{@link net.bioclipse.qsar.impl.MoleculelistTypeImpl <em>Moleculelist Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bioclipse.qsar.impl.MoleculelistTypeImpl
		 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getMoleculelistType()
		 * @generated
		 */
		EClass MOLECULELIST_TYPE = eINSTANCE.getMoleculelistType();

		/**
		 * The meta object literal for the '<em><b>Molecule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOLECULELIST_TYPE__MOLECULE = eINSTANCE.getMoleculelistType_Molecule();

		/**
		 * The meta object literal for the '{@link net.bioclipse.qsar.impl.MoleculeTypeImpl <em>Molecule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bioclipse.qsar.impl.MoleculeTypeImpl
		 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getMoleculeType()
		 * @generated
		 */
		EClass MOLECULE_TYPE = eINSTANCE.getMoleculeType();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULE_TYPE__URL = eINSTANCE.getMoleculeType_Url();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULE_TYPE__PATH = eINSTANCE.getMoleculeType_Path();

		/**
		 * The meta object literal for the '<em><b>Smiles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULE_TYPE__SMILES = eINSTANCE.getMoleculeType_Smiles();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULE_TYPE__ID = eINSTANCE.getMoleculeType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULE_TYPE__NAME = eINSTANCE.getMoleculeType_Name();

		/**
		 * The meta object literal for the '{@link net.bioclipse.qsar.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bioclipse.qsar.impl.ParameterTypeImpl
		 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__KEY = eINSTANCE.getParameterType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__VALUE = eINSTANCE.getParameterType_Value();

		/**
		 * The meta object literal for the '{@link net.bioclipse.qsar.impl.QsarTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bioclipse.qsar.impl.QsarTypeImpl
		 * @see net.bioclipse.qsar.impl.QsarPackageImpl#getQsarType()
		 * @generated
		 */
		EClass QSAR_TYPE = eINSTANCE.getQsarType();

		/**
		 * The meta object literal for the '<em><b>Moleculelist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSAR_TYPE__MOLECULELIST = eINSTANCE.getQsarType_Moleculelist();

		/**
		 * The meta object literal for the '<em><b>Descriptorlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSAR_TYPE__DESCRIPTORLIST = eINSTANCE.getQsarType_Descriptorlist();

		/**
		 * The meta object literal for the '<em><b>Descriptorimpl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSAR_TYPE__DESCRIPTORIMPL = eINSTANCE.getQsarType_Descriptorimpl();

	}

} //QsarPackage
