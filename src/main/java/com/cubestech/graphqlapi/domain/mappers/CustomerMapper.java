package com.cubestech.graphqlapi.domain.mappers;


import com.cubestech.graphqlapi.adapter.in.rest.dto.CustomerDTO;
import com.cubestech.graphqlapi.adapter.in.rest.dto.CustomerInput;
import com.cubestech.graphqlapi.adapter.out.db.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface CustomerMapper {

    Customer toModel(CustomerInput input);

    CustomerDTO toDTO(Customer customer);

    List<CustomerDTO> toDTOs(List<Customer> customers);
}
