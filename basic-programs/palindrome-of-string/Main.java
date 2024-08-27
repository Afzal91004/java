import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char stop;

        do {
            // Story introduction
            System.out.println("One day, Afzal was intrigued by the concept of palindromes.");
            System.out.println("Neetu Miss challenged him to find out if certain words were palindromes, which read the same forwards and backwards.");

            // Prompting user input
            System.out.print("Enter a string: ");
            String txt = scanner.next();
            String reverse = "";

            // Reversing the string
            for (int i = txt.length() - 1; i >= 0; i--) {
                reverse = reverse + txt.charAt(i);
            }

            // Checking if the string is a palindrome
            if (reverse.equals(txt)) {
                System.out.println(txt + " is a palindrome.");
                System.out.println("Afzal proudly announced that " + txt + " is a palindrome!");
            } else {
                System.out.println(txt + " is not a palindrome.");
                System.out.println("Afzal thought for a moment and realized that " + txt + " isn't a palindrome.");
            }

            // Asking if the user wants to continue
            System.out.println("Do you want to check another word? Press 'n' to exit or any other key to continue.");
            stop = scanner.next().charAt(0);

            if (stop == 'n') {
                System.out.println("You are exiting the program. Afzal thanked Neetu Miss for the fun challenge!");
            }

        } while (stop != 'n');

        System.out.println("You have exited the program.");
        scanner.close();
    }
}
