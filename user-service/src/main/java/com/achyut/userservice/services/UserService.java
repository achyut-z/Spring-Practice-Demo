package com.achyut.userservice.services;

import com.achyut.userservice.dtos.request.ChangePassword;
import com.achyut.userservice.dtos.request.CreateUserRequest;
import com.achyut.userservice.dtos.request.SetPassword;
import com.achyut.userservice.dtos.response.CredentialResponse;
import com.achyut.userservice.dtos.response.UserResponse;

public interface UserService {

	public UserResponse createUser(CreateUserRequest userRequest);

	public CredentialResponse getUserByUsername(String username);

    public UserResponse setPasswordForRegisteredUser(SetPassword request);

    public CredentialResponse changePassword(ChangePassword request);

}
