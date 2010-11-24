package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.AttributeType;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 27-Sep-2007<br>
 * Time: 17:58:21<br>
 */
public class AttributeTypeImpl implements AttributeType {

    private int id;
    private String code;
    private String name;
    private String description;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getCode() {
        return code;
    }

    @Testable
    public void setCode(String code) {
        this.code = code;
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
    public String getDescription() {
        return description;
    }

    @Testable
    public void setDescription(String description) {
        this.description = description;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof AttributeType)) return false;

        AttributeType that = (AttributeType) o;

        if (!code.equals(that.getCode())) return false;
        if (name != null ? !name.equals(that.getName()) : that.getName() != null) return false;

        return true;
    }
    
    @Testable
    public int hashCode() {
        int result;
        result = code.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String toString() {
        return name;
    }
}
