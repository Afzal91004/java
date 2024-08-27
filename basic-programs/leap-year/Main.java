import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char stop;
        int year;

        do {
            // Story introduction
            System.out.println("Afzal was learning about leap years in his math class.");
            System.out.println("He was curious to find out which years are leap years.");

            // Prompting user input
            System.out.print("Enter a year: ");
            year = scanner.nextInt();

            // Leap year check
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
                System.out.println("Afzal found that " + year + " is a leap year!");
            } else {
                System.out.println(year + " is not a leap year.");
                System.out.println("Afzal found that " + year + " is not a leap year.");
            }

            // Asking if the user wants to continue
            System.out.println("Do you want to find another leap year? (y/n)");
            stop = scanner.next().charAt(0);

            if (stop == 'n') {
                System.out.println("You have exited the program. Afzal thanked Neetu Miss for helping him understand leap years!");
            }

        } while (stop != 'n');

        scanner.close();
    }
}
