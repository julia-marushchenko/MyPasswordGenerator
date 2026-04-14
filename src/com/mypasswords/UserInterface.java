package com.mypasswords;

/**
 *  UserInterface defines set of methods.
 */
public interface UserInterface {
    public int getPasswordLength();
    public boolean useLowerCase();
    public boolean useUpperCase();
    public boolean useNumbers();
    public boolean useSymbols();
    public void displayPassword(String password);
}
