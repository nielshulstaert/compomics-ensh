package com.compomics.ensh.core.model.impl;

import java.io.Serializable;

import com.compomics.ensh.core.model.OligoArray;
import com.compomics.ensh.core.model.OligoProbe;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 16:38:59<br>
 */
public class OligoProbeImpl implements Serializable, OligoProbe {

    private int probeId;
    private int arrayId;
    private OligoArray array;
    private String probesetId;
    private String name;
    private String description;
    private String length;
//    private List<OligoProbeFeatureImpl> alignments;

    @Testable
    public int getProbeId() {
        return probeId;
    }

    @Testable
    public void setProbeId(int probeId) {
        this.probeId = probeId;
    }

    @Testable
    public int getArrayId() {
        return arrayId;
    }

    @Testable
    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
    }

    @Testable
    public OligoArray getArray() {
        return array;
    }

    @Testable
    public void setArray(OligoArray array) {
        this.array = array;
    }

    @Testable
    public String getProbesetId() {
        return probesetId;
    }

    @Testable
    public void setProbesetId(String probesetId) {
        this.probesetId = probesetId;
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
    public String getLength() {
        return length;
    }

    @Testable
    public void setLength(String length) {
        this.length = length;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof OligoProbe)) return false;

        OligoProbe that = (OligoProbe) o;

        if (probeId != that.getProbeId()) return false;
        if (!array.equals(that.getArray())) return false;
        if (!probesetId.equals(that.getProbesetId())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = probeId;
        result = 31 * result + array.hashCode();
        result = 31 * result + probesetId.hashCode();
        return result;
    }

//    public List<OligoProbeFeatureImpl> getAlignments() {
//        if(alignments == null){
//            Session s = HibernateUtil.getSessionFactory().getCurrentSession();
//            Query q = s.createQuery("from OligoProbeFeatureImpl where oligoProbeId = " + this.getProbeId());
//            alignments = q.list();
//        }
//
//        return alignments;
//    }
//
//    public void setAlignments(List<OligoProbeFeatureImpl> alignments) {
//        this.alignments = alignments;
//    }


    public String toString() {
        return array.getName() + ": " + probesetId + " (" + name + ")";
    }
}
