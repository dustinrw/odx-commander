//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import com.javahacks.odx.index.LocationAware.AbstractLocationAware;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SECURITY complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="SECURITY"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="SECURITY-METHOD" type="{}SECURITY-METHOD" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="FW-SIGNATURE" type="{}FW-SIGNATURE" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="FW-CHECKSUM" type="{}FW-CHECKSUM" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="VALIDITY-FOR" type="{}VALIDITY-FOR" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECURITY")
public class SECURITY extends AbstractLocationAware {

    @XmlElement(name = "SECURITY-METHOD")
    protected SECURITYMETHOD securitymethod;
    @XmlElement(name = "FW-SIGNATURE")
    protected FWSIGNATURE fwsignature;
    @XmlElement(name = "FW-CHECKSUM")
    protected FWCHECKSUM fwchecksum;
    @XmlElement(name = "VALIDITY-FOR")
    protected VALIDITYFOR validityfor;

    /**
     * Gets the value of the securitymethod property.
     *
     * @return possible object is
     * {@link SECURITYMETHOD }
     */
    public SECURITYMETHOD getSECURITYMETHOD() {
        return securitymethod;
    }

    /**
     * Sets the value of the securitymethod property.
     *
     * @param value allowed object is
     *              {@link SECURITYMETHOD }
     */
    public void setSECURITYMETHOD(SECURITYMETHOD value) {
        this.securitymethod = value;
    }

    /**
     * Gets the value of the fwsignature property.
     *
     * @return possible object is
     * {@link FWSIGNATURE }
     */
    public FWSIGNATURE getFWSIGNATURE() {
        return fwsignature;
    }

    /**
     * Sets the value of the fwsignature property.
     *
     * @param value allowed object is
     *              {@link FWSIGNATURE }
     */
    public void setFWSIGNATURE(FWSIGNATURE value) {
        this.fwsignature = value;
    }

    /**
     * Gets the value of the fwchecksum property.
     *
     * @return possible object is
     * {@link FWCHECKSUM }
     */
    public FWCHECKSUM getFWCHECKSUM() {
        return fwchecksum;
    }

    /**
     * Sets the value of the fwchecksum property.
     *
     * @param value allowed object is
     *              {@link FWCHECKSUM }
     */
    public void setFWCHECKSUM(FWCHECKSUM value) {
        this.fwchecksum = value;
    }

    /**
     * Gets the value of the validityfor property.
     *
     * @return possible object is
     * {@link VALIDITYFOR }
     */
    public VALIDITYFOR getVALIDITYFOR() {
        return validityfor;
    }

    /**
     * Sets the value of the validityfor property.
     *
     * @param value allowed object is
     *              {@link VALIDITYFOR }
     */
    public void setVALIDITYFOR(VALIDITYFOR value) {
        this.validityfor = value;
    }

}
