package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 15:59:29<br>
 */
public interface StrandedLocation extends Location {

    int getSequenceRegionStrand();

    void setSequenceRegionStrand(int sequenceRegionStrand);

}
