package com.cubestech.graphqlapi.adapter.in.rest.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
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
