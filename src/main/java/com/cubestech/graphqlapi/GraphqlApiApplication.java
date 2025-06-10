package com.cubestech.graphqlapi;

import com.cubestech.graphqlapi.dao.AddressRepository;
import com.cubestech.graphqlapi.dao.AuthorRepository;
import com.cubestech.graphqlapi.dao.BookRepository;
import com.cubestech.graphqlapi.dao.CustomerRepository;
import com.cubestech.graphqlapi.enums.AddressType;
import com.cubestech.graphqlapi.enums.Gender;
import com.cubestech.graphqlapi.model.Address;
import com.cubestech.graphqlapi.model.Author;
import com.cubestech.graphqlapi.model.Book;
import com.cubestech.graphqlapi.model.Customer;
import com.cubestech.graphqlapi.utils.CodeGenerator;
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
            BookRepository bookRepository,
            AddressRepository addressRepository,
            CustomerRepository customerRepository
    ) {
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

            Address home = Address.builder()
                    .street("Home Street")
                    .number("Home Number")
                    .zipcode("65479")
                    .city("Home City")
                    .country("Home Country")
                    .addressType(AddressType.HOME)
                    .build();
            Address work = Address.builder()
                    .street("Landgraben")
                    .number("4")
                    .zipcode("98745")
                    .city("Nürnberg")
                    .country("Germany")
                    .addressType(AddressType.HOME)
                    .build();

            Customer james = Customer.builder()
                    .customerNumber(CodeGenerator.generateCustomerNumber())
                    .title("NBA")
                    .firstName("James")
                    .lastName("Doe")
                    .gender(Gender.MALE)
                    .addresses(List.of(home, work))
                    .build();

            james.getAddresses().forEach(address -> address.setCustomer(james));
            customerRepository.saveAll(List.of(james));


        };
    }

}
