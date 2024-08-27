import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char stop;

        do {
            // Story introduction
            System.out.println("One day, Afzal was curious about a sequence of numbers called the Fibonacci sequence.");
            System.out.println("His teacher, Neetu Miss, asked him to explore the sequence by entering any number.");

            // Prompting user input
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Initializing the first two numbers of the Fibonacci sequence
            int num0 = 0, num1 = 1;

            // Checking if the input is zero
            if (num == 0) {
                System.out.println(0);
            } else {
                // Generating and displaying the Fibonacci sequence up to the entered number
                for (int i = 1; i <= num; i++) {
                    System.out.println(num0);
                    int temp = num0 + num1;
                    num0 = num1;
                    num1 = temp;
                }
            }

            // Asking if the user wants to continue
            System.out.println("Do you want to explore another Fibonacci sequence? Press 'n' to stop or any other key to continue.");
            stop = scanner.next().charAt(0);

            if (stop == 'n') {
                System.out.println("You have exited the program. Afzal thanked Neetu Miss for introducing him to the Fibonacci sequence!");
            }

        } while (stop != 'n');

        scanner.close();
    }
}
