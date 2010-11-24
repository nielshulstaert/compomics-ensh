package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.module.model.Module;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 11-Dec-2007<br/>
 * Time: 19:19:14<br/>
 */
public class ModuleFactory {

    Module createProteinComplex(String identifier, int version){
        return new Complex(identifier, version);
    }

}
