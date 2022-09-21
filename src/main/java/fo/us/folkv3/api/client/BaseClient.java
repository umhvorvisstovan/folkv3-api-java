package fo.us.folkv3.api.client;

import com.sun.xml.ws.developer.JAXWSProperties;
import eu.x_road.us_folk_v3.producer.*;
import eu.x_road.xsd.identifiers.XRoadClientIdentifierType;
import eu.x_road.xsd.identifiers.XRoadObjectType;
import eu.x_road.xsd.identifiers.XRoadServiceIdentifierType;
import fo.us.folkv3.api.cert.CertificateConfig;
import fo.us.folkv3.api.model.PrivateId;
import fo.us.folkv3.api.model.PublicId;
import fo.us.folkv3.api.model.param.AddressParam;
import fo.us.folkv3.api.model.param.NameParam;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Holder;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

abstract class BaseClient {

	private static final String WSDL_PATH = '/' + FolkClient.class.getPackageName().replace('.', '/')
			+ "/us-folk-v3.wsdl";

	private static final AtomicLong ID_SEQUENCE = new AtomicLong(System.currentTimeMillis());
	private static final String CAN_USE_COMMUNITY_METHODS = "CanUseCommunityMethods"; 
	private static final String PROTOCOL_VERSION = "4.0";
	private static final String SERVICE_VERSION = "v1";
	
	private final HeldinConfig config;
	private final Map<Class<?>, Holder<XRoadServiceIdentifierType>> serviceHeaders;
	protected final Holder<XRoadClientIdentifierType> clientHeader;
	protected final Holder<String> protocolVersionHeader;
	protected final Holder<String> userIdHeader;
	protected final Holder<String> issueHeader;
	protected final UsFolkPortType webService;
	protected final boolean canUseCommunityMethods;
	
	protected BaseClient(HeldinConfig heldinConfig, CertificateConfig certificateConfig) {
		this.config = Objects.requireNonNull(heldinConfig, "heldinConfig must not be null");
		serviceHeaders = initServiceHeaders();
		clientHeader = initClientHeader();
		protocolVersionHeader = holder(PROTOCOL_VERSION);
		userIdHeader = holder(heldinConfig.userId);
		issueHeader = holder(null);
		webService = webService(heldinConfig.host, certificateConfig);
		var myPrivileges = getMyPrivileges();
		canUseCommunityMethods = myPrivileges.contains(CAN_USE_COMMUNITY_METHODS);
		checkPrivileges(myPrivileges);
	}

	private static UsFolkPortType webService(String host, CertificateConfig certificateConfig) {
		Objects.requireNonNull(host, "host must not be null");
		var sslSocketFactory = certificateConfig == null ? null : certificateConfig.socketFactory();
		var secure = sslSocketFactory != null;
		try {
			var webService = UsFolkService.port(wsdlUrl());
			var context = ((BindingProvider) webService).getRequestContext();
			context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointAddress(host, secure));
			if (sslSocketFactory != null) context.put(JAXWSProperties.SSL_SOCKET_FACTORY, sslSocketFactory);
			return webService;
		} catch (Exception e) {
			throw new FolkApiException("Could not create instance", e);
		}
	}

	private static URL wsdlUrl() {
		var url = FolkClient.class.getResource(WSDL_PATH);
		if (url == null) {
			throw new IllegalStateException("No wsdl found at " + WSDL_PATH);
		}
		return url;
	}

	private static String endpointAddress(String host, boolean secure) {
		return String.format("http%s://%s", (secure ? "s" : ""), host);
	}

	private Map<Class<?>, Holder<XRoadServiceIdentifierType>> initServiceHeaders() {
		var serviceHeaders = new HashMap<Class<?>, Holder<XRoadServiceIdentifierType>>();
		addServiceHeader(GetSystemStatus.class, serviceHeaders);
		addServiceHeader(GetMyPrivileges.class, serviceHeaders);
		addServiceHeader(RefreshConsumer.class, serviceHeaders);
		listOfOperationClasses(new ArrayList<>()).forEach(c -> addServiceHeader(c, serviceHeaders));
		return serviceHeaders;
	}
	
	protected abstract List<Class<?>> listOfOperationClasses(List<Class<?>> operationClasses);
	
	private void checkPrivileges(Set<String> myPrivileges) {
		var privileges = myPrivileges.stream()
				.filter(p -> !p.equals(CAN_USE_COMMUNITY_METHODS))
				.collect(Collectors.toSet());
		var requiredPrivileges = getRequiredPrivileges();
		if (!privileges.containsAll(requiredPrivileges)) {
			var missingPrivileges = requiredPrivileges.stream()
					.filter(p -> !privileges.contains(p)).toList();
			throw new FolkApiException(
					"Insufficient privileges - actual: " + myPrivileges + " - required: " + requiredPrivileges
					+ " - missing: " + missingPrivileges);
		}
	}
	
	protected void checkCanUseCommunityMethods() {
		checkCanOrNot(true, "use community methods");
	}
	
	protected void checkCanUsePrivateId() {
		checkCanOrNot(true, "use private id");
	}
	
	protected void checkCanUsePublicId() {
		checkCanOrNot(false, "use public id");
	}
	
	protected void checkCanGetPrivateChanges() {
		checkCanOrNot(true, "get private changes");
	}
	
	protected void checkCanGetPublicChanges() {
		checkCanOrNot(false, "get public changes");
	}
	
	private void checkCanOrNot(boolean useOrNot, String what) {
		if (useOrNot == canUseCommunityMethods) {
			return;
		}
		throw new FolkApiException("Insufficient privileges - can not " + what);
	}
	
	public String refreshConsumer() {
		return call((sh, mh, rh) ->
				webService.refreshConsumer(
						null,
						sh,
						mh,
						rh,
						clientHeader,
						serviceHeader(RefreshConsumer.class),
						idHeader(),
						userIdHeader,
						issueHeader,
						protocolVersionHeader
						)
				);
	}

	public Map<String, String> getSystemStatus() {
		SystemStatusList result = call((sh, mh, rh) ->
				webService.getSystemStatus(
						null,
						sh,
						mh,
						rh,
						clientHeader,
						serviceHeader(GetSystemStatus.class),
						idHeader(),
						userIdHeader,
						issueHeader,
						protocolVersionHeader
						)
				);
		return result.getSystemStatus().stream()
				.collect(Collectors.toMap(SystemStatus::getName, SystemStatus::getValue));
	}

	public Set<String> getMyPrivileges() {
        PrivilegeList result = call((sh, mh, rh) ->
				webService.getMyPrivileges(
						null,
						sh,
						mh,
						rh,
						clientHeader,
						serviceHeader(GetMyPrivileges.class),
						idHeader(),
						userIdHeader,
						issueHeader,
						protocolVersionHeader
						)
				);
        return Set.copyOf(result.getPrivilege());
	}
	
	public abstract Set<String> getRequiredPrivileges() throws FolkApiException;

	protected <R> R call(CallConsumer<R> method) {
		var statusHolder = new Holder<String>();
		var messageHolder = new Holder<String>();
		var resultHolder = new Holder<R>();
		method.accept(statusHolder, messageHolder, resultHolder);
		checkStatus(statusHolder, messageHolder);
		return resultHolder.value;
	}

	protected void checkStatus(Holder<String> statusHolder, Holder<String> messageHolder) {
		if (statusHolder.value == null) {
			throw new FolkApiException("Invalid response, no status - message: " + messageHolder.value);
		}
		var status = extractStatus(statusHolder);
		if (status.isOk() || status.isNotFound()) {
			return;
		}
		if (status.isMoreThanOne()) {
			throw new MoreThanOneException();
		}
		throw new ResponseStatusException(messageHolder.value, status);
	}
	
	protected Holder<XRoadServiceIdentifierType> serviceHeader(Class<?> operationClass) {
		var header = serviceHeaders.get(operationClass);
		if (header == null) {
			throw new IllegalStateException("Illegal operation class " + operationClass);
		}
		return header;
	}
	
	private void addServiceHeader(Class<?> serviceClass, Map<Class<?>,
			Holder<XRoadServiceIdentifierType>> serviceHeaders) {
		serviceHeaders.put(serviceClass, initServiceHeader(serviceClass));
	}

	private Holder<XRoadServiceIdentifierType> initServiceHeader(Class<?> serviceClass) {
		var si = new XRoadServiceIdentifierType();
		si.setObjectType(XRoadObjectType.SERVICE);
		si.setXRoadInstance(config.service.xRoadInstance);
		si.setMemberClass(config.service.memberClass.name());
		si.setMemberCode(config.service.memberCode);
		si.setSubsystemCode(config.service.subSystemCode);
		si.setServiceCode(serviceClass.getSimpleName());
		si.setServiceVersion(SERVICE_VERSION);
		return holder(si);
	}

	private Holder<XRoadClientIdentifierType> initClientHeader() {
		var ci = new XRoadClientIdentifierType();
		ci.setObjectType(XRoadObjectType.SUBSYSTEM);
		ci.setXRoadInstance(config.client.xRoadInstance);
		ci.setMemberClass(config.client.memberClass.name());
		ci.setMemberCode(config.client.memberCode);
		ci.setSubsystemCode(config.client.subSystemCode);
		return holder(ci);
	}

	static <T> T requireNonNull(T value, String name) {
		return Objects.requireNonNull(value, name + " must not be null");
	}
	
	static <T> Holder<T> responseHolder(Class<T> responseClass) {
		return new Holder<T>();
	}
	
	static <T> Holder<T> holder(T value) {
		return new Holder<T>(value);
	}

	static Holder<String> idHeader() {
		return new Holder<>(Long.toString(ID_SEQUENCE.getAndIncrement()));
	}

	static eu.x_road.us_folk_v3.producer.NameParam nameParam(NameParam name) {
		var result = new eu.x_road.us_folk_v3.producer.NameParam();
		result.setFirst(name.getFirst());
		result.setLast(name.getLast());
		return result;
	}
	
	static eu.x_road.us_folk_v3.producer.AddressParam addressParam(AddressParam address) {
		var result = new eu.x_road.us_folk_v3.producer.AddressParam();
		result.setStreet(address.getStreet());
		result.setHouseNumber(new eu.x_road.us_folk_v3.producer.HouseNumber());
		result.getHouseNumber().setNumber(address.getHouseNumber().getNumber());
		result.getHouseNumber().setBuildingCode(address.getHouseNumber().hasLetter()
				? address.getHouseNumber().getLetter().toString() : null);
		result.setCity(address.getCity());
		return result;
	}

	static eu.x_road.us_folk_v3.producer.NameAndAddressParam nameAndAddressParam(NameParam name, AddressParam address) {
		var param = new eu.x_road.us_folk_v3.producer.NameAndAddressParam();
		param.setName(nameParam(name));
		param.setAddress(addressParam(address));
		return param;
	}
	
	static eu.x_road.us_folk_v3.producer.NameAndDateOfBirthParam nameAndDateOfBirthParam(NameParam name, LocalDate dateOfBirth) {
		var param = new eu.x_road.us_folk_v3.producer.NameAndDateOfBirthParam();
		param.setName(nameParam(name));
		param.setDateOfBirth(dateOfBirth.toString());
		return param;
	}
	
	static eu.x_road.us_folk_v3.producer.ChangesParam changesParam(LocalDateTime from, LocalDateTime to) {
		var param = new eu.x_road.us_folk_v3.producer.ChangesParam();
		param.setFrom(from.toString());
		param.setTo(to.toString());
		return param;
	}

	static eu.x_road.us_folk_v3.producer.PrivateId privateId(PrivateId id) {
		var result = new eu.x_road.us_folk_v3.producer.PrivateId();
		result.setValue(id.getValue());
		return result;
	}

	static eu.x_road.us_folk_v3.producer.PublicId publicId(PublicId id) {
		var result = new eu.x_road.us_folk_v3.producer.PublicId();
		result.setValue(id.getValue());
		return result;
	}

	static eu.x_road.us_folk_v3.producer.PrivateIdList privateIdList(List<PrivateId> ids) {
		var result = new eu.x_road.us_folk_v3.producer.PrivateIdList();
		result.getId().addAll(
				ids.stream().map(BaseClient::privateId).toList()
				);
		return result;
	}

	static Set<String> privileges(eu.x_road.us_folk_v3.producer.PrivilegeList privilegeList) {
		return Set.copyOf(privilegeList.getPrivilege());
	}

	private static ResponseStatus extractStatus(Holder<String> statusHolder) {
		try {
			return ResponseStatus.valueOf(statusHolder.value);
		} catch (Exception e) {
			throw new FolkApiException("Invalid response status: " + statusHolder.value);
		}
	}
	
}
