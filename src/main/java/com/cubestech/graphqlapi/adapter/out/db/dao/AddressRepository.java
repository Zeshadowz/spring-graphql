package com.cubestech.graphqlapi.adapter.out.db.dao;

import com.cubestech.graphqlapi.adapter.out.db.entity.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AddressRepository extends CrudRepository<Address, UUID> {
}
