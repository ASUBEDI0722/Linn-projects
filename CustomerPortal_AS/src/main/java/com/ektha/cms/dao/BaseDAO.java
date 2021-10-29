package com.ektha.cms.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

	private static final String URL = "jdbc:mysql://localhost:3306/customerportal?useSSL=false";

	public Connection getConnection() {

		Connection connection = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, "root", "java");

		} catch (Exception e) {

			e.printStackTrace();
		}
		return connection;

	}

}
