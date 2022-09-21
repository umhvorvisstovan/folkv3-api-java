
package eu.x_road.us_folk_v3.producer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivilegesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PrivilegesResponse">
 *   <complexContent>
 *     <extension base="{http://us-folk-v3.x-road.eu/producer}ResponseBase">
 *       <sequence>
 *         <element name="result" type="{http://us-folk-v3.x-road.eu/producer}PrivilegeList"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivilegesResponse", propOrder = {
    "result"
})
@XmlSeeAlso({
    GetPrivilegesMediumResponse.class,
    GetPrivilegesSmallResponse.class,
    GetMyPrivilegesResponse.class
})
public class PrivilegesResponse
    extends ResponseBase
{

    @XmlElement(required = true)
    protected PrivilegeList result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegeList }
     *     
     */
    public PrivilegeList getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegeList }
     *     
     */
    public void setResult(PrivilegeList value) {
        this.result = value;
    }

}
