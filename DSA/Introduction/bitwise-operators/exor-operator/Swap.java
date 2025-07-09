import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number(a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number(b): ");
        int b = sc.nextInt();

        System.out.println("Before Swap: a= " + a + " b = " + b);
        // Swapping using XOR operator
        a = a ^ b; 
        b = a ^ b; 
        a = a ^ b;
        System.out.println("After Swap: a= " + a + " b = " + b);
        sc.close();
    }
}