package net.bioclipse.qsar.descriptor;

import java.util.List;
import java.util.Map;

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.descriptor.model.DescriptorInstance;
import net.bioclipse.qsar.descriptor.model.DescriptorParameter;

public interface IDescriptorCalculator {

	/**
	 * Calculates descriptors for a List of molecules.
	 * @param molecules the Imolecules as input
	 * @param descriptorInstancesForProvider the id's of the descriptors we should calculate and 
	 * a List of parameters for this descriptor calculation
	 * @return Map<IMolecule, IDescriptorResult> results for each molecule
	 */
	public Map<IMolecule, List<IDescriptorResult>> calculateDescriptor(
			             List<IMolecule> molecules, List<DescriptorInstance> descriptorInstancesForProvider);

}
