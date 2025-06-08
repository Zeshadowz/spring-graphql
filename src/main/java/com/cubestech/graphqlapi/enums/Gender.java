package com.cubestech.graphqlapi.enums;

public enum Gender {
    MALE ('M'),
    FEMALE ('F');

    private Character value;

    private Gender(Character value) {
        this.value = value;
    }

    public Character getCharacter() {
        return value;
    }
}
