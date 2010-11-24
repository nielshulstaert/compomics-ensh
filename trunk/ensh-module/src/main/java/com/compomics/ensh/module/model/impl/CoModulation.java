package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.module.model.Component;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 11-Dec-2007<br/>
 * Time: 18:46:01<br/>
 */
public class CoModulation extends ModuleImpl {

    public CoModulation() {
    }

    public CoModulation(String identifier, int version) {
        super(identifier, version);
    }

    public CoModulation(String identifier, int version, Set<Component> components) {
        super(identifier, version, components);
    }
    
}
