import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Method 1: Initialize array using new keyword and assigning values
        int[] arr0 = new int[5];
        arr0[0] = 1;
        arr0[1] = 2;
        arr0[2] = 3;
        arr0[3] = 4;
        arr0[4] = 5;
        System.out.println("Method 1 - Using new keyword and assigning values:");
        System.out.println(Arrays.toString(arr0));
        System.out.println();

        // Method 2: Initialize array using array literal
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Method 2 - Using array literal:");
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        // Method 3: Initialize array using new keyword with values
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        System.out.println("Method 3 - Using new keyword with values:");
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        // Dynamic Array using ArrayList
        List<Integer> dynamicArr = new ArrayList<>();
        dynamicArr.add(1);
        dynamicArr.add(2);
        dynamicArr.add(3);
        dynamicArr.add(4);
        dynamicArr.add(5);
        System.out.println("Dynamic Array using ArrayList:");
        System.out.println(dynamicArr);
    }
}
