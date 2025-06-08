package com.cubestech.graphqlapi.service;

import com.cubestech.graphqlapi.dao.AddressRepository;
import com.cubestech.graphqlapi.dto.AddressInput;
import com.cubestech.graphqlapi.mappers.AddressMapper;
import com.cubestech.graphqlapi.model.Address;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Service
public class AddressService {
    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public Optional<Address> getAddressById(UUID id) {
        return addressRepository.findById(id);
    }

    public Iterable<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address saveAddress(AddressInput address) {
        address.setId(null);
        return addressRepository.save(addressMapper.dtoToModel(address));
    }
}
