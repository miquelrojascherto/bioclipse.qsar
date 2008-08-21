package net.bioclipse.qsar.descriptor;

import java.util.List;
import java.util.Map;

import net.bioclipse.core.domain.IMolecule;

public interface IDescriptorCalculator {

	/**
	 * Calculates descriptors for a List of molecules.
	 * @param molecules the Imolecules as input
	 * @param descriptorIDs the id's of the descriptors we should calculate
	 * @return Map<IMolecule, IDescriptorResult> results for each molecule
	 */
	public Map<IMolecule, List<IDescriptorResult>> calculateDescriptor(
			             List<IMolecule> molecules, List<String> descriptorIDs);

}
