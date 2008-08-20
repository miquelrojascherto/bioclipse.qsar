package net.bioclipse.qsar.test.business;

import static org.junit.Assert.*;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.core.domain.SmilesMolecule;
import net.bioclipse.qsar.business.IQsarManager;
import net.bioclipse.qsar.business.QsarManager;
import net.bioclipse.qsar.descriptor.IDescriptorResult;
import net.bioclipse.qsar.descriptor.model.Descriptor;
import net.bioclipse.qsar.descriptor.model.DescriptorCategory;
import net.bioclipse.qsar.descriptor.model.DescriptorProvider;

import org.junit.Test;

public class TestQsarManager {

	IQsarManager qsar;
	
	public TestQsarManager() {
		
		//Unnecessary to use OSGI.
		qsar=new QsarManager();
	}
	
	

	@Test
	public void testGetCategories(){

		//Get category IDs
		List<String> lst = qsar.getCategories();
		assertNotNull(lst);
		assertTrue(lst.size()>=2);

		System.out.println("=======================");
		System.out.println("Category IDs:");
		for (String str : lst){
			System.out.println("  - " + str);
		}
		System.out.println("=======================");

		//Get category classes
		List<DescriptorCategory> lstFull = qsar.getFullCategories();
		assertNotNull(lstFull);
		
		//Should have same size as IDs
		assertTrue(lstFull.size()==(lst.size()));

	}

	@Test
	public void testGetProviders(){

		//Get provider IDs
		List<String> lst = qsar.getProviders();
		assertNotNull(lst);
		assertTrue(lst.size()>=2);

		System.out.println("=======================");
		System.out.println("Provider IDs:");
		for (String str : lst){
			System.out.println("  - " + str);
		}
		System.out.println("=======================");

		//Get provider classes
		List<DescriptorProvider> lstFull = qsar.getFullProviders();
		assertNotNull(lstFull);
		
		//Should have same size as IDs
		assertTrue(lstFull.size()==(lst.size()));

	}

	@Test
	public void testGetDescriptors(){

		//Matches plugin.xml
		String providerID="net.bioclipse.qsar.test.descriptorProvider1";
		String providerID2="net.bioclipse.qsar.test.descriptorProvider2";
		String cat1id="net.bioclipse.qsar.test.category1";
		String cat2id="net.bioclipse.qsar.test.category2";
		
		String descriptorID="net.bioclipse.qsar.test.descriptor3";

		assertEquals(2, qsar.getDescriptors(providerID).size());
		assertEquals(2, qsar.getDescriptors(providerID2).size());
		
		assertEquals(1, qsar.getDescriptors(providerID, cat1id).size());
		assertEquals(1, qsar.getDescriptors(providerID2, cat1id).size());
		assertEquals(1, qsar.getDescriptors(providerID, cat2id).size());
		assertEquals(1, qsar.getDescriptors(providerID2, cat2id).size());

		assertTrue(qsar.existsDescriptor(descriptorID));
		
		//Get decriptor by hardcoded id
		Descriptor desc=qsar.getDescriptor(descriptorID);
		assertNotNull(desc);
		assertEquals("category1", desc.getCategory().getName());
		assertEquals("descriptorProvider2", desc.getProvider().getName());
		
	}
	
	
	
	
	
	@Test
	public void testCalculateSingleMolSingleDescriptor(){

		IMolecule mol=new SmilesMolecule("C1CCCCC1CC(CC)CC");
		String descriptorID="net.bioclipse.qsar.test.descriptor3";
		
		IDescriptorResult res = qsar.calculate(mol, descriptorID);
		assertNotNull(res);
		
		assertEquals(1, res.getDescriptorIds().size());
		assertEquals(1, res.getValues().size());

		//Dummycalculator returns 100 as first result
		assertEquals(100, res.getValues().get(0));
		
	}

	@Test
	public void testCalculateMultipleMolMultipleDescriptor(){
		
		IMolecule mol1=new SmilesMolecule("C1CCCCC1CC(CC)CC");
		IMolecule mol2=new SmilesMolecule("C1CCCCC1CC(CC)CCCCCO");
		String descriptorID="net.bioclipse.qsar.test.descriptor3";
		String descriptorID2="net.bioclipse.qsar.test.descriptor2";
		
		List<IMolecule> mols=new ArrayList<IMolecule>();
		List<String> descs=new ArrayList<String>();
		
		mols.add(mol1);
		mols.add(mol2);
		descs.add(descriptorID);
		descs.add(descriptorID2);
		
		Map<IMolecule, List<IDescriptorResult>> res = qsar.calculate(mols, descs);
		assertNotNull(res);
		
		List<IDescriptorResult> res1=res.get(mol1);
		List<IDescriptorResult> res2=res.get(mol2);

		assertEquals(2, res1.size());
		assertEquals(2, res2.size());

		IDescriptorResult dres1=res1.get(0);
		IDescriptorResult dres11=res1.get(1);
		IDescriptorResult dres2=res2.get(0);
		IDescriptorResult dres22=res2.get(1);
		
		assertEquals(1, dres1.getDescriptorIds().size());
		assertEquals(1, dres1.getValues().size());
		assertEquals(100, dres1.getValues().get(0));
		assertEquals(1, dres11.getDescriptorIds().size());
		assertEquals(1, dres11.getValues().size());
		assertEquals(100, dres11.getValues().get(0));

		assertEquals(1, dres2.getDescriptorIds().size());
		assertEquals(1, dres2.getValues().size());
		assertEquals(100, dres2.getValues().get(0));
		assertEquals(1, dres22.getDescriptorIds().size());
		assertEquals(1, dres22.getValues().size());
		assertEquals(100, dres22.getValues().get(0));

	}

}
