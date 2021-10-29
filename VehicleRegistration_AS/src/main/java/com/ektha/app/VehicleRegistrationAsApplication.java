package com.ektha.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class VehicleRegistrationAsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRegistrationAsApplication.class, args);
	}
	
}
