package com.achyut.userservice.entities;

import com.achyut.userservice.constants.ValidationConstants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.mongodb.core.index.Indexed;

import lombok.Data;

@Data
public class Credentials {

    @NotBlank(message = ValidationConstants.MANDATORY_USERNAME_MESSAGE)
    @Min(value = 6,
            message = ValidationConstants.MINIMUM_USERNAME_LENGTH_MESSAGE)
    @Max(value = 25,
            message = ValidationConstants.MAXIMUM_USERNAME_LENGTH_MESSAGE)
    @Indexed
    private String username;

    @NotBlank(message = ValidationConstants.MANDATORY_PASSWORD_MESSAGE)
    @Min(value = 8,
            message = ValidationConstants.MINIMUM_PASSWORD_LENGTH_MESSAGE)
    private String password;

    @NotBlank(message = ValidationConstants.MANDATORY_EMAIL_MESSAGE)
    @Email(message = ValidationConstants.EMAIL_PATTERN_MESSAGE)
    @Indexed
    private String email;

}
