//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for PHYS-SEGMENT complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="PHYS-SEGMENT"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="FILLBYTE" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="BLOCK-SIZE" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="START-ADDRESS" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 * &amp;lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PHYS-SEGMENT")
@XmlSeeAlso({
        ADDRDEFPHYSSEGMENT.class,
        SIZEDEFPHYSSEGMENT.class
})
public abstract class PHYSSEGMENT {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "FILLBYTE", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] fillbyte;
    @XmlElement(name = "BLOCK-SIZE")
    @XmlSchemaType(name = "unsignedInt")
    protected Long blocksize;
    @XmlElement(name = "START-ADDRESS", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] startaddress;
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
     * Gets the value of the fillbyte property.
     *
     * @return possible object is
     * {@link String }
     */
    public byte[] getFILLBYTE() {
        return fillbyte;
    }

    /**
     * Sets the value of the fillbyte property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFILLBYTE(final byte[] value) {
        this.fillbyte = value;
    }

    /**
     * Gets the value of the blocksize property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getBLOCKSIZE() {
        return blocksize;
    }

    /**
     * Sets the value of the blocksize property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setBLOCKSIZE(final Long value) {
        this.blocksize = value;
    }

    /**
     * Gets the value of the startaddress property.
     *
     * @return possible object is
     * {@link String }
     */
    public byte[] getSTARTADDRESS() {
        return startaddress;
    }

    /**
     * Sets the value of the startaddress property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSTARTADDRESS(final byte[] value) {
        this.startaddress = value;
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
