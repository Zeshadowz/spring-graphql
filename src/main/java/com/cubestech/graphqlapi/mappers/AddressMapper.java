package com.cubestech.graphqlapi.mappers;

import com.cubestech.graphqlapi.dto.AddressInput;
import com.cubestech.graphqlapi.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address dtoToModel(AddressInput addressInput);
}
