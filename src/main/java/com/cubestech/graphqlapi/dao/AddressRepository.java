package com.cubestech.graphqlapi.dao;

import com.cubestech.graphqlapi.model.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<Address, UUID> {
}
