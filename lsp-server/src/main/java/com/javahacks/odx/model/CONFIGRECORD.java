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
 * &lt;p&gt;Java class for CONFIG-RECORD complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="CONFIG-RECORD"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="CONFIG-ID-ITEM" type="{}CONFIG-ID-ITEM" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DIAG-COMM-DATA-CONNECTORS" type="{}DIAG-COMM-DATA-CONNECTORS"/&amp;gt;
 * &amp;lt;element name="CONFIG-ID" type="{}IDENT-VALUE" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DATA-RECORDS" type="{}DATA-RECORDS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="AUDIENCE" type="{}AUDIENCE" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="SYSTEM-ITEMS" type="{}SYSTEM-ITEMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DATA-ID-ITEM" type="{}DATA-ID-ITEM" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="OPTION-ITEMS" type="{}OPTION-ITEMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DEFAULT-DATA-RECORD-SNREF" type="{}SNREF" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="SDGS" type="{}SDGS" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CONFIG-RECORD")
public class CONFIGRECORD {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "CONFIG-ID-ITEM")
    protected CONFIGIDITEM configiditem;
    @XmlElement(name = "DIAG-COMM-DATA-CONNECTORS", required = true)
    protected DIAGCOMMDATACONNECTORS diagcommdataconnectors;
    @XmlElement(name = "CONFIG-ID")
    protected IDENTVALUE configid;
    @XmlElement(name = "DATA-RECORDS")
    protected DATARECORDS datarecords;
    @XmlElement(name = "AUDIENCE")
    protected AUDIENCE audience;
    @XmlElement(name = "SYSTEM-ITEMS")
    protected SYSTEMITEMS systemitems;
    @XmlElement(name = "DATA-ID-ITEM")
    protected DATAIDITEM dataiditem;
    @XmlElement(name = "OPTION-ITEMS")
    protected OPTIONITEMS optionitems;
    @XmlElement(name = "DEFAULT-DATA-RECORD-SNREF")
    protected SNREF defaultdatarecordsnref;
    @XmlElement(name = "SDGS")
    protected SDGS sdgs;

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
     * Gets the value of the configiditem property.
     *
     * @return possible object is
     * {@link CONFIGIDITEM }
     */
    public CONFIGIDITEM getCONFIGIDITEM() {
        return configiditem;
    }

    /**
     * Sets the value of the configiditem property.
     *
     * @param value allowed object is
     *              {@link CONFIGIDITEM }
     */
    public void setCONFIGIDITEM(CONFIGIDITEM value) {
        this.configiditem = value;
    }

    /**
     * Gets the value of the diagcommdataconnectors property.
     *
     * @return possible object is
     * {@link DIAGCOMMDATACONNECTORS }
     */
    public DIAGCOMMDATACONNECTORS getDIAGCOMMDATACONNECTORS() {
        return diagcommdataconnectors;
    }

    /**
     * Sets the value of the diagcommdataconnectors property.
     *
     * @param value allowed object is
     *              {@link DIAGCOMMDATACONNECTORS }
     */
    public void setDIAGCOMMDATACONNECTORS(DIAGCOMMDATACONNECTORS value) {
        this.diagcommdataconnectors = value;
    }

    /**
     * Gets the value of the configid property.
     *
     * @return possible object is
     * {@link IDENTVALUE }
     */
    public IDENTVALUE getCONFIGID() {
        return configid;
    }

    /**
     * Sets the value of the configid property.
     *
     * @param value allowed object is
     *              {@link IDENTVALUE }
     */
    public void setCONFIGID(IDENTVALUE value) {
        this.configid = value;
    }

    /**
     * Gets the value of the datarecords property.
     *
     * @return possible object is
     * {@link DATARECORDS }
     */
    public DATARECORDS getDATARECORDS() {
        return datarecords;
    }

    /**
     * Sets the value of the datarecords property.
     *
     * @param value allowed object is
     *              {@link DATARECORDS }
     */
    public void setDATARECORDS(DATARECORDS value) {
        this.datarecords = value;
    }

    /**
     * Gets the value of the audience property.
     *
     * @return possible object is
     * {@link AUDIENCE }
     */
    public AUDIENCE getAUDIENCE() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     *
     * @param value allowed object is
     *              {@link AUDIENCE }
     */
    public void setAUDIENCE(AUDIENCE value) {
        this.audience = value;
    }

    /**
     * Gets the value of the systemitems property.
     *
     * @return possible object is
     * {@link SYSTEMITEMS }
     */
    public SYSTEMITEMS getSYSTEMITEMS() {
        return systemitems;
    }

    /**
     * Sets the value of the systemitems property.
     *
     * @param value allowed object is
     *              {@link SYSTEMITEMS }
     */
    public void setSYSTEMITEMS(SYSTEMITEMS value) {
        this.systemitems = value;
    }

    /**
     * Gets the value of the dataiditem property.
     *
     * @return possible object is
     * {@link DATAIDITEM }
     */
    public DATAIDITEM getDATAIDITEM() {
        return dataiditem;
    }

    /**
     * Sets the value of the dataiditem property.
     *
     * @param value allowed object is
     *              {@link DATAIDITEM }
     */
    public void setDATAIDITEM(DATAIDITEM value) {
        this.dataiditem = value;
    }

    /**
     * Gets the value of the optionitems property.
     *
     * @return possible object is
     * {@link OPTIONITEMS }
     */
    public OPTIONITEMS getOPTIONITEMS() {
        return optionitems;
    }

    /**
     * Sets the value of the optionitems property.
     *
     * @param value allowed object is
     *              {@link OPTIONITEMS }
     */
    public void setOPTIONITEMS(OPTIONITEMS value) {
        this.optionitems = value;
    }

    /**
     * Gets the value of the defaultdatarecordsnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getDEFAULTDATARECORDSNREF() {
        return defaultdatarecordsnref;
    }

    /**
     * Sets the value of the defaultdatarecordsnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setDEFAULTDATARECORDSNREF(SNREF value) {
        this.defaultdatarecordsnref = value;
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