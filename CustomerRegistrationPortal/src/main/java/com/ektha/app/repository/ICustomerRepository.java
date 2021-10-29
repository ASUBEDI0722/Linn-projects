package com.ektha.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ektha.app.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

//	@Query("insert firstName, lastName, phoneNumber, email into customerdetails.customer ");
}
