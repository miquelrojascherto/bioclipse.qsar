package net.bioclipse.qsar.test;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import net.bioclipse.qsar.DescriptorType;
import net.bioclipse.qsar.DescriptorlistType;
import net.bioclipse.qsar.DescriptorproviderType;
import net.bioclipse.qsar.DocumentRoot;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.ResourceType;
import net.bioclipse.qsar.StructurelistType;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class TestRead {

	public static void main(String[] args) {

		   // Create a resource set.
		   ResourceSet resourceSet = new ResourceSetImpl();

		  // Register the default resource factory -- only needed for stand-alone!
		  resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		  // Register the package -- only needed for stand-alone!
		  QsarPackage qsarPackage=QsarPackage.eINSTANCE;

		   // Get the URI of the model file.
		   URI fileURI = URI.createFileURI(new File("myQSAR2.xml").getAbsolutePath());

		   // Demand load the resource for this file.
		   Resource resource = resourceSet.getResource(fileURI, true);

		   DocumentRoot root=(DocumentRoot) resource.getContents().get(0);

		   QsarType qsar=root.getQsar();
		   
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
		
	}
}
