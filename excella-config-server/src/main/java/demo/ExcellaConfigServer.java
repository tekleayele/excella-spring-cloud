package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
@EnableConfigServer
public class ExcellaConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(ExcellaConfigServer.class, args);
	}

}
