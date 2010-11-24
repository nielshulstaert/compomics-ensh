package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.RegulatoryFactor;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 09:54:21<br>
 */
public class RegulatoryFactorImpl implements RegulatoryFactor {

    private int id;
    private String name;
    private String type;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getName() {
        return name;
    }

    @Testable
    public void setName(String name) {
        this.name = name;
    }

    @Testable
    public String getType() {
        return type;
    }

    @Testable
    public void setType(String type) {
        this.type = type;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof RegulatoryFactor) return false;

        RegulatoryFactor that = (RegulatoryFactor) o;

        if (!name.equals(that.getName())) return false;
        if (type != null ? !type.equals(that.getType()) : that.getType() != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = name.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }


    public String toString() {
        return "RegulatoryFactor{" +
                "name='" + name + '\'' +
                '}';
    }
}
