package com.cubestech.graphqlapi.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInput {

    private String customerNumber;
    private String firstName;
    private String lastName;
    //private Gender gender;
}
