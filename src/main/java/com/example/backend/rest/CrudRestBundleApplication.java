package com.example.backend.rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class CrudRestBundleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudRestBundleApplication.class, args);
	}

}
