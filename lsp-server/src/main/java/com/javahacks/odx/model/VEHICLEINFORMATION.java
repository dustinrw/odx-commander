//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import com.javahacks.odx.index.LocationAware;
import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for VEHICLE-INFORMATION complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="VEHICLE-INFORMATION"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;group ref="{}ELEMENT-ID"/&amp;gt;
 * &amp;lt;element name="INFO-COMPONENT-REFS" type="{}INFO-COMPONENT-REFS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="VEHICLE-CONNECTORS" type="{}VEHICLE-CONNECTORS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="LOGICAL-LINKS" type="{}LOGICAL-LINKS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="ECU-GROUPS" type="{}ECU-GROUPS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="PHYSICAL-VEHICLE-LINKS" type="{}PHYSICAL-VEHICLE-LINKS" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VEHICLE-INFORMATION")
public class VEHICLEINFORMATION extends LocationAware.AbstractLocationAware {

    @XmlPath("LOGICAL-LINKS/LOGICAL-LINK")
    private final List<LOGICALLINK> logicallinks = new ArrayList<>();
    @XmlPath("PHYSICAL-VEHICLE-LINKS/PHYSICAL-VEHICLE-LINK")
    private final List<PHYSICALVEHICLELINK> physicalvehiclelinks = new ArrayList<>();
    @XmlElement(name = "SHORT-NAME", required = true)
    protected String shortname;
    @XmlElement(name = "LONG-NAME")
    protected LONGNAME longname;
    @XmlElement(name = "DESC")
    protected DESCRIPTION desc;
    @XmlElement(name = "INFO-COMPONENT-REFS")
    protected INFOCOMPONENTREFS infocomponentrefs;
    @XmlElement(name = "ECU-GROUPS")
    protected ECUGROUPS ecugroups;
    @XmlPath("VEHICLE-CONNECTORS/VEHICLE-CONNECTOR")
    protected List<VEHICLECONNECTOR> vehicleconnectors = new ArrayList<>();

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
     * Gets the value of the infocomponentrefs property.
     *
     * @return possible object is
     * {@link INFOCOMPONENTREFS }
     */
    public INFOCOMPONENTREFS getINFOCOMPONENTREFS() {
        return infocomponentrefs;
    }

    /**
     * Sets the value of the infocomponentrefs property.
     *
     * @param value allowed object is
     *              {@link INFOCOMPONENTREFS }
     */
    public void setINFOCOMPONENTREFS(final INFOCOMPONENTREFS value) {
        this.infocomponentrefs = value;
    }


    /**
     * Gets the value of the ecugroups property.
     *
     * @return possible object is
     * {@link ECUGROUPS }
     */
    public ECUGROUPS getECUGROUPS() {
        return ecugroups;
    }

    /**
     * Sets the value of the ecugroups property.
     *
     * @param value allowed object is
     *              {@link ECUGROUPS }
     */
    public void setECUGROUPS(final ECUGROUPS value) {
        this.ecugroups = value;
    }


    public List<VEHICLECONNECTOR> getVehicleconnectors() {
        return vehicleconnectors;
    }

    public List<PHYSICALVEHICLELINK> getPhysicalvehiclelinks() {
        return physicalvehiclelinks;
    }

    public List<LOGICALLINK> getLogicallinks() {
        return logicallinks;
    }
}
