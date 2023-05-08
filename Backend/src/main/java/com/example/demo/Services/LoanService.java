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

	//User Model
	@Autowired
	public UserRepo urepo;
	
	public List<UserModel> getInfo()
	{
		return urepo.findAll();
	}
	
	public UserModel saveUser(UserModel um)
	{
		return urepo.save(um);
	}
	
	public UserModel updateUser(UserModel um)
	{
		return urepo.saveAndFlush(um);
	}
	
	public String deleteUser(int id)
	{
		urepo.deleteById(id);
		return "Deleted";
	}
	
	//Admin Model
	@Autowired
	public AdminRepo arepo;
	
	public List<AdminModel> getAdminInfo()
	{
		return arepo.findAll();
	}
	
	public AdminModel saveAdmin(AdminModel am)
	{
		return arepo.save(am);
	}
	
	public AdminModel updateAdmin(AdminModel am)
	{
		return arepo.saveAndFlush(am);
	}
	
	public String deleteAdmin(int userRole)
	{
		arepo.deleteById(userRole);
		return "Deleted";
	}
	
	
	

	
	
	
	
}
