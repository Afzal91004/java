import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Given array
        int arr[] = new int[]{3, 4, 5, 24, 2, 13, -5, 15, 25, -15, 10, 0, 4, 6, 8, 2, 1, 9};
        
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        sc.close();

        // Brute-force approach: Checking all pairs (O(n^2) time complexity)
        for (int i = 0; i < arr.length; i++) { 
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pairs: " + arr[i] + " " + arr[j]);
                }
            }
        }
    }    
}

/*
 * Time Complexity: O(n^2)
 * - The program uses a nested loop, iterating through all pairs.
 * - For an array of size n, it performs (n * (n - 1)) / 2 operations, which simplifies to O(n^2).
 *
 * Space Complexity: O(1)
 * - Only a few integer variables are used, and no additional data structures are created.
 */
