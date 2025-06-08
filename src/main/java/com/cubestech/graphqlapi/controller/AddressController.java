package com.cubestech.graphqlapi.controller;

import com.cubestech.graphqlapi.enums.AddressType;
import com.cubestech.graphqlapi.model.Address;
import com.cubestech.graphqlapi.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@RequiredArgsConstructor
@Controller
public class AddressController {

    private final AddressService addressService;


    @QueryMapping
    public Iterable<Address> allAddresses() {
        return addressService.getAllAddresses();
    }

    @MutationMapping
    public Address createAddress(
            @Argument String street,
            @Argument String additional,
            @Argument String number,
            @Argument String zipcode,
            @Argument String city,
            @Argument String state,
            @Argument String country,
            @Argument String addressType) {
        Address address = new Address(null, street, additional, number, zipcode, city, state, country, AddressType.valueOf(addressType));
        return addressService.saveAddress(address);
    }
}
