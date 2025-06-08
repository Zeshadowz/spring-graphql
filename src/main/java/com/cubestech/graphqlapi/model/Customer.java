package com.cubestech.graphqlapi.model;

import com.cubestech.graphqlapi.enums.Gender;
import com.cubestech.graphqlapi.enums.GenderConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String firstName;
    private String lastName;

    @Convert(converter = GenderConverter.class)
    private Gender gender;

    private LocalDate birthDate;
}
