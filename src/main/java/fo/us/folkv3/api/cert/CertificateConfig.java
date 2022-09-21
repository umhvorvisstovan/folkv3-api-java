package fo.us.folkv3.api.cert;

import javax.net.ssl.SSLSocketFactory;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class CertificateConfig {

    public final static String TLS_PROTOCOL = "folkv3.tlsProtocol";
    public final static String TLS_PROTOCOL_ENV = Env.toEnv(TLS_PROTOCOL);

    private final ServerCertificateConfig serverCertificateConfig;
    private final ClientCertificateConfig clientCertificateConfig;
    private final SecurityContext.TlsProtocol tlsProtocol;

    private CertificateConfig(
            ServerCertificateConfig serverCertificateConfig,
            ClientCertificateConfig clientCertificateConfig,
            SecurityContext.TlsProtocol tlsProtocol) {
        this.serverCertificateConfig = serverCertificateConfig;
        this.clientCertificateConfig = clientCertificateConfig;
        this.tlsProtocol = tlsProtocol == null ? SecurityContext.defaultTlsProtocol : tlsProtocol;
    }

    public static CertificateConfig trustAll() {
        return new CertificateConfig(
                null,
                null,
                loadTlsProtocol()
        );
    }

    public static CertificateConfig loadClientCertificate() {
        return new CertificateConfig(
                null,
                ClientCertificateConfig.load(),
                loadTlsProtocol()
        );
    }

    public static CertificateConfig loadServerCertificate() {
        return new CertificateConfig(
                ServerCertificateConfig.load(),
                null,
                loadTlsProtocol()
        );
    }

    public static CertificateConfig loadClientAndServerCertificate() {
        return new CertificateConfig(
                ServerCertificateConfig.load(),
                ClientCertificateConfig.load(),
                loadTlsProtocol()
        );
    }

    public static Builder builder() {
        return new Builder();
    }

    public SSLSocketFactory socketFactory() {
        return SecurityContext.socketFactory(
                tlsProtocol,
                clientCertificateConfig == null ? null : clientCertificateConfig.keyManagers(),
                serverCertificateConfig == null
                        ? SecurityContext.trustAllManagers() : serverCertificateConfig.trustManagers()
        );
    }

    @Override
    public String toString() {
        return "CertificateConfig{serverCertificateConfig=%s, clientCertificateConfig=%s, tlsProtocol=%s}"
                .formatted(serverCertificateConfig, clientCertificateConfig, tlsProtocol);
    }

    private static SecurityContext.TlsProtocol loadTlsProtocol() {
        var envTlsProtocol = Env.property(TLS_PROTOCOL);
        if (envTlsProtocol == null) return null;
        try {
            return SecurityContext.TlsProtocol.of(envTlsProtocol);
        } catch (Exception e) {
            throw new IllegalStateException(
                    "Invalid parameter (vm or env) supplied (vm: %s - env: %s) - value: %s"
                            .formatted(TLS_PROTOCOL, TLS_PROTOCOL_ENV, envTlsProtocol)
            );
        }
    }

    public static class Builder {
        private Path clientKeyStorePath;
        private char[] clientKeyStorePassword;
        private SecurityContext.KeyStoreType clientKeyStoreType;
        private Path serverCertificatePath;
        private SecurityContext.TlsProtocol tlsProtocol;
        public Builder clientKeyStorePath(String clientKeyStorePath) {
            return clientKeyStorePath(Paths.get(clientKeyStorePath));
        }
        public Builder clientKeyStorePath(Path clientKeyStorePath) {
            this.clientKeyStorePath = clientKeyStorePath;
            return this;
        }
        public Builder clientKeyStorePassword(String clientKeyStorePassword) {
            return clientKeyStorePassword(clientKeyStorePassword.toCharArray());
        }
        public Builder clientKeyStorePassword(char[] clientKeyStorePassword) {
            this.clientKeyStorePassword = Arrays.copyOf(clientKeyStorePassword, clientKeyStorePassword.length);
            return this;
        }
        public Builder clientKeyStoreType(String clientKeyStoreType) {
            return clientKeyStoreType(SecurityContext.KeyStoreType.valueOf(clientKeyStoreType));
        }
        public Builder clientKeyStoreType(SecurityContext.KeyStoreType clientKeyStoreType) {
            this.clientKeyStoreType = clientKeyStoreType;
            return this;
        }
        public Builder serverCertificatePath(String serverCertificatePath) {
            return serverCertificatePath(Paths.get(serverCertificatePath));
        }
        public Builder serverCertificatePath(Path serverCertificatePath) {
            this.serverCertificatePath = serverCertificatePath;
            return this;
        }
        public Builder tlsProtocol(String tlsProtocol) {
            return tlsProtocol(SecurityContext.TlsProtocol.of(tlsProtocol));
        }
        public Builder tlsProtocol(SecurityContext.TlsProtocol tlsProtocol) {
            this.tlsProtocol = tlsProtocol;
            return this;
        }
        public CertificateConfig build() {
            return new CertificateConfig(
                    serverCertificatePath == null ? null : new ServerCertificateConfig(serverCertificatePath),
                    clientKeyStorePath == null ? null : new ClientCertificateConfig(
                            clientKeyStorePath, clientKeyStorePassword, clientKeyStoreType),
                    tlsProtocol
            );
        }
    }

}
