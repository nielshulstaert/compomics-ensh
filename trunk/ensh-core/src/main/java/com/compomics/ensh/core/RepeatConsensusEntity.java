package com.compomics.ensh.core;

/**
 * This class is a
 */
public class RepeatConsensusEntity {
    private int iRepeatConsensusId;

    public int getRepeatConsensusId() {
        return iRepeatConsensusId;
    }

    public void setRepeatConsensusId(int aRepeatConsensusId) {
        iRepeatConsensusId = aRepeatConsensusId;
    }

    private String iRepeatName;

    public String getRepeatName() {
        return iRepeatName;
    }

    public void setRepeatName(String aRepeatName) {
        iRepeatName = aRepeatName;
    }

    private String iRepeatClass;

    public String getRepeatClass() {
        return iRepeatClass;
    }

    public void setRepeatClass(String aRepeatClass) {
        iRepeatClass = aRepeatClass;
    }

    private String iRepeatType;

    public String getRepeatType() {
        return iRepeatType;
    }

    public void setRepeatType(String aRepeatType) {
        iRepeatType = aRepeatType;
    }

    private String iRepeatConsensus;

    public String getRepeatConsensus() {
        return iRepeatConsensus;
    }

    public void setRepeatConsensus(String aRepeatConsensus) {
        iRepeatConsensus = aRepeatConsensus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepeatConsensusEntity that = (RepeatConsensusEntity) o;

        if (iRepeatConsensusId != that.iRepeatConsensusId) return false;
        if (iRepeatClass != null ? !iRepeatClass.equals(that.iRepeatClass) : that.iRepeatClass != null) return false;
        if (iRepeatConsensus != null ? !iRepeatConsensus.equals(that.iRepeatConsensus) : that.iRepeatConsensus != null)
            return false;
        if (iRepeatName != null ? !iRepeatName.equals(that.iRepeatName) : that.iRepeatName != null) return false;
        if (iRepeatType != null ? !iRepeatType.equals(that.iRepeatType) : that.iRepeatType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iRepeatConsensusId;
        lresult = 31 * lresult + (iRepeatName != null ? iRepeatName.hashCode() : 0);
        lresult = 31 * lresult + (iRepeatClass != null ? iRepeatClass.hashCode() : 0);
        lresult = 31 * lresult + (iRepeatType != null ? iRepeatType.hashCode() : 0);
        lresult = 31 * lresult + (iRepeatConsensus != null ? iRepeatConsensus.hashCode() : 0);
        return lresult;
    }
}
