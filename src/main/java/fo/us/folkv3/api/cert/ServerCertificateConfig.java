package fo.us.folkv3.api.cert;

import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Objects;

class ServerCertificateConfig {

    public static final String SERVER_PATH = "folkv3.serverCertificate.path";
    public static final String SERVER_PATH_ENV = Env.toEnv(SERVER_PATH);

    private final Path certificatePath;

    ServerCertificateConfig(Path certificatePath) {
        this.certificatePath = Objects.requireNonNull(certificatePath, "certificatePath must not be null");
    }

    static ServerCertificateConfig load() {
        var serverCertificatePath = Env.property(SERVER_PATH);
        if (serverCertificatePath == null) {
            throw new RuntimeException(
                    "No path parameter (vm or env) supplied (vm: %s - env: %s)".formatted(SERVER_PATH, SERVER_PATH_ENV)
            );
        }
        var path = Paths.get(serverCertificatePath);
        if (!Files.exists(path) || !Files.isRegularFile(path) || !Files.isReadable(path)) {
            throw new IllegalStateException(
                    "The server certificate file denoted by the path %s does not exist as a regular readable file"
                            .formatted(serverCertificatePath)
            );
        }
        return new ServerCertificateConfig(path);
    }

    TrustManager[] trustManagers() {
        var certificate = loadCertificate(certificatePath);
        try {
            var store = KeyStore.getInstance(KeyStore.getDefaultType());
            store.load(null, null);
            store.setCertificateEntry(
                    certificatePath.getFileName().toString(),
                    certificate
            );
            var tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tmf.init(store);
            return tmf.getTrustManagers();
        } catch (Exception e) {
            throw new RuntimeException("Could not init trust store from path " + certificatePath, e);
        }
    }

    @Override
    public String toString() {
        return "ServerCertificateConfig{certificatePath=%s}".formatted(certificatePath);
    }

    private static X509Certificate loadCertificate(Path path) {
        try (var is = Files.newInputStream(path)) {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(is);
        } catch (Exception x) {
            throw new RuntimeException("Could not load certificate from path " + path, x);
        }
    }

}
