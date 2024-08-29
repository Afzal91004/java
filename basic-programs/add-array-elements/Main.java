import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int n, sum = 0;

        // Story introduction
        System.out.println("One day, Afzal was solving a math problem in his computer class.");
        System.out.println("Neetu Miss challenged him to create a program that sums all the numbers in an array.");

        // Getting the size of the array from the user
        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();
        arr = new int[n];

        // Populating the array with user input
        System.out.println("\nAfzal started entering numbers into the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = scanner.nextInt();
        }

        // Calculating the sum of all numbers in the array
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        // Displaying the sum
        System.out.println("\nAfzal quickly calculated the sum of all the numbers in the array.");
        System.out.println("Sum of all numbers in the array: " + sum);

        // Conclusion
        System.out.println("\nNeetu Miss was proud of Afzal's efforts and said, 'Great job, Afzal! You have successfully summed up all the numbers.'");

        scanner.close();
    }
}
