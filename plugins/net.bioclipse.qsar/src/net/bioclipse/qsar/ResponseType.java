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
import org.eclipse.emf.ecore.EObject;
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getArrayValues <em>Array Values</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getMoleculeResource <em>Molecule Resource</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getResourceIndex <em>Resource Index</em>}</li>
 *   <li>{@link net.bioclipse.qsar.ResponseType#getStructureID <em>Structure ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getResponseType()
 * @model extendedMetaData="name='responseType' kind='elementOnly'"
 * @generated
 */
public interface ResponseType extends EObject {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #isSetValue()
         * @see #unsetValue()
         * @see #setValue(float)
         * @see net.bioclipse.qsar.QsarPackage#getResponseType_Value()
         * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
         *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
         * @generated
         */
        float getValue();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #isSetValue()
         * @see #unsetValue()
         * @see #getValue()
         * @generated
         */
        void setValue(float value);
        /**
         * Unsets the value of the '{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetValue()
         * @see #getValue()
         * @see #setValue(float)
         * @generated
         */
        void unsetValue();
        /**
         * Returns whether the value of the '{@link net.bioclipse.qsar.ResponseType#getValue <em>Value</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Value</em>' attribute is set.
         * @see #unsetValue()
         * @see #getValue()
         * @see #setValue(float)
         * @generated
         */
        boolean isSetValue();
        /**
         * Returns the value of the '<em><b>Array Values</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Array Values</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Array Values</em>' attribute.
         * @see #setArrayValues(String)
         * @see net.bioclipse.qsar.QsarPackage#getResponseType_ArrayValues()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='element' name='arrayValues' namespace='##targetNamespace'"
         * @generated
         */
        String getArrayValues();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getArrayValues <em>Array Values</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Array Values</em>' attribute.
         * @see #getArrayValues()
         * @generated
         */
        void setArrayValues(String value);
        /**
         * Returns the value of the '<em><b>Molecule Resource</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Molecule Resource</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Molecule Resource</em>' attribute.
         * @see #setMoleculeResource(String)
         * @see net.bioclipse.qsar.QsarPackage#getResponseType_MoleculeResource()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
         *        extendedMetaData="kind='attribute' name='moleculeResource'"
         * @generated
         */
        String getMoleculeResource();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getMoleculeResource <em>Molecule Resource</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Molecule Resource</em>' attribute.
         * @see #getMoleculeResource()
         * @generated
         */
        void setMoleculeResource(String value);
        /**
         * Returns the value of the '<em><b>Resource Index</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Resource Index</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Resource Index</em>' attribute.
         * @see #isSetResourceIndex()
         * @see #unsetResourceIndex()
         * @see #setResourceIndex(int)
         * @see net.bioclipse.qsar.QsarPackage#getResponseType_ResourceIndex()
         * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
         *        extendedMetaData="kind='attribute' name='resourceIndex'"
         * @generated
         */
        int getResourceIndex();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getResourceIndex <em>Resource Index</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Resource Index</em>' attribute.
         * @see #isSetResourceIndex()
         * @see #unsetResourceIndex()
         * @see #getResourceIndex()
         * @generated
         */
        void setResourceIndex(int value);
        /**
         * Unsets the value of the '{@link net.bioclipse.qsar.ResponseType#getResourceIndex <em>Resource Index</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isSetResourceIndex()
         * @see #getResourceIndex()
         * @see #setResourceIndex(int)
         * @generated
         */
        void unsetResourceIndex();
        /**
         * Returns whether the value of the '{@link net.bioclipse.qsar.ResponseType#getResourceIndex <em>Resource Index</em>}' attribute is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Resource Index</em>' attribute is set.
         * @see #unsetResourceIndex()
         * @see #getResourceIndex()
         * @see #setResourceIndex(int)
         * @generated
         */
        boolean isSetResourceIndex();
        /**
         * Returns the value of the '<em><b>Structure ID</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Structure ID</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Structure ID</em>' attribute.
         * @see #setStructureID(String)
         * @see net.bioclipse.qsar.QsarPackage#getResponseType_StructureID()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String" transient="true"
         *        extendedMetaData="kind='attribute' name='structureID'"
         * @generated
         */
        String getStructureID();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.ResponseType#getStructureID <em>Structure ID</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Structure ID</em>' attribute.
         * @see #getStructureID()
         * @generated
         */
        void setStructureID(String value);
} // ResponseType
