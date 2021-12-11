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
 * &lt;p&gt;Java class for IDENT-DESC complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="IDENT-DESC"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="DIAG-COMM-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;element name="IDENT-IF-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="OUT-PARAM-IF-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;element name="OUT-PARAM-IF-SNPATHREF" type="{}SNPATHREF"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENT-DESC")
public class IDENTDESC {

    @XmlElement(name = "DIAG-COMM-SNREF", required = true)
    protected SNREF diagcommsnref;
    @XmlElement(name = "IDENT-IF-SNREF", required = true)
    protected SNREF identifsnref;
    @XmlElement(name = "OUT-PARAM-IF-SNREF")
    protected SNREF outparamifsnref;
    @XmlElement(name = "OUT-PARAM-IF-SNPATHREF")
    protected SNPATHREF outparamifsnpathref;

    /**
     * Gets the value of the diagcommsnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getDIAGCOMMSNREF() {
        return diagcommsnref;
    }

    /**
     * Sets the value of the diagcommsnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setDIAGCOMMSNREF(SNREF value) {
        this.diagcommsnref = value;
    }

    /**
     * Gets the value of the identifsnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getIDENTIFSNREF() {
        return identifsnref;
    }

    /**
     * Sets the value of the identifsnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setIDENTIFSNREF(SNREF value) {
        this.identifsnref = value;
    }

    /**
     * Gets the value of the outparamifsnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getOUTPARAMIFSNREF() {
        return outparamifsnref;
    }

    /**
     * Sets the value of the outparamifsnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setOUTPARAMIFSNREF(SNREF value) {
        this.outparamifsnref = value;
    }

    /**
     * Gets the value of the outparamifsnpathref property.
     *
     * @return possible object is
     * {@link SNPATHREF }
     */
    public SNPATHREF getOUTPARAMIFSNPATHREF() {
        return outparamifsnpathref;
    }

    /**
     * Sets the value of the outparamifsnpathref property.
     *
     * @param value allowed object is
     *              {@link SNPATHREF }
     */
    public void setOUTPARAMIFSNPATHREF(SNPATHREF value) {
        this.outparamifsnpathref = value;
    }

}
