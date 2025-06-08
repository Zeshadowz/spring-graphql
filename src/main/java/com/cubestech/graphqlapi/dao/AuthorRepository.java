package com.cubestech.graphqlapi.dao;

import com.cubestech.graphqlapi.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
