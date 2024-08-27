import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Story intro
        System.out.println("Afzal, a bright schoolboy, was learning about factorials in his math class.");
        System.out.println("His teacher gave him an exercise to find the factorial of a number, and Afzal decided to solve it using a program.");

        // Prompting user input
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        long factorial = 1;
        // Calculating factorial
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
            // Story detail about the process
            System.out.println("Afzal is multiplying " + factorial + " by " + i + " to find the factorial.");
        }

        // Displaying result
        System.out.println("The factorial of " + num + " is: " + factorial);
        System.out.println("Afzal was pleased with his result and felt more confident about his math skills after solving the exercise.");
        System.out.println("His teacher congratulated him and said, 'Great job, Afzal! You've successfully calculated the factorial!'");

        scanner.close();
    }
}
