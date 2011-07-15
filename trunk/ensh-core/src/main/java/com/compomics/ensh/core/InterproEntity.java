package com.compomics.ensh.core;

/**
 * This class is a
 */
public class InterproEntity {
    private String iInterproAc;

    public String getInterproAc() {
        return iInterproAc;
    }

    public void setInterproAc(String aInterproAc) {
        iInterproAc = aInterproAc;
    }

    private String iId;

    public String getId() {
        return iId;
    }

    public void setId(String aId) {
        iId = aId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterproEntity that = (InterproEntity) o;

        if (iId != null ? !iId.equals(that.iId) : that.iId != null) return false;
        if (iInterproAc != null ? !iInterproAc.equals(that.iInterproAc) : that.iInterproAc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iInterproAc != null ? iInterproAc.hashCode() : 0;
        lresult = 31 * lresult + (iId != null ? iId.hashCode() : 0);
        return lresult;
    }
}
