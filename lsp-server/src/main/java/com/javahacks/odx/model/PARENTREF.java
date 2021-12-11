//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for PARENT-REF complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="PARENT-REF"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="NOT-INHERITED-DIAG-COMMS" type="{}NOT-INHERITED-DIAG-COMMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="NOT-INHERITED-VARIABLES" type="{}NOT-INHERITED-VARIABLES" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="NOT-INHERITED-DOPS" type="{}NOT-INHERITED-DOPS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="NOT-INHERITED-TABLES" type="{}NOT-INHERITED-TABLES" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="NOT-INHERITED-GLOBAL-NEG-RESPONSES" type="{}NOT-INHERITED-GLOBAL-NEG-RESPONSES" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attGroup ref="{}ODXLINK-ATTR"/&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARENT-REF")
@XmlSeeAlso({
        BASEVARIANTREF.class,
        ECUSHAREDDATAREF.class,
        FUNCTIONALGROUPREF.class,
        PROTOCOLREF.class
})
public abstract class PARENTREF extends ODXLINK {

    @XmlElement(name = "NOT-INHERITED-VARIABLES/NOT-INHERITED-VARIABLE")
    protected List<NOTINHERITEDVARIABLE> notinheritedvariables =new ArrayList<>();
    @XmlElement(name = "NOT-INHERITED-TABLES/NOT-INHERITED-TABLE")
    protected List<NOTINHERITEDTABLE> notinheritedtables = new ArrayList<>();

    @XmlPath("NOT-INHERITED-DIAG-COMMS/NOT-INHERITED-DIAG-COMM")
    protected List<NOTINHERITEDDIAGCOMM> notinheriteddiagcomms = new ArrayList<>();
    @XmlPath("NOT-INHERITED-DOPS/NOT-INHERITED-DOP")
    protected List<NOTINHERITEDDOP> notinheriteddops = new ArrayList<>();
    @XmlPath("NOT-INHERITED-GLOBAL-NEG-RESPONSES/NOT-INHERITED-GLOBAL-NEG-RESPONSE")
    protected List<NOTINHERITEDGLOBALNEGRESPONSE> notinheritedglobalnegresponses = new ArrayList<>();



    public List<NOTINHERITEDTABLE> getNotinheritedtables() {
        return notinheritedtables;
    }

    public List<NOTINHERITEDVARIABLE> getNotinheritedvariables() {
        return notinheritedvariables;
    }

    public List<NOTINHERITEDDIAGCOMM> getNotinheriteddiagcomms() {
        return notinheriteddiagcomms;
    }

    public List<NOTINHERITEDDOP> getNotinheriteddops() {
        return notinheriteddops;
    }

    public List<NOTINHERITEDGLOBALNEGRESPONSE> getNotinheritedglobalnegresponses() {
        return notinheritedglobalnegresponses;
    }
}