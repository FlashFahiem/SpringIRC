package com.example.database.Info;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GInfo")
public class GarageInfo {
	
	
	@Id
	@Column(name="GarageID")
	private int garageId;
	@Column(name="OwnerName")
	private String ownerName;
	@Column(name="OwnerNumber")
	private int ownerNumber;
	@Column(name="VehicleNumber")
	private String vehicleNumber;
	@Column(name="VehicleName")
	private String vehicleName;
	@Column(name="TotalVehicles")
	private int totalVehicles;
	@Column(name="GarageClass")
	private String garageClass;
	
	public String getGarageClass() {
		return garageClass;
	}
	public void setGarageClass(String garageClass) {
		this.garageClass = garageClass;
	}
	public int getGarageId() {
		return garageId;
	}
	public void setGarageId(int garageId) {
		this.garageId = garageId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getOwnerNumber() {
		return ownerNumber;
	}
	public void setOwnerNumber(int ownerNumber) {
		this.ownerNumber = ownerNumber;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public int getTotalVehicles() {
		return totalVehicles;
	}
	public void setTotalVehicles(int totalVehicles) {
		this.totalVehicles = totalVehicles;
	}
	
	
	
}
