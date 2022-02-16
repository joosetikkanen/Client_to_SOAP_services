
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOfficialCountry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOfficialCountry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfficialCountry" type="{http://www.xignite.com/services/}OfficialCountry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOfficialCountry", propOrder = {
    "officialCountry"
})
public class ArrayOfOfficialCountry {

    @XmlElement(name = "OfficialCountry", nillable = true)
    protected List<OfficialCountry> officialCountry;

    /**
     * Gets the value of the officialCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officialCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficialCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfficialCountry }
     * 
     * 
     */
    public List<OfficialCountry> getOfficialCountry() {
        if (officialCountry == null) {
            officialCountry = new ArrayList<OfficialCountry>();
        }
        return this.officialCountry;
    }

}
