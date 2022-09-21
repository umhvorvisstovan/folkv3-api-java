
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicIdListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PublicIdListResponse">
 *   <complexContent>
 *     <extension base="{http://us-folk-v3.x-road.eu/producer}ResponseBase">
 *       <sequence>
 *         <element name="result" type="{http://us-folk-v3.x-road.eu/producer}PublicIdList"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicIdListResponse", propOrder = {
    "result"
})
public class PublicIdListResponse
    extends ResponseBase
{

    @XmlElement(required = true)
    protected PublicIdList result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link PublicIdList }
     *     
     */
    public PublicIdList getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicIdList }
     *     
     */
    public void setResult(PublicIdList value) {
        this.result = value;
    }

}
