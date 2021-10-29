package com.ektha.cms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.cms.dao.CustomerDAO;
import com.ektha.cms.dao.ICustomerDAO;
import com.ektha.cms.entity.Address;
import com.ektha.cms.entity.Customer;

/**
 * Servlet implementation class CustomerPortal
 */
@WebServlet("/CustomerPortal")
public class CustomerPortal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ICustomerDAO customerDAO = null;

	public void init(ServletConfig config) throws ServletException {

		customerDAO = new CustomerDAO();
	}

	public CustomerPortal() {

		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String phoneNumber = request.getParameter("phone");
		String email = request.getParameter("email");

		String addressLine1 = request.getParameter("address1");
		String addressLine2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zipCode = Integer.parseInt(request.getParameter("zip"));

		Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setPhoneNumber(phoneNumber);
		customer.setEmail(email);

		Address address = new Address();
		address.setAddressLine1(addressLine1);
		address.setAddressLine2(addressLine2);
		address.setCity(city);
		address.setState(state);
		address.setZipCode(zipCode);

		customer.setAddress(address);

		customerDAO.addCustomer(customer);
		
		Customer c = customerDAO.findAll();
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
		request.setAttribute("customer", customer);
		requestDispatcher.forward(request, response);
		
//		int customerId = customerDAO.find(customer);
//		address.setCustomerId(customerId);

	}

}
