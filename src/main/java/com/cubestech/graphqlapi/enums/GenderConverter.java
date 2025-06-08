package com.cubestech.graphqlapi.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, Character> {

    @Override
    public Character convertToDatabaseColumn(final Gender attribute) {
        return attribute == null ? null : attribute.getCharacter();
    }

    @Override
    public Gender convertToEntityAttribute(Character dbData) {
        if (dbData == null) {
            return null;
        }

        return Stream.of(Gender.values())
                .filter(g -> g.getCharacter().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

    }
}
