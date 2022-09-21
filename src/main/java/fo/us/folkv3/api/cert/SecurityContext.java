package fo.us.folkv3.api.cert;

import javax.net.ssl.*;
import java.security.cert.X509Certificate;
import java.util.Objects;

public class SecurityContext {

    public static KeyStoreType defaultKeyStoreType = KeyStoreType.PKCS12;
    public static TlsProtocol defaultTlsProtocol = TlsProtocol.TLSv13;

    static TrustManager[] trustAllManagers() {
        return new TrustManager[] {
                new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
                    public void checkClientTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                    public void checkServerTrusted(
                            java.security.cert.X509Certificate[] certs, String authType) {
                    }
                }
        };
    }

    static SSLSocketFactory socketFactory(
            TlsProtocol tlsProtocol, KeyManager[] keyManagers, TrustManager[] trustManagers) {
        try {
            SSLContext ssLCtx = SSLContext.getInstance(tlsProtocol.toString());
            ssLCtx.init(
                    keyManagers,
                    trustManagers,
                    null
            );
            return ssLCtx.getSocketFactory();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public enum KeyStoreType {
        JKS, PKCS12;
        public static KeyStoreType of(String value) {
            try {
                return KeyStoreType.valueOf(Objects.requireNonNull(value, "value must not be null").toUpperCase());
            } catch (Exception x) {
                throw new IllegalArgumentException("Invalid key store type value: " + value);
            }
        }
    }

    public enum TlsProtocol {
        TLSv12, TLSv13;
        public static TlsProtocol of(String value) {
            Objects.requireNonNull(value, "value must not be null");
            var protocol = switch (value) {
                case "TLSv1.2", "TLS1.2", "TLS12" -> TLSv12;
                case "TLSv1.3", "TLS1.3", "TLS13" -> TLSv13;
                default -> null;
            };
            if (protocol == null) {
                try {
                    protocol = TlsProtocol.valueOf(value);
                } catch (Exception x) {
                    throw new IllegalArgumentException("Invalid TLS protocol value: " + value);
                }
            }
            return protocol;
        }
        @Override
        public String toString() {
            return switch (this) {
                case TLSv12 -> "TLSv1.2";
                case TLSv13 -> "TLSv1.3";
            };
        }
    }
}
