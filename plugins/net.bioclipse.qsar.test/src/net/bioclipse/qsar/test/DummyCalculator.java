package net.bioclipse.qsar.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.descriptor.DescriptorResult;
import net.bioclipse.qsar.descriptor.IDescriptorCalculator;
import net.bioclipse.qsar.descriptor.IDescriptorResult;
import net.bioclipse.qsar.descriptor.model.DescriptorInstance;
import net.bioclipse.qsar.descriptor.model.DescriptorParameter;

public class DummyCalculator implements IDescriptorCalculator {

	private ArrayList<String> supported;

	/**
	 * For each molecule and descriptor, return an array of values
	 */
	public Map<IMolecule, List<IDescriptorResult>> calculateDescriptor(
			List<IMolecule> molecules, 
			List<DescriptorInstance> descriptorInstances){

		Map<IMolecule, List<IDescriptorResult>> allResults = 
			                  new HashMap<IMolecule, List<IDescriptorResult>>();
		
		//Loop over all molecules
		for (IMolecule mol : molecules){

			List<IDescriptorResult> molresults=new ArrayList<IDescriptorResult>();
			
			//Loop over all descriptors
			for (DescriptorInstance inst : descriptorInstances){
				String descriptorImplID=inst.getDescriptorImpl().getId();
				
				//Dummy result
				DescriptorResult res=new DescriptorResult();

				//If descriptor is supported, add content
				if (getSupportedDescriptorIDs().contains(descriptorImplID)){

					if (descriptorImplID.equals("net.bioclipse.qsar.test.descriptor3D")){
						//Return error result, fake a calculation has gone wrong
						res.setErrorMessage("Failed to calculate descriptor " +
								"'" + descriptorImplID + 
						"'. Molecule has no 3D coordinates.");
					}

					else if (descriptorImplID.equals("net.bioclipse.qsar.test.descriptorERROR")){
						//Return error result, fake a calculation has gone wrong
						res.setErrorMessage("Failed to calculate descriptor " +
								"'" + descriptorImplID + 
						"'. Reason: Unknown");
					}
					else{
						//Return correct result
						res.setDescriptorId(descriptorImplID);
						Float[] returnvalue=new Float[]{new Float(15.2456), new Float(47.01), new Float(-6.44)};
						res.setValues(returnvalue);
						String[] labels=new String[]{"label1","label2","label3"};
						res.setLabels(labels);
						
					}
				}

				//If this descriptor is not supported, add error msg
				//This should not happen
				else{
					res.setErrorMessage("DescriptorID '" + descriptorImplID + 
							"' is not supported by DummyProvider.");
				}

				//Add to results for this molecule
				molresults.add(res);

			}

			//Put this molecules result in map to return
			allResults.put(mol, molresults);
			
		}
		
		return allResults;
	}
	
	private List<String> getSupportedDescriptorIDs(){

		if (supported==null){
			supported=new ArrayList<String>();
			supported.add("net.bioclipse.qsar.test.descriptor1");
			supported.add("net.bioclipse.qsar.test.descriptor2");
			supported.add("net.bioclipse.qsar.test.descriptor3");
			supported.add("net.bioclipse.qsar.test.descriptorERROR");
			supported.add("net.bioclipse.qsar.test.descriptor3D");
		}
		return supported;
	}


}
