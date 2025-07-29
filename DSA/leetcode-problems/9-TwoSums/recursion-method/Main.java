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

        // Call twoSum (recursive) and display result
        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices found at: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Values are: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No valid pair found.");
        }

        sc.close();
    }

    // Wrapper method to start recursion from index 0
    public static int[] twoSum(int[] nums, int target) {
        return twoSum(nums, 0, target);
    }

    // Recursive twoSum logic
    private static int[] twoSum(int[] nums, int index, int target) {
        if (index >= nums.length) return null;

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[index] + nums[i] == target) {
                return new int[]{index, i};
            }
        }

        return twoSum(nums, index + 1, target);
    }
}
