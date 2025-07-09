import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Odd or Even using bitwise operator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            if ((number & 1) == 1) {
                System.out.println("The number " + number + " is Odd.");
            } else {
                System.out.println("The number " + number + " is Even.");
            }
        }

        sc.close();
    }
}