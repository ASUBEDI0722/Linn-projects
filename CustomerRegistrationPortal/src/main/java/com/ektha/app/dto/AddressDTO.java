package com.ektha.app.dto;

import lombok.Data;

@Data
public class AddressDTO {

	private int addressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;
	private int customerId;
}
