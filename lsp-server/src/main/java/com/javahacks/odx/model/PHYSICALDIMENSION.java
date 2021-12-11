//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import com.javahacks.odx.index.AbstractLinkTarget;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for PHYSICAL-DIMENSION complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="PHYSICAL-DIMENSION"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="LENGTH-EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="MASS-EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="TIME-EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="CURRENT-EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="TEMPERATURE-EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="MOLAR-AMOUNT-EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="LUMINOUS-INTENSITY-EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 * &amp;lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PHYSICAL-DIMENSION")
public class PHYSICALDIMENSION extends AbstractLinkTarget {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "LENGTH-EXP")
    protected Integer lengthexp;
    @XmlElement(name = "MASS-EXP")
    protected Integer massexp;
    @XmlElement(name = "TIME-EXP")
    protected Integer timeexp;
    @XmlElement(name = "CURRENT-EXP")
    protected Integer currentexp;
    @XmlElement(name = "TEMPERATURE-EXP")
    protected Integer temperatureexp;
    @XmlElement(name = "MOLAR-AMOUNT-EXP")
    protected Integer molaramountexp;
    @XmlElement(name = "LUMINOUS-INTENSITY-EXP")
    protected Integer luminousintensityexp;
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
     * Gets the value of the lengthexp property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getLENGTHEXP() {
        return lengthexp;
    }

    /**
     * Sets the value of the lengthexp property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setLENGTHEXP(final Integer value) {
        this.lengthexp = value;
    }

    /**
     * Gets the value of the massexp property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getMASSEXP() {
        return massexp;
    }

    /**
     * Sets the value of the massexp property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setMASSEXP(final Integer value) {
        this.massexp = value;
    }

    /**
     * Gets the value of the timeexp property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTIMEEXP() {
        return timeexp;
    }

    /**
     * Sets the value of the timeexp property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTIMEEXP(final Integer value) {
        this.timeexp = value;
    }

    /**
     * Gets the value of the currentexp property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getCURRENTEXP() {
        return currentexp;
    }

    /**
     * Sets the value of the currentexp property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setCURRENTEXP(final Integer value) {
        this.currentexp = value;
    }

    /**
     * Gets the value of the temperatureexp property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTEMPERATUREEXP() {
        return temperatureexp;
    }

    /**
     * Sets the value of the temperatureexp property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTEMPERATUREEXP(final Integer value) {
        this.temperatureexp = value;
    }

    /**
     * Gets the value of the molaramountexp property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getMOLARAMOUNTEXP() {
        return molaramountexp;
    }

    /**
     * Sets the value of the molaramountexp property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setMOLARAMOUNTEXP(final Integer value) {
        this.molaramountexp = value;
    }

    /**
     * Gets the value of the luminousintensityexp property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getLUMINOUSINTENSITYEXP() {
        return luminousintensityexp;
    }

    /**
     * Sets the value of the luminousintensityexp property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setLUMINOUSINTENSITYEXP(final Integer value) {
        this.luminousintensityexp = value;
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
