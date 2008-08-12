/*******************************************************************************
 *Copyright (c) 2008 The Bioclipse Team and others.
 *All rights reserved. This program and the accompanying materials
 *are made available under the terms of the Eclipse Public License v1.0
 *which accompanies this distribution, and is available at
 *http://www.eclipse.org/legal/epl-v10.html
 *
 *Contributors:
 *    Ola Spjuth - initial API and implementation
 *******************************************************************************/
package net.bioclipse.qsar.ui.editors.old;
import java.util.ArrayList;

/**
 * @author dejan
 * 
 * To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
public class SimpleModel {
    private ArrayList modelListeners;
    private ArrayList objects;
    public SimpleModel() {
        modelListeners = new ArrayList();
        initialize();
    }
    public void addModelListener(IModelListener listener) {
        if (!modelListeners.contains(listener))
            modelListeners.add(listener);
    }
    public void removeModelListener(IModelListener listener) {
        modelListeners.remove(listener);
    }
    public void fireModelChanged(Object[] objects, String type, String property) {
        for (int i = 0; i < modelListeners.size(); i++) {
            ((IModelListener) modelListeners.get(i)).modelChanged(objects,
                    type, property);
        }
    }
    public Object[] getContents() {
        return objects.toArray();
    }
    private void initialize() {
        objects = new ArrayList();
        NamedObject[] objects = {
                new TypeOne("SimpleModel.t1_i1", 2, true, "SimpleModel.text1"),
                new TypeOne("SimpleModel.t1_i2", 1, false, "SimpleModel.text2"),
                new TypeOne("SimpleModel.t1_i3", 3, true, "SimpleModel.text3"),
                new TypeOne("SimpleModel.t1_i4", 0, false, "SimpleModel.text4"),
                new TypeOne("SimpleModel.t1_i5", 1, true, "SimpleModel.text5"),
                new TypeTwo("SimpleModel.t2_i1", false, true),
                new TypeTwo("SimpleModel.t2_i2", true, false)};
        add(objects, false);
    }
    public void add(NamedObject[] objs, boolean notify) {
        for (int i = 0; i < objs.length; i++) {
            objects.add(objs[i]);
            objs[i].setModel(this);
        }
        if (notify)
            fireModelChanged(objs, IModelListener.ADDED, "");
    }
    public void remove(NamedObject[] objs, boolean notify) {
        for (int i = 0; i < objs.length; i++) {
            objects.remove(objs[i]);
            objs[i].setModel(null);
        }
        if (notify)
            fireModelChanged(objs, IModelListener.REMOVED, ""); //$NON-NLS-1$
    }
}