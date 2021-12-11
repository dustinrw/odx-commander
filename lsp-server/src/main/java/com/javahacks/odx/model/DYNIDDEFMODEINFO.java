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
 * &lt;p&gt;Java class for DYN-ID-DEF-MODE-INFO complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="DYN-ID-DEF-MODE-INFO"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="DEF-MODE" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="CLEAR-DYN-DEF-MESSAGE-REF" type="{}ODXLINK"/&amp;gt;
 * &amp;lt;element name="CLEAR-DYN-DEF-MESSAGE-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="READ-DYN-DEF-MESSAGE-REF" type="{}ODXLINK"/&amp;gt;
 * &amp;lt;element name="READ-DYN-DEF-MESSAGE-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="DYN-DEF-MESSAGE-REF" type="{}ODXLINK"/&amp;gt;
 * &amp;lt;element name="DYN-DEF-MESSAGE-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;element name="SUPPORTED-DYN-IDS" type="{}SUPPORTED-DYN-IDS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="SELECTION-TABLE-REFS" type="{}SELECTION-TABLE-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DYN-ID-DEF-MODE-INFO")
public class DYNIDDEFMODEINFO {

    @XmlElement(name = "DEF-MODE", required = true)
    protected String defmode;
    @XmlElement(name = "CLEAR-DYN-DEF-MESSAGE-REF")
    protected ODXLINK cleardyndefmessageref;
    @XmlElement(name = "CLEAR-DYN-DEF-MESSAGE-SNREF")
    protected SNREF cleardyndefmessagesnref;
    @XmlElement(name = "READ-DYN-DEF-MESSAGE-REF")
    protected ODXLINK readdyndefmessageref;
    @XmlElement(name = "READ-DYN-DEF-MESSAGE-SNREF")
    protected SNREF readdyndefmessagesnref;
    @XmlElement(name = "DYN-DEF-MESSAGE-REF")
    protected ODXLINK dyndefmessageref;
    @XmlElement(name = "DYN-DEF-MESSAGE-SNREF")
    protected SNREF dyndefmessagesnref;
    @XmlElement(name = "SUPPORTED-DYN-IDS")
    protected SUPPORTEDDYNIDS supporteddynids;
    @XmlElement(name = "SELECTION-TABLE-REFS")
    protected SELECTIONTABLEREFS selectiontablerefs;

    /**
     * Gets the value of the defmode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDEFMODE() {
        return defmode;
    }

    /**
     * Sets the value of the defmode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDEFMODE(String value) {
        this.defmode = value;
    }

    /**
     * Gets the value of the cleardyndefmessageref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getCLEARDYNDEFMESSAGEREF() {
        return cleardyndefmessageref;
    }

    /**
     * Sets the value of the cleardyndefmessageref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setCLEARDYNDEFMESSAGEREF(ODXLINK value) {
        this.cleardyndefmessageref = value;
    }

    /**
     * Gets the value of the cleardyndefmessagesnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getCLEARDYNDEFMESSAGESNREF() {
        return cleardyndefmessagesnref;
    }

    /**
     * Sets the value of the cleardyndefmessagesnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setCLEARDYNDEFMESSAGESNREF(SNREF value) {
        this.cleardyndefmessagesnref = value;
    }

    /**
     * Gets the value of the readdyndefmessageref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getREADDYNDEFMESSAGEREF() {
        return readdyndefmessageref;
    }

    /**
     * Sets the value of the readdyndefmessageref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setREADDYNDEFMESSAGEREF(ODXLINK value) {
        this.readdyndefmessageref = value;
    }

    /**
     * Gets the value of the readdyndefmessagesnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getREADDYNDEFMESSAGESNREF() {
        return readdyndefmessagesnref;
    }

    /**
     * Sets the value of the readdyndefmessagesnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setREADDYNDEFMESSAGESNREF(SNREF value) {
        this.readdyndefmessagesnref = value;
    }

    /**
     * Gets the value of the dyndefmessageref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getDYNDEFMESSAGEREF() {
        return dyndefmessageref;
    }

    /**
     * Sets the value of the dyndefmessageref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setDYNDEFMESSAGEREF(ODXLINK value) {
        this.dyndefmessageref = value;
    }

    /**
     * Gets the value of the dyndefmessagesnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getDYNDEFMESSAGESNREF() {
        return dyndefmessagesnref;
    }

    /**
     * Sets the value of the dyndefmessagesnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setDYNDEFMESSAGESNREF(SNREF value) {
        this.dyndefmessagesnref = value;
    }

    /**
     * Gets the value of the supporteddynids property.
     *
     * @return possible object is
     * {@link SUPPORTEDDYNIDS }
     */
    public SUPPORTEDDYNIDS getSUPPORTEDDYNIDS() {
        return supporteddynids;
    }

    /**
     * Sets the value of the supporteddynids property.
     *
     * @param value allowed object is
     *              {@link SUPPORTEDDYNIDS }
     */
    public void setSUPPORTEDDYNIDS(SUPPORTEDDYNIDS value) {
        this.supporteddynids = value;
    }

    /**
     * Gets the value of the selectiontablerefs property.
     *
     * @return possible object is
     * {@link SELECTIONTABLEREFS }
     */
    public SELECTIONTABLEREFS getSELECTIONTABLEREFS() {
        return selectiontablerefs;
    }

    /**
     * Sets the value of the selectiontablerefs property.
     *
     * @param value allowed object is
     *              {@link SELECTIONTABLEREFS }
     */
    public void setSELECTIONTABLEREFS(SELECTIONTABLEREFS value) {
        this.selectiontablerefs = value;
    }

}
