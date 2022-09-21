
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonMediumResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonMediumResponse">
 *   <complexContent>
 *     <extension base="{http://us-folk-v3.x-road.eu/producer}ResponseBase">
 *       <sequence>
 *         <element name="result" type="{http://us-folk-v3.x-road.eu/producer}PersonMedium"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonMediumResponse", propOrder = {
    "result"
})
@XmlSeeAlso({
    GetPersonMediumByNameAndDateOfBirthResponse.class,
    GetPersonMediumByNameAndAddressResponse.class,
    GetPersonMediumByPtalResponse.class,
    GetPersonMediumByPublicIdResponse.class,
    GetPersonMediumByPrivateIdResponse.class
})
public class PersonMediumResponse
    extends ResponseBase
{

    @XmlElement(required = true)
    protected PersonMedium result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link PersonMedium }
     *     
     */
    public PersonMedium getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonMedium }
     *     
     */
    public void setResult(PersonMedium value) {
        this.result = value;
    }

}
