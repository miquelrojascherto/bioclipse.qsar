/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.util;

import java.util.Map;

import net.sf.bibtexml.BibtexmlPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BibtexmlXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BibtexmlXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        BibtexmlPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the BibtexmlResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new BibtexmlResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new BibtexmlResourceFactoryImpl());
        }
        return registrations;
    }

} //BibtexmlXMLProcessor
