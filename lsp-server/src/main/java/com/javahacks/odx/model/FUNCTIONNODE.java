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
 * &lt;p&gt;Java class for FUNCTION-NODE complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="FUNCTION-NODE"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}BASE-FUNCTION-NODE"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="FUNCTION-NODES" type="{}FUNCTION-NODES" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FUNCTION-NODE")
public class FUNCTIONNODE
        extends BASEFUNCTIONNODE {

    @XmlElement(name = "FUNCTION-NODES")
    protected FUNCTIONNODES functionnodes;

    /**
     * Gets the value of the functionnodes property.
     *
     * @return possible object is
     * {@link FUNCTIONNODES }
     */
    public FUNCTIONNODES getFUNCTIONNODES() {
        return functionnodes;
    }

    /**
     * Sets the value of the functionnodes property.
     *
     * @param value allowed object is
     *              {@link FUNCTIONNODES }
     */
    public void setFUNCTIONNODES(FUNCTIONNODES value) {
        this.functionnodes = value;
    }

}
