package com.ektha.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Customer;
//import com.ektha.app.repository.IAddressRepository;
import com.ektha.app.repository.ICustomerRepository;

@Repository
public class CustomerDAO implements ICustomerDAO {

	@Autowired
	private ICustomerRepository customerRepository;

//	@Autowired
//	private IAddressRepository addressRepository;

	@Override
	public Customer addCustomer(Customer customer) {

		Customer c = customerRepository.save(customer);
		System.out.println(c.getCustomerId());
		System.out.println(c);
		return c;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public int findCustomerById(int customerId) {
		customerRepository.findById(customerId);
		return customerId;

	}

	@Override
	public Customer getCustomerId(int customerId) {

		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer, int customerId) {
		Customer customer1 = customerRepository.getById(customerId);
//		customer1.setAddress(customer1.getAddress());
		customer1.setFirstName(customer1.getFirstName());
//		customer1.setLastName(customer1.getLastName());
//		customer1.setEmail(customer1.getEmail());
//		customer1.setPhoneNumber(customer1.getPhoneNumber());

		return customerRepository.save(customer1);
	}

	@Override
	public void deleteCustomerById(int customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public Customer updateCustomerDetails(Customer customer) {
		return customerRepository.save(customer);
	}

}
