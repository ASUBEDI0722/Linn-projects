package com.ektha.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.app.dao.IVehicleDAO;
import com.ektha.app.entity.Vehicle;

@Service
public class VehicleService implements IVehicleService {

	@Autowired
	private IVehicleDAO vehicleDAO;

	@Override
	public Vehicle getVehicle(String driverLicense) {
		return vehicleDAO.getVehicleInfo(driverLicense);
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleDAO.addVehicle(vehicle);
	}

	@Override
	public List<Vehicle> getVehicleInfo(String driverLicense) {
		return vehicleDAO.getVehicle(driverLicense);
	}

}
