package com.compomics.ensh.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.dom4j.io.DOMWriter;

import java.net.URL;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 22-Nov-2007<br/>
 * Time: 10:57:20<br/>
 */
public abstract class XmlUtil {

    /**
     * Converts a DOM4J Document to a W3C Document.
     *
     * @param document the DOM4J Document
     * @return a W3C Document
     * @throws DocumentException if an Exception occurs during the conversion
     */
    public static org.w3c.dom.Document toOrgW3cDomDocument(org.dom4j.Document document) throws DocumentException {
        return new DOMWriter().write(document);
    }

    /**
     * Parses an XML document into a DOM.
     * 
     * @param url the document URL
     * @return a DOM4J Document
     * @throws DocumentException if an Exception occurs while parsing the XML file
     */
    public static Document parse(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        return reader.read(url);
    }

}


