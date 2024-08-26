import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, temp;
        char choice;

        // Story introduction
        System.out.println("Afzal was working on a simple programming task given by Neetu Miss.");
        System.out.println("The task was to swap two numbers and then display the updated values.");
        System.out.println("Neetu Miss encouraged Afzal to use a loop to repeat the swapping operation as many times as he wanted.");

        System.out.println("For swapping enter 'c' & to exit press any other key");

        choice = scanner.next().charAt(0);
        while (choice == 'c') {
            // Prompt user for input
            System.out.print("Enter the value of a: ");
            a = scanner.nextInt();
            System.out.print("Enter the value of b: ");
            b = scanner.nextInt();

            // Swapping values
            temp = b;
            b = a;
            a = temp;

            // Display updated values
            System.out.println("Updated value of a: " + a);
            System.out.println("Updated value of b: " + b);

            // Ask user if they want to continue
            System.out.println("To continue swapping, press 'c' & to exit press any other key");
            choice = scanner.next().charAt(0);
        }

        // Story conclusion
        System.out.println("Afzal decided to exit the swapping program.");
        System.out.println("Neetu Miss praised Afzal for his effort and said, 'Great job, Afzal! You've learned how to swap values effectively.'");
        scanner.close();
    }
}
