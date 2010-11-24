package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.GeneticMarkerFeatureImpl;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 15:41:25<br>
 */
public interface GeneticMarker {

    GeneticMarkerSynonym getDisplayMarkerSynonym();

    void setDisplayMarkerSynonym(GeneticMarkerSynonym displayMarkerSynonym);

    String getLeftPrimer();

    void setLeftPrimer(String leftPrimer);

    String getRightPrimer();

    void setRightPrimer(String rightPrimer);

    int getMinPrimerDistance();

    void setMinPrimerDistance(int minPrimerDistance);

    int getMaxPrimerDistance();

    void setMaxPrimerDistance(int maxPrimerDistance);

    Integer getPriority();

    void setPriority(Integer priority);

    String getType();

    void setType(String type);

    Set<GeneticMarkerSynonym> getSynonyms();

    void setSynonyms(Set<GeneticMarkerSynonym> synonyms);

    Set<GeneticMapLocation> getMapLocations();

    void setMapLocations(Set<GeneticMapLocation> mapLocations);

    Set<GeneticMarkerFeature> getGenomeLocations();

    void setGenomeLocations(Set<GeneticMarkerFeature> genomeLocations);
}
