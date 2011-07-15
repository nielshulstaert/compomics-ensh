package com.compomics.ensh.core;

/**
 * This class is a
 */
public class IdentityXrefEntity {
    private int iObjectXrefId;

    public int getObjectXrefId() {
        return iObjectXrefId;
    }

    public void setObjectXrefId(int aObjectXrefId) {
        iObjectXrefId = aObjectXrefId;
    }

    private int iXrefIdentity;

    public int getXrefIdentity() {
        return iXrefIdentity;
    }

    public void setXrefIdentity(int aXrefIdentity) {
        iXrefIdentity = aXrefIdentity;
    }

    private int iEnsemblIdentity;

    public int getEnsemblIdentity() {
        return iEnsemblIdentity;
    }

    public void setEnsemblIdentity(int aEnsemblIdentity) {
        iEnsemblIdentity = aEnsemblIdentity;
    }

    private int iXrefStart;

    public int getXrefStart() {
        return iXrefStart;
    }

    public void setXrefStart(int aXrefStart) {
        iXrefStart = aXrefStart;
    }

    private int iXrefEnd;

    public int getXrefEnd() {
        return iXrefEnd;
    }

    public void setXrefEnd(int aXrefEnd) {
        iXrefEnd = aXrefEnd;
    }

    private int iEnsemblStart;

    public int getEnsemblStart() {
        return iEnsemblStart;
    }

    public void setEnsemblStart(int aEnsemblStart) {
        iEnsemblStart = aEnsemblStart;
    }

    private int iEnsemblEnd;

    public int getEnsemblEnd() {
        return iEnsemblEnd;
    }

    public void setEnsemblEnd(int aEnsemblEnd) {
        iEnsemblEnd = aEnsemblEnd;
    }

    private String iCigarLine;

    public String getCigarLine() {
        return iCigarLine;
    }

    public void setCigarLine(String aCigarLine) {
        iCigarLine = aCigarLine;
    }

    private double iScore;

    public double getScore() {
        return iScore;
    }

    public void setScore(double aScore) {
        iScore = aScore;
    }

    private double iEvalue;

    public double getEvalue() {
        return iEvalue;
    }

    public void setEvalue(double aEvalue) {
        iEvalue = aEvalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentityXrefEntity that = (IdentityXrefEntity) o;

        if (iEnsemblEnd != that.iEnsemblEnd) return false;
        if (iEnsemblIdentity != that.iEnsemblIdentity) return false;
        if (iEnsemblStart != that.iEnsemblStart) return false;
        if (Double.compare(that.iEvalue, iEvalue) != 0) return false;
        if (iObjectXrefId != that.iObjectXrefId) return false;
        if (Double.compare(that.iScore, iScore) != 0) return false;
        if (iXrefEnd != that.iXrefEnd) return false;
        if (iXrefIdentity != that.iXrefIdentity) return false;
        if (iXrefStart != that.iXrefStart) return false;
        if (iCigarLine != null ? !iCigarLine.equals(that.iCigarLine) : that.iCigarLine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult;
        long temp;
        lresult = iObjectXrefId;
        lresult = 31 * lresult + iXrefIdentity;
        lresult = 31 * lresult + iEnsemblIdentity;
        lresult = 31 * lresult + iXrefStart;
        lresult = 31 * lresult + iXrefEnd;
        lresult = 31 * lresult + iEnsemblStart;
        lresult = 31 * lresult + iEnsemblEnd;
        lresult = 31 * lresult + (iCigarLine != null ? iCigarLine.hashCode() : 0);
        temp = iScore != +0.0d ? Double.doubleToLongBits(iScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        temp = iEvalue != +0.0d ? Double.doubleToLongBits(iEvalue) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        return lresult;
    }
}
