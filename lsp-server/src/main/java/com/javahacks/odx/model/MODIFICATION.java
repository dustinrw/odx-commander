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
 * &lt;p&gt;Java class for MODIFICATION complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="MODIFICATION"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="CHANGE" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 * &amp;lt;element name="REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MODIFICATION")
public class MODIFICATION {

    @XmlElement(name = "CHANGE", required = true)
    protected String change;
    @XmlElement(name = "REASON")
    protected String reason;

    /**
     * Gets the value of the change property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCHANGE() {
        return change;
    }

    /**
     * Sets the value of the change property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCHANGE(String value) {
        this.change = value;
    }

    /**
     * Gets the value of the reason property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getREASON() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setREASON(String value) {
        this.reason = value;
    }

}