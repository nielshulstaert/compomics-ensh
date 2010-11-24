package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.module.model.Component;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 11-Dec-2007<br/>
 * Time: 17:58:53<br/>
 */
public class Process extends ModuleImpl {

    public Process() {
    }

    public Process(String identifier, int version) {
        super(identifier, version);
    }

    public Process(String identifier, int version, Set<Component> components) {
        super(identifier, version, components);
    }
}
