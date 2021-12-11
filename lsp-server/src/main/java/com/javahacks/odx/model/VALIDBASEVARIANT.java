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
 * &lt;p&gt;Java class for VALID-BASE-VARIANT complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="VALID-BASE-VARIANT"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="ECU-VARIANT-SNREFS" type="{}ECU-VARIANT-SNREFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="BASE-VARIANT-SNREF" type="{}SNREF"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALID-BASE-VARIANT")
public class VALIDBASEVARIANT {

    @XmlElement(name = "ECU-VARIANT-SNREFS")
    protected ECUVARIANTSNREFS ecuvariantsnrefs;
    @XmlElement(name = "BASE-VARIANT-SNREF", required = true)
    protected SNREF basevariantsnref;

    /**
     * Gets the value of the ecuvariantsnrefs property.
     *
     * @return possible object is
     * {@link ECUVARIANTSNREFS }
     */
    public ECUVARIANTSNREFS getECUVARIANTSNREFS() {
        return ecuvariantsnrefs;
    }

    /**
     * Sets the value of the ecuvariantsnrefs property.
     *
     * @param value allowed object is
     *              {@link ECUVARIANTSNREFS }
     */
    public void setECUVARIANTSNREFS(ECUVARIANTSNREFS value) {
        this.ecuvariantsnrefs = value;
    }

    /**
     * Gets the value of the basevariantsnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getBASEVARIANTSNREF() {
        return basevariantsnref;
    }

    /**
     * Sets the value of the basevariantsnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setBASEVARIANTSNREF(SNREF value) {
        this.basevariantsnref = value;
    }

}
