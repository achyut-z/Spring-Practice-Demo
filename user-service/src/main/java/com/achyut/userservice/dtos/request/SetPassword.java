package com.achyut.userservice.dtos.request;

import lombok.Data;

@Data
public class SetPassword {
    
    private String username;
    
    private String password;

}
