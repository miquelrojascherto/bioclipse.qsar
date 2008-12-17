package net.bioclipse.qsar.ui.util;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import net.bioclipse.qsar.DescriptorlistType;
import net.bioclipse.qsar.DocumentRoot;
import net.bioclipse.qsar.MoleculelistType;
import net.bioclipse.qsar.QsarFactory;
import net.bioclipse.qsar.QsarPackage;
import net.bioclipse.qsar.QsarType;
import net.bioclipse.qsar.util.QsarAdapterFactory;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
public class QsarXMLUtils {
        public static byte[] getEmptyContent(){
                //Create empty model
                QsarAdapterFactory factory=new QsarAdapterFactory();
                EditingDomain editingDomain=new AdapterFactoryEditingDomain(factory, new BasicCommandStack());
                //Create the super types
                DocumentRoot root=QsarFactory.eINSTANCE.createDocumentRoot();
                //Collect commands here
                CompoundCommand cCmd = new CompoundCommand();
                Command cmd;
                //Create editor type to hold everything else
                QsarType qsar=QsarFactory.eINSTANCE.createQsarType();
                //		//could not get SetCommand to work for root element, add directly 
                root.setQsar(qsar);
                MoleculelistType mollist=QsarFactory.eINSTANCE.createMoleculelistType();
                cmd=SetCommand.create(editingDomain, qsar, QsarPackage.Literals.QSAR_TYPE__MOLECULELIST, mollist);
                cCmd.append(cmd);
                DescriptorlistType desclist=QsarFactory.eINSTANCE.createDescriptorlistType();
                cmd=SetCommand.create(editingDomain, qsar, QsarPackage.Literals.QSAR_TYPE__DESCRIPTORLIST, desclist);
                cCmd.append(cmd);
                //Execute the CompoundCommand
                editingDomain.getCommandStack().execute(cCmd); 		
                //Serialize to byte[]
                ResourceSet resourceSet=new ResourceSetImpl();
                try {
                        URI fileURI = URI.createFileURI(new File("myQSAR.xml").getAbsolutePath());
                        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
                        Resource resource=resourceSet.createResource(fileURI);
                        resource.getContents().add(root);
                        //Serialize to byte[] and print to sysout
                        ByteArrayOutputStream os=new ByteArrayOutputStream();
                        resource.save(os, Collections.EMPTY_MAP);
                        return os.toByteArray();
                } catch (IOException e) {
                        e.printStackTrace();
                }
                return null;
        }
}
