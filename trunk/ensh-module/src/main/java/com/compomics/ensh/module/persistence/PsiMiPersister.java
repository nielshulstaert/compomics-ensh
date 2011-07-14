//package com.compomics.ensh.module.persistence;
//
//import psidev.psi.mi.xml.PsimiXmlReader;
//import psidev.psi.mi.xml.converter.ConverterException;
//import psidev.psi.mi.xml.model.Entry;
//import psidev.psi.mi.xml.model.EntrySet;
//import psidev.psi.mi.xml.model.Interaction;
//import com.compomics.eliot.io.psimi.PsiMiDocumentHandler;
//
//import javax.xml.bind.JAXBException;
//import java.io.IOException;
//import java.net.URL;
//
///**
// * Created by IntelliJ IDEA.<br/>
// * User: mmueller<br/>
// * Date: 21-Dec-2007<br/>
// * Time: 12:13:19<br/>
// */
//public class PsiMiPersister {
//
//    private PsiMiDocumentHandler psiMiDocumentHandler;
//
//    public PsiMiPersister(PsiMiDocumentHandler psiMiDocumentHandler) {
//        this.psiMiDocumentHandler = psiMiDocumentHandler;
//    }
//
//    public void persist(URL psiMiXmlDocumentUrl) {
//
//        System.out.println(psiMiXmlDocumentUrl);
//
//        try {
//
//            psiMiDocumentHandler.start();
//
//            PsimiXmlReader reader = new PsimiXmlReader();
//
//            EntrySet entrySet = reader.read(psiMiXmlDocumentUrl);
//
//            for (Entry entry : entrySet.getEntries()) {
//
//                for (Interaction interaction : entry.getInteractions()) {
//
//                    psiMiDocumentHandler.interaction(interaction);
//
//                }
//
//
//            }
//
//            psiMiDocumentHandler.end();
//
//        } catch (IOException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        } catch (JAXBException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        } catch (ConverterException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//
//
//    }
//
//    public PsiMiDocumentHandler getPsiMiDocumentHandler() {
//        return psiMiDocumentHandler;
//    }
//
//    public void setPsiMiDocumentHandler(PsiMiDocumentHandler psiMiDocumentHandler) {
//        this.psiMiDocumentHandler = psiMiDocumentHandler;
//    }
//
//
//}
