public class Main {
    public static void main(String[] args) {
        int x = 12;
        for(int i = 0; i < 32; i++) {
            if( (x & (1 << i)) != 0) {
                System.out.println(x + " is a power of two.");
                return;
            }
        }
                System.out.println(x + " is not a power of two.");

    }
}