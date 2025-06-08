package com.cubestech.graphqlapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class AddressInput {
    private UUID id;

    private String street;
    private String additional;
    private String number;
    private String zipcode;
    private String city;
    private String state;
    private String country;
    private String addressType;
}
