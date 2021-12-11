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
 * &lt;p&gt;Java class for SINGLE-ECU-JOB complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="SINGLE-ECU-JOB"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}DIAG-COMM"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="PROG-CODES" type="{}PROG-CODES"/&amp;gt;
 * &amp;lt;element name="INPUT-PARAMS" type="{}INPUT-PARAMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="OUTPUT-PARAMS" type="{}OUTPUT-PARAMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="NEG-OUTPUT-PARAMS" type="{}NEG-OUTPUT-PARAMS" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SINGLE-ECU-JOB")
public class SINGLEECUJOB
        extends DIAGCOMM {

    @XmlElement(name = "PROG-CODES", required = true)
    protected PROGCODES progcodes;
    @XmlElement(name = "INPUT-PARAMS")
    protected INPUTPARAMS inputparams;
    @XmlElement(name = "OUTPUT-PARAMS")
    protected OUTPUTPARAMS outputparams;
    @XmlElement(name = "NEG-OUTPUT-PARAMS")
    protected NEGOUTPUTPARAMS negoutputparams;

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
    public void setPROGCODES(PROGCODES value) {
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
    public void setINPUTPARAMS(INPUTPARAMS value) {
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
    public void setOUTPUTPARAMS(OUTPUTPARAMS value) {
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
    public void setNEGOUTPUTPARAMS(NEGOUTPUTPARAMS value) {
        this.negoutputparams = value;
    }

}
