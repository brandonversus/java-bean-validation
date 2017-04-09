package com.brandonversus.example.validation.model;

import org.junit.Before;

import javax.validation.Validation;
import javax.validation.Validator;

public class UserTest {

    private Validator validator;

    @Before
    public void setup() {
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

}
