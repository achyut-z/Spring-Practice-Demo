package com.achyut.userservice.validator.request;

import java.util.Objects;

import com.achyut.userservice.dtos.UserDetailsDto;
import com.achyut.userservice.dtos.request.CreateUserRequest;
import com.achyut.userservice.exception.ResourceNotFoundException;
import com.achyut.userservice.validator.EmailValidator;
import com.achyut.userservice.validator.UserDetailsValidator;
import com.achyut.userservice.validator.UsernameValidator;

public class CreateUserRequestValidator {

    public static void validateRequest(CreateUserRequest request) {
        
        if(Objects.isNull(request)) {
            throw new ResourceNotFoundException(CreateUserRequest.class.getSimpleName());
        }
        
        String email = request.getUserCredentials()
                .getEmail();

        String username = request.getUserCredentials()
                .getUsername();
        
        UserDetailsDto details = request.getUserDetails();

        EmailValidator.checkEmail(email);

        UsernameValidator.checkUsername(username);

        UserDetailsValidator.checkDetails(details);
    }

}
