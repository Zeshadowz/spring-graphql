package com.cubestech.graphqlapi.service;

import com.cubestech.graphqlapi.dao.CustomerRepository;
import com.cubestech.graphqlapi.dto.CustomerInput;
import com.cubestech.graphqlapi.mappers.CustomerMapper;
import com.cubestech.graphqlapi.model.Customer;
import com.cubestech.graphqlapi.utils.CodeGenerator;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Transactional
    public Customer create(CustomerInput dto) {
        dto.setId(null);
        dto.setCustomerNumber(CodeGenerator.generateCustomerNumber());
        Customer customer = customerMapper.toModel(dto);
        customer.getAddresses().forEach(address -> address.setCustomer(customer));
        return customerRepository.save(customer);
    }

    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }
}
