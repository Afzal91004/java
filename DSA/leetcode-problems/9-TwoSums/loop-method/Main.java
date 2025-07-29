import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        // Call twoSum and display result
        int[] result = twoSum(nums, target);

        if (result.length == 2) {

            System.out.println("Indices found at: " + Arrays.toString(result) + "]");
            System.out.println("Values are: " + nums[result[0]] + " + " + nums[result[1]]+ " = " + target);

        } else {
            System.out.println("No valid pair found.");
        }

        sc.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
    }
}
