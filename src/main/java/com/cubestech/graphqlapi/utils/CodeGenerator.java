package com.cubestech.graphqlapi.utils;

import java.time.Instant;
import java.util.Random;

public class CodeGenerator {

    public static String generateCustomerNumber() {
        Random random = new Random();

        String code = String.valueOf(Instant.now().toEpochMilli());
        // First 3 digits
        String firstDigits = code.substring(0, 3);
        // Last 6 digits (use last 6 digits of current time in milliseconds to ensure uniqueness)
        String lastDigits = code.substring(3);

        // Next 2 uppercase letters
        char letter1 = (char) ('A' + random.nextInt(26));
        char letter2 = (char) ('A' + random.nextInt(26));
        String letters = "" + letter1 + letter2;

        return firstDigits + letters + lastDigits;
    }
}
