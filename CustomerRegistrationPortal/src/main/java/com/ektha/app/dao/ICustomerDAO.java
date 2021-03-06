package com.ektha.app.dao;

import java.util.List;
import java.util.Optional;

import com.ektha.app.entity.Customer;

public interface ICustomerDAO {
	
	public Customer addCustomer(Customer customer);
	public List<Customer> findAll();
	public int findCustomerById(int customerId);
	public Customer getCustomerId(int customerId);
	public Customer updateCustomer(Customer customer, int customerId);
	public void deleteCustomerById(int customerId);
	public Customer updateCustomerDetails(Customer customer);

}
