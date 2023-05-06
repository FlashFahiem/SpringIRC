package com.example.database.Controller;

import java.util.List;
import java.util.Optional;

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

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class GarageController {

	@Autowired
	public GarageService gser;
	
	@PostMapping("/saveGarage")
	@Tag(name = "Add Garage Details",description = "Garage Details")
	public GarageInfo addDetails(@RequestBody GarageInfo ia)
	{
		return gser.saveInfo(ia);
	}
	
	@GetMapping("/getGarage")
	@Tag(name = "Get Garage Details",description = "Get Details")
	public List<GarageInfo> getDetails()
	{
		return gser.getDet();
	}
	
	@GetMapping("/getGarage/{garageId}")
	@Tag(name = "Get Garage Details by ID",description = "Get by ID")
	public Optional<GarageInfo> getDe(@PathVariable("garageId") int gid)
	{
		return gser.getDe(gid);
	}
	
	@PutMapping("/updateGarage")
	@Tag(name = "Update Garage Details",description = "Update")
	public GarageInfo updateDetails(@RequestBody GarageInfo garageId)
	{
		return gser.updateInfo(garageId);
	}
	
	//PathVariable
	@DeleteMapping("/deleteGarage/{garageId}")
	@Tag(name = "Delete Garage Details",description = "Delete")
	public String deleteDetails(@PathVariable("garageId") int gid)
	{
		gser.deleteInfo(gid);
		return "Garage ID "+ gid +" Deleted";
	}
	
	@GetMapping("/sortAsc/{vehicleName}")
	@Tag(name = "Sorting in Ascending",description = "Sorting")
	public List<GarageInfo> sortAscend(@PathVariable("vehicleName") String vehicleName)
	{
		return gser.sortAsc(vehicleName);
	}
	@GetMapping("/sortDesc/{vehicleName}")
	@Tag(name = "Sorting in Descending",description = "Sorting")
	public List<GarageInfo> sortDesc(@PathVariable("vehicleName") String vehicleName)
	{
		return gser.sortDesc(vehicleName);
	}
	
	@GetMapping("/pagination/{pageNo}/{pageSize}")
	@Tag(name = "Pagianting Garage Details",description = "Pagination")
	public List<GarageInfo> paginationData(@PathVariable("pageNo")int pnu,@PathVariable("pageSize") int psize)
	{
		return gser.paginationData(pnu,psize);
	}
	
	@GetMapping("/pagiantionAndSorting/{pageNo}/{pageSize}/{vehicleName}")
	@Tag(name = "Pagianting and Sorting Garage Details",description = "Pagination and Sorting")
	public List<GarageInfo> paginationAndSorting(@PathVariable("pageNo") int pnu,@PathVariable("pageSize") int psize,@PathVariable("vehicleName") String vehicleName)
	{
		return gser.paginationAndSorting(pnu, psize, vehicleName);
	}
	
	@Autowired
	public GarageRepo grepo; 
	
	@GetMapping("getG")
	@Tag(name = "Select Statement using Native Query",description = "Native Queries")
	public List<GarageInfo> getD()
	{
		return grepo.getAllData();
	}
	
	@GetMapping("byOwnerName/{id}")
	@Tag(name = "Select Statement using Native Query with Where Clause",description = "Native Queries")
	public List<GarageInfo> getName(@PathVariable("id") int gid)	{
		return grepo.byOwnerName(gid);
	}
	
	@GetMapping("startend/{start}/{end}")
	@Tag(name = "Select Statement using Native Query with Between Clause",description = "Native Queries")
	public List<GarageInfo> startEnd(@PathVariable("start") int start,@PathVariable("end") int end)	{
		return grepo.startEnd(start,end);
	}
	
	@DeleteMapping("delete/{id}/{name}")
	@Tag(name = "Delete Statement using Native Query",description = "Native Queries")
	public String deleteGarage(@PathVariable("id") int id,@PathVariable("name") String oname)
	{
		grepo.deleteDet(id, oname);
		return "Deleted";
	}
	
	@PutMapping("/update/{name}/{id}")
	@Tag(name = "Update Statement using Native Query",description = "Native Queries")
	public String updateGarage(@PathVariable("name") String oname,@PathVariable("id") int gid)
	{
		grepo.updateDet(oname, gid);
		return "Updated";
	}
	
	@PutMapping("/updated/{name}/{id}")
	@Tag(name = "Update Statement using Java Persistance Query Language",description = "JPQL")
	public String updateDetails(@PathVariable("name") String oname,@PathVariable("id") int gid)
	{
		grepo.updateDetails(oname, gid);
		return "Updated";
	}
	
	@DeleteMapping("deleted/{id}/{name}")
	@Tag(name = "Delete Statement using Java Persistance Query Language",description = "JPQL")
	public String deleteG(@PathVariable("id") int id,@PathVariable("name") String oname)
	{
		grepo.deleteDetails(id, oname);
		return "Deleted";
	}
	
	@GetMapping("jpql")
	@Tag(name = "Select Statement using Java Persistence Query Language",description = "JPQL")
	public List<GarageInfo> getJp()
	{
		return grepo.getAll();
	}
	
	@GetMapping("jp/{id}")
	@Tag(name = "Select Statement using Java Persistance Query Language by ID",description = "JPQL")
	public List<GarageInfo> getjpql(@PathVariable("id")int gid)
	{
		return grepo.jpql(gid);
	}
}
