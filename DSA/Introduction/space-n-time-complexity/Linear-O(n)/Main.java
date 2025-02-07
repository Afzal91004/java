public class Main {
    public static void main(String[] args) {
        // Initialize an array with 5 elements
        int[] arr = new int[]{1, 2, 3, 4, 5};

        // Create a new array of the same length (Space Complexity = O(n))
        int[] arrNew = new int[arr.length]; // S.C. = O(n) || T.C. = O(1) 

        // Copy elements from arr to arrNew (Time Complexity = O(n))
        for (int i = 0; i < arr.length; i++) { // S.C. = O(1) || T.C. = O(n)
            arrNew[i] = arr[i];
        }

        // Print all elements of the new array (Time Complexity = O(n))
        for (int num : arrNew) { // S.C. = O(1) || T.C. = O(n)
            System.out.println(num);
        }
    }
}

/*
 * Space Complexity Calculation:
 * - arr[] takes O(n) space.
 * - arrNew[] takes O(n) space.
 * - Loop variables take O(1) space.
 * - Total: O(n) + O(1) + O(1) = O(n+1+1) = O(n)
 *
 * Time Complexity Calculation:
 * - Initializing arrNew[] is O(1).
 * - Copying elements from arr to arrNew[] takes O(n).
 * - Printing elements takes O(n).
 * - Total: O(1) + O(n) + O(n) = O(2n) = O(n).
 */
