package com.blueyonder.helloworldservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info = @Info(title = "helloworld api", description = "Documentation helloworld API v1.0"))
public class HelloworldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldServiceApplication.class, args);
	}

	

}
