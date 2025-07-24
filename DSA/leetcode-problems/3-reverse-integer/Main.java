import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter an integer to reverse: ");
        int x = sc.nextInt();

        int result = 0;
        int original = x; // Save original value for display

        while (x != 0) {
            int lastDigit = x % 10;

            // Check for overflow before multiplication
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                System.out.println("Error: Reversed number goes out of 32-bit int range!");
                return;
            }

            result = result * 10 + lastDigit;
            x /= 10;
        }

        System.out.println("Reversed integer of " + original + " is: " + result);
    }
}
