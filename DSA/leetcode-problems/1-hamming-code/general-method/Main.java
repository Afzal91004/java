import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(hammingWeight(num));
        sc.close();

    }

    public static int hammingWeight(int n) {
        int count = 0;
        String res = Integer.toBinaryString(n);
        for(int i = 0; i < res.length(); i++) {
            if(res.charAt(i) == '1'){
                count++;
            }
        }

        return count;
    }
}