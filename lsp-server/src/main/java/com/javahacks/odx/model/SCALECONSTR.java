//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.*;


/**
 * &lt;p&gt;Java class for SCALE-CONSTR complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="SCALE-CONSTR"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="SHORT-LABEL" type="{}TEXT" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DESC" type="{}DESCRIPTION" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="LOWER-LIMIT" type="{}LIMIT"/&amp;gt;
 * &amp;lt;element name="UPPER-LIMIT" type="{}LIMIT"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="VALIDITY" use="required" type="{}VALID-TYPE" /&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCALE-CONSTR")
public class SCALECONSTR {

    @XmlElement(name = "SHORT-LABEL")
    protected TEXT shortlabel;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "LOWER-LIMIT", required = true)
    protected LIMIT lowerlimit;
    @XmlElement(name = "UPPER-LIMIT", required = true)
    protected LIMIT upperlimit;
    @XmlAttribute(name = "VALIDITY", required = true)
    protected VALIDTYPE validity;

    /**
     * Gets the value of the shortlabel property.
     *
     * @return possible object is
     * {@link TEXT }
     */
    public TEXT getSHORTLABEL() {
        return shortlabel;
    }

    /**
     * Sets the value of the shortlabel property.
     *
     * @param value allowed object is
     *              {@link TEXT }
     */
    public void setSHORTLABEL(TEXT value) {
        this.shortlabel = value;
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
     * Gets the value of the lowerlimit property.
     *
     * @return possible object is
     * {@link LIMIT }
     */
    public LIMIT getLOWERLIMIT() {
        return lowerlimit;
    }

    /**
     * Sets the value of the lowerlimit property.
     *
     * @param value allowed object is
     *              {@link LIMIT }
     */
    public void setLOWERLIMIT(LIMIT value) {
        this.lowerlimit = value;
    }

    /**
     * Gets the value of the upperlimit property.
     *
     * @return possible object is
     * {@link LIMIT }
     */
    public LIMIT getUPPERLIMIT() {
        return upperlimit;
    }

    /**
     * Sets the value of the upperlimit property.
     *
     * @param value allowed object is
     *              {@link LIMIT }
     */
    public void setUPPERLIMIT(LIMIT value) {
        this.upperlimit = value;
    }

    /**
     * Gets the value of the validity property.
     *
     * @return possible object is
     * {@link VALIDTYPE }
     */
    public VALIDTYPE getVALIDITY() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     *
     * @param value allowed object is
     *              {@link VALIDTYPE }
     */
    public void setVALIDITY(VALIDTYPE value) {
        this.validity = value;
    }

}
