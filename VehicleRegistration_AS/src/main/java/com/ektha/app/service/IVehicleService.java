package com.ektha.app.service;

import java.util.List;

import com.ektha.app.entity.Vehicle;

public interface IVehicleService {
	
	public Vehicle getVehicle(String driverLicense);
	
	public Vehicle addVehicle(Vehicle vehicle);
	
	public List<Vehicle> getVehicleInfo(String driverLicense);
}
