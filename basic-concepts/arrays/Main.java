import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int n;

        // Story introduction
        System.out.println("One day, Afzal was curious about how to store and print multiple numbers.");
        System.out.println("Neetu Miss, his teacher, challenged him to create an array and print all its values.");

        // Getting the size of the array from the user
        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();
        arr = new int[n];

        // Populating the array using user input
        System.out.println("\nFirst, Afzal decided to fill the array with numbers he inputs:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = scanner.nextInt();
        }

        // Explanation about printing the array using Arrays class
        System.out.println("\nAfzal first learned an easy way to print the array using the Arrays class:");
        System.out.println(Arrays.toString(arr)); // Printing with the help of Arrays class
        System.out.println("He realized this method was quick, but he wanted to understand how to do it himself.");

        // Printing the array in a custom way
        System.out.println("\nSo, Afzal decided to write his own code to print the array elements without using any helper classes:");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]");
            }
        }

        // Alternative method of populating the array
        System.out.println("\n\nThen, Neetu Miss showed Afzal another way to create an array directly with initial values:");
        int[] directArray = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("int[] directArray = new int[]{1, 2, 3, 4, 5, 6};");
        System.out.println("This way, he could create an array with pre-defined values in a single line!");

        // Printing the directly initialized array
        System.out.println("\nAfzal decided to print this new array too:");
        System.out.println(Arrays.toString(directArray));

        // Conclusion
        System.out.println("\nNeetu Miss smiled and said, 'Excellent job, Afzal! Now you know multiple ways to populate and print an array!'");

        scanner.close();
    }
}
