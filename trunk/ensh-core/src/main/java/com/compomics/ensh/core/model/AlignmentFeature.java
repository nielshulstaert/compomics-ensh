package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 12:33:14<br>
 */
public interface AlignmentFeature extends StrandedFeature {

    AlignmentHit getHit();

    void setHit(AlignmentHit hit);

    String getCigarLine();

    void setCigarLine(String cigarLine);
}
