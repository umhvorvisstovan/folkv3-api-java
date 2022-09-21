
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="request" type="{http://us-folk-v3.x-road.eu/producer}NameAndDateOfBirthParam"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "GetPersonMediumByNameAndDateOfBirth")
public class GetPersonMediumByNameAndDateOfBirth {

    @XmlElement(required = true)
    protected NameAndDateOfBirthParam request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndDateOfBirthParam }
     *     
     */
    public NameAndDateOfBirthParam getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndDateOfBirthParam }
     *     
     */
    public void setRequest(NameAndDateOfBirthParam value) {
        this.request = value;
    }

}
