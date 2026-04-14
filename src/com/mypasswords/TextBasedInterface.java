package com.mypasswords;

import java.util.Scanner;

/**
 * TextBasedInterface class.
 */
public class TextBasedInterface implements UserInterface {

    // Scanner instance to get user requirements.
    private Scanner scanner;

    // Constructor of the class TextBasedInterface.
    public TextBasedInterface() {
        this.scanner = new Scanner(System.in);
    }

    // Realiyation of methods of UserInterface.
    @Override
    public int getPasswordLength() {
        System.out.print("Please enter password length: ");
        return scanner.nextInt();
    }

    @Override
    public boolean useLowerCase() {
        System.out.print("Would you like a password to have lower case characters: (y / n) ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useUpperCase() {
        System.out.print("Would you like a password to have upper case characters: (y / n) ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useNumbers() {
        System.out.print("Would you like a password to have numerical characters: (y / n) ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useSymbols() {
        System.out.print("Would you like a password to have symbol characters: (y / n) ");
        return scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public void displayPassword(String password) {
        System.out.println("Here is your password: " + password);
    }

}
