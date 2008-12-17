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
 * A representation of the model object '<em><b>Descriptorimpl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bioclipse.qsar.DescriptorimplType#getId <em>Id</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorimplType#getName <em>Name</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorimplType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorimplType#getReference <em>Reference</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorimplType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link net.bioclipse.qsar.DescriptorimplType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bioclipse.qsar.QsarPackage#getDescriptorimplType()
 * @model extendedMetaData="name='descriptorimplType' kind='empty'"
 * @generated
 */
public interface DescriptorimplType extends EObject {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String copyright = "Copyright (c) 2007-2008 The Bioclipse Project and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nwww.eclipse.org\u00ef\u00bf\u03a9epl-v10.html <http://www.eclipse.org/legal/epl-v10.html>\n\nContributors:\n    Ola Spjuth - initial API and implementation\n";
        /**
         * Returns the value of the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Id</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Id</em>' attribute.
         * @see #setId(String)
         * @see net.bioclipse.qsar.QsarPackage#getDescriptorimplType_Id()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='id'"
         * @generated
         */
        String getId();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.DescriptorimplType#getId <em>Id</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Id</em>' attribute.
         * @see #getId()
         * @generated
         */
        void setId(String value);
        /**
         * Returns the value of the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Name</em>' attribute.
         * @see #setName(String)
         * @see net.bioclipse.qsar.QsarPackage#getDescriptorimplType_Name()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='name'"
         * @generated
         */
        String getName();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.DescriptorimplType#getName <em>Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Name</em>' attribute.
         * @see #getName()
         * @generated
         */
        void setName(String value);
        /**
         * Returns the value of the '<em><b>Namespace</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Namespace</em>' attribute.
         * @see #setNamespace(String)
         * @see net.bioclipse.qsar.QsarPackage#getDescriptorimplType_Namespace()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='namespace'"
         * @generated
         */
        String getNamespace();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.DescriptorimplType#getNamespace <em>Namespace</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Namespace</em>' attribute.
         * @see #getNamespace()
         * @generated
         */
        void setNamespace(String value);
        /**
         * Returns the value of the '<em><b>Reference</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Reference</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Reference</em>' attribute.
         * @see #setReference(String)
         * @see net.bioclipse.qsar.QsarPackage#getDescriptorimplType_Reference()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='reference'"
         * @generated
         */
        String getReference();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.DescriptorimplType#getReference <em>Reference</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Reference</em>' attribute.
         * @see #getReference()
         * @generated
         */
        void setReference(String value);
        /**
         * Returns the value of the '<em><b>Vendor</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Vendor</em>' attribute.
         * @see #setVendor(String)
         * @see net.bioclipse.qsar.QsarPackage#getDescriptorimplType_Vendor()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='vendor'"
         * @generated
         */
        String getVendor();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.DescriptorimplType#getVendor <em>Vendor</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Vendor</em>' attribute.
         * @see #getVendor()
         * @generated
         */
        void setVendor(String value);
        /**
         * Returns the value of the '<em><b>Version</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Version</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Version</em>' attribute.
         * @see #setVersion(String)
         * @see net.bioclipse.qsar.QsarPackage#getDescriptorimplType_Version()
         * @model dataType="org.eclipse.emf.ecore.xml.type.String"
         *        extendedMetaData="kind='attribute' name='version'"
         * @generated
         */
        String getVersion();
        /**
         * Sets the value of the '{@link net.bioclipse.qsar.DescriptorimplType#getVersion <em>Version</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Version</em>' attribute.
         * @see #getVersion()
         * @generated
         */
        void setVersion(String value);
} // DescriptorimplType
