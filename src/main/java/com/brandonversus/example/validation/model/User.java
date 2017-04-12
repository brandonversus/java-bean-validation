package com.brandonversus.example.validation.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class User {

    @NotNull
    private final String email;

    @NotNull
    private final String password;

}
