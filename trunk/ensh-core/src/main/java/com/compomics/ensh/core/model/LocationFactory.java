/**
 * Created by IntelliJ IDEA.
 * User: Michael Mueller
 * Date: 30-Jul-2009
 * Time: 16:16:04
 */
package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.LocationImpl;
import com.compomics.ensh.core.model.impl.SequenceRegionImpl;
import com.compomics.ensh.core.model.impl.CoordinateSystemImpl;
import com.compomics.ensh.core.model.impl.StrandedLocationImpl;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class LocationFactory {

    private static LocationFactory ourInstance = new LocationFactory();

    private static Map<String, CoordinateSystem> coordinateSystems = new HashMap<String, CoordinateSystem>();
    private static Map<String, Map<String, SequenceRegion>> coordinateSystem2SequenceRegions = new HashMap<String, Map<String, SequenceRegion>>();


    public static LocationFactory getInstance() {
        return ourInstance;
    }

    private LocationFactory() {
    }


    public Location createLocation(String coordinateSystemName,
                                   String coordinateSystemVersion,
                                   String sequenceRegionName,
                                   int sequenceRegionLength,
                                   int sequenceRegionStart,
                                   int sequenceRegionEnd){

        CoordinateSystem coordinateSystem = getCoordinateSystem(coordinateSystemName, coordinateSystemVersion);
        SequenceRegion sequenceRegion = getSequenceRegion(coordinateSystem, sequenceRegionName, sequenceRegionLength);

        Location retVal = new LocationImpl();

        retVal.setSequenceRegion(sequenceRegion);
        retVal.setSequenceRegionStart(sequenceRegionStart);
        retVal.setSequenceRegionEnd(sequenceRegionEnd);

        return retVal;

    }

    public Location createLocation(String coordinateSystemName,
                                   String coordinateSystemVersion,
                                   String sequenceRegionName,
                                   int sequenceRegionLength,
                                   int sequenceRegionStart,
                                   int sequenceRegionEnd,
                                   int strand){

        CoordinateSystem coordinateSystem = getCoordinateSystem(coordinateSystemName, coordinateSystemVersion);
        SequenceRegion sequenceRegion = getSequenceRegion(coordinateSystem, sequenceRegionName, sequenceRegionLength);

        StrandedLocation retVal = new StrandedLocationImpl();

        retVal.setSequenceRegion(sequenceRegion);
        retVal.setSequenceRegionStart(sequenceRegionStart);
        retVal.setSequenceRegionEnd(sequenceRegionEnd);
        retVal.setSequenceRegionStrand(strand);

        return retVal;

    }


    private static CoordinateSystem getCoordinateSystem(String coordinateSystemName, String coordinateSystemVersion){

        String key = coordinateSystemName+ "_" + coordinateSystemVersion;
        CoordinateSystem retVal;
        if(coordinateSystems.containsKey(key)){
            retVal = coordinateSystems.get(key);
        } else {
            retVal = new CoordinateSystemImpl();
            retVal.setName(coordinateSystemName);
            retVal.setVersion(coordinateSystemVersion);
            coordinateSystems.put(key, retVal);
        }

        return retVal;

    }

    private static SequenceRegion getSequenceRegion(CoordinateSystem coordinateSystem, String sequenceRegionName, int sequenceRegionLength){

        SequenceRegion retVal;

        String coordinateSystemKey =  coordinateSystem.getName() + "_" + coordinateSystem.getVersion();
        String sequenceRegionKey = sequenceRegionName + "_" + sequenceRegionLength;
        if(coordinateSystem2SequenceRegions.containsKey(coordinateSystemKey)){

            Map<String, SequenceRegion> sequenceRegions = coordinateSystem2SequenceRegions.get(coordinateSystemKey);
            if(sequenceRegions.containsKey(sequenceRegionKey)){

                retVal = sequenceRegions.get(sequenceRegionKey);

            } else {

                retVal = new SequenceRegionImpl();
                retVal.setName(sequenceRegionName);
                retVal.setLength(sequenceRegionLength);
                retVal.setCoordinateSystem(coordinateSystem);

                sequenceRegions.put(sequenceRegionKey, retVal);


            }

        } else {

            Map sequenceRegions = new HashMap<String, SequenceRegion>();

            retVal = new SequenceRegionImpl();
            retVal.setName(sequenceRegionName);
            retVal.setLength(sequenceRegionLength);
            retVal.setCoordinateSystem(coordinateSystem);

            sequenceRegions.put(sequenceRegionKey, retVal);

            coordinateSystem2SequenceRegions.put(coordinateSystemKey, sequenceRegions);

        }

        return retVal;

    }
}
