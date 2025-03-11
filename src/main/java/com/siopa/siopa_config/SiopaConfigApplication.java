package com.siopa.siopa_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SiopaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiopaConfigApplication.class, args);
	}

}
