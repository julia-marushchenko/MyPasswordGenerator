/**
 *  Java application to generate passwords with lower and upper letters, digits, and symbols.
 */

package com.mypasswords;

/**
 *  App class to start application.
 */
public class App {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating TextBasedInterface with UserInterface type.
        UserInterface ui = new TextBasedInterface();

        // Variables for password.
        int length = ui.getPasswordLength();
        boolean useLowerCase = ui.useLowerCase();
        boolean useUpperase = ui.useUpperCase();
        boolean useNumbers = ui.useNumbers();
        boolean useSymbols = ui.useSymbols();

        // Creating a new instance of PasswordGenerator.
        PasswordGenerator gen = new PasswordGenerator();

        // Calling method generatePassword() and saving password to a new string.
        String password = gen.generatePassword(length, useLowerCase, useUpperase,
                useNumbers, useSymbols);

        // Printing generated password to console.
        ui.displayPassword(password);

    }
}