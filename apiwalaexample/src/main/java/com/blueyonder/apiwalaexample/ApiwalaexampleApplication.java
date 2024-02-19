package com.blueyonder.apiwalaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info = @Info(title = "customer api", description = "Documentation customer API v1.0"))
public class ApiwalaexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiwalaexampleApplication.class, args);
	}

//	
}
