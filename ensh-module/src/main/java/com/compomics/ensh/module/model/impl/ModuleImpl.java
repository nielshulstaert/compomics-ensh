package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.module.model.Component;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 20-Nov-2007<br/>
 * Time: 19:33:42<br/>
 */
public class ModuleImpl extends AbstractModule {

    public ModuleImpl() {
    }

    protected ModuleImpl(String identifier, int version) {
        super(identifier, version);
    }

    protected ModuleImpl(String identifier, int version, Set<Component> components) {
        super(identifier, version, components);
    }
}
