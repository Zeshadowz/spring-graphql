package com.cubestech.graphqlapi.controller;

import com.cubestech.graphqlapi.dto.AddressInput;
import com.cubestech.graphqlapi.mappers.AddressMapper;
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
    private final AddressMapper addressMapper;


    @QueryMapping
    public Iterable<Address> allAddresses() {
        return addressService.getAllAddresses();
    }

    @MutationMapping(name = "createAddress")
    public Address create_Address(@Argument(name = "address") AddressInput input) {
        return addressService.saveAddress(input);
    }
}
