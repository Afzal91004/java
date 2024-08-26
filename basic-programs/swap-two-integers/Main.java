import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, temp;
        char choice;
        System.out.println("For swapping enter 'c' & to exit press any key");
        choice = scanner.next().charAt(0);
        while (choice == 'c') {

            System.out.print("Enter a: ");
            a = scanner.nextInt();
            System.out.print("Enter b: ");
            b = scanner.nextInt();

            temp = b;
            b = a;
            a = temp;
            System.out.println("Updated value of a: " + a);
            System.out.println("Updated value of b: " + b);
            System.out.println("To continue press 'c' & to exit press any key");
            choice = scanner.next().charAt(0);
        }
        scanner.close();
    }
}