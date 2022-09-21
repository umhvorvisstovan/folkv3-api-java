
package eu.x_road.us_folk_v3.producer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignSsnList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignSsnList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="foreignSsn" type="{http://us-folk-v3.x-road.eu/producer}ForeignSsn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignSsnList", propOrder = {
    "foreignSsn"
})
public class ForeignSsnList {

    protected List<ForeignSsn> foreignSsn;

    /**
     * Gets the value of the foreignSsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the foreignSsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignSsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignSsn }
     * 
     * 
     * @return
     *     The value of the foreignSsn property.
     */
    public List<ForeignSsn> getForeignSsn() {
        if (foreignSsn == null) {
            foreignSsn = new ArrayList<>();
        }
        return this.foreignSsn;
    }

}
