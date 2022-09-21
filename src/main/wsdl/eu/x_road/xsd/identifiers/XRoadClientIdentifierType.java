
package eu.x_road.xsd.identifiers;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadClientIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="XRoadClientIdentifierType">
 *   <complexContent>
 *     <restriction base="{http://x-road.eu/xsd/identifiers}XRoadIdentifierType">
 *       <sequence>
 *         <element ref="{http://x-road.eu/xsd/identifiers}xRoadInstance"/>
 *         <element ref="{http://x-road.eu/xsd/identifiers}memberClass"/>
 *         <element ref="{http://x-road.eu/xsd/identifiers}memberCode"/>
 *         <element ref="{http://x-road.eu/xsd/identifiers}subsystemCode" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://x-road.eu/xsd/identifiers}objectType use="required""/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoadClientIdentifierType")
public class XRoadClientIdentifierType
    extends XRoadIdentifierType
{


}
