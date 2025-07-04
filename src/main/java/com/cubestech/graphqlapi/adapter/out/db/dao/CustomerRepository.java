package com.cubestech.graphqlapi.adapter.out.db.dao;

import com.cubestech.graphqlapi.adapter.out.db.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
