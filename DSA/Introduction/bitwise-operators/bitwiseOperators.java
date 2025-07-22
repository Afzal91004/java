

public class bitwiseOperators {
    public static void main(String[] args) {
        System.out.println("*******************Bitwise Operators in Java******************");
        System.out.println("a = 5 (binary: 0101)");
        System.out.println("b = 3 (binary: 0011)");
        int a = 5;
        int b = 3;
        System.out.println("Bitwise AND (a & b): " + a + " & "+ b + " = " + (a & b) + " (binary: " + Integer.toBinaryString(a & b) + ")");
        System.out.println("Bitwise OR (a | b): " + a + " | " + b + " = " +  (a | b) + " (binary: " + Integer.toBinaryString(a | b) + ")");
        System.out.println("Bitwise XOR (a ^ b): " + a + " ^ " + b + " = " +  (a ^ b) + " (binary: " + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("Bitwise NOT (~a): ~" + a +" = " + (~a) + " (binary: " + Integer.toBinaryString(~a) + ")  <---2's complement representation");
    }
}
