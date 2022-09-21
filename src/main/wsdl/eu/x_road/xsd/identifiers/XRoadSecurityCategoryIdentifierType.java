
package eu.x_road.xsd.identifiers;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadSecurityCategoryIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="XRoadSecurityCategoryIdentifierType">
 *   <complexContent>
 *     <restriction base="{http://x-road.eu/xsd/identifiers}XRoadIdentifierType">
 *       <sequence>
 *         <element ref="{http://x-road.eu/xsd/identifiers}xRoadInstance"/>
 *         <element ref="{http://x-road.eu/xsd/identifiers}securityCategoryCode"/>
 *       </sequence>
 *       <attribute ref="{http://x-road.eu/xsd/identifiers}objectType use="required" fixed="SECURITYCATEGORY""/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoadSecurityCategoryIdentifierType")
public class XRoadSecurityCategoryIdentifierType
    extends XRoadIdentifierType
{


}
