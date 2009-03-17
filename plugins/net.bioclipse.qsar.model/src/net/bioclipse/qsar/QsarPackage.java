/**
 *  Copyright (c) 2009 Ola Spjuth
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package net.bioclipse.qsar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
    String copyright = " Copyright (c) 2009 Ola Spjuth\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n";

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
     * The meta object id for the '{@link net.bioclipse.qsar.impl.DescriptorlistTypeImpl <em>Descriptorlist Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.DescriptorlistTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorlistType()
     * @generated
     */
    int DESCRIPTORLIST_TYPE = 0;

    /**
     * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTORLIST_TYPE__DESCRIPTORS = 0;

    /**
     * The number of structural features of the '<em>Descriptorlist Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTORLIST_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.DescriptorproviderTypeImpl <em>Descriptorprovider Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.DescriptorproviderTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorproviderType()
     * @generated
     */
    int DESCRIPTORPROVIDER_TYPE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTORPROVIDER_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTORPROVIDER_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTORPROVIDER_TYPE__URL = 2;

    /**
     * The feature id for the '<em><b>Vendor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTORPROVIDER_TYPE__VENDOR = 3;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTORPROVIDER_TYPE__VERSION = 4;

    /**
     * The number of structural features of the '<em>Descriptorprovider Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTORPROVIDER_TYPE_FEATURE_COUNT = 5;

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
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTOR_TYPE__CHANGED = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTOR_TYPE__ID = 2;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTOR_TYPE__NAMESPACE = 3;

    /**
     * The feature id for the '<em><b>Provider</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIPTOR_TYPE__PROVIDER = 4;

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
     * The meta object id for the '{@link net.bioclipse.qsar.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.MetadataTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getMetadataType()
     * @generated
     */
    int METADATA_TYPE = 4;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__REFERENCE = 0;

    /**
     * The feature id for the '<em><b>Authors</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__AUTHORS = 1;

    /**
     * The feature id for the '<em><b>Datasetname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__DATASETNAME = 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>License</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__LICENSE = 4;

    /**
     * The feature id for the '<em><b>URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE__URL = 5;

    /**
     * The number of structural features of the '<em>Metadata Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METADATA_TYPE_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.ParameterTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getParameterType()
     * @generated
     */
    int PARAMETER_TYPE = 5;

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
     * The meta object id for the '{@link net.bioclipse.qsar.impl.PreprocessingStepTypeImpl <em>Preprocessing Step Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.PreprocessingStepTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getPreprocessingStepType()
     * @generated
     */
    int PREPROCESSING_STEP_TYPE = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPROCESSING_STEP_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPROCESSING_STEP_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPROCESSING_STEP_TYPE__NAMESPACE = 2;

    /**
     * The feature id for the '<em><b>Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPROCESSING_STEP_TYPE__ORDER = 3;

    /**
     * The feature id for the '<em><b>Vendor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPROCESSING_STEP_TYPE__VENDOR = 4;

    /**
     * The number of structural features of the '<em>Preprocessing Step Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPROCESSING_STEP_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.PreprocessingTypeImpl <em>Preprocessing Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.PreprocessingTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getPreprocessingType()
     * @generated
     */
    int PREPROCESSING_TYPE = 7;

    /**
     * The feature id for the '<em><b>Preprocessing Step</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPROCESSING_TYPE__PREPROCESSING_STEP = 0;

    /**
     * The number of structural features of the '<em>Preprocessing Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPROCESSING_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.QsarTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.QsarTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getQsarType()
     * @generated
     */
    int QSAR_TYPE = 8;

    /**
     * The feature id for the '<em><b>Structurelist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QSAR_TYPE__STRUCTURELIST = 0;

    /**
     * The feature id for the '<em><b>Descriptorlist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QSAR_TYPE__DESCRIPTORLIST = 1;

    /**
     * The feature id for the '<em><b>Descriptorproviders</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QSAR_TYPE__DESCRIPTORPROVIDERS = 2;

    /**
     * The feature id for the '<em><b>Preprocessing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QSAR_TYPE__PREPROCESSING = 3;

    /**
     * The feature id for the '<em><b>Responselist</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QSAR_TYPE__RESPONSELIST = 4;

    /**
     * The feature id for the '<em><b>Responseunit</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QSAR_TYPE__RESPONSEUNIT = 5;

    /**
     * The feature id for the '<em><b>Metadata</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QSAR_TYPE__METADATA = 6;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QSAR_TYPE_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.ReferenceTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getReferenceType()
     * @generated
     */
    int REFERENCE_TYPE = 9;

    /**
     * The feature id for the '<em><b>Authors</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE__AUTHORS = 0;

    /**
     * The feature id for the '<em><b>Doi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE__DOI = 1;

    /**
     * The feature id for the '<em><b>Journal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE__JOURNAL = 2;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE__TITLE = 3;

    /**
     * The feature id for the '<em><b>Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE__YEAR = 4;

    /**
     * The number of structural features of the '<em>Reference Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.ResourceTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getResourceType()
     * @generated
     */
    int RESOURCE_TYPE = 10;

    /**
     * The feature id for the '<em><b>Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__STRUCTURE = 0;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__CHECKSUM = 1;

    /**
     * The feature id for the '<em><b>Excluded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__EXCLUDED = 2;

    /**
     * The feature id for the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__FILE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__ID = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__NAME = 5;

    /**
     * The feature id for the '<em><b>No2d</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__NO2D = 6;

    /**
     * The feature id for the '<em><b>No3d</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__NO3D = 7;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__TYPE = 8;

    /**
     * The feature id for the '<em><b>URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE__URL = 9;

    /**
     * The number of structural features of the '<em>Resource Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_TYPE_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.ResponsesListTypeImpl <em>Responses List Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.ResponsesListTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getResponsesListType()
     * @generated
     */
    int RESPONSES_LIST_TYPE = 11;

    /**
     * The feature id for the '<em><b>Response</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_LIST_TYPE__RESPONSE = 0;

    /**
     * The number of structural features of the '<em>Responses List Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSES_LIST_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.ResponseTypeImpl <em>Response Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.ResponseTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getResponseType()
     * @generated
     */
    int RESPONSE_TYPE = 12;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TYPE__VALUE = 0;

    /**
     * The feature id for the '<em><b>Array Values</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TYPE__ARRAY_VALUES = 1;

    /**
     * The feature id for the '<em><b>Structure ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TYPE__STRUCTURE_ID = 2;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TYPE__UNIT = 3;

    /**
     * The number of structural features of the '<em>Response Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_TYPE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.ResponseunitTypeImpl <em>Responseunit Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.ResponseunitTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getResponseunitType()
     * @generated
     */
    int RESPONSEUNIT_TYPE = 13;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSEUNIT_TYPE__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSEUNIT_TYPE__ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSEUNIT_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>Shortname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSEUNIT_TYPE__SHORTNAME = 3;

    /**
     * The feature id for the '<em><b>URL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSEUNIT_TYPE__URL = 4;

    /**
     * The number of structural features of the '<em>Responseunit Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSEUNIT_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.StructurelistTypeImpl <em>Structurelist Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.StructurelistTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getStructurelistType()
     * @generated
     */
    int STRUCTURELIST_TYPE = 14;

    /**
     * The feature id for the '<em><b>Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURELIST_TYPE__RESOURCES = 0;

    /**
     * The number of structural features of the '<em>Structurelist Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURELIST_TYPE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.impl.StructureTypeImpl <em>Structure Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.impl.StructureTypeImpl
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getStructureType()
     * @generated
     */
    int STRUCTURE_TYPE = 15;

    /**
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_TYPE__CHANGED = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_TYPE__ID = 1;

    /**
     * The feature id for the '<em><b>Inchi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_TYPE__INCHI = 2;

    /**
     * The feature id for the '<em><b>Resourceid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_TYPE__RESOURCEID = 3;

    /**
     * The feature id for the '<em><b>Resourceindex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_TYPE__RESOURCEINDEX = 4;

    /**
     * The number of structural features of the '<em>Structure Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_TYPE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link net.bioclipse.qsar.TypeType <em>Type Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.TypeType
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getTypeType()
     * @generated
     */
    int TYPE_TYPE = 16;

    /**
     * The meta object id for the '<em>Type Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.bioclipse.qsar.TypeType
     * @see net.bioclipse.qsar.impl.QsarPackageImpl#getTypeTypeObject()
     * @generated
     */
    int TYPE_TYPE_OBJECT = 17;


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
     * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.DescriptorlistType#getDescriptors <em>Descriptors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Descriptors</em>'.
     * @see net.bioclipse.qsar.DescriptorlistType#getDescriptors()
     * @see #getDescriptorlistType()
     * @generated
     */
    EReference getDescriptorlistType_Descriptors();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.DescriptorproviderType <em>Descriptorprovider Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Descriptorprovider Type</em>'.
     * @see net.bioclipse.qsar.DescriptorproviderType
     * @generated
     */
    EClass getDescriptorproviderType();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorproviderType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see net.bioclipse.qsar.DescriptorproviderType#getId()
     * @see #getDescriptorproviderType()
     * @generated
     */
    EAttribute getDescriptorproviderType_Id();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorproviderType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see net.bioclipse.qsar.DescriptorproviderType#getName()
     * @see #getDescriptorproviderType()
     * @generated
     */
    EAttribute getDescriptorproviderType_Name();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorproviderType#getURL <em>URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>URL</em>'.
     * @see net.bioclipse.qsar.DescriptorproviderType#getURL()
     * @see #getDescriptorproviderType()
     * @generated
     */
    EAttribute getDescriptorproviderType_URL();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorproviderType#getVendor <em>Vendor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vendor</em>'.
     * @see net.bioclipse.qsar.DescriptorproviderType#getVendor()
     * @see #getDescriptorproviderType()
     * @generated
     */
    EAttribute getDescriptorproviderType_Vendor();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorproviderType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see net.bioclipse.qsar.DescriptorproviderType#getVersion()
     * @see #getDescriptorproviderType()
     * @generated
     */
    EAttribute getDescriptorproviderType_Version();

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
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorType#isChanged <em>Changed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Changed</em>'.
     * @see net.bioclipse.qsar.DescriptorType#isChanged()
     * @see #getDescriptorType()
     * @generated
     */
    EAttribute getDescriptorType_Changed();

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
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.DescriptorType#getProvider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Provider</em>'.
     * @see net.bioclipse.qsar.DescriptorType#getProvider()
     * @see #getDescriptorType()
     * @generated
     */
    EAttribute getDescriptorType_Provider();

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
     * Returns the meta object for class '{@link net.bioclipse.qsar.MetadataType <em>Metadata Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Metadata Type</em>'.
     * @see net.bioclipse.qsar.MetadataType
     * @generated
     */
    EClass getMetadataType();

    /**
     * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.MetadataType#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reference</em>'.
     * @see net.bioclipse.qsar.MetadataType#getReference()
     * @see #getMetadataType()
     * @generated
     */
    EReference getMetadataType_Reference();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MetadataType#getAuthors <em>Authors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Authors</em>'.
     * @see net.bioclipse.qsar.MetadataType#getAuthors()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Authors();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MetadataType#getDatasetname <em>Datasetname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Datasetname</em>'.
     * @see net.bioclipse.qsar.MetadataType#getDatasetname()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Datasetname();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MetadataType#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see net.bioclipse.qsar.MetadataType#getDescription()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_Description();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MetadataType#getLicense <em>License</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>License</em>'.
     * @see net.bioclipse.qsar.MetadataType#getLicense()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_License();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.MetadataType#getURL <em>URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>URL</em>'.
     * @see net.bioclipse.qsar.MetadataType#getURL()
     * @see #getMetadataType()
     * @generated
     */
    EAttribute getMetadataType_URL();

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
     * Returns the meta object for class '{@link net.bioclipse.qsar.PreprocessingStepType <em>Preprocessing Step Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Preprocessing Step Type</em>'.
     * @see net.bioclipse.qsar.PreprocessingStepType
     * @generated
     */
    EClass getPreprocessingStepType();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.PreprocessingStepType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see net.bioclipse.qsar.PreprocessingStepType#getId()
     * @see #getPreprocessingStepType()
     * @generated
     */
    EAttribute getPreprocessingStepType_Id();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.PreprocessingStepType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see net.bioclipse.qsar.PreprocessingStepType#getName()
     * @see #getPreprocessingStepType()
     * @generated
     */
    EAttribute getPreprocessingStepType_Name();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.PreprocessingStepType#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see net.bioclipse.qsar.PreprocessingStepType#getNamespace()
     * @see #getPreprocessingStepType()
     * @generated
     */
    EAttribute getPreprocessingStepType_Namespace();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.PreprocessingStepType#getOrder <em>Order</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Order</em>'.
     * @see net.bioclipse.qsar.PreprocessingStepType#getOrder()
     * @see #getPreprocessingStepType()
     * @generated
     */
    EAttribute getPreprocessingStepType_Order();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.PreprocessingStepType#getVendor <em>Vendor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vendor</em>'.
     * @see net.bioclipse.qsar.PreprocessingStepType#getVendor()
     * @see #getPreprocessingStepType()
     * @generated
     */
    EAttribute getPreprocessingStepType_Vendor();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.PreprocessingType <em>Preprocessing Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Preprocessing Type</em>'.
     * @see net.bioclipse.qsar.PreprocessingType
     * @generated
     */
    EClass getPreprocessingType();

    /**
     * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.PreprocessingType#getPreprocessingStep <em>Preprocessing Step</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Preprocessing Step</em>'.
     * @see net.bioclipse.qsar.PreprocessingType#getPreprocessingStep()
     * @see #getPreprocessingType()
     * @generated
     */
    EReference getPreprocessingType_PreprocessingStep();

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
     * Returns the meta object for the containment reference '{@link net.bioclipse.qsar.QsarType#getStructurelist <em>Structurelist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Structurelist</em>'.
     * @see net.bioclipse.qsar.QsarType#getStructurelist()
     * @see #getQsarType()
     * @generated
     */
    EReference getQsarType_Structurelist();

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
     * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.QsarType#getDescriptorproviders <em>Descriptorproviders</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Descriptorproviders</em>'.
     * @see net.bioclipse.qsar.QsarType#getDescriptorproviders()
     * @see #getQsarType()
     * @generated
     */
    EReference getQsarType_Descriptorproviders();

    /**
     * Returns the meta object for the containment reference '{@link net.bioclipse.qsar.QsarType#getPreprocessing <em>Preprocessing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Preprocessing</em>'.
     * @see net.bioclipse.qsar.QsarType#getPreprocessing()
     * @see #getQsarType()
     * @generated
     */
    EReference getQsarType_Preprocessing();

    /**
     * Returns the meta object for the containment reference '{@link net.bioclipse.qsar.QsarType#getResponselist <em>Responselist</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Responselist</em>'.
     * @see net.bioclipse.qsar.QsarType#getResponselist()
     * @see #getQsarType()
     * @generated
     */
    EReference getQsarType_Responselist();

    /**
     * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.QsarType#getResponseunit <em>Responseunit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Responseunit</em>'.
     * @see net.bioclipse.qsar.QsarType#getResponseunit()
     * @see #getQsarType()
     * @generated
     */
    EReference getQsarType_Responseunit();

    /**
     * Returns the meta object for the containment reference '{@link net.bioclipse.qsar.QsarType#getMetadata <em>Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Metadata</em>'.
     * @see net.bioclipse.qsar.QsarType#getMetadata()
     * @see #getQsarType()
     * @generated
     */
    EReference getQsarType_Metadata();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.ReferenceType <em>Reference Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Type</em>'.
     * @see net.bioclipse.qsar.ReferenceType
     * @generated
     */
    EClass getReferenceType();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ReferenceType#getAuthors <em>Authors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Authors</em>'.
     * @see net.bioclipse.qsar.ReferenceType#getAuthors()
     * @see #getReferenceType()
     * @generated
     */
    EAttribute getReferenceType_Authors();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ReferenceType#getDoi <em>Doi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Doi</em>'.
     * @see net.bioclipse.qsar.ReferenceType#getDoi()
     * @see #getReferenceType()
     * @generated
     */
    EAttribute getReferenceType_Doi();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ReferenceType#getJournal <em>Journal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Journal</em>'.
     * @see net.bioclipse.qsar.ReferenceType#getJournal()
     * @see #getReferenceType()
     * @generated
     */
    EAttribute getReferenceType_Journal();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ReferenceType#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see net.bioclipse.qsar.ReferenceType#getTitle()
     * @see #getReferenceType()
     * @generated
     */
    EAttribute getReferenceType_Title();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ReferenceType#getYear <em>Year</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Year</em>'.
     * @see net.bioclipse.qsar.ReferenceType#getYear()
     * @see #getReferenceType()
     * @generated
     */
    EAttribute getReferenceType_Year();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.ResourceType <em>Resource Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource Type</em>'.
     * @see net.bioclipse.qsar.ResourceType
     * @generated
     */
    EClass getResourceType();

    /**
     * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.ResourceType#getStructure <em>Structure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Structure</em>'.
     * @see net.bioclipse.qsar.ResourceType#getStructure()
     * @see #getResourceType()
     * @generated
     */
    EReference getResourceType_Structure();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#getURL <em>URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>URL</em>'.
     * @see net.bioclipse.qsar.ResourceType#getURL()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_URL();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#getFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File</em>'.
     * @see net.bioclipse.qsar.ResourceType#getFile()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_File();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#getChecksum <em>Checksum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Checksum</em>'.
     * @see net.bioclipse.qsar.ResourceType#getChecksum()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Checksum();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#isExcluded <em>Excluded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Excluded</em>'.
     * @see net.bioclipse.qsar.ResourceType#isExcluded()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Excluded();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see net.bioclipse.qsar.ResourceType#getId()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Id();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see net.bioclipse.qsar.ResourceType#getName()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Name();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#getNo2d <em>No2d</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>No2d</em>'.
     * @see net.bioclipse.qsar.ResourceType#getNo2d()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_No2d();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#getNo3d <em>No3d</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>No3d</em>'.
     * @see net.bioclipse.qsar.ResourceType#getNo3d()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_No3d();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResourceType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see net.bioclipse.qsar.ResourceType#getType()
     * @see #getResourceType()
     * @generated
     */
    EAttribute getResourceType_Type();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.ResponsesListType <em>Responses List Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Responses List Type</em>'.
     * @see net.bioclipse.qsar.ResponsesListType
     * @generated
     */
    EClass getResponsesListType();

    /**
     * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.ResponsesListType#getResponse <em>Response</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Response</em>'.
     * @see net.bioclipse.qsar.ResponsesListType#getResponse()
     * @see #getResponsesListType()
     * @generated
     */
    EReference getResponsesListType_Response();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.ResponseType <em>Response Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Response Type</em>'.
     * @see net.bioclipse.qsar.ResponseType
     * @generated
     */
    EClass getResponseType();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see net.bioclipse.qsar.ResponseType#getValue()
     * @see #getResponseType()
     * @generated
     */
    EAttribute getResponseType_Value();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseType#getArrayValues <em>Array Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Array Values</em>'.
     * @see net.bioclipse.qsar.ResponseType#getArrayValues()
     * @see #getResponseType()
     * @generated
     */
    EAttribute getResponseType_ArrayValues();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseType#getStructureID <em>Structure ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Structure ID</em>'.
     * @see net.bioclipse.qsar.ResponseType#getStructureID()
     * @see #getResponseType()
     * @generated
     */
    EAttribute getResponseType_StructureID();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseType#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see net.bioclipse.qsar.ResponseType#getUnit()
     * @see #getResponseType()
     * @generated
     */
    EAttribute getResponseType_Unit();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.ResponseunitType <em>Responseunit Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Responseunit Type</em>'.
     * @see net.bioclipse.qsar.ResponseunitType
     * @generated
     */
    EClass getResponseunitType();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseunitType#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see net.bioclipse.qsar.ResponseunitType#getDescription()
     * @see #getResponseunitType()
     * @generated
     */
    EAttribute getResponseunitType_Description();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseunitType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see net.bioclipse.qsar.ResponseunitType#getId()
     * @see #getResponseunitType()
     * @generated
     */
    EAttribute getResponseunitType_Id();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseunitType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see net.bioclipse.qsar.ResponseunitType#getName()
     * @see #getResponseunitType()
     * @generated
     */
    EAttribute getResponseunitType_Name();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseunitType#getShortname <em>Shortname</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Shortname</em>'.
     * @see net.bioclipse.qsar.ResponseunitType#getShortname()
     * @see #getResponseunitType()
     * @generated
     */
    EAttribute getResponseunitType_Shortname();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.ResponseunitType#getURL <em>URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>URL</em>'.
     * @see net.bioclipse.qsar.ResponseunitType#getURL()
     * @see #getResponseunitType()
     * @generated
     */
    EAttribute getResponseunitType_URL();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.StructurelistType <em>Structurelist Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structurelist Type</em>'.
     * @see net.bioclipse.qsar.StructurelistType
     * @generated
     */
    EClass getStructurelistType();

    /**
     * Returns the meta object for the containment reference list '{@link net.bioclipse.qsar.StructurelistType#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resources</em>'.
     * @see net.bioclipse.qsar.StructurelistType#getResources()
     * @see #getStructurelistType()
     * @generated
     */
    EReference getStructurelistType_Resources();

    /**
     * Returns the meta object for class '{@link net.bioclipse.qsar.StructureType <em>Structure Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structure Type</em>'.
     * @see net.bioclipse.qsar.StructureType
     * @generated
     */
    EClass getStructureType();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.StructureType#isChanged <em>Changed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Changed</em>'.
     * @see net.bioclipse.qsar.StructureType#isChanged()
     * @see #getStructureType()
     * @generated
     */
    EAttribute getStructureType_Changed();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.StructureType#getResourceindex <em>Resourceindex</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resourceindex</em>'.
     * @see net.bioclipse.qsar.StructureType#getResourceindex()
     * @see #getStructureType()
     * @generated
     */
    EAttribute getStructureType_Resourceindex();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.StructureType#getResourceid <em>Resourceid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resourceid</em>'.
     * @see net.bioclipse.qsar.StructureType#getResourceid()
     * @see #getStructureType()
     * @generated
     */
    EAttribute getStructureType_Resourceid();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.StructureType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see net.bioclipse.qsar.StructureType#getId()
     * @see #getStructureType()
     * @generated
     */
    EAttribute getStructureType_Id();

    /**
     * Returns the meta object for the attribute '{@link net.bioclipse.qsar.StructureType#getInchi <em>Inchi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inchi</em>'.
     * @see net.bioclipse.qsar.StructureType#getInchi()
     * @see #getStructureType()
     * @generated
     */
    EAttribute getStructureType_Inchi();

    /**
     * Returns the meta object for enum '{@link net.bioclipse.qsar.TypeType <em>Type Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Type Type</em>'.
     * @see net.bioclipse.qsar.TypeType
     * @generated
     */
    EEnum getTypeType();

    /**
     * Returns the meta object for data type '{@link net.bioclipse.qsar.TypeType <em>Type Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Type Type Object</em>'.
     * @see net.bioclipse.qsar.TypeType
     * @model instanceClass="net.bioclipse.qsar.TypeType"
     *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
     * @generated
     */
    EDataType getTypeTypeObject();

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
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.DescriptorlistTypeImpl <em>Descriptorlist Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.DescriptorlistTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorlistType()
         * @generated
         */
        EClass DESCRIPTORLIST_TYPE = eINSTANCE.getDescriptorlistType();

        /**
         * The meta object literal for the '<em><b>Descriptors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DESCRIPTORLIST_TYPE__DESCRIPTORS = eINSTANCE.getDescriptorlistType_Descriptors();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.DescriptorproviderTypeImpl <em>Descriptorprovider Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.DescriptorproviderTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getDescriptorproviderType()
         * @generated
         */
        EClass DESCRIPTORPROVIDER_TYPE = eINSTANCE.getDescriptorproviderType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTORPROVIDER_TYPE__ID = eINSTANCE.getDescriptorproviderType_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTORPROVIDER_TYPE__NAME = eINSTANCE.getDescriptorproviderType_Name();

        /**
         * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTORPROVIDER_TYPE__URL = eINSTANCE.getDescriptorproviderType_URL();

        /**
         * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTORPROVIDER_TYPE__VENDOR = eINSTANCE.getDescriptorproviderType_Vendor();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTORPROVIDER_TYPE__VERSION = eINSTANCE.getDescriptorproviderType_Version();

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
         * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTOR_TYPE__CHANGED = eINSTANCE.getDescriptorType_Changed();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTOR_TYPE__ID = eINSTANCE.getDescriptorType_Id();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTOR_TYPE__NAMESPACE = eINSTANCE.getDescriptorType_Namespace();

        /**
         * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIPTOR_TYPE__PROVIDER = eINSTANCE.getDescriptorType_Provider();

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
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.MetadataTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getMetadataType()
         * @generated
         */
        EClass METADATA_TYPE = eINSTANCE.getMetadataType();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference METADATA_TYPE__REFERENCE = eINSTANCE.getMetadataType_Reference();

        /**
         * The meta object literal for the '<em><b>Authors</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__AUTHORS = eINSTANCE.getMetadataType_Authors();

        /**
         * The meta object literal for the '<em><b>Datasetname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__DATASETNAME = eINSTANCE.getMetadataType_Datasetname();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__DESCRIPTION = eINSTANCE.getMetadataType_Description();

        /**
         * The meta object literal for the '<em><b>License</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__LICENSE = eINSTANCE.getMetadataType_License();

        /**
         * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute METADATA_TYPE__URL = eINSTANCE.getMetadataType_URL();

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
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.PreprocessingStepTypeImpl <em>Preprocessing Step Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.PreprocessingStepTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getPreprocessingStepType()
         * @generated
         */
        EClass PREPROCESSING_STEP_TYPE = eINSTANCE.getPreprocessingStepType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PREPROCESSING_STEP_TYPE__ID = eINSTANCE.getPreprocessingStepType_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PREPROCESSING_STEP_TYPE__NAME = eINSTANCE.getPreprocessingStepType_Name();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PREPROCESSING_STEP_TYPE__NAMESPACE = eINSTANCE.getPreprocessingStepType_Namespace();

        /**
         * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PREPROCESSING_STEP_TYPE__ORDER = eINSTANCE.getPreprocessingStepType_Order();

        /**
         * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PREPROCESSING_STEP_TYPE__VENDOR = eINSTANCE.getPreprocessingStepType_Vendor();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.PreprocessingTypeImpl <em>Preprocessing Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.PreprocessingTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getPreprocessingType()
         * @generated
         */
        EClass PREPROCESSING_TYPE = eINSTANCE.getPreprocessingType();

        /**
         * The meta object literal for the '<em><b>Preprocessing Step</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PREPROCESSING_TYPE__PREPROCESSING_STEP = eINSTANCE.getPreprocessingType_PreprocessingStep();

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
         * The meta object literal for the '<em><b>Structurelist</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QSAR_TYPE__STRUCTURELIST = eINSTANCE.getQsarType_Structurelist();

        /**
         * The meta object literal for the '<em><b>Descriptorlist</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QSAR_TYPE__DESCRIPTORLIST = eINSTANCE.getQsarType_Descriptorlist();

        /**
         * The meta object literal for the '<em><b>Descriptorproviders</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QSAR_TYPE__DESCRIPTORPROVIDERS = eINSTANCE.getQsarType_Descriptorproviders();

        /**
         * The meta object literal for the '<em><b>Preprocessing</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QSAR_TYPE__PREPROCESSING = eINSTANCE.getQsarType_Preprocessing();

        /**
         * The meta object literal for the '<em><b>Responselist</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QSAR_TYPE__RESPONSELIST = eINSTANCE.getQsarType_Responselist();

        /**
         * The meta object literal for the '<em><b>Responseunit</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QSAR_TYPE__RESPONSEUNIT = eINSTANCE.getQsarType_Responseunit();

        /**
         * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QSAR_TYPE__METADATA = eINSTANCE.getQsarType_Metadata();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.ReferenceTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getReferenceType()
         * @generated
         */
        EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

        /**
         * The meta object literal for the '<em><b>Authors</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_TYPE__AUTHORS = eINSTANCE.getReferenceType_Authors();

        /**
         * The meta object literal for the '<em><b>Doi</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_TYPE__DOI = eINSTANCE.getReferenceType_Doi();

        /**
         * The meta object literal for the '<em><b>Journal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_TYPE__JOURNAL = eINSTANCE.getReferenceType_Journal();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_TYPE__TITLE = eINSTANCE.getReferenceType_Title();

        /**
         * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REFERENCE_TYPE__YEAR = eINSTANCE.getReferenceType_Year();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.ResourceTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getResourceType()
         * @generated
         */
        EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

        /**
         * The meta object literal for the '<em><b>Structure</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESOURCE_TYPE__STRUCTURE = eINSTANCE.getResourceType_Structure();

        /**
         * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__URL = eINSTANCE.getResourceType_URL();

        /**
         * The meta object literal for the '<em><b>File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__FILE = eINSTANCE.getResourceType_File();

        /**
         * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__CHECKSUM = eINSTANCE.getResourceType_Checksum();

        /**
         * The meta object literal for the '<em><b>Excluded</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__EXCLUDED = eINSTANCE.getResourceType_Excluded();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__ID = eINSTANCE.getResourceType_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getResourceType_Name();

        /**
         * The meta object literal for the '<em><b>No2d</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__NO2D = eINSTANCE.getResourceType_No2d();

        /**
         * The meta object literal for the '<em><b>No3d</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__NO3D = eINSTANCE.getResourceType_No3d();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESOURCE_TYPE__TYPE = eINSTANCE.getResourceType_Type();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.ResponsesListTypeImpl <em>Responses List Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.ResponsesListTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getResponsesListType()
         * @generated
         */
        EClass RESPONSES_LIST_TYPE = eINSTANCE.getResponsesListType();

        /**
         * The meta object literal for the '<em><b>Response</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESPONSES_LIST_TYPE__RESPONSE = eINSTANCE.getResponsesListType_Response();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.ResponseTypeImpl <em>Response Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.ResponseTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getResponseType()
         * @generated
         */
        EClass RESPONSE_TYPE = eINSTANCE.getResponseType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSE_TYPE__VALUE = eINSTANCE.getResponseType_Value();

        /**
         * The meta object literal for the '<em><b>Array Values</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSE_TYPE__ARRAY_VALUES = eINSTANCE.getResponseType_ArrayValues();

        /**
         * The meta object literal for the '<em><b>Structure ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSE_TYPE__STRUCTURE_ID = eINSTANCE.getResponseType_StructureID();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSE_TYPE__UNIT = eINSTANCE.getResponseType_Unit();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.ResponseunitTypeImpl <em>Responseunit Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.ResponseunitTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getResponseunitType()
         * @generated
         */
        EClass RESPONSEUNIT_TYPE = eINSTANCE.getResponseunitType();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSEUNIT_TYPE__DESCRIPTION = eINSTANCE.getResponseunitType_Description();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSEUNIT_TYPE__ID = eINSTANCE.getResponseunitType_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSEUNIT_TYPE__NAME = eINSTANCE.getResponseunitType_Name();

        /**
         * The meta object literal for the '<em><b>Shortname</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSEUNIT_TYPE__SHORTNAME = eINSTANCE.getResponseunitType_Shortname();

        /**
         * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSEUNIT_TYPE__URL = eINSTANCE.getResponseunitType_URL();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.StructurelistTypeImpl <em>Structurelist Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.StructurelistTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getStructurelistType()
         * @generated
         */
        EClass STRUCTURELIST_TYPE = eINSTANCE.getStructurelistType();

        /**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURELIST_TYPE__RESOURCES = eINSTANCE.getStructurelistType_Resources();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.impl.StructureTypeImpl <em>Structure Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.impl.StructureTypeImpl
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getStructureType()
         * @generated
         */
        EClass STRUCTURE_TYPE = eINSTANCE.getStructureType();

        /**
         * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRUCTURE_TYPE__CHANGED = eINSTANCE.getStructureType_Changed();

        /**
         * The meta object literal for the '<em><b>Resourceindex</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRUCTURE_TYPE__RESOURCEINDEX = eINSTANCE.getStructureType_Resourceindex();

        /**
         * The meta object literal for the '<em><b>Resourceid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRUCTURE_TYPE__RESOURCEID = eINSTANCE.getStructureType_Resourceid();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRUCTURE_TYPE__ID = eINSTANCE.getStructureType_Id();

        /**
         * The meta object literal for the '<em><b>Inchi</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRUCTURE_TYPE__INCHI = eINSTANCE.getStructureType_Inchi();

        /**
         * The meta object literal for the '{@link net.bioclipse.qsar.TypeType <em>Type Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.TypeType
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getTypeType()
         * @generated
         */
        EEnum TYPE_TYPE = eINSTANCE.getTypeType();

        /**
         * The meta object literal for the '<em>Type Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see net.bioclipse.qsar.TypeType
         * @see net.bioclipse.qsar.impl.QsarPackageImpl#getTypeTypeObject()
         * @generated
         */
        EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

    }

} //QsarPackage
