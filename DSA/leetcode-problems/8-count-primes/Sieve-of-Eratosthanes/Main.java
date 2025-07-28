import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sieve of Eratosthenes");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
       int count = 0;
       boolean[] primes = new boolean[n];
       Arrays.fill(primes, true);
       primes[0] = primes[1] = false; // 0 and 1 are not prime numbers
       for(int i = 2; i < n; i++) {
        
        if(primes[i]) {
            count++;
            for(int j= 2*i; j < n; j += i) {
                primes[j] = false;
            }
        }
       }

       System.out.println(count);
    }
}