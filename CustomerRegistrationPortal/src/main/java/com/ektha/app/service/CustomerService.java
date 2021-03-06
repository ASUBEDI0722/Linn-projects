package com.ektha.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.app.dao.ICustomerDAO;
import com.ektha.app.entity.Customer;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerDAO customerDAO;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerDAO.addCustomer(customer);

	}

	@Override
	public int findCustomerById(int customerId) {
		customerDAO.findCustomerById(customerId);
		return customerId;
	}

	@Override
	public List<Customer> findAll() {
		return customerDAO.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer, int customerId) {
		return customerDAO.updateCustomer(customer, customerId);
	}

	@Override
	public Customer updateCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomerDetails(customer);
	}

	@Override
	public void deleteCustomerById(int customerId) {
		customerDAO.deleteCustomerById(customerId);
	}

}
