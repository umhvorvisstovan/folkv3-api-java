package fo.us.folkv3.api.client;

import java.util.List;
import java.util.Set;

import eu.x_road.us_folk_v3.producer.GetPrivilegesMedium;
import fo.us.folkv3.api.cert.CertificateConfig;

abstract class PrivilegesMediumClient extends BaseClient {

	protected PrivilegesMediumClient(HeldinConfig heldinConfig, CertificateConfig certificateConfig) {
		super(heldinConfig, certificateConfig);
	}

	@Override
	protected List<Class<?>> listOfOperationClasses(List<Class<?>> operationClasses) {
		operationClasses.add(GetPrivilegesMedium.class);
		return operationClasses;
	}

	@Override
	public Set<String> getRequiredPrivileges() {
		return privileges(
				call((sh, mh, rh) ->
						webService.getPrivilegesMedium(
								null,
								sh,
								mh,
								rh,
								clientHeader,
								serviceHeader(GetPrivilegesMedium.class),
								idHeader(),
								userIdHeader,
								issueHeader,
								protocolVersionHeader
								)
						)				
				);
	}

}
