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
 * &lt;p&gt;Java class for LEADING-LENGTH-INFO-TYPE complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="LEADING-LENGTH-INFO-TYPE"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}DIAG-CODED-TYPE"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="BIT-LENGTH"&amp;gt;
 * &amp;lt;simpleType&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&amp;gt;
 * &amp;lt;minExclusive value="0"/&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &amp;lt;/element&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LEADING-LENGTH-INFO-TYPE")
public class LEADINGLENGTHINFOTYPE
        extends DIAGCODEDTYPE {

    @XmlElement(name = "BIT-LENGTH")
    protected long bitlength;

    /**
     * Gets the value of the bitlength property.
     */
    public long getBITLENGTH() {
        return bitlength;
    }

    /**
     * Sets the value of the bitlength property.
     */
    public void setBITLENGTH(long value) {
        this.bitlength = value;
    }

}
