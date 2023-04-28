package com.example.database.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.Info.GarageInfo;
import com.example.database.Services.GarageService;
import com.example.database.garage.Repository.GarageRepo;

@RestController
public class GarageController {

	@Autowired
	public GarageService gser;
	
	@PostMapping("/saveGarage")
	
	public GarageInfo addDetails(@RequestBody GarageInfo ia)
	{
		return gser.saveInfo(ia);
	}
	
	@GetMapping("/getGarage")
	public List<GarageInfo> getDetails()
	{
		return gser.getDet();
	}
	
	@PutMapping("/updateGarage")
	public GarageInfo updateDetails(@RequestBody GarageInfo garageId)
	{
		return gser.updateInfo(garageId);
	}
	
	//PathVariable
	@DeleteMapping("/deleteGarage/{garageId}")
	public String deleteDetails(@PathVariable("garageId") int gid)
	{
		gser.deleteInfo(gid);
		return "Garage ID "+ gid +" Deleted";
	}
	
	@GetMapping("/sortAsc/{vehicleName}")
	public List<GarageInfo> sortAscend(@PathVariable("vehicleName") String vehicleName)
	{
		return gser.sortAsc(vehicleName);
	}
	@GetMapping("/sortDesc/{vehicleName}")
	public List<GarageInfo> sortDesc(@PathVariable("vehicleName") String vehicleName)
	{
		return gser.sortDesc(vehicleName);
	}
	
	@GetMapping("/pagination/{pageNo}/{pageSize}")
	public List<GarageInfo> paginationData(@PathVariable("pageNo")int pnu,@PathVariable("pageSize") int psize)
	{
		return gser.paginationData(pnu,psize);
	}
	
	@GetMapping("/pagiantionAndSorting/{pageNo}/{pageSize}/{vehicleName}")
	public List<GarageInfo> paginationAndSorting(@PathVariable("pageNo") int pnu,@PathVariable("pageSize") int psize,@PathVariable("vehicleName") String vehicleName)
	{
		return gser.paginationAndSorting(pnu, psize, vehicleName);
	}
	
	@Autowired
	public GarageRepo grepo; 
	
	@GetMapping("getG")
	public List<GarageInfo> getD()
	{
		return grepo.getAllData();
	}
	
	@GetMapping("byOwnerName/{id}")
	public List<GarageInfo> getName(@PathVariable("id") int gid)	{
		return grepo.byOwnerName(gid);
	}
	
	@GetMapping("startend/{start}/{end}")
	public List<GarageInfo> startEnd(@PathVariable("start") int start,@PathVariable("end") int end)	{
		return grepo.startEnd(start,end);
	}
	
	@DeleteMapping("delete/{id}/{name}")
	public String deleteGarage(@PathVariable("id") int id,@PathVariable("name") String oname)
	{
		grepo.deleteDet(id, oname);
		return "Deleted";
	}
	
	@GetMapping("jpql")
	public List<GarageInfo> getJp()
	{
		return grepo.getAll();
	}
	
	@GetMapping("jp/{id}")
	public List<GarageInfo> getjpql(@PathVariable("id")int gid)
	{
		return grepo.jpql(gid);
	}
}
