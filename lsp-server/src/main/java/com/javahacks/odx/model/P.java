//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:58:19 AM CET 
//


package com.javahacks.odx.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * <p>
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * <p>
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 * &amp;lt;complexContent&amp;gt;
 * &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 * &amp;lt;group ref="{}inline" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 * &amp;lt;/restriction&amp;gt;
 * &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "p")
public class P {

    @XmlElementRefs({
            @XmlElementRef(name = "br", type = Br.class),
            @XmlElementRef(name = "i", type = I.class),
            @XmlElementRef(name = "b", type = B.class),
            @XmlElementRef(name = "u", type = U.class),
            @XmlElementRef(name = "sub", type = Sub.class),
            @XmlElementRef(name = "sup", type = Sup.class)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * <p>
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the content property.
     * <p>
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     * getContent().add(newItem);
     * &lt;/pre&gt;
     * <p>
     * <p>
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Br }
     * {@link I }
     * {@link B }
     * {@link U }
     * {@link Sub }
     * {@link Sup }
     * {@link String }
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
