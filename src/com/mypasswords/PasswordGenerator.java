package com.mypasswords;

import java.util.Random;

/**
 *  PasswordGenerator class.
 */
public class PasswordGenerator {

    String pass;

    // Method to check if there is needed character in the string.
    private boolean hasOverlap(String s1, String s2) {
        for (char c : s1.toCharArray()) {
            if (s2.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

    // Method to return a password.
    String generatePassword(int length, boolean useLowerCase, boolean useUpperCase,
                            boolean useNumber, boolean useSpecialCharacter) {

        // Storing all lower case characters in a string.
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";

        // String with upper case letters.
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // String with digits.
        String numbers = "0123456789";

        // String with symbols.
        String symbols = "!@#$%^&#*()?";

        // StringBuilder for storing all characters.
        StringBuilder charOptions = new StringBuilder();

        // Condition if user requires adding lower case letters.
        if(useLowerCase) {
            charOptions.append(lowerCase);
        }

        // Condition if user requires adding upper case letters.
        if(useUpperCase) {
            charOptions.append(upperCase);
        }

        // Condition if user requires adding digits.
        if(useNumber) {
            charOptions.append(numbers);
        }

        // Condition if user requires adding symbols.
        if(useSpecialCharacter) {
            charOptions.append(symbols);
        }

        // String with all characters.
        String allCharacters = charOptions.toString();

        // Flag that password valid.
        boolean passwordValid = false;

        do {
            // Creating random number generator.
            Random random = new Random();

            // Creating StringBuilder instance to store a password.
            StringBuilder password = new StringBuilder();

            // Adding characters, symbols, and numbers to password.
            for (int i = 0; i < length; i++) {

                // Symbol to append;
                char nextLetter = allCharacters.charAt(random.nextInt(allCharacters.length()));

                // Adding characters.
                password.append(nextLetter);

            }


            passwordValid = true;

            if(useLowerCase && !hasOverlap(password.toString(), lowerCase)) {
                passwordValid = false;
            }

            if(useUpperCase && !hasOverlap(password.toString(), upperCase)) {
                passwordValid = false;
            }

            if(useNumber && !hasOverlap(password.toString(), numbers)) {
                passwordValid = false;
            }

            if(useSpecialCharacter && !hasOverlap(password.toString(), symbols)) {
                passwordValid = false;
            }

            // Converting password to a string.
            pass = password.toString();

        } while (!passwordValid);



        return pass;

    }
}
