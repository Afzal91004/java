import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Binary to Decimal Converter");
        System.out.print("Enter a binary number: ");
        
        String bin = sc.next();

          if (!bin.matches("[01]+")) {
            System.out.println("Invalid input! Please enter a binary number (only 0 and 1).");
            return;
        }


        int decimalValue = 0;
        int length = bin.length();

        for(int i = 0; i<length; i++){
            char bit = bin.charAt(length - 1 - i);
            // System.out.println(bit);
            if(bit == '1'){
                decimalValue += Math.pow(2, i);
            } 
        }

        System.out.println("Decimal value: " + decimalValue);

       sc.close();
    }
}