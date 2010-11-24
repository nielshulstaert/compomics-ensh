package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.StrandedFeature;
import com.compomics.ensh.core.model.StrandedLocation;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 14:40:41<br>
 */
public class AbstractStrandedFeature extends AbstractFeature<StrandedLocation> implements StrandedFeature {

    public StrandedLocation getLocation() {
        return location;
    }

    public void setLocation(StrandedLocation location) {
        this.location = location;
    }


}
