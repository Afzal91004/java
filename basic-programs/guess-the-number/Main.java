import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, randomNum;

        // Story introduction
        System.out.println("Afzal was playing a number guessing game with Neetu Miss.");
        System.out.println("Neetu Miss thought of a number between 0 and 9, and Afzal had to guess it.");
        System.out.println("Afzal was eager to guess the correct number to win the game.");

        // Generate a random number between 0 and 9
        randomNum = (int) (Math.random() * 10);

        // Prompt user to enter a number
        System.out.print("Enter a number between 0 and 9: ");
        num = scanner.nextInt();

        // Loop until the guessed number matches the random number
        while (randomNum != num) {
            System.out.print("Try again! Enter another number: ");
            num = scanner.nextInt();
        }

        // Congratulatory message when the correct number is guessed
        System.out.println("Congratulations, Afzal! You guessed the correct number: " + randomNum);
        System.out.println("Neetu Miss was impressed with your persistence and congratulated you for winning the game.");

        scanner.close();
    }
}
