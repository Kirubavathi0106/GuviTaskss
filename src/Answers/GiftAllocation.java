package Answers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GiftAllocation {
    public static void main(String[] args) {
        // Creating a list of English people names
        List<String> englishPeopleNames = Arrays.asList("Aruna", "Bala", "Surya", "Anusha", "Devi", "Anand", "Ananthu", "Gokila", "Ashok");

        // Using Stream API and lambda expression to filter names starting with "A"
        List<String> namesStartingWithA = englishPeopleNames.stream()
                                                .filter(name -> name.startsWith("A"))
                                                .collect(Collectors.toList());

        // Printing the names starting with "A"
        System.out.println("Names starting with 'A':");
        for (String name : namesStartingWithA) {
            System.out.println(name);
        }
    }
}
