package net.bioclipse.qsar.descriptor;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.DescriptorType;

public interface IDescriptorCalculator {

	/**
	 * Calculates descriptors for a List of molecules.
	 * @param molecules the Imolecules as input
	 * @param descriptorsForProvider descriptors with parameters and impl
	 * @param monitor Progressmonitor. Set worked++ for each molecule/descriptor
	 * done (max size must be set to mols x descs before this is called)
	 * @return Map<IMolecule, IDescriptorResult> results for each molecule
	 */
	public Map<? extends IMolecule, List<IDescriptorResult>> calculateDescriptor(
			             List<? extends IMolecule> molecules, 
			             List<DescriptorType> descriptorsForProvider, 
			             IProgressMonitor monitor);
}
