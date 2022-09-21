
package eu.x_road.us_folk_v3.producer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameAndDateOfBirthParamList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NameAndDateOfBirthParamList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="param" type="{http://us-folk-v3.x-road.eu/producer}NameAndDateOfBirthParam" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndDateOfBirthParamList", propOrder = {
    "param"
})
public class NameAndDateOfBirthParamList {

    protected List<NameAndDateOfBirthParam> param;

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameAndDateOfBirthParam }
     * 
     * 
     * @return
     *     The value of the param property.
     */
    public List<NameAndDateOfBirthParam> getParam() {
        if (param == null) {
            param = new ArrayList<>();
        }
        return this.param;
    }

}
