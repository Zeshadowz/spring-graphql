package com.cubestech.graphqlapi.service;

import com.cubestech.graphqlapi.dao.CustomerRepository;
import com.cubestech.graphqlapi.dto.CustomerInput;
import com.cubestech.graphqlapi.mappers.CustomerMapper;
import com.cubestech.graphqlapi.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public Customer create(CustomerInput customer) {
        customer.setId(null);
        return customerRepository.save(customerMapper.toModel(customer));
    }

    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }
}
