package Answers;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        // Parsing the user input as a LocalDate object
        LocalDate birthdate = LocalDate.parse(input);

        // Calculating the age using Period.between() method
        Period age = Period.between(birthdate, LocalDate.now());

        // Displaying the age using String.format() method with lambda expression
        // Construct the age string with years, months, and days
        String ageString = String.format("Your age is: %d years, %d months, and %d days.",
                age.getYears(), age.getMonths(), age.getDays());
        
        // Printing the age to the console
        System.out.println(ageString);

        // Closing the scanner to release resources
        scanner.close();
    }
}
