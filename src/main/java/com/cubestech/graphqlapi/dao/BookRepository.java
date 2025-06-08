package com.cubestech.graphqlapi.dao;

import com.cubestech.graphqlapi.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
