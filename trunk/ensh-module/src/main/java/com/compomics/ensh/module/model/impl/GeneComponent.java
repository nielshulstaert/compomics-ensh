package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.core.model.Gene;
import com.compomics.ensh.module.model.Component;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 13-Dec-2007<br/>
 * Time: 14:54:21<br/>
 */
public class GeneComponent extends ComponentImpl<Gene> implements Component<Gene> {

    public GeneComponent() {
    }

    public GeneComponent(Gene object) {
        super(object);
    }
    
}
