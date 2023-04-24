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
		return "Garage ID"+ gid +"Deleted";
	}
}
