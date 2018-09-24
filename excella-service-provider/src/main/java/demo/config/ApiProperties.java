package demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;

@Component
@ConfigurationProperties(prefix = "api", ignoreUnknownFields = false)
public class ApiProperties {

    private final KeyStore keyStore = new KeyStore();

    private final CorsConfiguration cors = new CorsConfiguration();

    private final SecureData secureData = new SecureData();

    public KeyStore getKeyStore() {
        return keyStore;
    }

    public CorsConfiguration getCors() {
        return cors;
    }

    public SecureData getSecureData() {
        return secureData;
    }

    public static class KeyStore {

        private String name;
        private String password;
        private String alias;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

    }

    public static class SecureData {

        private String location;

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

    }

}