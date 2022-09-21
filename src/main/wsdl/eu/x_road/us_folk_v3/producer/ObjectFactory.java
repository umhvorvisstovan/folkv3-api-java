
package eu.x_road.us_folk_v3.producer;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.x_road.us_folk_v3.producer package. 
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

    private final static QName _PublicId_QNAME = new QName("http://us-folk-v3.x-road.eu/producer", "PublicId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.x_road.us_folk_v3.producer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMyPrivileges }
     * 
     * @return
     *     the new instance of {@link GetMyPrivileges }
     */
    public GetMyPrivileges createGetMyPrivileges() {
        return new GetMyPrivileges();
    }

    /**
     * Create an instance of {@link GetMyPrivilegesResponse }
     * 
     * @return
     *     the new instance of {@link GetMyPrivilegesResponse }
     */
    public GetMyPrivilegesResponse createGetMyPrivilegesResponse() {
        return new GetMyPrivilegesResponse();
    }

    /**
     * Create an instance of {@link PrivilegesResponse }
     * 
     * @return
     *     the new instance of {@link PrivilegesResponse }
     */
    public PrivilegesResponse createPrivilegesResponse() {
        return new PrivilegesResponse();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     * @return
     *     the new instance of {@link ResponseBase }
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link PrivilegeList }
     * 
     * @return
     *     the new instance of {@link PrivilegeList }
     */
    public PrivilegeList createPrivilegeList() {
        return new PrivilegeList();
    }

    /**
     * Create an instance of {@link GetPrivilegesSmall }
     * 
     * @return
     *     the new instance of {@link GetPrivilegesSmall }
     */
    public GetPrivilegesSmall createGetPrivilegesSmall() {
        return new GetPrivilegesSmall();
    }

    /**
     * Create an instance of {@link GetPrivilegesSmallResponse }
     * 
     * @return
     *     the new instance of {@link GetPrivilegesSmallResponse }
     */
    public GetPrivilegesSmallResponse createGetPrivilegesSmallResponse() {
        return new GetPrivilegesSmallResponse();
    }

    /**
     * Create an instance of {@link GetPrivilegesMedium }
     * 
     * @return
     *     the new instance of {@link GetPrivilegesMedium }
     */
    public GetPrivilegesMedium createGetPrivilegesMedium() {
        return new GetPrivilegesMedium();
    }

    /**
     * Create an instance of {@link GetPrivilegesMediumResponse }
     * 
     * @return
     *     the new instance of {@link GetPrivilegesMediumResponse }
     */
    public GetPrivilegesMediumResponse createGetPrivilegesMediumResponse() {
        return new GetPrivilegesMediumResponse();
    }

    /**
     * Create an instance of {@link GetPersonSmallByPrivateId }
     * 
     * @return
     *     the new instance of {@link GetPersonSmallByPrivateId }
     */
    public GetPersonSmallByPrivateId createGetPersonSmallByPrivateId() {
        return new GetPersonSmallByPrivateId();
    }

    /**
     * Create an instance of {@link PrivateId }
     * 
     * @return
     *     the new instance of {@link PrivateId }
     */
    public PrivateId createPrivateId() {
        return new PrivateId();
    }

    /**
     * Create an instance of {@link GetPersonSmallByPrivateIdResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonSmallByPrivateIdResponse }
     */
    public GetPersonSmallByPrivateIdResponse createGetPersonSmallByPrivateIdResponse() {
        return new GetPersonSmallByPrivateIdResponse();
    }

    /**
     * Create an instance of {@link PersonSmallResponse }
     * 
     * @return
     *     the new instance of {@link PersonSmallResponse }
     */
    public PersonSmallResponse createPersonSmallResponse() {
        return new PersonSmallResponse();
    }

    /**
     * Create an instance of {@link PersonSmall }
     * 
     * @return
     *     the new instance of {@link PersonSmall }
     */
    public PersonSmall createPersonSmall() {
        return new PersonSmall();
    }

    /**
     * Create an instance of {@link GetPersonSmallByPtal }
     * 
     * @return
     *     the new instance of {@link GetPersonSmallByPtal }
     */
    public GetPersonSmallByPtal createGetPersonSmallByPtal() {
        return new GetPersonSmallByPtal();
    }

    /**
     * Create an instance of {@link GetPersonSmallByPtalResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonSmallByPtalResponse }
     */
    public GetPersonSmallByPtalResponse createGetPersonSmallByPtalResponse() {
        return new GetPersonSmallByPtalResponse();
    }

    /**
     * Create an instance of {@link GetPersonSmallByNameAndAddress }
     * 
     * @return
     *     the new instance of {@link GetPersonSmallByNameAndAddress }
     */
    public GetPersonSmallByNameAndAddress createGetPersonSmallByNameAndAddress() {
        return new GetPersonSmallByNameAndAddress();
    }

    /**
     * Create an instance of {@link NameAndAddressParam }
     * 
     * @return
     *     the new instance of {@link NameAndAddressParam }
     */
    public NameAndAddressParam createNameAndAddressParam() {
        return new NameAndAddressParam();
    }

    /**
     * Create an instance of {@link GetPersonSmallByNameAndAddressResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonSmallByNameAndAddressResponse }
     */
    public GetPersonSmallByNameAndAddressResponse createGetPersonSmallByNameAndAddressResponse() {
        return new GetPersonSmallByNameAndAddressResponse();
    }

    /**
     * Create an instance of {@link GetPersonSmallByNameAndDateOfBirth }
     * 
     * @return
     *     the new instance of {@link GetPersonSmallByNameAndDateOfBirth }
     */
    public GetPersonSmallByNameAndDateOfBirth createGetPersonSmallByNameAndDateOfBirth() {
        return new GetPersonSmallByNameAndDateOfBirth();
    }

    /**
     * Create an instance of {@link NameAndDateOfBirthParam }
     * 
     * @return
     *     the new instance of {@link NameAndDateOfBirthParam }
     */
    public NameAndDateOfBirthParam createNameAndDateOfBirthParam() {
        return new NameAndDateOfBirthParam();
    }

    /**
     * Create an instance of {@link GetPersonSmallByNameAndDateOfBirthResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonSmallByNameAndDateOfBirthResponse }
     */
    public GetPersonSmallByNameAndDateOfBirthResponse createGetPersonSmallByNameAndDateOfBirthResponse() {
        return new GetPersonSmallByNameAndDateOfBirthResponse();
    }

    /**
     * Create an instance of {@link GetPersonMediumByPrivateId }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByPrivateId }
     */
    public GetPersonMediumByPrivateId createGetPersonMediumByPrivateId() {
        return new GetPersonMediumByPrivateId();
    }

    /**
     * Create an instance of {@link GetPersonMediumByPrivateIdResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByPrivateIdResponse }
     */
    public GetPersonMediumByPrivateIdResponse createGetPersonMediumByPrivateIdResponse() {
        return new GetPersonMediumByPrivateIdResponse();
    }

    /**
     * Create an instance of {@link PersonMediumResponse }
     * 
     * @return
     *     the new instance of {@link PersonMediumResponse }
     */
    public PersonMediumResponse createPersonMediumResponse() {
        return new PersonMediumResponse();
    }

    /**
     * Create an instance of {@link PersonMedium }
     * 
     * @return
     *     the new instance of {@link PersonMedium }
     */
    public PersonMedium createPersonMedium() {
        return new PersonMedium();
    }

    /**
     * Create an instance of {@link GetPersonMediumByPublicId }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByPublicId }
     */
    public GetPersonMediumByPublicId createGetPersonMediumByPublicId() {
        return new GetPersonMediumByPublicId();
    }

    /**
     * Create an instance of {@link PublicId }
     * 
     * @return
     *     the new instance of {@link PublicId }
     */
    public PublicId createPublicId() {
        return new PublicId();
    }

    /**
     * Create an instance of {@link GetPersonMediumByPublicIdResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByPublicIdResponse }
     */
    public GetPersonMediumByPublicIdResponse createGetPersonMediumByPublicIdResponse() {
        return new GetPersonMediumByPublicIdResponse();
    }

    /**
     * Create an instance of {@link GetPersonMediumByPtal }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByPtal }
     */
    public GetPersonMediumByPtal createGetPersonMediumByPtal() {
        return new GetPersonMediumByPtal();
    }

    /**
     * Create an instance of {@link GetPersonMediumByPtalResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByPtalResponse }
     */
    public GetPersonMediumByPtalResponse createGetPersonMediumByPtalResponse() {
        return new GetPersonMediumByPtalResponse();
    }

    /**
     * Create an instance of {@link GetPersonMediumByNameAndAddress }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByNameAndAddress }
     */
    public GetPersonMediumByNameAndAddress createGetPersonMediumByNameAndAddress() {
        return new GetPersonMediumByNameAndAddress();
    }

    /**
     * Create an instance of {@link GetPersonMediumByNameAndAddressResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByNameAndAddressResponse }
     */
    public GetPersonMediumByNameAndAddressResponse createGetPersonMediumByNameAndAddressResponse() {
        return new GetPersonMediumByNameAndAddressResponse();
    }

    /**
     * Create an instance of {@link GetPersonMediumByNameAndDateOfBirth }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByNameAndDateOfBirth }
     */
    public GetPersonMediumByNameAndDateOfBirth createGetPersonMediumByNameAndDateOfBirth() {
        return new GetPersonMediumByNameAndDateOfBirth();
    }

    /**
     * Create an instance of {@link GetPersonMediumByNameAndDateOfBirthResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonMediumByNameAndDateOfBirthResponse }
     */
    public GetPersonMediumByNameAndDateOfBirthResponse createGetPersonMediumByNameAndDateOfBirthResponse() {
        return new GetPersonMediumByNameAndDateOfBirthResponse();
    }

    /**
     * Create an instance of {@link GetPrivateChanges }
     * 
     * @return
     *     the new instance of {@link GetPrivateChanges }
     */
    public GetPrivateChanges createGetPrivateChanges() {
        return new GetPrivateChanges();
    }

    /**
     * Create an instance of {@link ChangesParam }
     * 
     * @return
     *     the new instance of {@link ChangesParam }
     */
    public ChangesParam createChangesParam() {
        return new ChangesParam();
    }

    /**
     * Create an instance of {@link GetPrivateChangesResponse }
     * 
     * @return
     *     the new instance of {@link GetPrivateChangesResponse }
     */
    public GetPrivateChangesResponse createGetPrivateChangesResponse() {
        return new GetPrivateChangesResponse();
    }

    /**
     * Create an instance of {@link PrivateChanges }
     * 
     * @return
     *     the new instance of {@link PrivateChanges }
     */
    public PrivateChanges createPrivateChanges() {
        return new PrivateChanges();
    }

    /**
     * Create an instance of {@link GetPublicChanges }
     * 
     * @return
     *     the new instance of {@link GetPublicChanges }
     */
    public GetPublicChanges createGetPublicChanges() {
        return new GetPublicChanges();
    }

    /**
     * Create an instance of {@link GetPublicChangesResponse }
     * 
     * @return
     *     the new instance of {@link GetPublicChangesResponse }
     */
    public GetPublicChangesResponse createGetPublicChangesResponse() {
        return new GetPublicChangesResponse();
    }

    /**
     * Create an instance of {@link PublicChanges }
     * 
     * @return
     *     the new instance of {@link PublicChanges }
     */
    public PublicChanges createPublicChanges() {
        return new PublicChanges();
    }

    /**
     * Create an instance of {@link AddPersonToCommunityByNameAndAddress }
     * 
     * @return
     *     the new instance of {@link AddPersonToCommunityByNameAndAddress }
     */
    public AddPersonToCommunityByNameAndAddress createAddPersonToCommunityByNameAndAddress() {
        return new AddPersonToCommunityByNameAndAddress();
    }

    /**
     * Create an instance of {@link AddPersonToCommunityByNameAndAddressResponse }
     * 
     * @return
     *     the new instance of {@link AddPersonToCommunityByNameAndAddressResponse }
     */
    public AddPersonToCommunityByNameAndAddressResponse createAddPersonToCommunityByNameAndAddressResponse() {
        return new AddPersonToCommunityByNameAndAddressResponse();
    }

    /**
     * Create an instance of {@link CommunityPersonResponse }
     * 
     * @return
     *     the new instance of {@link CommunityPersonResponse }
     */
    public CommunityPersonResponse createCommunityPersonResponse() {
        return new CommunityPersonResponse();
    }

    /**
     * Create an instance of {@link CommunityPerson }
     * 
     * @return
     *     the new instance of {@link CommunityPerson }
     */
    public CommunityPerson createCommunityPerson() {
        return new CommunityPerson();
    }

    /**
     * Create an instance of {@link AddPersonToCommunityByNameAndDateOfBirth }
     * 
     * @return
     *     the new instance of {@link AddPersonToCommunityByNameAndDateOfBirth }
     */
    public AddPersonToCommunityByNameAndDateOfBirth createAddPersonToCommunityByNameAndDateOfBirth() {
        return new AddPersonToCommunityByNameAndDateOfBirth();
    }

    /**
     * Create an instance of {@link AddPersonToCommunityByNameAndDateOfBirthResponse }
     * 
     * @return
     *     the new instance of {@link AddPersonToCommunityByNameAndDateOfBirthResponse }
     */
    public AddPersonToCommunityByNameAndDateOfBirthResponse createAddPersonToCommunityByNameAndDateOfBirthResponse() {
        return new AddPersonToCommunityByNameAndDateOfBirthResponse();
    }

    /**
     * Create an instance of {@link RemovePersonsFromCommunity }
     * 
     * @return
     *     the new instance of {@link RemovePersonsFromCommunity }
     */
    public RemovePersonsFromCommunity createRemovePersonsFromCommunity() {
        return new RemovePersonsFromCommunity();
    }

    /**
     * Create an instance of {@link PrivateIdList }
     * 
     * @return
     *     the new instance of {@link PrivateIdList }
     */
    public PrivateIdList createPrivateIdList() {
        return new PrivateIdList();
    }

    /**
     * Create an instance of {@link RemovePersonsFromCommunityResponse }
     * 
     * @return
     *     the new instance of {@link RemovePersonsFromCommunityResponse }
     */
    public RemovePersonsFromCommunityResponse createRemovePersonsFromCommunityResponse() {
        return new RemovePersonsFromCommunityResponse();
    }

    /**
     * Create an instance of {@link GetSystemStatus }
     * 
     * @return
     *     the new instance of {@link GetSystemStatus }
     */
    public GetSystemStatus createGetSystemStatus() {
        return new GetSystemStatus();
    }

    /**
     * Create an instance of {@link GetSystemStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetSystemStatusResponse }
     */
    public GetSystemStatusResponse createGetSystemStatusResponse() {
        return new GetSystemStatusResponse();
    }

    /**
     * Create an instance of {@link SystemStatusList }
     * 
     * @return
     *     the new instance of {@link SystemStatusList }
     */
    public SystemStatusList createSystemStatusList() {
        return new SystemStatusList();
    }

    /**
     * Create an instance of {@link RefreshConsumer }
     * 
     * @return
     *     the new instance of {@link RefreshConsumer }
     */
    public RefreshConsumer createRefreshConsumer() {
        return new RefreshConsumer();
    }

    /**
     * Create an instance of {@link RefreshConsumerResponse }
     * 
     * @return
     *     the new instance of {@link RefreshConsumerResponse }
     */
    public RefreshConsumerResponse createRefreshConsumerResponse() {
        return new RefreshConsumerResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     * @return
     *     the new instance of {@link Address }
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressParam }
     * 
     * @return
     *     the new instance of {@link AddressParam }
     */
    public AddressParam createAddressParam() {
        return new AddressParam();
    }

    /**
     * Create an instance of {@link ChangesBase }
     * 
     * @return
     *     the new instance of {@link ChangesBase }
     */
    public ChangesBase createChangesBase() {
        return new ChangesBase();
    }

    /**
     * Create an instance of {@link CivilStatus }
     * 
     * @return
     *     the new instance of {@link CivilStatus }
     */
    public CivilStatus createCivilStatus() {
        return new CivilStatus();
    }

    /**
     * Create an instance of {@link Country }
     * 
     * @return
     *     the new instance of {@link Country }
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link ForeignSsn }
     * 
     * @return
     *     the new instance of {@link ForeignSsn }
     */
    public ForeignSsn createForeignSsn() {
        return new ForeignSsn();
    }

    /**
     * Create an instance of {@link ForeignSsnList }
     * 
     * @return
     *     the new instance of {@link ForeignSsnList }
     */
    public ForeignSsnList createForeignSsnList() {
        return new ForeignSsnList();
    }

    /**
     * Create an instance of {@link HouseNumber }
     * 
     * @return
     *     the new instance of {@link HouseNumber }
     */
    public HouseNumber createHouseNumber() {
        return new HouseNumber();
    }

    /**
     * Create an instance of {@link Incapacity }
     * 
     * @return
     *     the new instance of {@link Incapacity }
     */
    public Incapacity createIncapacity() {
        return new Incapacity();
    }

    /**
     * Create an instance of {@link Guardian }
     * 
     * @return
     *     the new instance of {@link Guardian }
     */
    public Guardian createGuardian() {
        return new Guardian();
    }

    /**
     * Create an instance of {@link NameParam }
     * 
     * @return
     *     the new instance of {@link NameParam }
     */
    public NameParam createNameParam() {
        return new NameParam();
    }

    /**
     * Create an instance of {@link NameAndAddressParamList }
     * 
     * @return
     *     the new instance of {@link NameAndAddressParamList }
     */
    public NameAndAddressParamList createNameAndAddressParamList() {
        return new NameAndAddressParamList();
    }

    /**
     * Create an instance of {@link NameAndDateOfBirthParamList }
     * 
     * @return
     *     the new instance of {@link NameAndDateOfBirthParamList }
     */
    public NameAndDateOfBirthParamList createNameAndDateOfBirthParamList() {
        return new NameAndDateOfBirthParamList();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     * @return
     *     the new instance of {@link PersonName }
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link PublicIdList }
     * 
     * @return
     *     the new instance of {@link PublicIdList }
     */
    public PublicIdList createPublicIdList() {
        return new PublicIdList();
    }

    /**
     * Create an instance of {@link PublicIdListResponse }
     * 
     * @return
     *     the new instance of {@link PublicIdListResponse }
     */
    public PublicIdListResponse createPublicIdListResponse() {
        return new PublicIdListResponse();
    }

    /**
     * Create an instance of {@link SpecialMarks }
     * 
     * @return
     *     the new instance of {@link SpecialMarks }
     */
    public SpecialMarks createSpecialMarks() {
        return new SpecialMarks();
    }

    /**
     * Create an instance of {@link SystemStatus }
     * 
     * @return
     *     the new instance of {@link SystemStatus }
     */
    public SystemStatus createSystemStatus() {
        return new SystemStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://us-folk-v3.x-road.eu/producer", name = "PublicId")
    public JAXBElement<Integer> createPublicId(Integer value) {
        return new JAXBElement<>(_PublicId_QNAME, Integer.class, null, value);
    }

}
