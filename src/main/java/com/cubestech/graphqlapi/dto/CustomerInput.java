package com.cubestech.graphqlapi.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInput {
    private String id;
    private String customerNumber;
    private String title;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private List<AddressInput> addresses;
}
