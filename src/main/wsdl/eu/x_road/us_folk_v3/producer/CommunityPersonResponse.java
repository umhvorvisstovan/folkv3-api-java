
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunityPersonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommunityPersonResponse">
 *   <complexContent>
 *     <extension base="{http://us-folk-v3.x-road.eu/producer}ResponseBase">
 *       <sequence>
 *         <element name="result" type="{http://us-folk-v3.x-road.eu/producer}CommunityPerson"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunityPersonResponse", propOrder = {
    "result"
})
@XmlSeeAlso({
    AddPersonToCommunityByNameAndDateOfBirthResponse.class,
    AddPersonToCommunityByNameAndAddressResponse.class
})
public class CommunityPersonResponse
    extends ResponseBase
{

    @XmlElement(required = true)
    protected CommunityPerson result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link CommunityPerson }
     *     
     */
    public CommunityPerson getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunityPerson }
     *     
     */
    public void setResult(CommunityPerson value) {
        this.result = value;
    }

}
