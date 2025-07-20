import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************Even or Odd Checker******************");
        System.out.print("Enter a number to check if it is even or odd: ");
        int number = sc.nextInt();
        
        // Using bitwise AND operator to check if the number is even or odd
        if((number & 1) == 1) {
            System.out.println(number + " is an Odd number.");
        } else {
            System.out.println(number + " is an Even number.");
        }
        sc.close();
    }
}