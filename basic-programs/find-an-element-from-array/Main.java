import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int n, x, option;

        // Story introduction
        System.out.println("One sunny day, Afzal was solving a math puzzle given by his teacher, Neetu Miss.");
        System.out.println("The puzzle involved finding numbers in a series. Afzal loves challenges, so he decided to write a small program to help him out.");
        System.out.println("Let's help Afzal find the number!");

        // Get size of array
        System.out.print("Enter size of the array: ");
        n = scanner.nextInt();
        arr = new int[n];

        // Populate the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = scanner.nextInt();
        }

        // Story continuation
        System.out.println("Neetu Miss asked Afzal to find a particular number from the series he just created.");
        System.out.print("Enter the number you want to find: ");
        x = scanner.nextInt();

        // Get the search option from the user
        System.out.println("Press 0 to find all occurrences of " + x);
        System.out.println("Press 1 to find only the first occurrence of " + x);
        option = scanner.nextInt();

        // Decision-making based on user's choice
        switch (option) {
            case 0: // Find all occurrences
                boolean foundAny = false; // Flag to check if any occurrence is found
                for (int i = 0; i < n; i++) {
                    if (arr[i] == x) {
                        System.out.println(x + " is found at position " + i + " (as per Java indexing).");
                        foundAny = true;
                    }
                }
                if (!foundAny) {
                    System.out.println(x + " is not found in the array.");
                    System.out.println("Afzal looked puzzled as the number was nowhere to be found!");
                } else {
                    System.out.println("Afzal grinned, 'I found all the occurrences, Neetu Miss!'");
                }
                break;

            case 1: // Find only the first occurrence
                boolean found = false; // Flag to check if the first occurrence is found
                for (int i = 0; i < n; i++) {
                    if (arr[i] == x) {
                        System.out.println(x + " is found at position " + i + " (as per Java indexing).");
                        System.out.println("Afzal exclaimed, 'I found the first occurrence of the number, Neetu Miss!'");
                        found = true;
                        break; // Stop at the first occurrence
                    }
                }
                if (!found) {
                    System.out.println(x + " is not found in the array.");
                    System.out.println("Afzal scratched his head, wondering where the number could be.");
                }
                break;

            default:
                System.out.println("Invalid entry. Please choose either 0 or 1.");
                System.out.println("Afzal frowned, realizing he had made a mistake in the input.");
                break;
        }

        // Ending the story
        System.out.println("Neetu Miss was happy to see Afzal's determination and praised him for his effort!");
        scanner.close();
    }
}
