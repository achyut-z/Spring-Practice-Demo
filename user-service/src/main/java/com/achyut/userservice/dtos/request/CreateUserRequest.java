package com.achyut.userservice.dtos.request;

import com.achyut.userservice.dtos.CredentialDto;
import com.achyut.userservice.dtos.UserDetailsDto;

import lombok.Data;

@Data
public class CreateUserRequest {
	
	CredentialDto userCredentials;
	
	UserDetailsDto userDetails;

}
