package com.compomics.ensh.core;

/**
 * This class is a
 */
public class ObjectXrefEntity {
    private int iObjectXrefId;

    public int getObjectXrefId() {
        return iObjectXrefId;
    }

    public void setObjectXrefId(int aObjectXrefId) {
        iObjectXrefId = aObjectXrefId;
    }

    private int iEnsemblId;

    public int getEnsemblId() {
        return iEnsemblId;
    }

    public void setEnsemblId(int aEnsemblId) {
        iEnsemblId = aEnsemblId;
    }

    private String iEnsemblObjectType;

    public String getEnsemblObjectType() {
        return iEnsemblObjectType;
    }

    public void setEnsemblObjectType(String aEnsemblObjectType) {
        iEnsemblObjectType = aEnsemblObjectType;
    }

    private int iXrefId;

    public int getXrefId() {
        return iXrefId;
    }

    public void setXrefId(int aXrefId) {
        iXrefId = aXrefId;
    }

    private String iLinkageAnnotation;

    public String getLinkageAnnotation() {
        return iLinkageAnnotation;
    }

    public void setLinkageAnnotation(String aLinkageAnnotation) {
        iLinkageAnnotation = aLinkageAnnotation;
    }

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectXrefEntity that = (ObjectXrefEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iEnsemblId != that.iEnsemblId) return false;
        if (iObjectXrefId != that.iObjectXrefId) return false;
        if (iXrefId != that.iXrefId) return false;
        if (iEnsemblObjectType != null ? !iEnsemblObjectType.equals(that.iEnsemblObjectType) : that.iEnsemblObjectType != null)
            return false;
        if (iLinkageAnnotation != null ? !iLinkageAnnotation.equals(that.iLinkageAnnotation) : that.iLinkageAnnotation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iObjectXrefId;
        lresult = 31 * lresult + iEnsemblId;
        lresult = 31 * lresult + (iEnsemblObjectType != null ? iEnsemblObjectType.hashCode() : 0);
        lresult = 31 * lresult + iXrefId;
        lresult = 31 * lresult + (iLinkageAnnotation != null ? iLinkageAnnotation.hashCode() : 0);
        lresult = 31 * lresult + (int) iAnalysisId;
        return lresult;
    }
}
