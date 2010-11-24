package com.compomics.ensh.module.model;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 20-Nov-2007<br/>
 * Time: 19:17:17<br/>
 *
 * Represents an object that is part of a module
 */
public interface Component<O> {

    /**
     * Returns the object that is represented by this component.
     *
     * @return the object
     */
    O getObject();

    /**
     * Sets the object that is presented by this component.
     *
     * @param object the object
     */
    void setObject(O object);

    /**
     * Returns the modules this component is part of.
     *
     * @return the modules
     */
    Set<Module> getModules();

    /**
     * Sets the modules this component is part of.
     *
     * @param modules the modules
     */
    void setModules(Set<Module> modules);

    /**
     * Adds the component to a module.
     *
     * @param module the module
     * @return true if the module has changed through addition of the component
     */
    boolean addToModule(Module module);

    /**
     * Removes the component from a module.
     *
     * @param module the parent module to be removed
     * @return true if the module has changed through removal of the component
     */
    boolean removeFromModule(Module module);

    /**
     * Removes the component from the specified modules.
     *
     * @param modules the modules
     * @return true if the modules have changed through removal of the component
     */
    boolean removeFromModules(Set<Module> modules);

    /**
     * Removes the component from all modules.
     */
    void removeFromAllModules();



}
