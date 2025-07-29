import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Factorial Calculation Program using Recursion");
        
        while(true) {
            System.out.print("Enter a number to calculate its factorial (or -1 to exit): ");
            num = sc.nextInt();
            if(num == -1) {
                System.out.println("Exiting the program. Goodbye!");
                sc.close();
                return;
            } else if(num >= 0) {
                break;
            }
            System.out.println("Factorial is not defined for negative numbers. \nPlease enter a non-negative integer.");
        }

        System.out.println("Calculating factorial of " + num + " using recursion...");
        System.out.println("The factorial of " + num + " is: " + factorial(num));
    }

    public static long factorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}