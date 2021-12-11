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
 * &lt;p&gt;Java class for OPTION-ITEM complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="OPTION-ITEM"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}CONFIG-ITEM"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="PHYSICAL-DEFAULT-VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="ITEM-VALUES" type="{}ITEM-VALUES" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="WRITE-AUDIENCE" type="{}AUDIENCE" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="READ-AUDIENCE" type="{}AUDIENCE" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPTION-ITEM")
public class OPTIONITEM
        extends CONFIGITEM {

    @XmlElement(name = "PHYSICAL-DEFAULT-VALUE")
    protected String physicaldefaultvalue;
    @XmlElement(name = "ITEM-VALUES")
    protected ITEMVALUES itemvalues;
    @XmlElement(name = "WRITE-AUDIENCE")
    protected AUDIENCE writeaudience;
    @XmlElement(name = "READ-AUDIENCE")
    protected AUDIENCE readaudience;

    /**
     * Gets the value of the physicaldefaultvalue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPHYSICALDEFAULTVALUE() {
        return physicaldefaultvalue;
    }

    /**
     * Sets the value of the physicaldefaultvalue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPHYSICALDEFAULTVALUE(String value) {
        this.physicaldefaultvalue = value;
    }

    /**
     * Gets the value of the itemvalues property.
     *
     * @return possible object is
     * {@link ITEMVALUES }
     */
    public ITEMVALUES getITEMVALUES() {
        return itemvalues;
    }

    /**
     * Sets the value of the itemvalues property.
     *
     * @param value allowed object is
     *              {@link ITEMVALUES }
     */
    public void setITEMVALUES(ITEMVALUES value) {
        this.itemvalues = value;
    }

    /**
     * Gets the value of the writeaudience property.
     *
     * @return possible object is
     * {@link AUDIENCE }
     */
    public AUDIENCE getWRITEAUDIENCE() {
        return writeaudience;
    }

    /**
     * Sets the value of the writeaudience property.
     *
     * @param value allowed object is
     *              {@link AUDIENCE }
     */
    public void setWRITEAUDIENCE(AUDIENCE value) {
        this.writeaudience = value;
    }

    /**
     * Gets the value of the readaudience property.
     *
     * @return possible object is
     * {@link AUDIENCE }
     */
    public AUDIENCE getREADAUDIENCE() {
        return readaudience;
    }

    /**
     * Sets the value of the readaudience property.
     *
     * @param value allowed object is
     *              {@link AUDIENCE }
     */
    public void setREADAUDIENCE(AUDIENCE value) {
        this.readaudience = value;
    }

}
