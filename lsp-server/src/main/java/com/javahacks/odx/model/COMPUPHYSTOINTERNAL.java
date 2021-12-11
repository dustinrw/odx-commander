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
 * &lt;p&gt;Java class for COMPU-PHYS-TO-INTERNAL complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="COMPU-PHYS-TO-INTERNAL"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;choice&amp;gt;
 * &amp;lt;element name="PROG-CODE" type="{}PROG-CODE"/&amp;gt;
 * &amp;lt;element name="COMPU-SCALES" type="{}COMPU-SCALES"/&amp;gt;
 * &amp;lt;/choice&amp;gt;
 * &amp;lt;element name="COMPU-DEFAULT-VALUE" type="{}COMPU-DEFAULT-VALUE" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPU-PHYS-TO-INTERNAL")
public class COMPUPHYSTOINTERNAL {

    @XmlElement(name = "PROG-CODE")
    protected PROGCODE progcode;
    @XmlElement(name = "COMPU-SCALES")
    protected COMPUSCALES compuscales;
    @XmlElement(name = "COMPU-DEFAULT-VALUE")
    protected COMPUDEFAULTVALUE compudefaultvalue;

    /**
     * Gets the value of the progcode property.
     *
     * @return possible object is
     * {@link PROGCODE }
     */
    public PROGCODE getPROGCODE() {
        return progcode;
    }

    /**
     * Sets the value of the progcode property.
     *
     * @param value allowed object is
     *              {@link PROGCODE }
     */
    public void setPROGCODE(PROGCODE value) {
        this.progcode = value;
    }

    /**
     * Gets the value of the compuscales property.
     *
     * @return possible object is
     * {@link COMPUSCALES }
     */
    public COMPUSCALES getCOMPUSCALES() {
        return compuscales;
    }

    /**
     * Sets the value of the compuscales property.
     *
     * @param value allowed object is
     *              {@link COMPUSCALES }
     */
    public void setCOMPUSCALES(COMPUSCALES value) {
        this.compuscales = value;
    }

    /**
     * Gets the value of the compudefaultvalue property.
     *
     * @return possible object is
     * {@link COMPUDEFAULTVALUE }
     */
    public COMPUDEFAULTVALUE getCOMPUDEFAULTVALUE() {
        return compudefaultvalue;
    }

    /**
     * Sets the value of the compudefaultvalue property.
     *
     * @param value allowed object is
     *              {@link COMPUDEFAULTVALUE }
     */
    public void setCOMPUDEFAULTVALUE(COMPUDEFAULTVALUE value) {
        this.compudefaultvalue = value;
    }

}
