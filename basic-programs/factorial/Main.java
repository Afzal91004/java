import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}