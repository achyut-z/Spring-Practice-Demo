package com.achyut.userservice.dtos;

import lombok.Data;

@Data
public class AddressDto {
	
	private String city;
	
	private String state;
	
	private Integer zipCode;

}
