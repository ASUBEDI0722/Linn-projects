package com.ektha.app.dto;

//import com.ektha.app.entity.Address;

import lombok.Data;

@Data
public class CustomerDTO {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
//	private Address address;

}
