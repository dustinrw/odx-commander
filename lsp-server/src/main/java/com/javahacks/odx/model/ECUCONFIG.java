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
 * &lt;p&gt;Java class for ECU-CONFIG complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="ECU-CONFIG"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}ODX-CATEGORY"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="CONFIG-DATAS" type="{}CONFIG-DATAS"/&amp;gt;
 * &amp;lt;element name="ADDITIONAL-AUDIENCES" type="{}ADDITIONAL-AUDIENCES" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="CONFIG-DATA-DICTIONARY-SPEC" type="{}CONFIG-DATA-DICTIONARY-SPEC" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECU-CONFIG")
public class ECUCONFIG
        extends ODXCATEGORY {

    @XmlElement(name = "CONFIG-DATAS", required = true)
    protected CONFIGDATAS configdatas;
    @XmlElement(name = "ADDITIONAL-AUDIENCES")
    protected ADDITIONALAUDIENCES additionalaudiences;
    @XmlElement(name = "CONFIG-DATA-DICTIONARY-SPEC")
    protected CONFIGDATADICTIONARYSPEC configdatadictionaryspec;

    /**
     * Gets the value of the configdatas property.
     *
     * @return possible object is
     * {@link CONFIGDATAS }
     */
    public CONFIGDATAS getCONFIGDATAS() {
        return configdatas;
    }

    /**
     * Sets the value of the configdatas property.
     *
     * @param value allowed object is
     *              {@link CONFIGDATAS }
     */
    public void setCONFIGDATAS(CONFIGDATAS value) {
        this.configdatas = value;
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

    /**
     * Gets the value of the configdatadictionaryspec property.
     *
     * @return possible object is
     * {@link CONFIGDATADICTIONARYSPEC }
     */
    public CONFIGDATADICTIONARYSPEC getCONFIGDATADICTIONARYSPEC() {
        return configdatadictionaryspec;
    }

    /**
     * Sets the value of the configdatadictionaryspec property.
     *
     * @param value allowed object is
     *              {@link CONFIGDATADICTIONARYSPEC }
     */
    public void setCONFIGDATADICTIONARYSPEC(CONFIGDATADICTIONARYSPEC value) {
        this.configdatadictionaryspec = value;
    }

}
