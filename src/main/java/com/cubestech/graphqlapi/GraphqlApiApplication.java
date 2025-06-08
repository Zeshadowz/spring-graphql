package com.cubestech.graphqlapi;

import com.cubestech.graphqlapi.dao.AddressRepository;
import com.cubestech.graphqlapi.dao.AuthorRepository;
import com.cubestech.graphqlapi.dao.BookRepository;
import com.cubestech.graphqlapi.enums.AddressType;
import com.cubestech.graphqlapi.model.Address;
import com.cubestech.graphqlapi.model.Author;
import com.cubestech.graphqlapi.model.Book;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphqlApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlApiApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(
            AuthorRepository authorRepository,
            BookRepository bookRepository, AddressRepository addressRepository) {
        return args -> {
            Author josh = authorRepository.save(new Author(null, "Josh Wish"));
            Author mark = authorRepository.save(new Author(null, "Mark Ant"));

            bookRepository.saveAll(List.of(
                    new Book("Reactive Spring", josh),
                    new Book("Cloud Native Java", mark),
                    new Book("Spring Boot Up", josh),
                    new Book("Spring Testing", mark),
                    new Book("TDD Test Driven Development", josh)
            ));

            Address home = new Address(null, "Steubenstraße", null, "54", "90763", "Fürth", null, "Deutschland", AddressType.HOME);
            Address work = new Address(null, "Landgraben", null, "4", "907441", "Nürnberg", null, "Deutschland", AddressType.WORK);
            addressRepository.saveAll(List.of(home, work));
        };
    }

}
