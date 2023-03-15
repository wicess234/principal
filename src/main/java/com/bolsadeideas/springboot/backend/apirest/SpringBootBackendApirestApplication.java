package com.bolsadeideas.springboot.backend.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendApirestApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","9091" );
		SpringApplication.run(SpringBootBackendApirestApplication.class, args);
	}
}
