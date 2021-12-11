//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import com.javahacks.odx.index.AbstractLinkTarget;
import com.javahacks.odx.index.RegionFoldable;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for UNIT complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="UNIT"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="DISPLAY-NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 * &amp;lt;element name="FACTOR-SI-TO-UNIT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="OFFSET-SI-TO-UNIT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="PHYSICAL-DIMENSION-REF" type="{}ODXLINK" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 * &amp;lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UNIT")
public class UNIT extends AbstractLinkTarget implements RegionFoldable {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "DISPLAY-NAME", required = true)
    protected String displayname;
    @XmlElement(name = "FACTOR-SI-TO-UNIT")
    protected Double factorsitounit;
    @XmlElement(name = "OFFSET-SI-TO-UNIT")
    protected Double offsetsitounit;
    @XmlElement(name = "PHYSICAL-DIMENSION-REF")
    protected ODXLINK physicaldimensionref;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "OID")
    @XmlTransient
    protected String oid;

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
     * Gets the value of the displayname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDISPLAYNAME() {
        return displayname;
    }

    /**
     * Sets the value of the displayname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDISPLAYNAME(final String value) {
        this.displayname = value;
    }

    /**
     * Gets the value of the factorsitounit property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getFACTORSITOUNIT() {
        return factorsitounit;
    }

    /**
     * Sets the value of the factorsitounit property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setFACTORSITOUNIT(final Double value) {
        this.factorsitounit = value;
    }

    /**
     * Gets the value of the offsetsitounit property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getOFFSETSITOUNIT() {
        return offsetsitounit;
    }

    /**
     * Sets the value of the offsetsitounit property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setOFFSETSITOUNIT(final Double value) {
        this.offsetsitounit = value;
    }

    /**
     * Gets the value of the physicaldimensionref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getPHYSICALDIMENSIONREF() {
        return physicaldimensionref;
    }

    /**
     * Sets the value of the physicaldimensionref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setPHYSICALDIMENSIONREF(final ODXLINK value) {
        this.physicaldimensionref = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setID(final String value) {
        this.id = value;
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

}
