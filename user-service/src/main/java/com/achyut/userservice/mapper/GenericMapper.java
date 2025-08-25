package com.achyut.userservice.mapper;

/**
 * 
*/
public interface GenericMapper<S, T> {
	
	T toDto(S entity);
	
	S toEntity(T dto);

}
