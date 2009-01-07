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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.bioclipse.qsar.QsarPackage
 * @generated
 */
public interface QsarFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QsarFactory eINSTANCE = net.bioclipse.qsar.impl.QsarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Descriptorimpl Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptorimpl Type</em>'.
	 * @generated
	 */
	DescriptorimplType createDescriptorimplType();

	/**
	 * Returns a new object of class '<em>Descriptorlist Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptorlist Type</em>'.
	 * @generated
	 */
	DescriptorlistType createDescriptorlistType();

	/**
	 * Returns a new object of class '<em>Descriptor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor Type</em>'.
	 * @generated
	 */
	DescriptorType createDescriptorType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Moleculelist Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moleculelist Type</em>'.
	 * @generated
	 */
	MoleculelistType createMoleculelistType();

	/**
	 * Returns a new object of class '<em>Molecule Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Molecule Resource Type</em>'.
	 * @generated
	 */
	MoleculeResourceType createMoleculeResourceType();

	/**
	 * Returns a new object of class '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Type</em>'.
	 * @generated
	 */
	ParameterType createParameterType();

	/**
	 * Returns a new object of class '<em>Preprocessing Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preprocessing Step Type</em>'.
	 * @generated
	 */
	PreprocessingStepType createPreprocessingStepType();

	/**
	 * Returns a new object of class '<em>Preprocessing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preprocessing Type</em>'.
	 * @generated
	 */
	PreprocessingType createPreprocessingType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	QsarType createQsarType();

	/**
	 * Returns a new object of class '<em>Responses List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responses List Type</em>'.
	 * @generated
	 */
	ResponsesListType createResponsesListType();

	/**
	 * Returns a new object of class '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Type</em>'.
	 * @generated
	 */
	ResponseType createResponseType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QsarPackage getQsarPackage();

} //QsarFactory
