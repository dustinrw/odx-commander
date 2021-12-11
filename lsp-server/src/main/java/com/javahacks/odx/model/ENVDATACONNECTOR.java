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
 * &lt;p&gt;Java class for ENV-DATA-CONNECTOR complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="ENV-DATA-CONNECTOR"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="ENV-DATA-DESC-REF" type="{}ODXLINK"/&amp;gt;
 * &amp;lt;element name="ENV-DATA-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENV-DATA-CONNECTOR")
public class ENVDATACONNECTOR {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "ENV-DATA-DESC-REF", required = true)
    protected ODXLINK envdatadescref;
    @XmlElement(name = "ENV-DATA-SNREF", required = true)
    protected SNREF envdatasnref;

    /**
     * Gets the value of the shortname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSHORTNAME() {
        return shortname;
    }

    /**
     * Sets the value of the shortname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSHORTNAME(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the longname property.
     *
     * @return possible object is
     * {@link LONGNAME }
     */
    public LONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * Sets the value of the longname property.
     *
     * @param value allowed object is
     *              {@link LONGNAME }
     */
    public void setLONGNAME(LONGNAME value) {
        this.longname = value;
    }

    /**
     * Gets the value of the desc property.
     *
     * @return possible object is
     * {@link DESCRIPTION }
     */
    public DESCRIPTION getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value allowed object is
     *              {@link DESCRIPTION }
     */
    public void setDESC(DESCRIPTION value) {
        this.desc = value;
    }

    /**
     * Gets the value of the envdatadescref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getENVDATADESCREF() {
        return envdatadescref;
    }

    /**
     * Sets the value of the envdatadescref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setENVDATADESCREF(ODXLINK value) {
        this.envdatadescref = value;
    }

    /**
     * Gets the value of the envdatasnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getENVDATASNREF() {
        return envdatasnref;
    }

    /**
     * Sets the value of the envdatasnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setENVDATASNREF(SNREF value) {
        this.envdatasnref = value;
    }

}
