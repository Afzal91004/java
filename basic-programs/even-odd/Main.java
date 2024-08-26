import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        //story intro
        System.out.println("Once upon a time, there was a student named Afzal who was learning about numbers.");
        System.out.println("His teacher, Neetu Miss, gave him an exercise to practice identifying odd and even numbers.");
        System.out.println("Afzal was given a task: enter a number and check if it is odd or even.");
        System.out.println("The exercise would continue until he decided to stop by entering 'x'.");

        do {
            // Prompt user input
            System.out.print("Enter any integer: ");
            int i = scanner.nextInt();

            // Check if the number is odd or even
            if (i % 2 == 1 || i % 2 == -1) {
                System.out.println(i + " is an odd number.");
            } else {
                System.out.println(i + " is an even number.");
            }

            // Prompt user to continue or exit
            System.out.println("Press 'x' to exit and press any key (except 'x') to continue.");
            choice = scanner.next().charAt(0);
        } while (choice != 'x'); // Loop continues until the user enters 'x'

        // Story conclusion
        System.out.println("Afzal finished his practice and was able to determine whether numbers were odd or even.");
        System.out.println("Neetu Miss was proud of his progress and encouraged him to keep practicing.");
        System.out.println("Well done, Afzal! You have successfully completed the exercise.");
        
        scanner.close();
    }
}
