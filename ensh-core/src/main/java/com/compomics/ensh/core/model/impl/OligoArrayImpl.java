package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.OligoArray;
import com.compomics.ensh.core.model.OligoProbe;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 16:41:03<br>
 */
public class OligoArrayImpl implements OligoArray {

    private int id;
    private OligoArray parentArray;
    private int probesetSize;
    private String name;
    private String type;
    private Set<OligoProbe> probes;


    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public OligoArray getParentArray() {
        return parentArray;
    }

    @Testable
    public void setParentArray(OligoArray parentArray) {
        this.parentArray = parentArray;
    }

    @Testable
    public int getProbesetSize() {
        return probesetSize;
    }

    @Testable
    public void setProbesetSize(int probesetSize) {
        this.probesetSize = probesetSize;
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
    public Set<OligoProbe> getProbes() {
        return probes;
    }

    @Testable
    public void setProbes(Set<OligoProbe> probes) {
        this.probes = probes;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OligoArrayImpl that = (OligoArrayImpl) o;

        if (probesetSize != that.probesetSize) return false;

        return true;
    }

    public int hashCode() {
        return probesetSize;
    }


    public String toString() {
        return name;
    }
}
