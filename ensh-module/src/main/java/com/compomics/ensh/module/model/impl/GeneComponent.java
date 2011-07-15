package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.core.GeneEntity;
import com.compomics.ensh.module.model.Component;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 13-Dec-2007<br/>
 * Time: 14:54:21<br/>
 */
public class GeneComponent extends ComponentImpl<GeneEntity> implements Component<GeneEntity> {

    public GeneComponent() {
    }

    public GeneComponent(GeneEntity object) {
        super(object);
    }
    
}
