package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.AdminModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Repositories.AdminRepo;
import com.example.demo.Repositories.UserRepo;

@Service
public class LoanService {

	@Autowired
	public UserRepo urepo;
	
	public List<UserModel> getInfo()
	{
		return urepo.findAll();
	}
	
	public UserModel signup(UserModel um)
	{
		return urepo.save(um);
	}
	
	public UserModel login(UserModel um)
	{
		return urepo.save(um);
	}

	
	
	
	@Autowired
	public AdminRepo arepo;
	
	public List<AdminModel> viewInfo()
	{
		return arepo.findAll();
	}
}
