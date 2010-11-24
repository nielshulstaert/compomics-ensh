package com.compomics.ensh.variation.model.impl;

import com.compomics.ensh.core.model.Transcript;
import com.compomics.ensh.variation.model.TranscriptVariation;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 21-Nov-2007<br/>
 * Time: 16:20:29<br/>
 */
public class TranscriptVariationImpl implements TranscriptVariation {

    int id;
    Transcript transcript;
    Integer cDNAStart;
    Integer cDNAEnd;
    Integer translationStart;
    Integer translationEnd;
    String peptideAllele;
    String consequenceType;
     /**
     * transcript_variation_id	4	int unsigned
transcript_id	4	int unsigned
variation_feature_id	4	int unsigned
cdna_start	4	int
cdna_end	4	int
translation_start	4	int
translation_end	4	int
peptide_allele_string	12	varchar
consequence_type	1	set
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public int getCDNAStart() {
        return cDNAStart;
    }

    public void setCDNAStart(Integer cDNAStart) {
        this.cDNAStart = cDNAStart;
    }

    public int getCDNAEnd() {
        return cDNAEnd;
    }

    public void setCDNAEnd(Integer cDNAEnd) {
        this.cDNAEnd = cDNAEnd;
    }

    public int getTranslationStart() {
        return translationStart;
    }

    public void setTranslationStart(Integer translationStart) {
        this.translationStart = translationStart;
    }

    public int getTranslationEnd() {
        return translationEnd;
    }

    public void setTranslationEnd(Integer translationEnd) {
        this.translationEnd = translationEnd;
    }

    public String getPeptideAllele() {
        return peptideAllele;
    }

    public void setPeptideAllele(String peptideAllele) {
        this.peptideAllele = peptideAllele;
    }

    public String getConsequenceType() {
        return consequenceType;
    }

    public void setConsequenceType(String consequenceType) {
        this.consequenceType = consequenceType;
    }


    public String toString() {
        return "TranscriptVariationImpl{" +
                "transcript=" + transcript.getStableId() +
                ", cDNAStart=" + cDNAStart +
                ", cDNAEnd=" + cDNAEnd +
                ", translationStart=" + translationStart +
                ", translationEnd=" + translationEnd +
                ", peptideAllele='" + peptideAllele + '\'' +
                ", consequenceType='" + consequenceType + '\'' +
                '}';
    }
}
