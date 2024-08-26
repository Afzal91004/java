package vowels-or-consonants;

public import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Story intro
        System.out.println("One day, Afzal was in his English class with Neetu Miss.");
        System.out.println("Neetu Miss was teaching the difference between vowels and consonants.");
        System.out.println("To help Afzal practice, she asked him to identify whether a letter was a vowel or a consonant.");

        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        char x;

        do {
            // Prompting user input
            System.out.print("Enter an alphabet: ");
            x = scanner.next().charAt(0);

            // Checking if the input character is a vowel, consonant, or invalid
            if (vowels.indexOf(x) != -1) {
                System.out.println(x + " is a vowel.");
                System.out.println("Afzal correctly identified that " + x + " is a vowel! Neetu Miss smiled and said, 'Well done, Afzal!'");
            } else if (consonants.indexOf(x) != -1) {
                System.out.println(x + " is a consonant.");
                System.out.println("Afzal correctly identified that " + x + " is a consonant! Neetu Miss was pleased with his answer.");
            } else {
                System.out.println("Invalid entry. Please enter a valid alphabet.");
                System.out.println("Afzal realized his mistake, and Neetu Miss gently reminded him to focus on entering a valid letter next time.");
            }

            // Asking if the user wants to try again
            System.out.print("Do you want to try another letter? (y/n): ");
            char tryAgain = scanner.next().charAt(0);
            if (tryAgain == 'n' || tryAgain == 'N') {
                break;
            }

        } while (true);//this is infinite do while loop if above condition met this will be finite loop

        System.out.println("Afzal had a great time learning about vowels and consonants with Neetu Miss!");
        scanner.close();
    }
}
 {
    
}
