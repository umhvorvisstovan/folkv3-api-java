
package eu.x_road.xsd.identifiers;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadObjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="XRoadObjectType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MEMBER"/>
 *     <enumeration value="SUBSYSTEM"/>
 *     <enumeration value="SERVER"/>
 *     <enumeration value="GLOBALGROUP"/>
 *     <enumeration value="LOCALGROUP"/>
 *     <enumeration value="SECURITYCATEGORY"/>
 *     <enumeration value="SERVICE"/>
 *     <enumeration value="CENTRALSERVICE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "XRoadObjectType")
@XmlEnum
public enum XRoadObjectType {

    MEMBER,
    SUBSYSTEM,
    SERVER,
    GLOBALGROUP,
    LOCALGROUP,
    SECURITYCATEGORY,
    SERVICE,
    CENTRALSERVICE;

    public String value() {
        return name();
    }

    public static XRoadObjectType fromValue(String v) {
        return valueOf(v);
    }

}
