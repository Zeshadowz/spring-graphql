package com.cubestech.graphqlapi.enums;

import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AddressTypeConverter extends EnumBaseConverter<AddressType> {
    public AddressTypeConverter() {
        super(AddressType.class);
    }

//    @Override
//    public AddressType convertToEntityAttribute(String type) {
//        return type == null ? null :
//                Stream.of(AddressType.values())
//                        .filter(a -> a.getCode().equals(type))
//                        .findFirst()
//                        .orElseThrow(() -> new IllegalArgumentException("Invalid AddressType: " + type));
//    }
//
//    @Override
//    public String convertToDatabaseColumn(AddressType attribute) {
//        return attribute == null ? null : attribute.getCode();
//    }
}
