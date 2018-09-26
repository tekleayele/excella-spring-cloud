package demo;

import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
@EnableEurekaClient
@RestController
@RefreshScope
public class ExcellaServiceProvider {
    private static final Logger log = LoggerFactory.getLogger(ExcellaServiceProvider.class);

    public static void main(String[] args) {
        SpringApplication.run(ExcellaServiceProvider.class, args);
    }

    @Bean
    @ConfigurationProperties(prefix = "excella")
    ExcellaServiceProviderProperties excellaProperties() {
        return new ExcellaServiceProviderProperties();
    }


    public static class ExcellaServiceProviderProperties {
        private String message;

        public ExcellaServiceProviderProperties(){}

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getEncryptedValue() {
            return encryptedValue;
        }

        public void setEncryptedValue(String encryptedValue) {
            this.encryptedValue = encryptedValue;
        }

        private String encryptedValue;


    }

    @RequestMapping("/")
    public String getMessage() {
        return excellaProperties().getMessage() + ",  encryptedValue - " + excellaProperties().getEncryptedValue();
    }
}
