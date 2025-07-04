package com.cubestech.graphqlapi.domain.enums;

import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AddressTypeConverter extends EnumBaseConverter<AddressType, String> {
    public AddressTypeConverter() {
        super(AddressType.class);
    }
}
