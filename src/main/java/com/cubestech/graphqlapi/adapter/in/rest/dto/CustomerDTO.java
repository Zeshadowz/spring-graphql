package com.cubestech.graphqlapi.adapter.in.rest.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private String customerNumber;
    private String title;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    List<AddressDTO> addresses;
}
