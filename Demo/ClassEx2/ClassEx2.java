package com.example.demo.ClassEx2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassEx2 {
	
	public String name="skct";
	
	@GetMapping("/setName")
	
	
	public String getName()
	{
		return "Welcome"+name+"!";
	}
	
}
