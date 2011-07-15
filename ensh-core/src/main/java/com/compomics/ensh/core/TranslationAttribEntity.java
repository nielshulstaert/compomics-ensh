package com.compomics.ensh.core;

/**
 * This class is a
 */
public class TranslationAttribEntity {
    private int iTranslationId;

    public int getTranslationId() {
        return iTranslationId;
    }

    public void setTranslationId(int aTranslationId) {
        iTranslationId = aTranslationId;
    }

    private short iAttribTypeId;

    public short getAttribTypeId() {
        return iAttribTypeId;
    }

    public void setAttribTypeId(short aAttribTypeId) {
        iAttribTypeId = aAttribTypeId;
    }

    private String iValue;

    public String getValue() {
        return iValue;
    }

    public void setValue(String aValue) {
        iValue = aValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranslationAttribEntity that = (TranslationAttribEntity) o;

        if (iAttribTypeId != that.iAttribTypeId) return false;
        if (iTranslationId != that.iTranslationId) return false;
        if (iValue != null ? !iValue.equals(that.iValue) : that.iValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iTranslationId;
        lresult = 31 * lresult + (int) iAttribTypeId;
        lresult = 31 * lresult + (iValue != null ? iValue.hashCode() : 0);
        return lresult;
    }
}
