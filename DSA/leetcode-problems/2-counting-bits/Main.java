import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int n = sc.nextInt();
        int[] result = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            int count = 0;
            int num = i;

            while(num != 0) {
                if((num & 1) == 1) //(num & 1) -----> last bit
                    count++;
                num = num >> 1;
            }
            result[i] = count;
        }

        System.out.println("counting bits: "+ Arrays.toString(result));

    }
}
// This program counts the number of 1's in the binary representation of each number from 0 to n.
// It uses bitwise operations to determine the count of 1's for each number.
// The result is stored in an array and printed at the end.
// The time complexity is O(n log n) due to the while loop for each number
// and the space complexity is O(n) for storing the results in an array.
// The program prompts the user to enter a decimal number and then calculates the number of bits for
// each number from 0 to that input number.
// The program uses bitwise operations to efficiently count the bits.   
// The program is designed to be run in a console environment where the user can input a number.
// It is a simple implementation of counting bits using bitwise operations in Java.
