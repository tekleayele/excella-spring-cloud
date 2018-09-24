package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ExcellaConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(ExcellaConfigServer.class, args);
	}

}
