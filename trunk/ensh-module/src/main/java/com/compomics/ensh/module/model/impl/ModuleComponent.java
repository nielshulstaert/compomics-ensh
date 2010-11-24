package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.module.model.Component;
import com.compomics.ensh.module.model.Module;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 21-Dec-2007<br/>
 * Time: 15:46:02<br/>
 */
public class ModuleComponent extends ComponentImpl<Module> implements Component<Module> {

    public ModuleComponent() {
    }

    public ModuleComponent(Module object) {
        super(object);
    }
    
}
