
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Address">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="streetAndNumbers" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="houseNumber" type="{http://us-folk-v3.x-road.eu/producer}HouseNumber"/>
 *         <element name="apartment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="country" type="{http://us-folk-v3.x-road.eu/producer}Country"/>
 *         <element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "streetAndNumbers",
    "street",
    "houseNumber",
    "apartment",
    "postalCode",
    "city",
    "country",
    "from"
})
public class Address {

    @XmlElement(required = true)
    protected String streetAndNumbers;
    @XmlElement(required = true)
    protected String street;
    @XmlElement(required = true)
    protected HouseNumber houseNumber;
    @XmlElement(required = true)
    protected String apartment;
    @XmlElement(required = true)
    protected String postalCode;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected Country country;
    @XmlElement(required = true)
    protected String from;

    /**
     * Gets the value of the streetAndNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAndNumbers() {
        return streetAndNumbers;
    }

    /**
     * Sets the value of the streetAndNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAndNumbers(String value) {
        this.streetAndNumbers = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link HouseNumber }
     *     
     */
    public HouseNumber getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseNumber }
     *     
     */
    public void setHouseNumber(HouseNumber value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

}
