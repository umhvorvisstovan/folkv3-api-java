
package eu.x_road.xsd.identifiers;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.x_road.xsd.identifiers package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _XRoadInstance_QNAME = new QName("http://x-road.eu/xsd/identifiers", "xRoadInstance");
    private final static QName _MemberClass_QNAME = new QName("http://x-road.eu/xsd/identifiers", "memberClass");
    private final static QName _MemberCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "memberCode");
    private final static QName _SubsystemCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "subsystemCode");
    private final static QName _GroupCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "groupCode");
    private final static QName _ServiceCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "serviceCode");
    private final static QName _ServiceVersion_QNAME = new QName("http://x-road.eu/xsd/identifiers", "serviceVersion");
    private final static QName _SecurityCategoryCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "securityCategoryCode");
    private final static QName _ServerCode_QNAME = new QName("http://x-road.eu/xsd/identifiers", "serverCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.x_road.xsd.identifiers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XRoadClientIdentifierType }
     * 
     * @return
     *     the new instance of {@link XRoadClientIdentifierType }
     */
    public XRoadClientIdentifierType createXRoadClientIdentifierType() {
        return new XRoadClientIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadServiceIdentifierType }
     * 
     * @return
     *     the new instance of {@link XRoadServiceIdentifierType }
     */
    public XRoadServiceIdentifierType createXRoadServiceIdentifierType() {
        return new XRoadServiceIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadCentralServiceIdentifierType }
     * 
     * @return
     *     the new instance of {@link XRoadCentralServiceIdentifierType }
     */
    public XRoadCentralServiceIdentifierType createXRoadCentralServiceIdentifierType() {
        return new XRoadCentralServiceIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadIdentifierType }
     * 
     * @return
     *     the new instance of {@link XRoadIdentifierType }
     */
    public XRoadIdentifierType createXRoadIdentifierType() {
        return new XRoadIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadSecurityCategoryIdentifierType }
     * 
     * @return
     *     the new instance of {@link XRoadSecurityCategoryIdentifierType }
     */
    public XRoadSecurityCategoryIdentifierType createXRoadSecurityCategoryIdentifierType() {
        return new XRoadSecurityCategoryIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadSecurityServerIdentifierType }
     * 
     * @return
     *     the new instance of {@link XRoadSecurityServerIdentifierType }
     */
    public XRoadSecurityServerIdentifierType createXRoadSecurityServerIdentifierType() {
        return new XRoadSecurityServerIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadGlobalGroupIdentifierType }
     * 
     * @return
     *     the new instance of {@link XRoadGlobalGroupIdentifierType }
     */
    public XRoadGlobalGroupIdentifierType createXRoadGlobalGroupIdentifierType() {
        return new XRoadGlobalGroupIdentifierType();
    }

    /**
     * Create an instance of {@link XRoadLocalGroupIdentifierType }
     * 
     * @return
     *     the new instance of {@link XRoadLocalGroupIdentifierType }
     */
    public XRoadLocalGroupIdentifierType createXRoadLocalGroupIdentifierType() {
        return new XRoadLocalGroupIdentifierType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "xRoadInstance")
    public JAXBElement<String> createXRoadInstance(String value) {
        return new JAXBElement<>(_XRoadInstance_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "memberClass")
    public JAXBElement<String> createMemberClass(String value) {
        return new JAXBElement<>(_MemberClass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "memberCode")
    public JAXBElement<String> createMemberCode(String value) {
        return new JAXBElement<>(_MemberCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "subsystemCode")
    public JAXBElement<String> createSubsystemCode(String value) {
        return new JAXBElement<>(_SubsystemCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "groupCode")
    public JAXBElement<String> createGroupCode(String value) {
        return new JAXBElement<>(_GroupCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "serviceCode")
    public JAXBElement<String> createServiceCode(String value) {
        return new JAXBElement<>(_ServiceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "serviceVersion")
    public JAXBElement<String> createServiceVersion(String value) {
        return new JAXBElement<>(_ServiceVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "securityCategoryCode")
    public JAXBElement<String> createSecurityCategoryCode(String value) {
        return new JAXBElement<>(_SecurityCategoryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/identifiers", name = "serverCode")
    public JAXBElement<String> createServerCode(String value) {
        return new JAXBElement<>(_ServerCode_QNAME, String.class, null, value);
    }

}
