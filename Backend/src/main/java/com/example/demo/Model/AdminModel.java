package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="Admin")
public class AdminModel {
	
	@Id
	private int UserRole;
	private String Email;
	private String Password;
	private String MobileNumber;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public int getUserRole() {
		return UserRole;
	}
	public void setUserRole(int userRole) {
		UserRole = userRole;
	}

}
