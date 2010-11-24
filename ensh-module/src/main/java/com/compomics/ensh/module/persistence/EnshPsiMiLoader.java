package com.compomics.ensh.module.persistence;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import psidev.psi.mi.xml.model.*;
import com.compomics.eliot.io.psimi.PsiMiDocumentHandler;
import com.compomics.eliot.io.psimi.PsiMiDocumentHandlerException;
import com.compomics.ensh.core.model.StableID;
import com.compomics.ensh.core.model.impl.StableIDImpl;
import com.compomics.ensh.module.model.Component;
import com.compomics.ensh.module.model.impl.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 26-Nov-2007<br/>
 * Time: 17:41:42<br/>
 */
public class EnshPsiMiLoader implements PsiMiDocumentHandler {

    private Session hibernateSession;
    private static Logger logger = Logger.getLogger(EnshPsiMiLoader.class);
    private static Set<String> uniProtExternalDbNames = new HashSet<String>();

    static {

        uniProtExternalDbNames.add("Uniprot/SPTREMBL");
        uniProtExternalDbNames.add("Uniprot/SWISSPROT");
        uniProtExternalDbNames.add("Uniprot/Varsplic");
//        uniProtExternalDbNames.add("Uniprot/SPTREMBL_predicted");
//        uniProtExternalDbNames.add("Uniprot/SWISSPROT_predicted");

    }

    public EnshPsiMiLoader(Session hibernateSession) {
        this.hibernateSession = hibernateSession;
    }

    public void start() throws PsiMiDocumentHandlerException {

        //begin transaction
        hibernateSession.beginTransaction();

    }

    public void interaction(Interaction interaction) {

        Complex complex = processInteraction(interaction);

        for (Participant participant : interaction.getParticipants()) {

            Component component = processParticipant(participant);
            if (component != null) {
                complex.addComponent(component);
            } else {
                logger.warn(participant + " skipped.");
            }

        }

        logger.debug("persisting complex " + complex.getName());
        try {
            hibernateSession.save(complex);
        } catch (HibernateException e) {

            hibernateSession.getTransaction().rollback();

        }

    }

    public void source(Source source) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Complex processInteraction(Interaction interaction) {

        Complex complex = new Complex();

        //process Names and Xref
        Xref xref = interaction.getXref();
        DbReference dbReference = xref.getPrimaryRef();

        //module identifier
        complex.setIdentifier(dbReference.getDbAc());

        //module stable id
        if (xref.hasSecondaryRef()) {

            DbReference secondaryDbReference = xref.getSecondaryRef().iterator().next();
            if (secondaryDbReference != null) {

                StableID stableID = new StableIDImpl();
                stableID.setStableId(secondaryDbReference.getDbAc());

                try {
                    stableID.setVersion(new Integer(dbReference.getVersion()));
                } catch (NumberFormatException e) {
                    complex.setVersion(0);
                }

                complex.setStableId(stableID);

            }

        }

        Names names = interaction.getNames();
        if (names.hasFullName()) {
            complex.setName(names.getFullName());
        }

        return complex;

    }

    public Component processParticipant(Participant participant) {

        Component retVal = null;

        Interactor interactor = participant.getInteractor();

        String interactorTypeName = interactor.getInteractorType().getNames().getFullName();

        //TODO replace by PSI-MI ontology term IDs
        if (interactorTypeName.equalsIgnoreCase("protein")) {


            Query query = hibernateSession.createQuery(
                    "select t from Translation t inner join t.xrefs xref  " +
                            "where xref.xref.externalDb.name in (:externalDbName) " +
                            "and xref.xref.dbPrimaryAccession = :dbPrimaryAccession");

            DbReference dbRef = interactor.getXref().getPrimaryRef();
            String db = dbRef.getDb();
            if (db.equals("uniprot")) {

                query.setParameterList("externalDbName", uniProtExternalDbNames);

            } else {

                query.setParameter("externalDbName", db);

            }

            String acc = dbRef.getDbAc();

            query.setParameter("dbPrimaryAccession", acc);

            Object translation = null;
            Iterator translations = query.iterate();
            if (translations.hasNext()) {

                translation = translations.next();
                logger.debug(translation);


            }

            if (translation != null) {
                retVal = new ProteinComponent();
                retVal.setObject(translation);
            }

        } else if (interactorTypeName.equalsIgnoreCase("gene")) {

            retVal = new GeneComponent();

        } else if (interactorTypeName.equalsIgnoreCase("ribonucleic acid")) {

            retVal = new TranscriptComponent();

        } else if (interactorTypeName.equalsIgnoreCase("complex")) {

            retVal = new ModuleComponent();

        } else {

            logger.warn("Unsupported interactor type '" + interactorTypeName + "'. Convertion to component failed.");

        }

        return retVal;

    }

    public void participant(Participant participant) {
        throw new UnsupportedOperationException("Method not implemented.");
    }

    public void end() throws PsiMiDocumentHandlerException {

        //commit changes
//        try{
//
//            hibernateSession.getTransaction().commit();
//
//        } catch (HibernateException e) {
//
//            hibernateSession.getTransaction().rollback();
//            throw new PsiMiDocumentHandlerException("Exception while persisting PSI MI interaction. Transcation rolled back.", e);
//
//        }
    }


    public Session getHibernateSession() {
        return hibernateSession;
    }

    public void setHibernateSession(Session hibernateSession) {
        this.hibernateSession = hibernateSession;
    }

}
