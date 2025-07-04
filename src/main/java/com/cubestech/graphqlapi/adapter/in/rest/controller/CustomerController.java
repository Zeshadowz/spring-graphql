package com.cubestech.graphqlapi.adapter.in.rest.controller;

import com.cubestech.graphqlapi.adapter.in.rest.dto.CustomerDTO;
import com.cubestech.graphqlapi.adapter.in.rest.dto.CustomerInput;
import com.cubestech.graphqlapi.adapter.out.db.entity.Customer;
import com.cubestech.graphqlapi.domain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @QueryMapping(name = "customers")
    public Iterable<CustomerDTO> getAllCustomers() {
        return customerService.findAll();
    }

    @MutationMapping(name = "createCustomer")
    public Customer addCustomer(@Argument(name = "customer") final CustomerInput customer) {
        return customerService.create(customer);
    }

}
