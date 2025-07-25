import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }

        // copy original number for display
        int original = x;

        // Create mask of same length as binary form of x
        int mask = 0;
        int temp = x;

        while (temp != 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        // Compute bitwise complement using mask
        int complement = (~x) & mask;

        // Output
        System.out.println("\n--- Bitwise Complement Calculation ---");
        System.out.println("Original number       : " + original);
        System.out.println("Binary representation : " + Integer.toBinaryString(original));
        System.out.println("Bitwise complement    : " + complement);
        System.out.println("Complement in binary  : " + Integer.toBinaryString(complement));
    }
}
