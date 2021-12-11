//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for COMPANY-REVISION-INFO complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="COMPANY-REVISION-INFO"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="COMPANY-DATA-REF" type="{}ODXLINK"/&amp;gt;
 * &amp;lt;element name="REVISION-LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPANY-REVISION-INFO")
public class COMPANYREVISIONINFO {

    @XmlElement(name = "COMPANY-DATA-REF", required = true)
    protected ODXLINK companydataref;
    @XmlElement(name = "REVISION-LABEL")
    protected String revisionlabel;
    @XmlElement(name = "STATE")
    protected String state;

    /**
     * Gets the value of the companydataref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getCOMPANYDATAREF() {
        return companydataref;
    }

    /**
     * Sets the value of the companydataref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setCOMPANYDATAREF(ODXLINK value) {
        this.companydataref = value;
    }

    /**
     * Gets the value of the revisionlabel property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getREVISIONLABEL() {
        return revisionlabel;
    }

    /**
     * Sets the value of the revisionlabel property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setREVISIONLABEL(String value) {
        this.revisionlabel = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSTATE(String value) {
        this.state = value;
    }

}