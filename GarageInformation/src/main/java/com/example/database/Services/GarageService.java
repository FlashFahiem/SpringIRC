package com.example.database.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	
	public Optional<GarageInfo> getDe(int garageId)
	{
		return grepo.findById(garageId);
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
	
	//sorting
	public List<GarageInfo> sortAsc(String vehicleName)
	{
		return grepo.findAll(Sort.by(vehicleName).ascending());
	}
	
	public List<GarageInfo> sortDesc(String vehicleName)
	{
		return grepo.findAll(Sort.by(vehicleName).descending());
	}
	
	//pagination
	public List<GarageInfo> paginationData(int pageNo, int pageSize)
	{
		Page<GarageInfo> p = grepo.findAll(PageRequest.of(pageNo, pageSize));
		return p.getContent();
	}
	
	//paginationAndSorting
	public List<GarageInfo> paginationAndSorting(int pageNo,int pageSize,String vehicleName)
	{
		Page<GarageInfo> p = grepo.findAll(PageRequest.of(pageNo, pageSize, Sort.by(vehicleName).ascending()));
		return p.getContent();
	}
	
}
