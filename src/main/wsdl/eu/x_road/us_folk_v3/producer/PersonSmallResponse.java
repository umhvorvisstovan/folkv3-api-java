
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonSmallResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonSmallResponse">
 *   <complexContent>
 *     <extension base="{http://us-folk-v3.x-road.eu/producer}ResponseBase">
 *       <sequence>
 *         <element name="result" type="{http://us-folk-v3.x-road.eu/producer}PersonSmall"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonSmallResponse", propOrder = {
    "result"
})
@XmlSeeAlso({
    GetPersonSmallByNameAndDateOfBirthResponse.class,
    GetPersonSmallByNameAndAddressResponse.class,
    GetPersonSmallByPtalResponse.class,
    GetPersonSmallByPrivateIdResponse.class
})
public class PersonSmallResponse
    extends ResponseBase
{

    @XmlElement(required = true)
    protected PersonSmall result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link PersonSmall }
     *     
     */
    public PersonSmall getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonSmall }
     *     
     */
    public void setResult(PersonSmall value) {
        this.result = value;
    }

}
