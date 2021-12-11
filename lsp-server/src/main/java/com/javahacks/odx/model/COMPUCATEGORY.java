//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for COMPU-CATEGORY.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="COMPU-CATEGORY"&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 * &amp;lt;enumeration value="IDENTICAL"/&amp;gt;
 * &amp;lt;enumeration value="LINEAR"/&amp;gt;
 * &amp;lt;enumeration value="SCALE-LINEAR"/&amp;gt;
 * &amp;lt;enumeration value="TEXTTABLE"/&amp;gt;
 * &amp;lt;enumeration value="COMPUCODE"/&amp;gt;
 * &amp;lt;enumeration value="TAB-INTP"/&amp;gt;
 * &amp;lt;enumeration value="RAT-FUNC"/&amp;gt;
 * &amp;lt;enumeration value="SCALE-RAT-FUNC"/&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlType(name = "COMPU-CATEGORY")
@XmlEnum
public enum COMPUCATEGORY {

    IDENTICAL("IDENTICAL"),
    LINEAR("LINEAR"),
    @XmlEnumValue("SCALE-LINEAR")
    SCALE_LINEAR("SCALE-LINEAR"),
    TEXTTABLE("TEXTTABLE"),
    COMPUCODE("COMPUCODE"),
    @XmlEnumValue("TAB-INTP")
    TAB_INTP("TAB-INTP"),
    @XmlEnumValue("RAT-FUNC")
    RAT_FUNC("RAT-FUNC"),
    @XmlEnumValue("SCALE-RAT-FUNC")
    SCALE_RAT_FUNC("SCALE-RAT-FUNC");
    private final String value;

    COMPUCATEGORY(String v) {
        value = v;
    }

    public static COMPUCATEGORY fromValue(String v) {
        for (COMPUCATEGORY c : COMPUCATEGORY.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}