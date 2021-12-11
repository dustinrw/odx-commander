//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for COMPARAM-SPEC complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType name="COMPARAM-SPEC"&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;extension base="{}ODX-CATEGORY"&amp;gt;
 * &amp;lt;sequence&amp;gt;
 * &amp;lt;element name="PROT-STACKS" type="{}PROT-STACKS" minOccurs="0"/&amp;gt;
 * &amp;lt;/sequence&amp;gt;
 * &amp;lt;/extension&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMPARAM-SPEC")
public class COMPARAMSPEC
        extends ODXCATEGORY {

    @XmlPath("PROT-STACKS/PROT-STACK")
    private final List<PROTSTACK> protocolStacks = new ArrayList();

    //2.1.0
    @XmlPath("COMPARAMS/COMPARAM")
    private final List<COMPARAM> comparams = new ArrayList();

    //2.1.0
    @XmlPath("DATA-OBJECT-PROPS/DATA-OBJECT-PROP")
    private final List<DATAOBJECTPROP> dataobjectprops = new ArrayList();

    //2.1.0
    @XmlElement(name = "UNIT-SPEC")
    protected UNITSPEC unitspec;

    public List<COMPARAM> getComparams() {
        return comparams;
    }

    public List<DATAOBJECTPROP> getDataobjectprops() {
        return dataobjectprops;
    }

    public UNITSPEC getUnitspec() {
        return unitspec;
    }

    public void setUnitspec(final UNITSPEC unitspec) {
        this.unitspec = unitspec;
    }

    public List<PROTSTACK> getProtocolStacks() {
        return protocolStacks;
    }

    @Override
    public boolean isExpandable() {
        return !comparams.isEmpty() || !protocolStacks.isEmpty();
    }


}
