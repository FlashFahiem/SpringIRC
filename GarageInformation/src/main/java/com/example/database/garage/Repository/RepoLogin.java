package com.example.database.garage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.Info.ModelLogin;


public interface RepoLogin extends JpaRepository<ModelLogin, Integer> {

	ModelLogin findByuname(String uname);
}


	

