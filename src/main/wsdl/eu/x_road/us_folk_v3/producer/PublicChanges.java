
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PublicChanges">
 *   <complexContent>
 *     <extension base="{http://us-folk-v3.x-road.eu/producer}ChangesBase">
 *       <sequence>
 *         <element name="ids" type="{http://us-folk-v3.x-road.eu/producer}PublicIdList"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicChanges", propOrder = {
    "ids"
})
public class PublicChanges
    extends ChangesBase
{

    @XmlElement(required = true)
    protected PublicIdList ids;

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link PublicIdList }
     *     
     */
    public PublicIdList getIds() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicIdList }
     *     
     */
    public void setIds(PublicIdList value) {
        this.ids = value;
    }

}
