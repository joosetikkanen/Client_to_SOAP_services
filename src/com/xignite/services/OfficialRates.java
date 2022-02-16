
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficialRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficialRates">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="CountryList" type="{http://www.xignite.com/services/}ArrayOfOfficialCountry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficialRates", propOrder = {
    "countryList"
})
public class OfficialRates
    extends Common
{

    @XmlElement(name = "CountryList")
    protected ArrayOfOfficialCountry countryList;

    /**
     * Gets the value of the countryList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfficialCountry }
     *     
     */
    public ArrayOfOfficialCountry getCountryList() {
        return countryList;
    }

    /**
     * Sets the value of the countryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfficialCountry }
     *     
     */
    public void setCountryList(ArrayOfOfficialCountry value) {
        this.countryList = value;
    }

}
