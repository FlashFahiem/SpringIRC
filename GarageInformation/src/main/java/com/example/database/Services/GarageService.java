package com.example.database.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database.Info.GarageInfo;
import com.example.database.garage.Repository.GarageRepo;

@Service
public class GarageService {

	@Autowired
	public GarageRepo grepo;
	
	//posting information
	public GarageInfo saveInfo(GarageInfo im)
	{
		return grepo.save(im);
	}
	
	//getting information
	public List<GarageInfo> getDet()
	{
		return grepo.findAll();
	}
	
	//updating information
	public GarageInfo updateInfo(GarageInfo iu)
	{
		return grepo.saveAndFlush(iu);
	}
	
	//deleting information
	public void deleteInfo(int garageId)
	{
		grepo.deleteById(garageId);
	}
	
}
