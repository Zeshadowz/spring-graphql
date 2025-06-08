package com.cubestech.graphqlapi.controller;

import com.cubestech.graphqlapi.dao.AuthorRepository;
import com.cubestech.graphqlapi.model.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    @QueryMapping
    Iterable<Author> authors(){
        return authorRepository.findAll();
    }

    @QueryMapping
    Optional<Author> authorById(@Argument Long id){
        return authorRepository.findById(id);
    }
}
