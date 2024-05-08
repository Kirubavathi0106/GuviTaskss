package Answers;

import java.util.ArrayList; // Importing ArrayList class
import java.util.Arrays; // Importing Arrays class
import java.util.List; // Importing List interface

public class NonEmptyStringChecker { // Defining a class named NonEmptyStringChecker
    public static void main(String[] args) { // Defining the main method
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl"); // Create a list of strings
        
        // Creating a new list to hold non-empty strings
        List<String> nonEmptyStrings = new ArrayList<>(); 
        
        // Iterating through each string in the original list
        for (String str : strings) { // For each loop to iterate over strings
            // Checking if the string is not empty
            if (!str.isEmpty()) { // Checking if the string is not empty
                // If not empty, adding it to the list of non-empty strings
                nonEmptyStrings.add(str); // Adding non-empty string to the list
            }
        }

        // Printing the list with non-empty strings
        System.out.println("List with non-empty strings:");
        for (String nonEmptyString : nonEmptyStrings) { // For each loop to iterate over non-empty strings
            System.out.println(nonEmptyString); // Printing each non-empty string
        }
    }
}
