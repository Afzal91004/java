import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Story introduction
        System.out.println("Afzal and his friends are planning a treasure hunt. Each friend contributes a number representing clues hidden at different locations.");
        System.out.println("Afzal needs to keep track of these numbers. Let's help him store and display the clues!");

        // Create a list and add elements
        List<Integer> list = new ArrayList<>();
        list.add(20); // Clue from friend 1
        list.add(2);  // Clue from friend 2
        list.add(50); // Clue from friend 3
        list.add(19); // Clue from friend 4

        // Story continuation
        System.out.println("You have entered the following clues:");
        System.out.println(list); // Display all clues at once

        // Display each clue separately
        for (int x : list) {
            System.out.println(x);
        }

        // Ending the story
        System.out.println("Afzal smiles, ready to find the treasure with all these clues in hand!");

        scanner.close();
    }
}
