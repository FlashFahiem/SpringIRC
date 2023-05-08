package com.example.demo.Services;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.AdminModel;
import com.example.demo.Model.LoginModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Repositories.AdminRepo;
import com.example.demo.Repositories.LoanApplicationRepo;
import com.example.demo.Repositories.UserRepo;
import com.example.demo.Repositories.LoginRepo;


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
	
	//Login
	@Autowired
	public LoginRepo lrepo;
	
	public List<LoginModel> getLoginInfo()
	{
		return lrepo.findAll();
	}
	
	public LoginModel saveLogin(LoginModel lm)
	{
		return lrepo.save(lm);
	}
	
	public LoginModel updateLogin(LoginModel lm)
	{
		return lrepo.saveAndFlush(lm);
	}
//	
//	public String deleteLogin(String password)
//	{
//		return lrepo.deleteAll(password);
//	}
	
	//Loan Application
	@Autowired
	public LoanApplicationRepo lorepo;
	
	public List<LoanApplicationModel> getLoan()
	{
		return lorepo.findAll();
	}
	
	public LoanApplicationModel saveLoan(LoanApplicationModel lo)
	{
		return lorepo.save(lo);
	}
	
	public LoanApplicationModel updateLoan(LoanApplicationModel lo)
	{
		return lorepo.saveAndFlush(lo);
	}
	
	public String deleteLoan(int loanId)
	{
		lorepo.deleteById(loanId);
		return "Deleted";
	}
	
	
	
	
	

	
	
	
	
}
