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
 * &lt;p&gt;Java class for COMPANY-SPECIFIC-INFO complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="COMPANY-SPECIFIC-INFO"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="RELATED-DOCS" type="{}RELATED-DOCS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="SDGS" type="{}SDGS" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPANY-SPECIFIC-INFO")
public class COMPANYSPECIFICINFO {

    @XmlElement(name = "RELATED-DOCS")
    protected RELATEDDOCS relateddocs;
    @XmlElement(name = "SDGS")
    protected SDGS sdgs;

    /**
     * Gets the value of the relateddocs property.
     *
     * @return possible object is
     * {@link RELATEDDOCS }
     */
    public RELATEDDOCS getRELATEDDOCS() {
        return relateddocs;
    }

    /**
     * Sets the value of the relateddocs property.
     *
     * @param value allowed object is
     *              {@link RELATEDDOCS }
     */
    public void setRELATEDDOCS(RELATEDDOCS value) {
        this.relateddocs = value;
    }

    /**
     * Gets the value of the sdgs property.
     *
     * @return possible object is
     * {@link SDGS }
     */
    public SDGS getSDGS() {
        return sdgs;
    }

    /**
     * Sets the value of the sdgs property.
     *
     * @param value allowed object is
     *              {@link SDGS }
     */
    public void setSDGS(SDGS value) {
        this.sdgs = value;
    }

}