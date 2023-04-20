package com.example.demo.ClassEx3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ClassEx3 {

	
	@Value("${bikename}")
	public String bike;
	
	@GetMapping("/setDisplay")
	@ResponseBody
	
	
	public String displayBike()
	{
		return "My Bike's name is the "+bike;
	}
	
}
