
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunityPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommunityPerson">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="person" type="{http://us-folk-v3.x-road.eu/producer}PersonSmall"/>
 *         <element name="existingId" type="{http://us-folk-v3.x-road.eu/producer}PrivateId"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunityPerson", propOrder = {
    "status",
    "person",
    "existingId"
})
public class CommunityPerson {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected PersonSmall person;
    @XmlElement(required = true)
    protected PrivateId existingId;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonSmall }
     *     
     */
    public PersonSmall getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonSmall }
     *     
     */
    public void setPerson(PersonSmall value) {
        this.person = value;
    }

    /**
     * Gets the value of the existingId property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateId }
     *     
     */
    public PrivateId getExistingId() {
        return existingId;
    }

    /**
     * Sets the value of the existingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateId }
     *     
     */
    public void setExistingId(PrivateId value) {
        this.existingId = value;
    }

}
