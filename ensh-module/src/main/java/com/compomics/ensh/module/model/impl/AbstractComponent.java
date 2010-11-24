package com.compomics.ensh.module.model.impl;

import test.Testable;
import com.compomics.ensh.module.model.Component;
import com.compomics.ensh.module.model.Module;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 20-Nov-2007<br/>
 * Time: 19:25:55<br/>
 */
public abstract class AbstractComponent<O> implements Component<O> {

    protected int id;
    protected O object;
    protected Set<Module> modules = new HashSet<Module>();

    protected AbstractComponent() {
    }

    protected AbstractComponent(O object) {
        this.object = object;
    }

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    public O getObject() {
        return object;
    }

    public void setObject(O object) {
        this.object = object;
    }

    /**
     * Returns the modules this component is part of.
     *
     * @return the modules
     */
    public Set<Module> getModules() {
        return modules;
    }

    /**
     * Sets the modules this component is part of.
     *
     * @param modules the modules
     */
    public void setModules(Set<Module> modules) {
        this.modules=modules;
    }

    /**
     * Adds a parent module.
     *
     * @param module the module
     * @return true if the module has changed through addition of the component
     */
    public boolean addToModule(Module module) {
        return this.modules.add(module);
    }


    /**
     * Removes the component from a module.
     *
     * @param module the parent module to be removed
     * @return true if the module has changed through removal of the component
     */
    public boolean removeFromModule(Module module) {
        return this.modules.remove(module);
    }

    /**
     * Removes the component from the specified modules.
     *
     * @param modules the modules
     * @return true if the modules have changed through removal of the component
     */
    public boolean removeFromModules(Set<Module> modules) {
        return this.modules.removeAll(modules);
    }

    /**
     * Removes the component from all modules.
     */
    public void removeFromAllModules() {
        this.modules.clear();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Component)) return false;

        Component that = (Component) o;

        if (!object.equals(that.getObject())) return false;

        return true;
    }

    public int hashCode() {
        return object.hashCode();
    }
}
