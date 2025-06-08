package com.cubestech.graphqlapi.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class EnumBaseConverter<T extends Enum<T> & BaseEnum<String>> implements AttributeConverter<T, String> {

    private final Class<T> enumClass;

    public EnumBaseConverter(final Class<T> enumClass) {
        this.enumClass = enumClass;
    }

    @Override
    public T convertToEntityAttribute(String code) {
        return code == null ? null :
                Stream.of(enumClass.getEnumConstants())
                        .filter(e -> e.getCode().equals(code))
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("Invalid " + enumClass.getSimpleName() + ": " + code));
    }

    @Override
    public String convertToDatabaseColumn(T attribute) {
        return attribute == null ? null : attribute.getCode();
    }


}
