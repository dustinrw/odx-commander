//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.*;


/**
 * &lt;p&gt;Java class for VALIDITY-FOR complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="VALIDITY-FOR"&amp;gt;
 * &amp;lt;simpleContent&amp;gt;
 * &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
 * &amp;lt;attribute name="TYPE" use="required" type="{}SESSION-SUB-ELEM-TYPE" /&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VALIDITY-FOR")
public class VALIDITYFOR {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "TYPE", required = true)
    protected SESSIONSUBELEMTYPE type;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link SESSIONSUBELEMTYPE }
     */
    public SESSIONSUBELEMTYPE getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link SESSIONSUBELEMTYPE }
     */
    public void setTYPE(SESSIONSUBELEMTYPE value) {
        this.type = value;
    }

}
