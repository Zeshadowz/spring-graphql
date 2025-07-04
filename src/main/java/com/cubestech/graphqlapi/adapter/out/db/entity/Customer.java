package com.cubestech.graphqlapi.adapter.out.db.entity;

import com.cubestech.graphqlapi.domain.enums.Gender;
import com.cubestech.graphqlapi.domain.enums.GenderConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(unique = true, nullable = false)
    private String customerNumber;
    private String title;
    private String firstName;
    private String lastName;

    @Convert(converter = GenderConverter.class)
    private Gender gender;

    private LocalDate birthDate;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<>();
}
