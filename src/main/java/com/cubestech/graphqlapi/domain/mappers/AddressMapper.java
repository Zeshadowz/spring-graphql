package com.cubestech.graphqlapi.domain.mappers;

import com.cubestech.graphqlapi.adapter.in.rest.dto.AddressDTO;
import com.cubestech.graphqlapi.adapter.in.rest.dto.AddressInput;
import com.cubestech.graphqlapi.adapter.out.db.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    @Mapping(target = "customer", ignore = true)
    Address toEntity(AddressInput addressInput);

    AddressDTO toDto(Address address);

    List<AddressDTO> toDto(Iterable<Address> addresses);
}
