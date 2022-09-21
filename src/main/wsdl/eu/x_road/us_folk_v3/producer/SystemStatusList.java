
package eu.x_road.us_folk_v3.producer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatusList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemStatusList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="systemStatus" type="{http://us-folk-v3.x-road.eu/producer}SystemStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatusList", propOrder = {
    "systemStatus"
})
public class SystemStatusList {

    protected List<SystemStatus> systemStatus;

    /**
     * Gets the value of the systemStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the systemStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemStatus }
     * 
     * 
     * @return
     *     The value of the systemStatus property.
     */
    public List<SystemStatus> getSystemStatus() {
        if (systemStatus == null) {
            systemStatus = new ArrayList<>();
        }
        return this.systemStatus;
    }

}
