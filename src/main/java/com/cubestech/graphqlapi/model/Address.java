package com.cubestech.graphqlapi.model;

import com.cubestech.graphqlapi.enums.AddressType;
import com.cubestech.graphqlapi.enums.AddressTypeConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder(toBuilder = true)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String street;
    private String additional;
    @Column(nullable = false)
    private String number;
    @Column(nullable = false)
    private String zipcode;
    @Column(nullable = false)
    private String city;
    private String state;
    @Column(nullable = false)
    private String country;

    @Convert(converter = AddressTypeConverter.class)
    @Column(nullable = false)
    private AddressType addressType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_address_customer"))
    private Customer customer;
}