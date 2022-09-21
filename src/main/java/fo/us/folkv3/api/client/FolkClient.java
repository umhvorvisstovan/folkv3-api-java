package fo.us.folkv3.api.client;

import fo.us.folkv3.api.cert.CertificateConfig;

public class FolkClient {

	private FolkClient() {
		throw new AssertionError();
	}

	public static PersonSmallClient personSmall(HeldinConfig heldinConfig) {
		return new PersonSmallClient(heldinConfig, securityConfig(heldinConfig));
	}

	public static PersonSmallClient personSmall(HeldinConfig heldinConfig, CertificateConfig certificateConfig) {
		return new PersonSmallClient(heldinConfig, certificateConfig);
	}

	public static PersonMediumClient personMedium(HeldinConfig heldinConfig) {
		return new PersonMediumClient(heldinConfig, securityConfig(heldinConfig));
	}

	public static PersonMediumClient personMedium(HeldinConfig heldinConfig, CertificateConfig certificateConfig) {
		return new PersonMediumClient(heldinConfig, certificateConfig);
	}

	public static PrivateCommunityClient privateCommunity(HeldinConfig heldinConfig) {
		return new PrivateCommunityClient(heldinConfig, securityConfig(heldinConfig));
	}

	public static PrivateCommunityClient privateCommunity(HeldinConfig heldinConfig, CertificateConfig certificateConfig) {
		return new PrivateCommunityClient(heldinConfig, certificateConfig);
	}

	public static PublicCommunityClient publicCommunity(HeldinConfig heldinConfig) {
		return new PublicCommunityClient(heldinConfig, securityConfig(heldinConfig));
	}

	public static PublicCommunityClient publicCommunity(HeldinConfig heldinConfig, CertificateConfig certificateConfig) {
		return new PublicCommunityClient(heldinConfig, certificateConfig);
	}
	private static CertificateConfig securityConfig(HeldinConfig heldinConfig) {
		System.out.println("!!!!!!!!!!!!!!");
		System.out.println("SECURE: " + heldinConfig.secure);
		System.out.println("!!!!!!!!!!!!!!");
		return heldinConfig.secure ? CertificateConfig.trustAll() : null;
	}

}
