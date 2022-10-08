package com.github.kennykarnama.commons.sort.alphabetsoup;

/**
 * AlphabetSoup is an abstract class to fullfil the specification
 * defined as follows
 * The Function should be returning a String that consists of
    sequential alphabet. For example: input parameter hello -> return string ehllo (We
    assumed that Symbols and Numbers are not included in str parameter).
* This abstract class also has validation method to validate if the string contains only alphabet
* Different implementation is required to implement Process function
 */
abstract class AlphabetSoup {
    /**
     * Validate input string
     * @param s input string
     * @throws Exception validation failed
     */
    protected void Validate(String s) throws Exception {
        boolean match = s.matches("[a-zA-Z]+");
        if (!match) {
            throw new Exception("only alphabets are permitted");
        }
        return;
    }
    /**
     * Sort string
     * alphabetically
     * @param s input
     * @return sorted String
     * @throws Exception Validation failed
     */
    abstract public String Process(String s) throws Exception;
}
