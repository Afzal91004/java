import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sorted array for binary search
        int[] arr = new int[]{1, 2, 4, 10, 12, 25, 40, 80, 94}; 
        
        // Start and end pointers
        int start = 0;
        int end = arr.length - 1;
        
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int num = sc.nextInt();
        sc.close();

        // Binary Search Implementation
        while (start <= end) {
            int mid = (start + end) / 2;  // Find middle index
            
            if (arr[mid] == num) { // Element found
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < num) { // Search right half
                start = mid + 1;
            } else { // Search left half
                end = mid - 1;
            }
        }

        // If element is not found
        System.out.println("Element not found in the array.");
    }
}

/*
 * Time Complexity:
 * - Best case: O(1) (if the element is found in the middle)
 * - Average case: O(log n) (binary search reduces search space by half in each step)
 * - Worst case: O(log n) (if the element is at the start or end of the array)
 *
 * Space Complexity:
 * - O(1) (constant space is used, no extra memory apart from variables)
 */
