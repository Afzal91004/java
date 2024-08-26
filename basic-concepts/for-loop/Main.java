// This program demonstrates the use of a for loop in Java.
// The story is about a school student named Afzal, who was late to school.
// His teacher, Neetu Miss, gave him a punishment to repeat "I am Sorry" multiple times.
// The for loop is used when the number of iterations is known before entering the loop.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Story introduction
        System.out.println("Afzal was late to school today. Neetu Miss was not happy with this.");
        System.out.println("As a punishment, she asked Afzal to repeat 'I am Sorry' a certain number of times.");
        
        // Prompting user input
        System.out.println("How many times do you want to repeat 'I am Sorry'?");
        int m = scanner.nextShort();
        
        // Repeat the message m times
        for (int i = 1; i <= m; i++) {
            System.out.println("I am Sorry " + i);
        }
        
        // Story conclusion
        System.out.println("Afzal repeated 'I am Sorry' " + m + " times as per Neetu Miss's instruction.");
        System.out.println("Hopefully, Afzal will be on time from now on!");
    }
}
