import java.util.Scanner;

public class DecreasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("Enter a positive integer to print numbers in decreasing order (or -1 to exit): ");
            n = sc.nextInt();
            if(n == -1) {
                System.out.println("Exiting the program. Goodbye!");
                sc.close();
                return;
            } else if(n >= 0) {
                break;
            } else {
                System.out.println("Negative numbers are not allowed.");
            }
            System.out.print("Please enter a non-negative integer: ");
        }
        System.out.println("Printing numbers in decreasing order from " + n + " to 1:");
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if(n < 0) {
            return; // Base case: if n is less than 0, stop the recursion
        }
        System.out.print(n + " "); // Print the current number
        printDecreasing(n - 1); // Recursive call with n decremented by 1
    }
}