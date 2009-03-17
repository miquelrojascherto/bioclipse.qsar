package net.bioclipse.qsar.descriptor;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;

import net.bioclipse.core.domain.IMolecule;
import net.bioclipse.qsar.DescriptorType;

public interface IDescriptorCalculator {

    /**
     * Calculate a set of descriptors for each molecule.
     * 
     * @param moldesc Map from IMolecule to a list of Descriptortypes
     * @param monitor Progressmonitor. Set worked++ for each molecule/descriptor combo calculated
     * @return Map<IMolecule, IDescriptorResult> results for each molecule
     */
    public Map<? extends IMolecule, List<IDescriptorResult>> calculateDescriptor(
             Map<IMolecule, List<DescriptorType>> moldesc,
             IProgressMonitor monitor );
}
