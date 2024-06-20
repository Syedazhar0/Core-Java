package complete_core_java;

import java.util.Scanner;

// Program to convert decimal to binary
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number");
        int decimal = sc.nextInt();
        int binary = 0;
        int base = 1;

        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + rem * base;
            decimal = decimal / 2;
            base = base * 10;
        }

        System.out.println("Binary number is: " + binary);
    }
}
