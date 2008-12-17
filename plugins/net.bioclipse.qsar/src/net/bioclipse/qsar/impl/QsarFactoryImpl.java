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
import net.bioclipse.qsar.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QsarFactoryImpl extends EFactoryImpl implements QsarFactory {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static QsarFactory init() {
                try {
                        QsarFactory theQsarFactory = (QsarFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bioclipse.net/qsar"); 
                        if (theQsarFactory != null) {
                                return theQsarFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new QsarFactoryImpl();
        }
        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QsarFactoryImpl() {
                super();
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case QsarPackage.DESCRIPTORIMPL_TYPE: return createDescriptorimplType();
                        case QsarPackage.DESCRIPTORLIST_TYPE: return createDescriptorlistType();
                        case QsarPackage.DESCRIPTOR_TYPE: return createDescriptorType();
                        case QsarPackage.DOCUMENT_ROOT: return createDocumentRoot();
                        case QsarPackage.MOLECULELIST_TYPE: return createMoleculelistType();
                        case QsarPackage.MOLECULE_RESOURCE_TYPE: return createMoleculeResourceType();
                        case QsarPackage.PARAMETER_TYPE: return createParameterType();
                        case QsarPackage.PREPROCESSING_STEP_TYPE: return createPreprocessingStepType();
                        case QsarPackage.PREPROCESSING_TYPE: return createPreprocessingType();
                        case QsarPackage.QSAR_TYPE: return createQsarType();
                        case QsarPackage.RESPONSES_LIST_TYPE: return createResponsesListType();
                        case QsarPackage.RESPONSE_TYPE: return createResponseType();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DescriptorimplType createDescriptorimplType() {
                DescriptorimplTypeImpl descriptorimplType = new DescriptorimplTypeImpl();
                return descriptorimplType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DescriptorlistType createDescriptorlistType() {
                DescriptorlistTypeImpl descriptorlistType = new DescriptorlistTypeImpl();
                return descriptorlistType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DescriptorType createDescriptorType() {
                DescriptorTypeImpl descriptorType = new DescriptorTypeImpl();
                return descriptorType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DocumentRoot createDocumentRoot() {
                DocumentRootImpl documentRoot = new DocumentRootImpl();
                return documentRoot;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MoleculelistType createMoleculelistType() {
                MoleculelistTypeImpl moleculelistType = new MoleculelistTypeImpl();
                return moleculelistType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MoleculeResourceType createMoleculeResourceType() {
                MoleculeResourceTypeImpl moleculeResourceType = new MoleculeResourceTypeImpl();
                return moleculeResourceType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ParameterType createParameterType() {
                ParameterTypeImpl parameterType = new ParameterTypeImpl();
                return parameterType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public PreprocessingStepType createPreprocessingStepType() {
                PreprocessingStepTypeImpl preprocessingStepType = new PreprocessingStepTypeImpl();
                return preprocessingStepType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public PreprocessingType createPreprocessingType() {
                PreprocessingTypeImpl preprocessingType = new PreprocessingTypeImpl();
                return preprocessingType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QsarType createQsarType() {
                QsarTypeImpl qsarType = new QsarTypeImpl();
                return qsarType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResponsesListType createResponsesListType() {
                ResponsesListTypeImpl responsesListType = new ResponsesListTypeImpl();
                return responsesListType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResponseType createResponseType() {
                ResponseTypeImpl responseType = new ResponseTypeImpl();
                return responseType;
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public QsarPackage getQsarPackage() {
                return (QsarPackage)getEPackage();
        }
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static QsarPackage getPackage() {
                return QsarPackage.eINSTANCE;
        }
} //QsarFactoryImpl
