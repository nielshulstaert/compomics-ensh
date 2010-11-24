package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.GeneticMap;
import com.compomics.ensh.core.model.GeneticMarker;
import com.compomics.ensh.core.model.GeneticMapLocation;

import java.util.*;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 16:06:10<br>
 */
public class GeneticMapImpl implements GeneticMap {

    private int id;
    private String name;
    private Set<GeneticMarker> markers;    
//    private SortedSet<GeneticMarker> markers = new TreeSet<GeneticMarker>(new GeneticMarkerMapLocationComparator());
    //private GeneticMap thisMapInstance;

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
    public int compareTo(GeneticMap that) {

        return this.getName().compareTo(that.getName());

    }

    @Testable
    public Set<GeneticMarker> getMarkers() {
        return markers;
    }

    @Testable
    public void setMarkers(Set<GeneticMarker> markers) {
        this.markers=markers;
//        this.markers = new TreeSet<GeneticMarker>(new GeneticMarkerMapLocationComparator());
//        for (GeneticMarker marker : markers) {
//            this.markers.add(marker);
//        }
    }

    @Testable
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof GeneticMap)) return false;

        GeneticMap that = (GeneticMap) o;

        if (!name.equals(that.getName())) return false;

        return true;
    }

    public int hashCode() {
        return name.hashCode();
    }


    public String toString() {
        return name;
    }

//    public class GeneticMarkerMapLocationComparator implements Comparator<GeneticMarker> {
//
//        public int compare(GeneticMarker marker1, GeneticMarker marker2) {
//
//            GeneticMapLocation location1 = null;
//            GeneticMapLocation location2 = null;
//
//            for(GeneticMapLocation location : marker1.getMapLocations()){
//                if(location.getMap().equals(thisMapInstance)){
//                    location1 = location;
//                    break;
//                }
//            }
//
//            for(GeneticMapLocation location : marker2.getMapLocations()){
//                if(location.getMap().equals(thisMapInstance)){
//                    location2 = location;
//                    break;
//                }
//            }
//
//            return location1.compareTo(location2);
//
//        }
//
//    }
}
