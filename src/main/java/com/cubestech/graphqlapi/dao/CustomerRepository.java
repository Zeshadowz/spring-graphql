package com.cubestech.graphqlapi.dao;

import com.cubestech.graphqlapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
