package com.samuapplication.samu_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SamuBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SamuBackendApplication.class, args);
	}

}
