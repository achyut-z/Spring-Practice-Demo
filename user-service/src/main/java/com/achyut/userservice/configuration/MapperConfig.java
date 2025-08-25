package com.achyut.userservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.achyut.userservice.mapper.GenericDynamicMapper;
import com.achyut.userservice.dtos.AddressDto;
import com.achyut.userservice.dtos.CredentialDto;
import com.achyut.userservice.dtos.UserDetailsDto;
import com.achyut.userservice.dtos.request.CreateUserRequest;
import com.achyut.userservice.entities.Address;
import com.achyut.userservice.entities.Credentials;
import com.achyut.userservice.entities.User;
import com.achyut.userservice.entities.UserDetails;

@Configuration
public class MapperConfig {
	
	@Bean
    public GenericDynamicMapper<User, CreateUserRequest> userMapper() {
        return new GenericDynamicMapper<>(User.class, CreateUserRequest.class);
    }
	
	@Bean
    public GenericDynamicMapper<Credentials, CredentialDto> credentialsMapper() {
        return new GenericDynamicMapper<>(Credentials.class, CredentialDto.class);
    }
	
	@Bean
    public GenericDynamicMapper<UserDetails, UserDetailsDto> detailsMapper() {
        return new GenericDynamicMapper<>(UserDetails.class, UserDetailsDto.class);
    }
	
	@Bean
    public GenericDynamicMapper<Address, AddressDto> addressMapper() {
        return new GenericDynamicMapper<>(Address.class, AddressDto.class);
    }

}
