package com.healty.models;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Builder
@Value
@Jacksonized
public class Doctor extends User {



        Speciality speciality;
}
