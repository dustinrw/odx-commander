//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.*;


/**
 * &lt;p&gt;Java class for INPUT-PARAM complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="INPUT-PARAM"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="PHYSICAL-DEFAULT-VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DOP-BASE-REF" type="{}ODXLINK"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;attribute name="SEMANTIC" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INPUT-PARAM")
public class INPUTPARAM {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "PHYSICAL-DEFAULT-VALUE")
    protected String physicaldefaultvalue;
    @XmlElement(name = "DOP-BASE-REF", required = true)
    protected ODXLINK dopbaseref;
    @XmlAttribute(name = "OID")
    @XmlTransient
    protected String oid;
    @XmlAttribute(name = "SEMANTIC")
    protected String semantic;

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
    public void setSHORTNAME(final String value) {
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
    public void setLONGNAME(final LONGNAME value) {
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
    public void setDESC(final DESCRIPTION value) {
        this.desc = value;
    }

    /**
     * Gets the value of the physicaldefaultvalue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPHYSICALDEFAULTVALUE() {
        return physicaldefaultvalue;
    }

    /**
     * Sets the value of the physicaldefaultvalue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPHYSICALDEFAULTVALUE(final String value) {
        this.physicaldefaultvalue = value;
    }

    /**
     * Gets the value of the dopbaseref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getDOPBASEREF() {
        return dopbaseref;
    }

    /**
     * Sets the value of the dopbaseref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setDOPBASEREF(final ODXLINK value) {
        this.dopbaseref = value;
    }

    /**
     * Gets the value of the oid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOID(final String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the semantic property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSEMANTIC() {
        return semantic;
    }

    /**
     * Sets the value of the semantic property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSEMANTIC(final String value) {
        this.semantic = value;
    }

}
