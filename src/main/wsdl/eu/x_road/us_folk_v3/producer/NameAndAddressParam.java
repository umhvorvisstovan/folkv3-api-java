
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameAndAddressParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NameAndAddressParam">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://us-folk-v3.x-road.eu/producer}NameParam"/>
 *         <element name="address" type="{http://us-folk-v3.x-road.eu/producer}AddressParam"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndAddressParam", propOrder = {
    "name",
    "address"
})
public class NameAndAddressParam {

    @XmlElement(required = true)
    protected NameParam name;
    @XmlElement(required = true)
    protected AddressParam address;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameParam }
     *     
     */
    public NameParam getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameParam }
     *     
     */
    public void setName(NameParam value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressParam }
     *     
     */
    public AddressParam getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressParam }
     *     
     */
    public void setAddress(AddressParam value) {
        this.address = value;
    }

}
