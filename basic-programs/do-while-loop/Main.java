// This program demonstrates the use of a do-while loop in Java.
// The story is about a student named Afzal, who is practicing entering numbers with the help of Neetu Miss.
// The program prompts Afzal to enter a number and continues to ask for input until he enters 0.
// The do-while loop ensures that the code block runs at least once, even if Afzal enters 0 initially.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Story introduction
        System.out.println("Afzal was in a math exercise with Neetu Miss.");
        System.out.println("Neetu Miss asked Afzal to enter numbers to practice his math skills.");
        System.out.println("The exercise would continue until Afzal decided to stop by entering 0.");

        // Prompting user input
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();
        System.out.println("Press 0 to exit the loop");

        // Do-while loop ensures that the block of code runs at least once
        do {
            // Display the entered number
            System.out.println("You have entered " + num);
            if (num == 0) {
                System.out.println("If you enter 0 again, you will exit the loop.");
            }
            // Prompt user to enter a number again
            System.out.print("Enter a number again: ");
            num = scanner.nextInt();
        } while (num != 0); // Loop continues until the user enters 0

        // Story conclusion
        System.out.println("Afzal has completed the exercise.");
        System.out.println("Neetu Miss was pleased with his effort and said, 'Good job, Afzal! You've practiced well.'");
    }
}
