package com.cubestech.graphqlapi.domain.service;

import com.cubestech.graphqlapi.adapter.in.rest.dto.CustomerDTO;
import com.cubestech.graphqlapi.adapter.in.rest.dto.CustomerInput;
import com.cubestech.graphqlapi.adapter.out.db.dao.CustomerRepository;
import com.cubestech.graphqlapi.adapter.out.db.entity.Customer;
import com.cubestech.graphqlapi.domain.mappers.CustomerMapper;
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

    public Iterable<CustomerDTO> findAll() {

        return customerMapper.toDTOs(customerRepository.findAll());
    }
}
