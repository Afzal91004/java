import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int x = sc.nextInt();

        // Negative or zero case
        if (x <= 0) {
            System.out.println("Only positive integers can be checked.");
            return;
        }

        int original = x;

        // Divide by 4 till not divisible
        while (x % 4 == 0) {
            x /= 4;
        }

        // Final check
        if (x == 1) {
            System.out.println(original + " is a power of four.");
        } else {
            System.out.println(original + " is not a power of four.");
        }
    }
}
