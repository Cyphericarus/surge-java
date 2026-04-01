package day11.assignment;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "I am Atomic";
        System.out.println("Original String: " + str);
        // concatenate
        str = str.concat("!");
        System.out.println("After concatenation: " + str);
        // startsWith
        System.out.println("Does it start with 'The': " + str.startsWith("The"));
        // endsWith
        System.out.println("Does it end with '!': " + str.endsWith("!"));
        // contains
        System.out.println("Does it contain the word \"are\": " + str.contains("are"));
        // equals
        String dup = "I am Atomic!";
        System.out.println("Are both the strings equal? " + str.equals(dup));
        // equalsIgnoreCase
        String duplicate = "i Am aTomic!";
        System.out.println("Are both the strings equal ignoring case? " + dup.equalsIgnoreCase(duplicate));
        // length
        System.out.println("The length of the string 'duplicate': " + duplicate.length());
        // trim 
        String unnecessarySpaces = "   I am learning java   ";
        System.out.println("String with lead and trail spaces: " + unnecessarySpaces);
        System.out.println("After removing lead and trail spaces: " + unnecessarySpaces.trim());
        // toCharArray
        System.out.println("The char array of the string is: " + Arrays.toString(str.toCharArray()));
        // toUpperCase 
        System.out.println("The upper case is: " + str.toUpperCase());
        // toLowerCase 
        System.out.println("The upper case is: " + str.toLowerCase());
        // indexOf
        System.out.println("The index of the letter 'm' is: " + str.indexOf('m'));
        // lastIndexOf
        System.out.println("The last index of the letter 'm' is: " + str.lastIndexOf('m'));
        // substring
        System.out.println("The extracted substring of the str string is: " + str.substring(5));
        // charAt
        System.out.println("The char at index 6 of string str is: " + str.charAt(6));
        // replace
        System.out.println("Replacing 'I am' with 'You are' in string str: " + str.replace("I am", "You are"));
        // replaceAll
        System.out.println("Replacing the letter 'm' with 'k': " + str.replaceAll("m", "k"));
        // isEmpty
        String emptyString = "  ";
        System.out.println("Is the string emptyString empty? " + emptyString.isEmpty());
        // isBlank
        System.out.println("Is the string emptyString blank? " + emptyString.isBlank());

    }
}
