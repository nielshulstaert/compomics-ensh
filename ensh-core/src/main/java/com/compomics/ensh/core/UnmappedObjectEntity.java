package com.compomics.ensh.core;

/**
 * This class is a
 */
public class UnmappedObjectEntity {
    private int iUnmappedObjectId;

    public int getUnmappedObjectId() {
        return iUnmappedObjectId;
    }

    public void setUnmappedObjectId(int aUnmappedObjectId) {
        iUnmappedObjectId = aUnmappedObjectId;
    }

    private String iType;

    public String getType() {
        return iType;
    }

    public void setType(String aType) {
        iType = aType;
    }

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    private short iExternalDbId;

    public short getExternalDbId() {
        return iExternalDbId;
    }

    public void setExternalDbId(short aExternalDbId) {
        iExternalDbId = aExternalDbId;
    }

    private String iIdentifier;

    public String getIdentifier() {
        return iIdentifier;
    }

    public void setIdentifier(String aIdentifier) {
        iIdentifier = aIdentifier;
    }

    private short iUnmappedReasonId;

    public short getUnmappedReasonId() {
        return iUnmappedReasonId;
    }

    public void setUnmappedReasonId(short aUnmappedReasonId) {
        iUnmappedReasonId = aUnmappedReasonId;
    }

    private double iQueryScore;

    public double getQueryScore() {
        return iQueryScore;
    }

    public void setQueryScore(double aQueryScore) {
        iQueryScore = aQueryScore;
    }

    private double iTargetScore;

    public double getTargetScore() {
        return iTargetScore;
    }

    public void setTargetScore(double aTargetScore) {
        iTargetScore = aTargetScore;
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

    private String iParent;

    public String getParent() {
        return iParent;
    }

    public void setParent(String aParent) {
        iParent = aParent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnmappedObjectEntity that = (UnmappedObjectEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iEnsemblId != that.iEnsemblId) return false;
        if (iExternalDbId != that.iExternalDbId) return false;
        if (Double.compare(that.iQueryScore, iQueryScore) != 0) return false;
        if (Double.compare(that.iTargetScore, iTargetScore) != 0) return false;
        if (iUnmappedObjectId != that.iUnmappedObjectId) return false;
        if (iUnmappedReasonId != that.iUnmappedReasonId) return false;
        if (iEnsemblObjectType != null ? !iEnsemblObjectType.equals(that.iEnsemblObjectType) : that.iEnsemblObjectType != null)
            return false;
        if (iIdentifier != null ? !iIdentifier.equals(that.iIdentifier) : that.iIdentifier != null) return false;
        if (iParent != null ? !iParent.equals(that.iParent) : that.iParent != null) return false;
        if (iType != null ? !iType.equals(that.iType) : that.iType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult;
        long temp;
        lresult = iUnmappedObjectId;
        lresult = 31 * lresult + (iType != null ? iType.hashCode() : 0);
        lresult = 31 * lresult + (int) iAnalysisId;
        lresult = 31 * lresult + (int) iExternalDbId;
        lresult = 31 * lresult + (iIdentifier != null ? iIdentifier.hashCode() : 0);
        lresult = 31 * lresult + (int) iUnmappedReasonId;
        temp = iQueryScore != +0.0d ? Double.doubleToLongBits(iQueryScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        temp = iTargetScore != +0.0d ? Double.doubleToLongBits(iTargetScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        lresult = 31 * lresult + iEnsemblId;
        lresult = 31 * lresult + (iEnsemblObjectType != null ? iEnsemblObjectType.hashCode() : 0);
        lresult = 31 * lresult + (iParent != null ? iParent.hashCode() : 0);
        return lresult;
    }
}
