import java.util.Scanner;

public class Main {
    public static int bitwiseComplement(int n) {
        if (n == 0) return 1;

        String bit = "";
        while (n != 0) {
            int lastBit = n & 1;
            if (lastBit == 1) {
                bit = "0" + bit;
            } else {
                bit = "1" + bit;
            }
            n >>= 1;
        }

        return Integer.parseInt(bit, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        // Output
        int complement = bitwiseComplement(n);
        System.out.println("Original number: " + n);
        System.out.println("Bitwise complement: " + complement);
    }
}

