package net.bioclipse.qsar.test;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.DescriptorlistType;
import net.bioclipse.qsar.DocumentRoot;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.ResourceType;
import net.bioclipse.qsar.StructurelistType;
import net.bioclipse.qsar.util.QsarResourceFactoryImpl;
import net.sf.bibtexml.BibTeXMLEntriesClass;
import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.util.BibtexmlResourceFactoryImpl;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class TestRead {

    public static void main(String[] args) {

        System.out.println("start");

        // Register the package -- only needed for stand-alone!
        QsarPackage qsarPackage=QsarPackage.eINSTANCE;

        // Register the package -- only needed for stand-alone!
        BibtexmlPackage bibPackage=BibtexmlPackage.eINSTANCE;

        // Create a resource set to hold the resources.
        //
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory to handle all file extensions.
        //
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
        (Resource.Factory.Registry.DEFAULT_EXTENSION, 
         new QsarResourceFactoryImpl());

        // Register the package to ensure it is available during loading.
        //
        resourceSet.getPackageRegistry().put
        (QsarPackage.eNS_URI, 
         QsarPackage.eINSTANCE);

        // Register the package to ensure it is available during loading.
        //
        resourceSet.getPackageRegistry().put
        (BibtexmlPackage.eNS_URI, 
         BibtexmlPackage.eINSTANCE);

        EcoreUtil.resolveAll( resourceSet );

        // Get the URI of the model file.
        URI fileURI = URI.createFileURI(new File("myQSAR2.xml").getAbsolutePath());

        // Demand load the resource for this file.
        Resource resource=null;
        try{
            resource = resourceSet.getResource(fileURI, true);
        }catch (Exception e){
            e.printStackTrace();
        }

        DocumentRoot root=(DocumentRoot) resource.getContents().get(0);

        QsarType qsar=root.getQsar();

        System.out.println(fileURI);

        System.out.println("read all success");

        // Print the contents of the resource to System.out.
        try
        {
            resource.save(System.out, Collections.EMPTY_MAP);
        }
        catch (IOException e) {}


        //Molecules
        //=========
        if (qsar.getStructurelist()==null){
            System.out.println("No moleculesList.");
            return;
        }

        StructurelistType structlist = qsar.getStructurelist();

        if (structlist.getResources()==null || structlist.getResources().size()<=0){
            System.out.println("No structures in StructureList.");
            return;
        }

        for (ResourceType mol : structlist.getResources()){
            System.out.println(" ++ Mol: " + mol.getId() + " [" + mol.getFile()+"]");
        }




        //Descriptors
        //===========
        if (qsar.getDescriptorlist()==null){
            System.out.println("No descriptorList.");
            return;
        }

        DescriptorlistType desclist = qsar.getDescriptorlist();

        if (desclist.getDescriptors()==null || desclist.getDescriptors().size()<=0){
            System.out.println("No descriptors in descriptorList.");
            return;
        }

        for (DescriptorType desc : desclist.getDescriptors()){
            String impl = desc.getProvider();
            System.out.println(" ** desc: " + desc.getId() + " [" + impl + "]");
        }

        //Metadata
        //===========
        System.out.println(" ## Metadata. DS name: " + qsar.getMetadata().getDatasetname() + " - Authors: " + qsar.getMetadata().getAuthors());
        for (BibTeXMLEntriesClass ref : qsar.getMetadata().getReference()){
            System.out.println("  == ref: " + ref.getArticle().getAuthor() + " - " + ref.getArticle().getTitle());
        }


        // Validate the contents of the loaded resource.
        //
        for (EObject eObject : resource.getContents()) {
            Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
            if (diagnostic.getSeverity() != Diagnostic.OK) {
                printDiagnostic(diagnostic, "");
            }
        }
    }


    protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
        System.out.print(indent);
        System.out.println(diagnostic.getMessage());
        for (Diagnostic child : diagnostic.getChildren()) {
            printDiagnostic(child, indent + "  ");
        }
    }
}
