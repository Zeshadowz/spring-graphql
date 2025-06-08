package com.cubestech.graphqlapi.enums;

import lombok.Getter;

@Getter
public enum AddressType implements BaseEnum<String> {
    BILLING("B"),
    HOME("H"),
    SHIPPING("S"),
    WORK("W");

    private final String code;

    private AddressType(String code) {
        this.code = code;
    }

}
