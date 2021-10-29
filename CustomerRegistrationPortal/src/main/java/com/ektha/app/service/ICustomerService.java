package com.ektha.app.service;

import java.util.List;

import com.ektha.app.entity.Customer;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer);
	public int findCustomerById(int customerId);
	public List<Customer> findAll();
	public Customer updateCustomer(Customer customer, int customerId);
	public Customer updateCustomerDetails(Customer customer);
	public void deleteCustomerById(int customerId);


}
