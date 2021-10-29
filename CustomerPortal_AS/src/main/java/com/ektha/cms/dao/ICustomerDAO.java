package com.ektha.cms.dao;

import com.ektha.cms.entity.Customer;

public interface ICustomerDAO {

	public void addCustomer(Customer customer);
	public int find(Customer customer);
	public Customer findAll();

}
