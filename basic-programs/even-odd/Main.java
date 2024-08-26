import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter any integer: ");
            int i = scanner.nextInt();

            if (i % 2 == 1 || i % 2 == -1) {
                System.out.println(i + " is an odd number");
            } else {
                System.out.println(i + " is an even number");
            }

            System.out.println("press x to exit and press any key (except x) to continue");
            choice = scanner.next().charAt(0);
        } while (choice != 'x');
        System.out.println("You have exited the even odd checker program");
        scanner.close();
    }
}