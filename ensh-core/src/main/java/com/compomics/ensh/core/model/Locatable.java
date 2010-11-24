package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.SequenceRegionImpl;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 15:44:41<br>
 */
public interface Locatable<L extends Location> {

    L getLocation();

    void setLocation(L location);

}
