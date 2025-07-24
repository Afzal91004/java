import java.util.Scanner;

public class HammingWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(hammingWeight(num));
        sc.close();
    }
    
    public static int hammingWeight(int num) {
       
        int count = 0;

        while(num != 0) {
            int lastBit = num & 1;
            if(lastBit == 1) {
                count++;
            }
            num = num >> 1;   
        }

        return count;
    }
}