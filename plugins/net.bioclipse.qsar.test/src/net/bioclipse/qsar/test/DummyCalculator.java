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

	public Map<IMolecule, IDescriptorResult> calculateDescriptor(
			List<IMolecule> molecules, List<String> descriptorIDs) {

		//Return a dummy result
		DescriptorResult res=new DescriptorResult();
		res.setDescriptorIds(descriptorIDs);
		List<Float> retValues=new ArrayList<Float>();
		float startfloat=100;
		for (int i=0; i<descriptorIDs.size();i++){
			retValues.add(new Float(startfloat+i));
		}
		res.setDescriptorIds(descriptorIDs);
		res.setValues(retValues);

		//Dummy result
		Map<IMolecule, IDescriptorResult> retmap=
									new HashMap<IMolecule, IDescriptorResult>();
		for (int i=0; i<molecules.size();i++){
			retmap.put(molecules.get(i), res);
		}
		
		return retmap;
	}


}
