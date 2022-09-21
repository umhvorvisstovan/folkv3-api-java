
package eu.x_road.xsd.identifiers;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadLocalGroupIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="XRoadLocalGroupIdentifierType">
 *   <complexContent>
 *     <restriction base="{http://x-road.eu/xsd/identifiers}XRoadIdentifierType">
 *       <sequence>
 *         <element ref="{http://x-road.eu/xsd/identifiers}groupCode"/>
 *       </sequence>
 *       <attribute ref="{http://x-road.eu/xsd/identifiers}objectType use="required" fixed="LOCALGROUP""/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoadLocalGroupIdentifierType")
public class XRoadLocalGroupIdentifierType
    extends XRoadIdentifierType
{


}
