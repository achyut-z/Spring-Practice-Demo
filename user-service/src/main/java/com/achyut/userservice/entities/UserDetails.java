package com.achyut.userservice.entities;

import java.time.LocalDate;
import java.util.List;

import com.achyut.userservice.constants.ValidationConstants;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDetails {

    @NotBlank(message = "First" + ValidationConstants.MANDATORY_NAME_MESSAGE)
    @Size(min = 2, max = 50,
            message = "First" + ValidationConstants.MINIMUM_MAXIMUM_NAME_LENGTH_MESSAGE)
    private String name;

	@NotBlank(message = "Last" + ValidationConstants.MANDATORY_NAME_MESSAGE)
    @Size(min = 3, max = 50,
    		message = "Last" + ValidationConstants.MINIMUM_MAXIMUM_NAME_LENGTH_MESSAGE)
    private String lastName;

    @Past(message = ValidationConstants.PAST_MESSAGE)
    private LocalDate dateOfBirth;

    @NotEmpty(message = ValidationConstants.NOT_EMPTY_MESSAGE)
    private List<String> phoneNumbers;

    @NotNull(message = ValidationConstants.NOT_NULL_MESSAGE)
    private Address address;

}
