import java.util.Scanner;;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************Swap Two Numbers Using XOR Operator******************");
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swapping using XOR operator
        a = a ^ b; // Step 1: a now holds the XOR of a and b 
        // above line: a = a ^ b = a'
        b = a ^ b; // Step 2: b now holds the original value of a
        // above line: b = a' ^ b = a' ^ (a ^ b) = a
        a = a ^ b; // Step 3: a now holds the original value of b
        // above line: a = a' ^ b 
        // but b = a
        // so a = a' ^ a = a ^ b ^ a = b
        System.out.println("After swapping: a = " + a + ", b = " + b);
        sc.close();
    }
}