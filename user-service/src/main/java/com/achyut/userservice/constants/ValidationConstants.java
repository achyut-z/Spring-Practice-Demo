package com.achyut.userservice.constants;

/**
 * Validation message strings here
 *
 * @author Achyut
*/
public class ValidationConstants {

    public static final String NOT_NULL_MESSAGE = "Cannot be null.";

    public static final String NOT_EMPTY_MESSAGE = "Cannot be empty";

    public static final String MANDATORY_USERNAME_MESSAGE = "Username cannot be blank.";

    public static final String MINIMUM_USERNAME_LENGTH_MESSAGE = "Username length needs to be at least {value} characters.";

    public static final String MAXIMUM_USERNAME_LENGTH_MESSAGE = "Username length can be maximum {value} characters.";

    public static final String MANDATORY_PASSWORD_MESSAGE = "Password cannot be blank.";

    public static final String MINIMUM_PASSWORD_LENGTH_MESSAGE = "Password length needs to be at least {value} characters.";

    public static final String MANDATORY_EMAIL_MESSAGE = "Email cannot be blank.";

    public static final String EMAIL_PATTERN_MESSAGE = "Please provide a valid email address.";

    public static final String MANDATORY_NAME_MESSAGE = "Name cannot be blank.";

    public static final String MINIMUM_MAXIMUM_NAME_LENGTH_MESSAGE = "Name must be between {min} and {max} characters.";

    public static final String PAST_MESSAGE = "Date must be in the past.";

}
