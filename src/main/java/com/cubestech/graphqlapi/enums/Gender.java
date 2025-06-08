package com.cubestech.graphqlapi.enums;


import lombok.Getter;

@Getter
public enum Gender implements BaseEnum<Character> {
    MALE('M'),
    FEMALE('F');

    private final Character code;

    private Gender(Character code) {
        this.code = code;
    }
}
