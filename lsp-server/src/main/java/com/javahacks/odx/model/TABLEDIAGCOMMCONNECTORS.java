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
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for TABLE-DIAG-COMM-CONNECTORS complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="TABLE-DIAG-COMM-CONNECTORS"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="TABLE-DIAG-COMM-CONNECTOR" type="{}TABLE-DIAG-COMM-CONNECTOR" maxOccurs="unbounded"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TABLE-DIAG-COMM-CONNECTORS")
public class TABLEDIAGCOMMCONNECTORS {

    @XmlElement(name = "TABLE-DIAG-COMM-CONNECTOR", required = true)
    protected List<TABLEDIAGCOMMCONNECTOR> tablediagcommconnector;

    /**
     * Gets the value of the tablediagcommconnector property.
     * <p>
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tablediagcommconnector property.
     * <p>
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     * getTABLEDIAGCOMMCONNECTOR().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TABLEDIAGCOMMCONNECTOR }
     */
    public List<TABLEDIAGCOMMCONNECTOR> getTABLEDIAGCOMMCONNECTOR() {
        if (tablediagcommconnector == null) {
            tablediagcommconnector = new ArrayList<TABLEDIAGCOMMCONNECTOR>();
        }
        return this.tablediagcommconnector;
    }

}
