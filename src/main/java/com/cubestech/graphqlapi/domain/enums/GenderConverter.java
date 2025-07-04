package com.cubestech.graphqlapi.domain.enums;

import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GenderConverter extends EnumBaseConverter<Gender, Character> {
    public GenderConverter() {
        super(Gender.class);
    }
}
