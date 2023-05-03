package com.example.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title = "Garage Information",
		version = "1.1.2",
		description = "Game Hub Project",
		contact = @Contact(
				name = "Fahiem",
				email = "fahiemrox@gmail.com"
				)
		)
)

 class GarageInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageInformationApplication.class, args);
	}

}
