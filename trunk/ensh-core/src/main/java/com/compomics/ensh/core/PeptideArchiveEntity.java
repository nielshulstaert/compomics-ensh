package com.compomics.ensh.core;

/**
 * This class is a
 */
public class PeptideArchiveEntity {
    private int iPeptideArchiveId;

    public int getPeptideArchiveId() {
        return iPeptideArchiveId;
    }

    public void setPeptideArchiveId(int aPeptideArchiveId) {
        iPeptideArchiveId = aPeptideArchiveId;
    }

    private String iMd5Checksum;

    public String getMd5Checksum() {
        return iMd5Checksum;
    }

    public void setMd5Checksum(String aMd5Checksum) {
        iMd5Checksum = aMd5Checksum;
    }

    private String iPeptideSeq;

    public String getPeptideSeq() {
        return iPeptideSeq;
    }

    public void setPeptideSeq(String aPeptideSeq) {
        iPeptideSeq = aPeptideSeq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeptideArchiveEntity that = (PeptideArchiveEntity) o;

        if (iPeptideArchiveId != that.iPeptideArchiveId) return false;
        if (iMd5Checksum != null ? !iMd5Checksum.equals(that.iMd5Checksum) : that.iMd5Checksum != null) return false;
        if (iPeptideSeq != null ? !iPeptideSeq.equals(that.iPeptideSeq) : that.iPeptideSeq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iPeptideArchiveId;
        lresult = 31 * lresult + (iMd5Checksum != null ? iMd5Checksum.hashCode() : 0);
        lresult = 31 * lresult + (iPeptideSeq != null ? iPeptideSeq.hashCode() : 0);
        return lresult;
    }
}
