package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.EnsemblObject;
import com.compomics.ensh.core.model.ObjectXref;
import com.compomics.ensh.core.model.Xref;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 10:17:57<br>
 */
public class ObjectXrefImpl implements ObjectXref {

    private int id;
    private Xref xref;
    private EnsemblObject ensemblObject;
    private String linkageAnnotation;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public Xref getXref() {
        return xref;
    }

    @Testable
    public void setXref(Xref xref) {
        this.xref = xref;
    }

    @Testable
    public String getLinkageAnnotation() {
        return linkageAnnotation;
    }

    @Testable
    public void setLinkageAnnotation(String linkageAnnotation) {
        this.linkageAnnotation = linkageAnnotation;
    }

    @Testable
    public EnsemblObject getEnsemblObject() {
        return ensemblObject;
    }

    @Testable
    public void setEnsemblObject(EnsemblObject ensemblObject) {
        this.ensemblObject = ensemblObject;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectXrefImpl that = (ObjectXrefImpl) o;

        if (!ensemblObject.equals(that.ensemblObject)) return false;
        if (linkageAnnotation != null ? !linkageAnnotation.equals(that.linkageAnnotation) : that.linkageAnnotation != null)
            return false;
        if (!xref.equals(that.xref)) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = xref.hashCode();
        result = 31 * result + ensemblObject.hashCode();
        result = 31 * result + (linkageAnnotation != null ? linkageAnnotation.hashCode() : 0);
        return result;
    }
}
