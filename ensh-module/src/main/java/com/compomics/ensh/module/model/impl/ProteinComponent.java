package com.compomics.ensh.module.model.impl;

import com.compomics.ensh.core.TranslationEntity;
import com.compomics.ensh.module.model.Component;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 11-Dec-2007<br/>
 * Time: 18:19:20<br/>
 */
public class ProteinComponent extends ComponentImpl<TranslationEntity> implements Component<TranslationEntity> {

    public ProteinComponent() {
    }

    public ProteinComponent(TranslationEntity object) {
        super(object);
    }

    

}
