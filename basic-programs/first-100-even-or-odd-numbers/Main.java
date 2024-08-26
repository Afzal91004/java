import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option;

        // Story intro
        System.out.println("Afzal was working on a programming assignment given by Neetu Miss.");
        System.out.println("She asked him to create a program that could display numbers based on user choice.");
        System.out.println("Afzal had to provide options to print either even numbers, odd numbers, or exit the program.");

        do {
            // Prompt user for input
            System.out.println("Select \n'e' -> print first 100 even numbers \n'o' -> print first 100 odd numbers \n'x' -> exit the loop ");
            option = scanner.next().charAt(0);

            switch (option) {
                case 'e':
                    // Story detail about even numbers
                    System.out.println("Afzal chose to print the first 100 even numbers.");
                    System.out.println("He started with 0 and kept adding 2 to get the next even number.");
                    for (int i = 0; i < 200; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 'o':
                    // Story detail about odd numbers
                    System.out.println("Afzal chose to print the first 100 odd numbers.");
                    System.out.println("He started with 1 and kept adding 2 to get the next odd number.");
                    for (int i = 0; i < 200; i++) {
                        if (i % 2 == 1) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 'x':
                    // Story conclusion
                    System.out.println("Afzal decided to exit the program.");
                    System.out.println("Neetu Miss was impressed with his implementation and said, 'Well done, Afzal! You've successfully created the number display program.'");
                    break;
                default:
                    System.out.println("Invalid Option. Please try again.");
            }
        } while (option != 'x');
        scanner.close();
    }
}
