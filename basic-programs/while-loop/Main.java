// This program demonstrates the use of a while loop in Java.
// The story is about a student named Afzal, who is practicing math with his teacher, Neetu Miss.
// The program prompts Afzal to enter a number and continues to ask for input until he enters 0.
// The while loop checks the condition before each iteration, so the loop might not execute if the condition is false initially.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Story introduction
        System.out.println("Afzal was in math class with Neetu Miss.");
        System.out.println("Neetu Miss asked Afzal to practice his number skills by entering different numbers.");
        System.out.println("Whenever Afzal wanted to stop, he could enter 0 to finish the exercise.");
        
        // Prompting user input
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        System.out.println("Press 0 to exit");

        // Loop continues until the user enters 0
        while (num != 0) { 
            // Display the entered number
            System.out.println("You have entered " + num);
            // Prompt user to enter a number again
            System.out.print("Enter a number again: ");
            num = scanner.nextInt();
        }

        // Story conclusion
        System.out.println("Afzal finished his math practice successfully.");
        System.out.println("Neetu Miss was proud of his effort and told him, 'Well done, Afzal!'");
    }
}
