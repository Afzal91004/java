import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Choose an option:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        int choice = sc.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Enter a decimal number:");
                int decimal = sc.nextInt();
                System.out.println("Binary representation: " + converter.toBinary(decimal));
                break;
            case 2:
                System.out.println("Enter a binary number:");
                int binary = sc.nextInt();
                System.out.println("Decimal representation: " + converter.toDecimal(binary));
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                return;
        }

        sc.close();
        System.out.println("Thank you for using the converter!");
    }
}

class Converter {
    public int toDecimal(int binary) {
        int decimal = 0;
        int index = 0;

        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * (1 << index);
            binary /= 10;
            index++;
        }

        return decimal;
    }


    public int toBinary(int decimal) {
        String binary = "";

        while(decimal != 0) {
            int lastBit = decimal & 1;
            binary = lastBit + binary;
            decimal >>= 1;
        }

        return Integer.parseInt(binary);
    }
}