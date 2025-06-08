package com.cubestech.graphqlapi.dao;

import com.cubestech.graphqlapi.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
