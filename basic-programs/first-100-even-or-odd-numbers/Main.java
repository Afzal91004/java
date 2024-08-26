import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option;
        do {
            System.out.println("Select \n'e' -> print first 100 even numbers \n'o' -> print first 100 odd numbers \npress x to exit the loop ");
            option = scanner.next().charAt(0);
            switch (option) {
                case 'e':
                    System.out.println("Printing first 100 Even Numbers...");
                    for (int i = 0; i < 200; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 'o':
                    for (int i = 0; i < 200; i++) {
                        if (i % 2 == 1) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 'x':
                    System.out.println("You are exiting the program");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 'x');
    }
}