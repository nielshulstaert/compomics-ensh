package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.GOAnnotation;
import com.compomics.ensh.core.model.Xref;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 27-Sep-2007<br>
 * Time: 18:19:05<br>
 */
public class GOAnnotationImpl extends ObjectXrefImpl implements GOAnnotation {

    private String evidenceCode;
    private Xref source;

    @Testable
    public String getEvidenceCode() {
        return evidenceCode;
    }

    @Testable
    public void setEvidenceCode(String evidenceCode) {
        this.evidenceCode = evidenceCode;
    }

    @Testable
    public Xref getSource() {
        return source;
    }

    @Testable
    public void setSource(Xref source) {
        this.source = source;
    }
       
    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof GOAnnotation)) return false;
        if (!super.equals(o)) return false;

        GOAnnotation that = (GOAnnotation) o;

        if (!evidenceCode.equals(that.getEvidenceCode())) return false;
        if (source != null ? !source.equals(that.getSource()) : that.getSource() != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = evidenceCode.hashCode();
        result = 31 * result + (source != null ? source.hashCode() : 0);
        return result;
    }
}
