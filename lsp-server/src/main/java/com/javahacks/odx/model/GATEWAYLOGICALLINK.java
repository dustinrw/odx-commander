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
 * &lt;p&gt;Java class for GATEWAY-LOGICAL-LINK complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="GATEWAY-LOGICAL-LINK"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}LOGICAL-LINK"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="SEMANTIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GATEWAY-LOGICAL-LINK")
public class GATEWAYLOGICALLINK
        extends LOGICALLINK {

    @XmlElement(name = "SEMANTIC")
    protected String semantic;

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
    public void setSEMANTIC(String value) {
        this.semantic = value;
    }

}