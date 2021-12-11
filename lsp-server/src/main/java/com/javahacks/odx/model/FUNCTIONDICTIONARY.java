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
 * &lt;p&gt;Java class for FUNCTION-DICTIONARY complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="FUNCTION-DICTIONARY"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}ODX-CATEGORY"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="FUNCTION-NODES" type="{}FUNCTION-NODES" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="FUNCTION-NODE-GROUPS" type="{}FUNCTION-NODE-GROUPS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="ADDITIONAL-AUDIENCES" type="{}ADDITIONAL-AUDIENCES" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FUNCTION-DICTIONARY")
public class FUNCTIONDICTIONARY
        extends ODXCATEGORY {

    @XmlElement(name = "FUNCTION-NODES")
    protected FUNCTIONNODES functionnodes;
    @XmlElement(name = "FUNCTION-NODE-GROUPS")
    protected FUNCTIONNODEGROUPS functionnodegroups;
    @XmlElement(name = "ADDITIONAL-AUDIENCES")
    protected ADDITIONALAUDIENCES additionalaudiences;

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

    /**
     * Gets the value of the functionnodegroups property.
     *
     * @return possible object is
     * {@link FUNCTIONNODEGROUPS }
     */
    public FUNCTIONNODEGROUPS getFUNCTIONNODEGROUPS() {
        return functionnodegroups;
    }

    /**
     * Sets the value of the functionnodegroups property.
     *
     * @param value allowed object is
     *              {@link FUNCTIONNODEGROUPS }
     */
    public void setFUNCTIONNODEGROUPS(FUNCTIONNODEGROUPS value) {
        this.functionnodegroups = value;
    }

    /**
     * Gets the value of the additionalaudiences property.
     *
     * @return possible object is
     * {@link ADDITIONALAUDIENCES }
     */
    public ADDITIONALAUDIENCES getADDITIONALAUDIENCES() {
        return additionalaudiences;
    }

    /**
     * Sets the value of the additionalaudiences property.
     *
     * @param value allowed object is
     *              {@link ADDITIONALAUDIENCES }
     */
    public void setADDITIONALAUDIENCES(ADDITIONALAUDIENCES value) {
        this.additionalaudiences = value;
    }

}
