package com.healty.models;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class User extends Credentials {

    String firstName;

    String lastName;

    LocalDate dateOfBirth;

}
