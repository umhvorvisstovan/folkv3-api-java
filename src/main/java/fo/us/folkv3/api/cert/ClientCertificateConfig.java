package fo.us.folkv3.api.cert;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.util.Objects;

class ClientCertificateConfig {

    public static final String CLIENT_PATH = "folkv3.clientKeyStore.path";
    public static final String CLIENT_PATH_ENV = Env.toEnv(CLIENT_PATH);
    public static final String CLIENT_PASSWORD = "folkv3.clientKeyStore.password";
    public static final String CLIENT_PASSWORD_ENV = Env.toEnv(CLIENT_PASSWORD);
    public static final String CLIENT_STORETYPE = "folkv3.clientKeyStore.type";
    public static final String CLIENT_STORETYPE_ENV = Env.toEnv(CLIENT_STORETYPE);

    private final Path keyStorePath;
    private final char[] keyStorePassword;
    private final SecurityContext.KeyStoreType keyStoreType;

    ClientCertificateConfig(
            Path keyStorePath,
            char[] keyStorePassword,
            SecurityContext.KeyStoreType keyStoreType
    ) {
        this.keyStorePath = Objects.requireNonNull(keyStorePath, "keyStorePath must not be null");
        this.keyStorePassword = Objects.requireNonNull(keyStorePassword, "keyStorePassword must not be null");
        this.keyStoreType =  keyStoreType == null ? SecurityContext.defaultKeyStoreType : keyStoreType;
    }

    public static ClientCertificateConfig load() {
        var clientKeyStorePath = Env.property(CLIENT_PATH);
        var clientKeyStorePassword = Env.property(CLIENT_PASSWORD);
        if (clientKeyStorePath == null) {
            throw new IllegalStateException(
                    "No path parameter (vm or env) supplied (vm: %s - env: %s)"
                            .formatted(CLIENT_PATH, CLIENT_PATH_ENV)
            );
        }
        if (clientKeyStorePassword == null) {
            throw new IllegalStateException(
                    "No password parameter (vm or env) supplied for key store %s  (vm: %s - env: %s)"
                            .formatted(clientKeyStorePath, CLIENT_PASSWORD, CLIENT_PASSWORD_ENV)
            );
        }
        var path = Paths.get(clientKeyStorePath);
        if (!Files.exists(path) || !Files.isRegularFile(path) || !Files.isReadable(path)) {
            throw new IllegalStateException(
                    "The client key store file denoted by the path %s does not exist as a regular readable file"
                            .formatted(clientKeyStorePath)
            );
        }
        return new ClientCertificateConfig(
                path,
                clientKeyStorePassword.toCharArray(),
                loadKeyStoreType()
        );
    }

    @Override
    public String toString() {
        return "ClientCertificateConfig{keyStorePath=%s, keyStoreType=%s}".formatted(keyStorePath, keyStoreType);
    }

    KeyManager[] keyManagers() {
        try {
            var store = KeyStore.getInstance(keyStoreType.name());
            store.load(Files.newInputStream(keyStorePath), keyStorePassword);
            var kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(store, keyStorePassword);
            return kmf.getKeyManagers();
        } catch (Exception e) {
            throw new RuntimeException("Could not init key store from path " + keyStorePath, e);
        }
    }

    private static SecurityContext.KeyStoreType loadKeyStoreType() {
        var envKeyStoreType = Env.property(CLIENT_STORETYPE);
        if (envKeyStoreType == null) return null;
        try {
            return SecurityContext.KeyStoreType.of(envKeyStoreType);
        } catch (Exception e) {
            throw new IllegalStateException(
                    "Invalid parameter (vm or env) supplied (vm: %s - env: %s) - value: %s"
                            .formatted(CLIENT_STORETYPE, CLIENT_STORETYPE_ENV, envKeyStoreType)
            );
        }
    }

}
