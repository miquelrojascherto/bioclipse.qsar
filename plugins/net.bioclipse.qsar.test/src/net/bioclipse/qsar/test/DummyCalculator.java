package net.bioclipse.qsar.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.descriptor.DescriptorResult;
import net.bioclipse.qsar.descriptor.IDescriptorCalculator;
import net.bioclipse.qsar.descriptor.IDescriptorResult;

public class DummyCalculator implements IDescriptorCalculator {

	/**
	 * For each molecule and descriptor, return an array of values
	 */
	public Map<IMolecule, List<IDescriptorResult>> calculateDescriptor(
			List<IMolecule> molecules, List<String> descriptorIDs) {

		Map<IMolecule, List<IDescriptorResult>> allResults = 
			                  new HashMap<IMolecule, List<IDescriptorResult>>();
		
		//Loop over all molecules
		for (IMolecule mol : molecules){

			List<IDescriptorResult> molresults=new ArrayList<IDescriptorResult>();
			
			//Loop over all descriptors
			for (String descriptorID : descriptorIDs){

				//Dummy result
				DescriptorResult res=new DescriptorResult();
				res.setDescriptorId(descriptorID);
				Float[] returnvalue=new Float[]{new Float(15.2456), new Float(47.01), new Float(-6.44)};
				res.setValues(returnvalue);
				String[] labels=new String[]{"label1","label2","label3"};
				res.setLabels(labels);

				//Add to results for this molecule
				molresults.add(res);
			}

			//Put this molecules result in map to return
			allResults.put(mol, molresults);
			
		}
		
		return allResults;
	}


}
