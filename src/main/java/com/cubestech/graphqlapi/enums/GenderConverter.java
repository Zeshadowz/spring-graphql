package com.cubestech.graphqlapi.enums;

import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GenderConverter extends EnumBaseConverter<Gender, Character> {
    public GenderConverter() {
        super(Gender.class);
    }
}
