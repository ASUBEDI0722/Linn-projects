package com.ektha.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Vehicle;

@Repository
public class VehicleDAO implements IVehicleDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Vehicle getVehicleInfo(String driverLicense) {

		Session session = sessionFactory.openSession();

		Vehicle vehicle = session.get(Vehicle.class, driverLicense);
		session.close();
		return vehicle;
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		Session session = sessionFactory.openSession();
		Vehicle vehicle1 = (Vehicle) session.save(vehicle);
		return vehicle1;
	}

	@Override
	public List<Vehicle> getVehicle(String driverLicense) {

		Session session = sessionFactory.openSession();
		Query<Vehicle> query = session.createQuery(
				"select v.vin, v.driverLicense, v.manufacturer, v.model from Vehicle v where v.driverLicense=:license");
		query.setParameter("license", driverLicense);
		List<Vehicle> vehicle = query.list();
		return vehicle;
	}

}
