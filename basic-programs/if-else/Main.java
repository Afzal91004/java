// Let's learn if-else with the help of voting age eligibility

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your Age: "); 
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextByte();
        if (age >= 18) { // Condition to be checked here
            System.out.println("Welcome! You are eligible to vote."); 
        } else {
            System.out.println("Oops! Sorry... You are ineligible to vote."); 
        }
    }
}