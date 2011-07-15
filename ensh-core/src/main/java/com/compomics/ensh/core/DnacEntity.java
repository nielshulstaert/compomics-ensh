package com.compomics.ensh.core;

import java.util.Arrays;

/**
 * This class is a
 */
public class DnacEntity {
    private int iSeqRegionId;

    public int getSeqRegionId() {
        return iSeqRegionId;
    }

    public void setSeqRegionId(int aSeqRegionId) {
        iSeqRegionId = aSeqRegionId;
    }

    private byte[] iSequence;

    public byte[] getSequence() {
        return iSequence;
    }

    public void setSequence(byte[] aSequence) {
        iSequence = aSequence;
    }

    private String iNLine;

    public String getNLine() {
        return iNLine;
    }

    public void setNLine(String aNLine) {
        iNLine = aNLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DnacEntity that = (DnacEntity) o;

        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (!Arrays.equals(iSequence, that.iSequence)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSeqRegionId;
        lresult = 31 * lresult + (iSequence != null ? Arrays.hashCode(iSequence) : 0);
        return lresult;
    }
}
