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
 * &lt;p&gt;Java class for COMPARAM-SUBSET complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="COMPARAM-SUBSET"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}ODX-CATEGORY"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="COMPARAMS" type="{}COMPARAMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="COMPLEX-COMPARAMS" type="{}COMPLEX-COMPARAMS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="DATA-OBJECT-PROPS" type="{}DATA-OBJECT-PROPS" minOccurs="0"/&amp;gt;
 * &amp;lt;element name="UNIT-SPEC" type="{}UNIT-SPEC" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;attribute name="CATEGORY" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPARAM-SUBSET")
public class COMPARAMSUBSET
        extends ODXCATEGORY {


    @XmlAttribute(name = "CATEGORY", required = true)
    protected String category;

    @XmlPath("COMPLEX-COMPARAMS/COMPLEX-COMPARAM")
    protected List<COMPLEXCOMPARAM> complexcomparams = new ArrayList<>();

    @XmlPath("COMPARAMS/COMPARAM")
    protected List<COMPARAM> comparams = new ArrayList();

    @XmlPath("DATA-OBJECT-PROPS/DATA-OBJECT-PROP")
    protected List<DATAOBJECTPROP> dataobjectprops = new ArrayList<>();

    @XmlElement(name = "UNIT-SPEC")
    protected UNITSPEC unitspec;


    /**
     * Gets the value of the unitspec property.
     *
     * @return possible object is
     * {@link UNITSPEC }
     */
    public UNITSPEC getUNITSPEC() {
        return unitspec;
    }

    /**
     * Sets the value of the unitspec property.
     *
     * @param value allowed object is
     *              {@link UNITSPEC }
     */
    public void setUNITSPEC(final UNITSPEC value) {
        this.unitspec = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCATEGORY(final String value) {
        this.category = value;
    }

    public List<DATAOBJECTPROP> getDataobjectprops() {
        return dataobjectprops;
    }

    public List<COMPARAM> getComparams() {
        return comparams;
    }

    public List<COMPLEXCOMPARAM> getComplexcomparams() {
        return complexcomparams;
    }

    @Override
    public boolean isExpandable() {
        return !getComparams().isEmpty() || !getComplexcomparams().isEmpty();
    }
}
