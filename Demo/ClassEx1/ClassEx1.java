package com.example.demo.ClassEx1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ClassEx1 {
	
	@GetMapping("/")
	
	@ResponseBody
	
	
	public String Welcome()
	{
		return " Hi ";
	}
	
	
}
