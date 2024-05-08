package Answers;

import java.util.List; // Importing the List interface
import java.util.stream.Collectors; // Importing the Collectors class
import java.util.stream.Stream; // Importing the Stream class

public class StringUppercaseConverter { // Defining a class named StringUppercaseConverter
    public static void main(String[] args) { // Defining the main method
        Stream<String> names = Stream.of("aBc", "d", "ef"); // Creating a Stream of strings

        List<String> uppercaseNames = names // Using the map() method to convert each string to uppercase
                .map(String::toUpperCase) // Converting each string to uppercase
                .collect(Collectors.toList()); // Collecting the results into a list

        // Printing the uppercase names
        uppercaseNames.forEach(System.out::println); // Using forEach() method to print each element in the list
    }
}
