//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import com.javahacks.odx.index.LocationAware;
import com.javahacks.odx.index.RegionFoldable;
import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for LOGICAL-LINK complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="LOGICAL-LINK"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="GATEWAY-LOGICAL-LINK-REFS" type="{}GATEWAY-LOGICAL-LINK-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="PHYSICAL-VEHICLE-LINK-REF" type="{}ODXLINK"/&amp;gt;
 * &amp;lt;element name="PROTOCOL-REF" type="{}ODXLINK" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="FUNCTIONAL-GROUP-REF" type="{}ODXLINK" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="BASE-VARIANT-REF" type="{}ODXLINK" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="ECU-PROXY-REFS" type="{}ECU-PROXY-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="LINK-COMPARAM-REFS" type="{}LINK-COMPARAM-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="PROT-STACK-SNREF" type="{}SNREF" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 * &amp;lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOGICAL-LINK")
@XmlSeeAlso({
        GATEWAYLOGICALLINK.class,
        MEMBERLOGICALLINK.class
})
public abstract class LOGICALLINK extends LocationAware.AbstractLocationAware implements RegionFoldable {

    @XmlPath("LINK-COMPARAM-REFS/LINK-COMPARAM-REF")
    private final List<LINKCOMPARAMREF> linkcomparamrefs = new ArrayList<>();
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "OID")
    @XmlTransient
    protected String oid;
    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "GATEWAY-LOGICAL-LINK-REFS")
    protected GATEWAYLOGICALLINKREFS gatewaylogicallinkrefs;
    @XmlElement(name = "PHYSICAL-VEHICLE-LINK-REF", required = true)
    protected ODXLINK physicalvehiclelinkref;
    @XmlElement(name = "PROTOCOL-REF")
    protected ODXLINK protocolref;
    @XmlElement(name = "FUNCTIONAL-GROUP-REF")
    protected ODXLINK functionalgroupref;
    @XmlElement(name = "BASE-VARIANT-REF")
    protected ODXLINK basevariantref;
    @XmlElement(name = "ECU-PROXY-REFS")
    protected ECUPROXYREFS ecuproxyrefs;
    @XmlElement(name = "PROT-STACK-SNREF")
    protected SNREF protstacksnref;

    /**
     * Gets the value of the shortname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSHORTNAME() {
        return shortname;
    }

    /**
     * Sets the value of the shortname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSHORTNAME(final String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the longname property.
     *
     * @return possible object is
     * {@link LONGNAME }
     */
    public LONGNAME getLONGNAME() {
        return longname;
    }

    /**
     * Sets the value of the longname property.
     *
     * @param value allowed object is
     *              {@link LONGNAME }
     */
    public void setLONGNAME(final LONGNAME value) {
        this.longname = value;
    }

    /**
     * Gets the value of the desc property.
     *
     * @return possible object is
     * {@link DESCRIPTION }
     */
    public DESCRIPTION getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value allowed object is
     *              {@link DESCRIPTION }
     */
    public void setDESC(final DESCRIPTION value) {
        this.desc = value;
    }

    /**
     * Gets the value of the gatewaylogicallinkrefs property.
     *
     * @return possible object is
     * {@link GATEWAYLOGICALLINKREFS }
     */
    public GATEWAYLOGICALLINKREFS getGATEWAYLOGICALLINKREFS() {
        return gatewaylogicallinkrefs;
    }

    /**
     * Sets the value of the gatewaylogicallinkrefs property.
     *
     * @param value allowed object is
     *              {@link GATEWAYLOGICALLINKREFS }
     */
    public void setGATEWAYLOGICALLINKREFS(final GATEWAYLOGICALLINKREFS value) {
        this.gatewaylogicallinkrefs = value;
    }

    /**
     * Gets the value of the physicalvehiclelinkref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getPHYSICALVEHICLELINKREF() {
        return physicalvehiclelinkref;
    }

    /**
     * Sets the value of the physicalvehiclelinkref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setPHYSICALVEHICLELINKREF(final ODXLINK value) {
        this.physicalvehiclelinkref = value;
    }

    /**
     * Gets the value of the protocolref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getPROTOCOLREF() {
        return protocolref;
    }

    /**
     * Sets the value of the protocolref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setPROTOCOLREF(final ODXLINK value) {
        this.protocolref = value;
    }

    /**
     * Gets the value of the functionalgroupref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getFUNCTIONALGROUPREF() {
        return functionalgroupref;
    }

    /**
     * Sets the value of the functionalgroupref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setFUNCTIONALGROUPREF(final ODXLINK value) {
        this.functionalgroupref = value;
    }

    /**
     * Gets the value of the basevariantref property.
     *
     * @return possible object is
     * {@link ODXLINK }
     */
    public ODXLINK getBASEVARIANTREF() {
        return basevariantref;
    }

    /**
     * Sets the value of the basevariantref property.
     *
     * @param value allowed object is
     *              {@link ODXLINK }
     */
    public void setBASEVARIANTREF(final ODXLINK value) {
        this.basevariantref = value;
    }

    /**
     * Gets the value of the ecuproxyrefs property.
     *
     * @return possible object is
     * {@link ECUPROXYREFS }
     */
    public ECUPROXYREFS getECUPROXYREFS() {
        return ecuproxyrefs;
    }

    /**
     * Sets the value of the ecuproxyrefs property.
     *
     * @param value allowed object is
     *              {@link ECUPROXYREFS }
     */
    public void setECUPROXYREFS(final ECUPROXYREFS value) {
        this.ecuproxyrefs = value;
    }


    /**
     * Gets the value of the protstacksnref property.
     *
     * @return possible object is
     * {@link SNREF }
     */
    public SNREF getPROTSTACKSNREF() {
        return protstacksnref;
    }

    /**
     * Sets the value of the protstacksnref property.
     *
     * @param value allowed object is
     *              {@link SNREF }
     */
    public void setPROTSTACKSNREF(final SNREF value) {
        this.protstacksnref = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setID(final String value) {
        this.id = value;
    }

    /**
     * Gets the value of the oid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOID(final String value) {
        this.oid = value;
    }

    public List<LINKCOMPARAMREF> getLinkcomparamrefs() {
        return linkcomparamrefs;
    }
}
