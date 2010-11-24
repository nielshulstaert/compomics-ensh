package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.SequenceRegion;
import com.compomics.ensh.core.model.AttributeType;
import com.compomics.ensh.core.model.CoordinateSystem;

import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 26-Sep-2007<br>
 * Time: 20:03:15<br>
 */
public class SequenceRegionImpl implements SequenceRegion {

    private int id;
    private String name;
    private CoordinateSystem coordinateSystem;
    private int length;
    private Map<AttributeType, String> attributes;

    @Testable
    public SequenceRegionImpl() {
    }

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getName() {
        return name;
    }

    @Testable
    public void setName(String name) {
        this.name = name;
    }

    @Testable
    public int getLength() {
        return length;
    }

    @Testable
    public void setLength(int length) {
        this.length = length;
    }

    @Testable
    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    @Testable
    public void setCoordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    @Testable
    public Map<AttributeType, String> getAttributes() {
        if(attributes == null)
            attributes = new HashMap<AttributeType,String>();
        return attributes;
    }

    @Testable
    public void setAttributes(Map<AttributeType, String> attributes) {
        this.attributes = attributes;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof SequenceRegion)) return false;

        SequenceRegion that = (SequenceRegion) o;

        if (length != that.getLength()) return false;
        if (!coordinateSystem.equals(that.getCoordinateSystem())) return false;
        if (!name.equals(that.getName())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = name.hashCode();
        result = 31 * result + coordinateSystem.hashCode();
        result = 31 * result + length;
        return result;
    }

    @Testable
    public int compareTo(SequenceRegion that) {

        int BEFORE = -1;
        int EQUAL = 0;
        int AFTER = 1;

        if(this == that) return 0;

        if(this.equals(that)) return 0;

        if(!this.coordinateSystem.equals(that.getCoordinateSystem()))
            return this.coordinateSystem.compareTo(that.getCoordinateSystem());


        //compare names
        String thisName = this.getName();
        String thatName = that.getName();

        if(thisName.equals(thatName)) return EQUAL;

        //try to parse names to numbers
        int thisNo;
        int thatNo;
        try {
            thisNo = Integer.parseInt(thisName);
        } catch (NumberFormatException e) {
            thisNo = -1;
        }
        try {
            thatNo = Integer.parseInt(thatName);
        } catch (NumberFormatException e) {
            thatNo = -1;
        }

        //if both names are numbers
        if (thisNo > -1 && thatNo > -1) {
            if (thisNo < thatNo) return BEFORE;
            if (thisNo > thatNo) return AFTER;
        }
        //if only one is a number numbers always come before strings
        else if (thisNo > -1){
            return BEFORE;
        }
        else if (thatNo > -1){
            return AFTER;
        }

        //if one is X,Y, MT, W, Z
        if(thisName.equals("X") ||
                thisName.equals("Y") ||
                thisName.equals("MT") ||
                thisName.equals("W") ||
                thisName.equals("Z")) return BEFORE;

        //if not we compare the name string values lexicographically
        return thisName.compareTo(thatName);

    }

    public String toString() {
        return "SequenceRegion{" +
                "coordinateSystem=" + coordinateSystem +
                ", name='" + name + '\'' +
                ", length=" + length +
                '}';
    }



}
