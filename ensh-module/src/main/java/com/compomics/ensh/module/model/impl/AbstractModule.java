package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.core.StableIdEventEntity;
import com.compomics.ensh.module.model.Component;
import com.compomics.ensh.module.model.Module;
import com.compomics.ensh.module.model.ModuleSource;
import com.compomics.ensh.module.model.ModuleType;
import test.Testable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 20-Nov-2007<br/>
 * Time: 19:20:37<br/>
 */
public abstract class AbstractModule implements Module {

    protected int id;
    protected String identifier;
    protected StableIdEventEntity stableID;
    protected int version;
    protected String name;
    protected String description;
    protected ModuleType moduleType;
    protected ModuleSource moduleSource;
    protected Set<Component> components = new HashSet<Component>();

    protected AbstractModule() {
    }

    public AbstractModule(String identifier, int version) {
        this.identifier = identifier;
        this.version = version;
    }

    public AbstractModule(String identifier, int version, Set<Component> components) {
        this.identifier = identifier;
        this.version = version;
        this.components = components;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public StableIdEventEntity getStableId() {
        return stableID;
    }

    public void setStableId(StableIdEventEntity stableID) {
        this.stableID = stableID;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Testable
    public Set<Component> getComponents() {
        return components;
    }

    @Testable
    public void setComponents(Set<Component> components) {
        this.components=components;
    }

    public ModuleType getModuleType() {
        return moduleType;
    }

    public void setModuleType(ModuleType moduleType) {
        this.moduleType = moduleType;
    }

    public ModuleSource getModuleSource() {
        return moduleSource;
    }

    public void setModuleSource(ModuleSource moduleSource) {
        this.moduleSource = moduleSource;
    }

    @Testable
    public boolean addComponent(Component component) {
        return components.add(component);
    }

    public boolean addComponents(Set<Component> components) {
        return components.addAll(components);
    }

    @Testable
    public boolean removeCompenent(Component component) {
        return components.remove(component);
    }

    @Testable
    public void removeAllComponents(){
        components.clear();
    }

    /**
     * If they don't have an identifier and version two modules are equal if they
     * have the some components.
     *
     * @param o the object to compare
     * @return true if the modules are equal
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractModule)) return false;

        Module that = (Module) o;

        if (version != that.getVersion()) return false;
        if (!components.equals(that.getComponents())) return false;
        if (identifier != null ? !identifier.equals(that.getIdentifier()) : that.getIdentifier() != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + components.hashCode();
        return result;
    }
}
