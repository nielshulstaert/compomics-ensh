package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.module.model.ModuleType;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 23-Nov-2007<br/>
 * Time: 18:18:38<br/>
 */
public class ModuleTypeImpl implements ModuleType {

    private int id;
    private String name;
    private String description;

    public ModuleTypeImpl() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ModuleType)) return false;

        ModuleType that = (ModuleType) o;

        if (description != null ? !description.equals(that.getDescription()) : that.getDescription() != null) return false;
        if (!name.equals(that.getName())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
