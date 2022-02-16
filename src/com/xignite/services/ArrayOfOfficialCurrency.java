
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOfficialCurrency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOfficialCurrency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfficialCurrency" type="{http://www.xignite.com/services/}OfficialCurrency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOfficialCurrency", propOrder = {
    "officialCurrency"
})
public class ArrayOfOfficialCurrency {

    @XmlElement(name = "OfficialCurrency", nillable = true)
    protected List<OfficialCurrency> officialCurrency;

    /**
     * Gets the value of the officialCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officialCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficialCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfficialCurrency }
     * 
     * 
     */
    public List<OfficialCurrency> getOfficialCurrency() {
        if (officialCurrency == null) {
            officialCurrency = new ArrayList<OfficialCurrency>();
        }
        return this.officialCurrency;
    }

}
