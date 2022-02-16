
package com.xignite.services;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tracer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IHeader_Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IHeader_Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IHeader_Tracer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "username",
    "password",
    "tracer",
    "iHeaderUsername",
    "iHeaderPassword",
    "iHeaderTracer"
})
public class Header {

    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Tracer")
    protected String tracer;
    @XmlElement(name = "IHeader_Username")
    protected String iHeaderUsername;
    @XmlElement(name = "IHeader_Password")
    protected String iHeaderPassword;
    @XmlElement(name = "IHeader_Tracer")
    protected String iHeaderTracer;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the tracer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTracer() {
        return tracer;
    }

    /**
     * Sets the value of the tracer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTracer(String value) {
        this.tracer = value;
    }

    /**
     * Gets the value of the iHeaderUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIHeaderUsername() {
        return iHeaderUsername;
    }

    /**
     * Sets the value of the iHeaderUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIHeaderUsername(String value) {
        this.iHeaderUsername = value;
    }

    /**
     * Gets the value of the iHeaderPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIHeaderPassword() {
        return iHeaderPassword;
    }

    /**
     * Sets the value of the iHeaderPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIHeaderPassword(String value) {
        this.iHeaderPassword = value;
    }

    /**
     * Gets the value of the iHeaderTracer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIHeaderTracer() {
        return iHeaderTracer;
    }

    /**
     * Sets the value of the iHeaderTracer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIHeaderTracer(String value) {
        this.iHeaderTracer = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
