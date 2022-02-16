
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mexico"/>
 *     &lt;enumeration value="UnitedStatesAM"/>
 *     &lt;enumeration value="UnitedStatesPM"/>
 *     &lt;enumeration value="Canada"/>
 *     &lt;enumeration value="Europe"/>
 *     &lt;enumeration value="Russia"/>
 *     &lt;enumeration value="Poland"/>
 *     &lt;enumeration value="Romania"/>
 *     &lt;enumeration value="Hungary"/>
 *     &lt;enumeration value="Chile"/>
 *     &lt;enumeration value="Czech"/>
 *     &lt;enumeration value="Australia"/>
 *     &lt;enumeration value="Brazil"/>
 *     &lt;enumeration value="Bulgaria"/>
 *     &lt;enumeration value="China"/>
 *     &lt;enumeration value="Uruguay"/>
 *     &lt;enumeration value="UnitedStates"/>
 *     &lt;enumeration value="Colombia"/>
 *     &lt;enumeration value="Argentina"/>
 *     &lt;enumeration value="MexicoDoF"/>
 *     &lt;enumeration value="Serbia"/>
 *     &lt;enumeration value="Macedonia"/>
 *     &lt;enumeration value="Turkey"/>
 *     &lt;enumeration value="India"/>
 *     &lt;enumeration value="Philippines"/>
 *     &lt;enumeration value="EuropeItalyEUR"/>
 *     &lt;enumeration value="Thailand"/>
 *     &lt;enumeration value="EuropeItalyUSD"/>
 *     &lt;enumeration value="UnitedArabEmirates"/>
 *     &lt;enumeration value="Kazakhstan"/>
 *     &lt;enumeration value="Peru"/>
 *     &lt;enumeration value="Oman"/>
 *     &lt;enumeration value="DominicanRepublic"/>
 *     &lt;enumeration value="Croatia"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryTypes")
@XmlEnum
public enum CountryTypes {

    @XmlEnumValue("Mexico")
    MEXICO("Mexico"),
    @XmlEnumValue("UnitedStatesAM")
    UNITED_STATES_AM("UnitedStatesAM"),
    @XmlEnumValue("UnitedStatesPM")
    UNITED_STATES_PM("UnitedStatesPM"),
    @XmlEnumValue("Canada")
    CANADA("Canada"),
    @XmlEnumValue("Europe")
    EUROPE("Europe"),
    @XmlEnumValue("Russia")
    RUSSIA("Russia"),
    @XmlEnumValue("Poland")
    POLAND("Poland"),
    @XmlEnumValue("Romania")
    ROMANIA("Romania"),
    @XmlEnumValue("Hungary")
    HUNGARY("Hungary"),
    @XmlEnumValue("Chile")
    CHILE("Chile"),
    @XmlEnumValue("Czech")
    CZECH("Czech"),
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),
    @XmlEnumValue("Brazil")
    BRAZIL("Brazil"),
    @XmlEnumValue("Bulgaria")
    BULGARIA("Bulgaria"),
    @XmlEnumValue("China")
    CHINA("China"),
    @XmlEnumValue("Uruguay")
    URUGUAY("Uruguay"),
    @XmlEnumValue("UnitedStates")
    UNITED_STATES("UnitedStates"),
    @XmlEnumValue("Colombia")
    COLOMBIA("Colombia"),
    @XmlEnumValue("Argentina")
    ARGENTINA("Argentina"),
    @XmlEnumValue("MexicoDoF")
    MEXICO_DO_F("MexicoDoF"),
    @XmlEnumValue("Serbia")
    SERBIA("Serbia"),
    @XmlEnumValue("Macedonia")
    MACEDONIA("Macedonia"),
    @XmlEnumValue("Turkey")
    TURKEY("Turkey"),
    @XmlEnumValue("India")
    INDIA("India"),
    @XmlEnumValue("Philippines")
    PHILIPPINES("Philippines"),
    @XmlEnumValue("EuropeItalyEUR")
    EUROPE_ITALY_EUR("EuropeItalyEUR"),
    @XmlEnumValue("Thailand")
    THAILAND("Thailand"),
    @XmlEnumValue("EuropeItalyUSD")
    EUROPE_ITALY_USD("EuropeItalyUSD"),
    @XmlEnumValue("UnitedArabEmirates")
    UNITED_ARAB_EMIRATES("UnitedArabEmirates"),
    @XmlEnumValue("Kazakhstan")
    KAZAKHSTAN("Kazakhstan"),
    @XmlEnumValue("Peru")
    PERU("Peru"),
    @XmlEnumValue("Oman")
    OMAN("Oman"),
    @XmlEnumValue("DominicanRepublic")
    DOMINICAN_REPUBLIC("DominicanRepublic"),
    @XmlEnumValue("Croatia")
    CROATIA("Croatia");
    private final String value;

    CountryTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryTypes fromValue(String v) {
        for (CountryTypes c: CountryTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
