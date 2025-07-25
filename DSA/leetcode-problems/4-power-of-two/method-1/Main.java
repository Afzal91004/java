import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        // Check if input is valid
        if (x <= 0) {
            System.out.println(x + " is not a power of two (only positive integers are allowed).");
            return;
        }

        // Check using bitwise method: only one bit set in power of two
        int n = x;

        while (n != 0) {
            if ((n & 1) == 1 && n != 1) {
                System.out.println(x + " is not a power of two.");
                return;
            }
            n = n >> 1;
        }

        System.out.println(x + " is a power of two.");
    }
}
// This program checks if a given integer is a power of two using bitwise operations.
// It counts the number of bits set to 1 in the binary representation of the number.    
// If there is more than one bit set, it is not a power of two.
// If there is exactly one bit set, it is a power of two.
// The program also checks if the input is a positive integer before proceeding.
// If the input is not positive, it informs the user that only positive integers are allowed.