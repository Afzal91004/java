import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Decimal to Binary Converter");
        System.out.print("Enter a decimal number: ");

        int decNum = sc.nextInt();
        int num = decNum;
        String res = "";

        while(num > 0){
            int bin = num % 2;
            num = num / 2;
            res = bin + res;
        } 
        System.out.println("decimal("+ decNum +") = binary("+res+") ");

    }
}