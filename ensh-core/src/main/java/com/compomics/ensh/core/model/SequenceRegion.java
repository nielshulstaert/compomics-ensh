package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.CoordinateSystemImpl;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 10:42:10<br>
 */
public interface SequenceRegion extends Comparable<SequenceRegion> {

    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    int getLength();

    void setLength(int length);

    CoordinateSystem getCoordinateSystem();

    void setCoordinateSystem(CoordinateSystem coordinateSystem);

    Map<AttributeType, String> getAttributes();

    void setAttributes(Map<AttributeType, String> attributes);

}
