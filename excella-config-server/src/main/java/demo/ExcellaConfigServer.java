package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.config.server.EnableConfigServer;


@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
@EnableConfigServer
public class ExcellaConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(ExcellaConfigServer.class, args);
	}

}
