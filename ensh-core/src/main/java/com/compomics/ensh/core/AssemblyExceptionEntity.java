package com.compomics.ensh.core;

/**
 * This class is a
 */
public class AssemblyExceptionEntity {
    private int iAssemblyExceptionId;

    public int getAssemblyExceptionId() {
        return iAssemblyExceptionId;
    }

    public void setAssemblyExceptionId(int aAssemblyExceptionId) {
        iAssemblyExceptionId = aAssemblyExceptionId;
    }

    private int iSeqRegionId;

    public int getSeqRegionId() {
        return iSeqRegionId;
    }

    public void setSeqRegionId(int aSeqRegionId) {
        iSeqRegionId = aSeqRegionId;
    }

    private int iSeqRegionStart;

    public int getSeqRegionStart() {
        return iSeqRegionStart;
    }

    public void setSeqRegionStart(int aSeqRegionStart) {
        iSeqRegionStart = aSeqRegionStart;
    }

    private int iSeqRegionEnd;

    public int getSeqRegionEnd() {
        return iSeqRegionEnd;
    }

    public void setSeqRegionEnd(int aSeqRegionEnd) {
        iSeqRegionEnd = aSeqRegionEnd;
    }

    private String iExcType;

    public String getExcType() {
        return iExcType;
    }

    public void setExcType(String aExcType) {
        iExcType = aExcType;
    }

    private int iExcSeqRegionId;

    public int getExcSeqRegionId() {
        return iExcSeqRegionId;
    }

    public void setExcSeqRegionId(int aExcSeqRegionId) {
        iExcSeqRegionId = aExcSeqRegionId;
    }

    private int iExcSeqRegionStart;

    public int getExcSeqRegionStart() {
        return iExcSeqRegionStart;
    }

    public void setExcSeqRegionStart(int aExcSeqRegionStart) {
        iExcSeqRegionStart = aExcSeqRegionStart;
    }

    private int iExcSeqRegionEnd;

    public int getExcSeqRegionEnd() {
        return iExcSeqRegionEnd;
    }

    public void setExcSeqRegionEnd(int aExcSeqRegionEnd) {
        iExcSeqRegionEnd = aExcSeqRegionEnd;
    }

    private int iOri;

    public int getOri() {
        return iOri;
    }

    public void setOri(int aOri) {
        iOri = aOri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssemblyExceptionEntity that = (AssemblyExceptionEntity) o;

        if (iAssemblyExceptionId != that.iAssemblyExceptionId) return false;
        if (iExcSeqRegionEnd != that.iExcSeqRegionEnd) return false;
        if (iExcSeqRegionId != that.iExcSeqRegionId) return false;
        if (iExcSeqRegionStart != that.iExcSeqRegionStart) return false;
        if (iOri != that.iOri) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iExcType != null ? !iExcType.equals(that.iExcType) : that.iExcType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iAssemblyExceptionId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (iExcType != null ? iExcType.hashCode() : 0);
        lresult = 31 * lresult + iExcSeqRegionId;
        lresult = 31 * lresult + iExcSeqRegionStart;
        lresult = 31 * lresult + iExcSeqRegionEnd;
        lresult = 31 * lresult + iOri;
        return lresult;
    }
}
