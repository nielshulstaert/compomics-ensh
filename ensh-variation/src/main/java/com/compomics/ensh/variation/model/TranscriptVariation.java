package com.compomics.ensh.variation.model;

import com.compomics.ensh.core.model.Transcript;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 21-Nov-2007<br/>
 * Time: 16:13:53<br/>
 */
public interface TranscriptVariation {

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

    public Transcript getTranscript();

    public void setTranscript(Transcript transcript);

    int getCDNAStart();

    void setCDNAStart(Integer cdnaStart);

    int getCDNAEnd();

    void setCDNAEnd(Integer cdnaEnd);

    int getTranslationStart();

    void setTranslationStart(Integer translationStart);

    int getTranslationEnd();

    void setTranslationEnd(Integer translationEnd);

    String getPeptideAllele();

    void setPeptideAllele(String peptideAllele);

    String getConsequenceType();

    void setConsequenceType(String consequenceType);

}
