
package com.ektha.app.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.Bean;

import com.ektha.app.entity.Customer;
import com.ektha.app.entity.Vehicle;

@org.springframework.context.annotation.Configuration
public class HibernateImp {

	public static SessionFactory sessionFactory;

	@Bean
	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				Properties properties = new Properties();
				properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/vehicleregistration");
				properties.put(Environment.USER, "root");
				properties.put(Environment.PASS, "java");
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				properties.put(Environment.SHOW_SQL, "true");

				configuration.setProperties(properties); 
				configuration.addAnnotatedClass(Customer.class);
				configuration.addAnnotatedClass(Vehicle.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;

	}

}
