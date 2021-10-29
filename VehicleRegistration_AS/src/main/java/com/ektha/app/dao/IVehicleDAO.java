package com.ektha.app.dao;

import java.util.List;

import com.ektha.app.entity.Vehicle;

public interface IVehicleDAO {

	public Vehicle getVehicleInfo(String driverLicense);
	
	public Vehicle addVehicle(Vehicle vehicle);
	
	public List<Vehicle> getVehicle(String driverLicense);
}
