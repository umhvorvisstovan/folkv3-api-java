package fo.us.folkv3.api.client;

import java.util.List;
import java.util.Set;

import eu.x_road.us_folk_v3.producer.GetPrivilegesSmall;
import fo.us.folkv3.api.cert.CertificateConfig;

abstract class PrivilegesSmallClient extends BaseClient {

	protected PrivilegesSmallClient(HeldinConfig  heldinConfig, CertificateConfig certificateConfig) {
		super(heldinConfig, certificateConfig);
	}

	@Override
	protected List<Class<?>> listOfOperationClasses(List<Class<?>> operationClasses) {
		operationClasses.add(GetPrivilegesSmall.class);
		return operationClasses;
	}

	@Override
	public Set<String> getRequiredPrivileges() throws FolkApiException {
		return privileges(
				call((sh, mh, rh) ->
						webService.getPrivilegesSmall(
								null,
								sh,
								mh,
								rh,
								clientHeader,
								serviceHeader(GetPrivilegesSmall.class),
								idHeader(),
								userIdHeader,
								issueHeader,
								protocolVersionHeader
								)
						)				
				);
	}

}
