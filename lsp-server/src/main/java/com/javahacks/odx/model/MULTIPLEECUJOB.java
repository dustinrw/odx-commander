//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for MULTIPLE-ECU-JOB complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="MULTIPLE-ECU-JOB"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="ADMIN-DATA" type="{}ADMIN-DATA" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="SDGS" type="{}SDGS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="FUNCT-CLASS-REFS" type="{}FUNCT-CLASS-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="PROG-CODES" type="{}PROG-CODES"/&amp;gt;
 * &amp;lt;element name="INPUT-PARAMS" type="{}INPUT-PARAMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="OUTPUT-PARAMS" type="{}OUTPUT-PARAMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="NEG-OUTPUT-PARAMS" type="{}NEG-OUTPUT-PARAMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DIAG-LAYER-REFS" type="{}DIAG-LAYER-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="AUDIENCE" type="{}AUDIENCE" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 * &amp;lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;attribute name="SEMANTIC" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;attribute name="IS-EXECUTABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MULTIPLE-ECU-JOB")
public class MULTIPLEECUJOB {

    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "ADMIN-DATA")
    protected ADMINDATA admindata;
    @XmlElement(name = "SDGS")
    protected SDGS sdgs;
    @XmlElement(name = "FUNCT-CLASS-REFS")
    protected FUNCTCLASSREFS functclassrefs;
    @XmlElement(name = "PROG-CODES", required = true)
    protected PROGCODES progcodes;
    @XmlElement(name = "INPUT-PARAMS")
    protected INPUTPARAMS inputparams;
    @XmlElement(name = "OUTPUT-PARAMS")
    protected OUTPUTPARAMS outputparams;
    @XmlElement(name = "NEG-OUTPUT-PARAMS")
    protected NEGOUTPUTPARAMS negoutputparams;
    @XmlElement(name = "DIAG-LAYER-REFS")
    protected DIAGLAYERREFS diaglayerrefs;
    @XmlElement(name = "AUDIENCE")
    protected AUDIENCE audience;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "OID")
    @XmlTransient
    protected String oid;
    @XmlAttribute(name = "SEMANTIC")
    protected String semantic;
    @XmlAttribute(name = "IS-EXECUTABLE")
    protected Boolean isexecutable;

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
     * Gets the value of the admindata property.
     *
     * @return possible object is
     * {@link ADMINDATA }
     */
    public ADMINDATA getADMINDATA() {
        return admindata;
    }

    /**
     * Sets the value of the admindata property.
     *
     * @param value allowed object is
     *              {@link ADMINDATA }
     */
    public void setADMINDATA(final ADMINDATA value) {
        this.admindata = value;
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
    public void setSDGS(final SDGS value) {
        this.sdgs = value;
    }

    /**
     * Gets the value of the functclassrefs property.
     *
     * @return possible object is
     * {@link FUNCTCLASSREFS }
     */
    public FUNCTCLASSREFS getFUNCTCLASSREFS() {
        return functclassrefs;
    }

    /**
     * Sets the value of the functclassrefs property.
     *
     * @param value allowed object is
     *              {@link FUNCTCLASSREFS }
     */
    public void setFUNCTCLASSREFS(final FUNCTCLASSREFS value) {
        this.functclassrefs = value;
    }

    /**
     * Gets the value of the progcodes property.
     *
     * @return possible object is
     * {@link PROGCODES }
     */
    public PROGCODES getPROGCODES() {
        return progcodes;
    }

    /**
     * Sets the value of the progcodes property.
     *
     * @param value allowed object is
     *              {@link PROGCODES }
     */
    public void setPROGCODES(final PROGCODES value) {
        this.progcodes = value;
    }

    /**
     * Gets the value of the inputparams property.
     *
     * @return possible object is
     * {@link INPUTPARAMS }
     */
    public INPUTPARAMS getINPUTPARAMS() {
        return inputparams;
    }

    /**
     * Sets the value of the inputparams property.
     *
     * @param value allowed object is
     *              {@link INPUTPARAMS }
     */
    public void setINPUTPARAMS(final INPUTPARAMS value) {
        this.inputparams = value;
    }

    /**
     * Gets the value of the outputparams property.
     *
     * @return possible object is
     * {@link OUTPUTPARAMS }
     */
    public OUTPUTPARAMS getOUTPUTPARAMS() {
        return outputparams;
    }

    /**
     * Sets the value of the outputparams property.
     *
     * @param value allowed object is
     *              {@link OUTPUTPARAMS }
     */
    public void setOUTPUTPARAMS(final OUTPUTPARAMS value) {
        this.outputparams = value;
    }

    /**
     * Gets the value of the negoutputparams property.
     *
     * @return possible object is
     * {@link NEGOUTPUTPARAMS }
     */
    public NEGOUTPUTPARAMS getNEGOUTPUTPARAMS() {
        return negoutputparams;
    }

    /**
     * Sets the value of the negoutputparams property.
     *
     * @param value allowed object is
     *              {@link NEGOUTPUTPARAMS }
     */
    public void setNEGOUTPUTPARAMS(final NEGOUTPUTPARAMS value) {
        this.negoutputparams = value;
    }

    /**
     * Gets the value of the diaglayerrefs property.
     *
     * @return possible object is
     * {@link DIAGLAYERREFS }
     */
    public DIAGLAYERREFS getDIAGLAYERREFS() {
        return diaglayerrefs;
    }

    /**
     * Sets the value of the diaglayerrefs property.
     *
     * @param value allowed object is
     *              {@link DIAGLAYERREFS }
     */
    public void setDIAGLAYERREFS(final DIAGLAYERREFS value) {
        this.diaglayerrefs = value;
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
    public void setAUDIENCE(final AUDIENCE value) {
        this.audience = value;
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

    /**
     * Gets the value of the isexecutable property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isISEXECUTABLE() {
        if (isexecutable == null) {
            return true;
        } else {
            return isexecutable;
        }
    }

    /**
     * Sets the value of the isexecutable property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setISEXECUTABLE(final Boolean value) {
        this.isexecutable = value;
    }

}
