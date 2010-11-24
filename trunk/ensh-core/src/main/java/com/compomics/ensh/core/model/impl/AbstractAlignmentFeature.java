package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.AlignmentFeature;
import com.compomics.ensh.core.model.AlignmentHit;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 12:25:33<br>
 */
public class AbstractAlignmentFeature extends AbstractStrandedFeature implements AlignmentFeature {

    private AlignmentHit hit;
    private String cigarLine;

    public AlignmentHit getHit() {
        return hit;
    }

    public void setHit(AlignmentHit hit) {
        this.hit = hit;
    }

    public String getCigarLine() {
        return cigarLine;
    }

    public void setCigarLine(String cigarLine) {
        this.cigarLine = cigarLine;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AbstractAlignmentFeature that = (AbstractAlignmentFeature) o;

        if (!hit.equals(that.hit)) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + hit.hashCode();
        return result;
    }
}
