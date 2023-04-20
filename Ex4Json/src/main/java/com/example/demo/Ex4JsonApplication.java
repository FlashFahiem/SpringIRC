package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Ex4JsonApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Ex4JsonApplication.class, args);
		
		Person p = new Person(21,"Fahiem",20);
		
		ObjectMapper o = new ObjectMapper();
		
		String json = o.writeValueAsString(p);
		
		System.out.println(json);
		
	}

}
