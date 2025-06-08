package com.cubestech.graphqlapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Person {
    @Id
    private String id;

    private String firstname;
    private LocalDate dateOfBirth;
    private boolean alive;

//    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Address> addresses = new ArrayList<>();

    public Person(String firstname, LocalDate dateOfBirth, boolean alive) {
        this.id = UUID.randomUUID().toString();
        this.firstname = firstname;
        this.dateOfBirth = dateOfBirth;
        this.alive = alive;
    }

//    public void addAddress(Address address) {
//        addresses.add(address);
//        address.setPerson(this);
//    }
//
//    public void removeAddress(Address address) {
//        addresses.remove(address);
//        address.setPerson(null);
//    }
}