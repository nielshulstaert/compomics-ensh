package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.core.model.Transcript;
import com.compomics.ensh.module.model.Component;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 20-Nov-2007<br/>
 * Time: 19:33:22<br/>
 */
public class ComponentImpl<O>  extends AbstractComponent<O> implements Component<O> {

    public ComponentImpl() {
    }

    public ComponentImpl(O object) {
        super(object);
    }
}
