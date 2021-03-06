package com.ektha.app.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.app.entity.Customer;
import com.ektha.app.service.ICustomerService;

@RequestMapping("api/v1/customers")
@RestController
public class CustomerRestController {

	@Autowired
	private ICustomerService customerService;

	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		Customer customer1 = customerService.addCustomer(customer);
		return customer1;

	}

	@GetMapping(path = "/{id}", produces = "application/json")
	public int findCustomerById(@PathVariable int id, @RequestParam(value = "query", required = false) String query) {
		int customer1 = customerService.findCustomerById(id);
		System.out.println("Anamika" + query);
		return customer1;

	}

	@GetMapping
	public List<Customer> findAll() {
		List<Customer> customer = customerService.findAll();
		return customer;

	}

	@PutMapping("/{customerId}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable int customerId) {
		return customerService.updateCustomer(customer, customerId);

	}


	@DeleteMapping("/deleteCustomer/{customerId}")
	public void deleteCustomerById(@PathVariable int customerId) {
		customerService.deleteCustomerById(customerId);
	}

}
