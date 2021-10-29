package com.ektha.cms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.ektha.cms.entity.Address;
import com.ektha.cms.entity.Customer;

public class CustomerDAO extends BaseDAO implements ICustomerDAO {

//	private static String SQL_INSERT = "select * from customerportal.customer c join customerportal.address a";

	private static String SQL_INSERT_CUSTOMER = "insert into customerportal.customer(firstName, lastName, phoneNumber, email) values(?,?,?,?)";

	private static String SQL_INSERT_ADDRESS = "insert into customerportal.address(addressLine1, addressLine2, city, state, zipcode, customerId) values(?,?,?,?,?,?)";

	private static String SQL_SELECT_ALL = " select AddressLine1, AddressLine2, city,state, ZipCode, FirstName, LastName, phone, email from customerportal.address a right join customerportal.customer c on  a.cID = c.CustomerId";

//	private static final String SQL_SELECT_QUERY_ID = "select * from customerportal.customer where id=?";
//
//	private static final String SQL_SELECT_QUERY = "select * from customerportal.customer where firstName = ? && lastName =?";
//
//	private static final String SELECT_QUERY = "select * from customerportal.customer";

	@Override
	public void addCustomer(Customer customer) {
		int customer_id = 0;

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_CUSTOMER,
					Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, customer.getFirstName());
			preparedStatement.setString(2, customer.getLastName());
			preparedStatement.setString(3, customer.getPhoneNumber());
			preparedStatement.setString(4, customer.getEmail());

			preparedStatement.executeUpdate();

			ResultSet resultSet = preparedStatement.getGeneratedKeys();

			if (resultSet.next()) {

				customer_id = resultSet.getInt(1);

			}

			PreparedStatement preparedStatement1 = connection.prepareStatement(SQL_INSERT_ADDRESS);
			preparedStatement1.setString(1, customer.getAddress().getAddressLine1());
			preparedStatement1.setString(2, customer.getAddress().getAddressLine2());
			preparedStatement1.setString(3, customer.getAddress().getCity());
			preparedStatement1.setString(4, customer.getAddress().getState());
			preparedStatement1.setInt(5, customer.getAddress().getZipCode());
			preparedStatement1.setInt(6, customer_id);

			preparedStatement1.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Customer findAll() {

		Customer customer = null;
		int customerId = 0;

		try (Connection connection = getConnection()) {

			PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ALL);

//			preparedStatement.setInt(1, customerId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				customer = new Customer();
				Address address = new Address();

				address.setAddressLine1(resultSet.getString("addressLine1"));
				address.setAddressLine2(resultSet.getString("addressLine2"));
				address.setCity(resultSet.getString("city"));
				address.setState(resultSet.getString("state"));
				address.setZipCode(resultSet.getInt("zipcode"));
//				address.setCustomerId(resultSet.getInt("customerId"));

				customer.setFirstName(resultSet.getString("firstName"));
				customer.setLastName(resultSet.getString("lastName"));
				customer.setPhoneNumber(resultSet.getString("phoneNumber"));
				customer.setEmail(resultSet.getString("email"));
				customer.setAddress(address);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customer;
	}

	@Override
	public int find(Customer customer) {

		int id = 0;
//
//		try (Connection connection = getConnection()) {
//			PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_QUERY);
//
//			preparedStatement.setString(1, customer.getFirstName());
//			preparedStatement.setString(2, customer.getLastName());
//
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			if (resultSet.next()) {
//
//				id = resultSet.getInt("customerId");
//
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return id;

	}

}