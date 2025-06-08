package com.cubestech.graphqlapi.model;

import com.cubestech.graphqlapi.enums.AddressType;
import com.cubestech.graphqlapi.enums.AddressTypeConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String street;
    private String additional;
    private String number;
    private String zipcode;
    private String city;
    private String state;
    private String country;

    @Convert(converter = AddressTypeConverter.class)
    private AddressType addressType;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "person_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_address_person"))
//    private Person person;

}