import java.util.Scanner;

public class XPowerN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take base input
        System.out.print("Enter base number (x): ");
        int x = sc.nextInt();

        // Take exponent input
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        // Call recursive function and display result
        int result = powerOf(x, power);
        System.out.println(x + "^" + power + " = " + result);

        sc.close();
    }

    public static int powerOf(int x, int power) {
        if (power == 0) return 1;
        if (x == 1) return 1;
        return x * powerOf(x, power - 1);
    }
}
