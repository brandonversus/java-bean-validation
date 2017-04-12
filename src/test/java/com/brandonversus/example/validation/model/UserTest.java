package com.brandonversus.example.validation.model;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private static final String EMAIL_VALID = "name@brandonversus.com";
    private static final String PASSWORD_VALID = "123456";

    private Validator validator;

    @Before
    public void setup() {
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void testEmailIsNull() {

        // Given
        String email = null;
        String password = PASSWORD_VALID;
        User user = new User(email, password);

        // When
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        // Then
        assertEquals(violations.size(), 1);
    }

    @Test
    public void testPasswordIsNull() {

        // Given
        String email = EMAIL_VALID;
        String password = null;
        User user = new User(email, password);

        // When
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        // Then
        assertEquals(violations.size(), 1);
    }

}
