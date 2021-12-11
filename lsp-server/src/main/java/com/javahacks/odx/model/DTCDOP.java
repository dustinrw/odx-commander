//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for DTC-DOP complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="DTC-DOP"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}DOP-BASE"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="DIAG-CODED-TYPE" type="{}DIAG-CODED-TYPE"/&amp;gt;
 * &amp;lt;element name="PHYSICAL-TYPE" type="{}PHYSICAL-TYPE"/&amp;gt;
 * &amp;lt;element name="COMPU-METHOD" type="{}COMPU-METHOD"/&amp;gt;
 * &amp;lt;element name="DTCS" type="{}DTCS"/&amp;gt;
 * &amp;lt;element name="LINKED-DTC-DOPS" type="{}LINKED-DTC-DOPS" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="IS-VISIBLE" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTC-DOP")
public class DTCDOP
        extends DOPBASE {

    @XmlElement(name = "DIAG-CODED-TYPE", required = true)
    protected DIAGCODEDTYPE diagcodedtype;
    @XmlElement(name = "PHYSICAL-TYPE", required = true)
    protected PHYSICALTYPE physicaltype;
    @XmlElement(name = "COMPU-METHOD", required = true)
    protected COMPUMETHOD compumethod;
    @XmlElement(name = "DTCS", required = true)
    protected DTCS dtcs;
    @XmlPath("LINKED-DTC-DOPS/LINKED-DTC-DOP")
    protected List<LINKEDDTCDOP> linkeddtcdops = new ArrayList<>();
    @XmlAttribute(name = "IS-VISIBLE")
    protected Boolean isvisible;

    /**
     * Gets the value of the diagcodedtype property.
     *
     * @return possible object is
     * {@link DIAGCODEDTYPE }
     */
    public DIAGCODEDTYPE getDIAGCODEDTYPE() {
        return diagcodedtype;
    }

    /**
     * Sets the value of the diagcodedtype property.
     *
     * @param value allowed object is
     *              {@link DIAGCODEDTYPE }
     */
    public void setDIAGCODEDTYPE(final DIAGCODEDTYPE value) {
        this.diagcodedtype = value;
    }

    /**
     * Gets the value of the physicaltype property.
     *
     * @return possible object is
     * {@link PHYSICALTYPE }
     */
    public PHYSICALTYPE getPHYSICALTYPE() {
        return physicaltype;
    }

    /**
     * Sets the value of the physicaltype property.
     *
     * @param value allowed object is
     *              {@link PHYSICALTYPE }
     */
    public void setPHYSICALTYPE(final PHYSICALTYPE value) {
        this.physicaltype = value;
    }

    /**
     * Gets the value of the compumethod property.
     *
     * @return possible object is
     * {@link COMPUMETHOD }
     */
    public COMPUMETHOD getCOMPUMETHOD() {
        return compumethod;
    }

    /**
     * Sets the value of the compumethod property.
     *
     * @param value allowed object is
     *              {@link COMPUMETHOD }
     */
    public void setCOMPUMETHOD(final COMPUMETHOD value) {
        this.compumethod = value;
    }

    /**
     * Gets the value of the dtcs property.
     *
     * @return possible object is
     * {@link DTCS }
     */
    public DTCS getDTCS() {
        return dtcs;
    }

    /**
     * Sets the value of the dtcs property.
     *
     * @param value allowed object is
     *              {@link DTCS }
     */
    public void setDTCS(final DTCS value) {
        this.dtcs = value;
    }

    /**
     * Gets the value of the isvisible property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isISVISIBLE() {
        if (isvisible == null) {
            return false;
        } else {
            return isvisible;
        }
    }

    /**
     * Sets the value of the isvisible property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setISVISIBLE(final Boolean value) {
        this.isvisible = value;
    }

    public List<LINKEDDTCDOP> getLinkeddtcdops() {
        return linkeddtcdops;
    }
}
