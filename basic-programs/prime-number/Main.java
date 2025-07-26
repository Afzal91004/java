public class Main {
    public static void main(String[] args) {
        int num = 13;
        for(int i = 2; i <= (int)Math.sqrt(num); i++ ) {
            if(num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            } else {
                System.out.println(num + " is a prime number.");
                return;
            }
        }
    }
}