package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.core.model.Translation;
import com.compomics.ensh.core.model.impl.TranslationImpl;
import com.compomics.ensh.module.model.Component;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 11-Dec-2007<br/>
 * Time: 18:19:20<br/>
 */
public class ProteinComponent extends ComponentImpl<Translation> implements Component<Translation> {

    public ProteinComponent() {
    }

    public ProteinComponent(Translation object) {
        super(object);
    }

    

}
