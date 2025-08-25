package com.achyut.userservice.entities;

import com.achyut.userservice.constants.ValidationConstants;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "User")
public class User {
	
	@Id
	private String id;

	@NotNull(message = ValidationConstants.NOT_NULL_MESSAGE)
	private Credentials userCredentials;

	@NotNull(message = ValidationConstants.NOT_NULL_MESSAGE)
	private UserDetails userDetails;

}
