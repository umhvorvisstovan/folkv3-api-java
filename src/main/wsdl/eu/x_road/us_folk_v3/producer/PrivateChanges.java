
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivateChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PrivateChanges">
 *   <complexContent>
 *     <extension base="{http://us-folk-v3.x-road.eu/producer}ChangesBase">
 *       <sequence>
 *         <element name="ids" type="{http://us-folk-v3.x-road.eu/producer}PrivateIdList"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateChanges", propOrder = {
    "ids"
})
public class PrivateChanges
    extends ChangesBase
{

    @XmlElement(required = true)
    protected PrivateIdList ids;

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateIdList }
     *     
     */
    public PrivateIdList getIds() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateIdList }
     *     
     */
    public void setIds(PrivateIdList value) {
        this.ids = value;
    }

}
