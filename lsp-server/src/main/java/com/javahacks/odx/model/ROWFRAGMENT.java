//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ROW-FRAGMENT.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ROW-FRAGMENT"&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="KEY"/&amp;gt;
 * &amp;lt;enumeration value="STRUCT"/&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlType(name = "ROW-FRAGMENT")
@XmlEnum
public enum ROWFRAGMENT {

    KEY,
    STRUCT;

    public static ROWFRAGMENT fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
