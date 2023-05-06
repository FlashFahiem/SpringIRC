package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserModel;
import com.example.demo.Services.LoanService;

@RestController
public class LoanController {

	@Autowired
	public LoanService lservice;
	
	@GetMapping("user/getProfile")
	public List<UserModel> getAll()
	{
		return lservice.getInfo();
	}
	
	@PostMapping("user/signup")
	public UserModel signUp(@RequestBody UserModel um)
	{
		return lservice.signup(um);
	}
	
	@PostMapping("user/login")
	public UserModel login(@RequestBody UserModel um)
	{
		return lservice.login(um);
	}
	
	
}
