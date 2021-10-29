package com.ektha.app.restapi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.app.entity.Vehicle;
import com.ektha.app.service.IVehicleService;

@RequestMapping("/getVehicles")
@RestController
public class VehicleController {

	@Autowired
	private IVehicleService vehicleService;

//	@GetMapping(path = "/{id}", produces = "application/json")
//	public Vehicle getVehicle(@PathVariable(value = "id") String driverLicense) {
//		Vehicle vehicle = vehicleService.getVehicleInfo(driverLicense);
//		System.out.println(vehicle);
//		return vehicle;
//
//	}

//	@PostMapping
//	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
//		Vehicle vehicle1 = vehicleService.addVehicle(vehicle);
//		System.out.println(vehicle1);
//		return vehicle1;
//
//	}
//
//	@GetMapping(path = "/{id}", produces = "application/json")
//	public Vehicle getVehicle(@PathVariable(value = "id") String driverLicense) {
//		Vehicle vehicle =  vehicleService.getVehicle(driverLicense);
//		System.out.println(vehicle);
//		return vehicle;
//	}

	@CrossOrigin(origins = "*")
	@PostMapping("/{driverLicense}")
	@ResponseBody
	public List<Vehicle> getVehicleInfo(@PathVariable(value = "driverLicense") String driverLicense) {
		List<Vehicle> vehicle = vehicleService.getVehicleInfo(driverLicense);

		return vehicle;

	}

}
