package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.module.model.Component;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 11-Dec-2007<br/>
 * Time: 17:57:22<br/>
 */
public class Complex extends ModuleImpl {

    public Complex() {
    }

    public Complex(String identifier, int version) {
        super(identifier, version);
    }

    public Complex(String identifier, int version, Set<Component> components) {
        super(identifier, version, components);
    }
}
