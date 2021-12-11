//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for POS-RESPONSE-SUPPRESSABLE complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="POS-RESPONSE-SUPPRESSABLE"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="BIT-MASK" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="CODED-CONST-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;element name="CODED-CONST-SNPATHREF" type="{}SNPATHREF"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="VALUE-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;element name="VALUE-SNPATHREF" type="{}SNPATHREF"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="PHYS-CONST-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;element name="PHYS-CONST-SNPATHREF" type="{}SNPATHREF"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="TABLE-KEY-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;element name="TABLE-KEY-SNPATHREF" type="{}SNPATHREF"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POS-RESPONSE-SUPPRESSABLE")
public class POSRESPONSESUPPRESSABLE {

    @XmlElement(name = "BIT-MASK", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] bitmask;
    @XmlElement(name = "CODED-CONST-SNREF")
    protected SNREF codedconstsnref;
    @XmlElement(name = "CODED-CONST-SNPATHREF")
    protected SNPATHREF codedconstsnpathref;
    @XmlElement(name = "VALUE-SNREF")
    protected SNREF valuesnref;
    @XmlElement(name = "VALUE-SNPATHREF")
    protected SNPATHREF valuesnpathref;
    @XmlElement(name = "PHYS-CONST-SNREF")
    protected SNREF physconstsnref;
    @XmlElement(name = "PHYS-CONST-SNPATHREF")
    protected SNPATHREF physconstsnpathref;
    @XmlElement(name = "TABLE-KEY-SNREF")
    protected SNREF tablekeysnref;
    @XmlElement(name = "TABLE-KEY-SNPATHREF")
    protected SNPATHREF tablekeysnpathref;

    /**
     * Gets the value of the bitmask property.
     *
     * @return possible object is
     * {@link String }
     */
    public byte[] getBITMASK() {
        return bitmask;
    }

    /**
     * Sets the value of the bitmask property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBITMASK(final byte[] value) {
        this.bitmask = value;
    }

    /**
     * Gets the value of the codedconstsnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getCODEDCONSTSNREF() {
        return codedconstsnref;
    }

    /**
     * Sets the value of the codedconstsnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setCODEDCONSTSNREF(final SNREF value) {
        this.codedconstsnref = value;
    }

    /**
     * Gets the value of the codedconstsnpathref property.
     *
     * @return possible object is
     * {@link SNPATHREF }
     */
    public SNPATHREF getCODEDCONSTSNPATHREF() {
        return codedconstsnpathref;
    }

    /**
     * Sets the value of the codedconstsnpathref property.
     *
     * @param value allowed object is
     *              {@link SNPATHREF }
     */
    public void setCODEDCONSTSNPATHREF(final SNPATHREF value) {
        this.codedconstsnpathref = value;
    }

    /**
     * Gets the value of the valuesnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getVALUESNREF() {
        return valuesnref;
    }

    /**
     * Sets the value of the valuesnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setVALUESNREF(final SNREF value) {
        this.valuesnref = value;
    }

    /**
     * Gets the value of the valuesnpathref property.
     *
     * @return possible object is
     * {@link SNPATHREF }
     */
    public SNPATHREF getVALUESNPATHREF() {
        return valuesnpathref;
    }

    /**
     * Sets the value of the valuesnpathref property.
     *
     * @param value allowed object is
     *              {@link SNPATHREF }
     */
    public void setVALUESNPATHREF(final SNPATHREF value) {
        this.valuesnpathref = value;
    }

    /**
     * Gets the value of the physconstsnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getPHYSCONSTSNREF() {
        return physconstsnref;
    }

    /**
     * Sets the value of the physconstsnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setPHYSCONSTSNREF(final SNREF value) {
        this.physconstsnref = value;
    }

    /**
     * Gets the value of the physconstsnpathref property.
     *
     * @return possible object is
     * {@link SNPATHREF }
     */
    public SNPATHREF getPHYSCONSTSNPATHREF() {
        return physconstsnpathref;
    }

    /**
     * Sets the value of the physconstsnpathref property.
     *
     * @param value allowed object is
     *              {@link SNPATHREF }
     */
    public void setPHYSCONSTSNPATHREF(final SNPATHREF value) {
        this.physconstsnpathref = value;
    }

    /**
     * Gets the value of the tablekeysnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getTABLEKEYSNREF() {
        return tablekeysnref;
    }

    /**
     * Sets the value of the tablekeysnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setTABLEKEYSNREF(final SNREF value) {
        this.tablekeysnref = value;
    }

    /**
     * Gets the value of the tablekeysnpathref property.
     *
     * @return possible object is
     * {@link SNPATHREF }
     */
    public SNPATHREF getTABLEKEYSNPATHREF() {
        return tablekeysnpathref;
    }

    /**
     * Sets the value of the tablekeysnpathref property.
     *
     * @param value allowed object is
     *              {@link SNPATHREF }
     */
    public void setTABLEKEYSNPATHREF(final SNPATHREF value) {
        this.tablekeysnpathref = value;
    }

}
