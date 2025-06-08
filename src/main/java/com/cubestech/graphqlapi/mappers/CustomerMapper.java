package com.cubestech.graphqlapi.mappers;


import com.cubestech.graphqlapi.dto.CustomerInput;
import com.cubestech.graphqlapi.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toModel(CustomerInput input);
}
