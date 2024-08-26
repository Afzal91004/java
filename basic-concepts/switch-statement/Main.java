// This program demonstrates the use of a switch statement in Java to create a basic calculator.
// It prompts the user to enter two numbers and an operator (+, -, *, /) and performs the corresponding arithmetic operation.
// The switch statement allows the program to choose the appropriate operation based on the user's input.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the first number
        System.out.print("Enter value of x: "); 
        int x = scanner.nextInt();
        // Prompt the user to enter the second number
        System.out.print("Enter value of y: ");
        int y = scanner.nextInt();
        // Prompt the user to enter an operation (operator)
        System.out.print("Enter operation name:");
        char operator = scanner.next().charAt(0);
        
        // Perform the operation based on the operator entered
        switch (operator) {
            case '+':
                System.out.println("Result: " + (x + y));
                break;
            case '-':
                System.out.println("Result: " + (x - y));
                break;
            case '*':
                System.out.println("Result: " + (x * y));
                break;
            case '/':
                System.out.println("Result: " + (x / y));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
