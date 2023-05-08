package com.example.demo.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserModel;
import com.example.demo.Model.AdminModel;
import com.example.demo.Services.LoanService;

@RestController
public class LoanController {

	@Autowired
	public LoanService lservice;
	
	//User
	@GetMapping("user/getProfile")
	public List<UserModel> getAll()
	{
		return lservice.getInfo();
	}
	
	@PostMapping("user/saveUser")
	public UserModel signUp(@RequestBody UserModel um)
	{
		return lservice.saveUser(um);
	}
	
	@PutMapping("user/updateUser")
	public UserModel updateUser (@RequestBody UserModel um)
	{
		return lservice.updateUser(um);
	}
	
	@DeleteMapping("user/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		lservice.deleteUser(id);
		return "Deleted";
	}
	
	//Admin
	
	@GetMapping("admin/getAdmin")
	public List<AdminModel> getAdmin()
	{
		return lservice.getAdminInfo();
	}
	
	@PostMapping("admin/saveAdmin")
	public AdminModel signUp(@RequestBody AdminModel um)
	{
		return lservice.saveAdmin(um);
	}
	
	@PutMapping("admin/updateAdmin")
	public AdminModel updateAdmin (@RequestBody AdminModel um)
	{
		return lservice.updateAdmin(um);
	}
	
	@DeleteMapping("admin/deleteAdmin/{userRole}")
	public String deleteAdmin(@PathVariable("userRole") int userRole)
	{
		lservice.deleteAdmin(userRole);
		return "Deleted";
	}
	
	
	
	
}
