package com.cubestech.graphqlapi.domain.service;

import com.cubestech.graphqlapi.adapter.in.rest.dto.AddressDTO;
import com.cubestech.graphqlapi.adapter.in.rest.dto.AddressInput;
import com.cubestech.graphqlapi.adapter.out.db.dao.AddressRepository;
import com.cubestech.graphqlapi.adapter.out.db.entity.Address;
import com.cubestech.graphqlapi.domain.mappers.AddressMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<AddressDTO> getAllAddresses() {
        Iterable<Address> all = addressRepository.findAll();
        return addressMapper.toDto(all);
    }

    public Address saveAddress(AddressInput address) {
        address.setId(null);
        return addressRepository.save(addressMapper.toEntity(address));
    }
}
