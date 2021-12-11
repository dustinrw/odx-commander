//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import com.javahacks.odx.index.RegionFoldable;
import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for DIAG-SERVICE complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="DIAG-SERVICE"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}DIAG-COMM"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="COMPARAM-REFS" type="{}COMPARAM-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="REQUEST-REF" type="{}ODXLINK" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="POS-RESPONSE-REFS" type="{}POS-RESPONSE-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="NEG-RESPONSE-REFS" type="{}NEG-RESPONSE-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="POS-RESPONSE-SUPPRESSABLE" type="{}POS-RESPONSE-SUPPRESSABLE" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="IS-CYCLIC" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 * &amp;lt;attribute name="IS-MULTIPLE" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 * &amp;lt;attribute name="ADDRESSING" type="{}ADDRESSING" default="PHYSICAL" /&amp;gt;
 * &amp;lt;attribute name="TRANSMISSION-MODE" type="{}TRANS-MODE" default="SEND-AND-RECEIVE" /&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIAG-SERVICE")
public class DIAGSERVICE
        extends DIAGCOMM implements RegionFoldable {

    @XmlPath("COMPARAM-REFS/COMPARAM-REF")
    protected List<COMPARAMREF> comparamrefs = new ArrayList<>();
    @XmlElement(name = "REQUEST-REF")
    protected ODXLINK requestref;


    @XmlElement(name = "POS-RESPONSE-SUPPRESSABLE")
    protected POSRESPONSESUPPRESSABLE posresponsesuppressable;
    @XmlAttribute(name = "IS-CYCLIC")
    protected Boolean iscyclic;
    @XmlAttribute(name = "IS-MULTIPLE")
    protected Boolean ismultiple;
    @XmlAttribute(name = "ADDRESSING")
    protected ADDRESSING addressing;
    @XmlAttribute(name = "TRANSMISSION-MODE")
    protected TRANSMODE transmissionmode;

    @XmlPath("POS-RESPONSE-REFS/POS-RESPONSE-REF")
    protected List<ODXLINK> posresponserefs = new ArrayList<>();

    @XmlElement(name = "NEG-RESPONSE-REFS/NEG-RESPONSE-REF")
    protected List<ODXLINK> negresponserefs = new ArrayList<>();

    /**
     * Gets the value of the requestref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getREQUESTREF() {
        return requestref;
    }

    /**
     * Sets the value of the requestref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setREQUESTREF(final ODXLINK value) {
        this.requestref = value;
    }


    /**
     * Gets the value of the posresponsesuppressable property.
     *
     * @return possible object is
     * {@link POSRESPONSESUPPRESSABLE }
     */
    public POSRESPONSESUPPRESSABLE getPOSRESPONSESUPPRESSABLE() {
        return posresponsesuppressable;
    }

    /**
     * Sets the value of the posresponsesuppressable property.
     *
     * @param value allowed object is
     *              {@link POSRESPONSESUPPRESSABLE }
     */
    public void setPOSRESPONSESUPPRESSABLE(final POSRESPONSESUPPRESSABLE value) {
        this.posresponsesuppressable = value;
    }

    /**
     * Gets the value of the iscyclic property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isISCYCLIC() {
        if (iscyclic == null) {
            return false;
        } else {
            return iscyclic;
        }
    }

    /**
     * Sets the value of the iscyclic property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setISCYCLIC(final Boolean value) {
        this.iscyclic = value;
    }

    /**
     * Gets the value of the ismultiple property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isISMULTIPLE() {
        if (ismultiple == null) {
            return false;
        } else {
            return ismultiple;
        }
    }

    /**
     * Sets the value of the ismultiple property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setISMULTIPLE(final Boolean value) {
        this.ismultiple = value;
    }

    /**
     * Gets the value of the addressing property.
     *
     * @return possible object is
     * {@link ADDRESSING }
     */
    public ADDRESSING getADDRESSING() {
        if (addressing == null) {
            return ADDRESSING.PHYSICAL;
        } else {
            return addressing;
        }
    }

    /**
     * Sets the value of the addressing property.
     *
     * @param value allowed object is
     *              {@link ADDRESSING }
     */
    public void setADDRESSING(final ADDRESSING value) {
        this.addressing = value;
    }

    /**
     * Gets the value of the transmissionmode property.
     *
     * @return possible object is
     * {@link TRANSMODE }
     */
    public TRANSMODE getTRANSMISSIONMODE() {
        if (transmissionmode == null) {
            return TRANSMODE.SEND_AND_RECEIVE;
        } else {
            return transmissionmode;
        }
    }

    /**
     * Sets the value of the transmissionmode property.
     *
     * @param value allowed object is
     *              {@link TRANSMODE }
     */
    public void setTRANSMISSIONMODE(final TRANSMODE value) {
        this.transmissionmode = value;
    }


    public List<ODXLINK> getPosresponserefs() {
        return posresponserefs;
    }

    public List<ODXLINK> getNegresponserefs() {
        return negresponserefs;
    }

    public List<COMPARAMREF> getComparamrefs() {
        return comparamrefs;
    }
}
