package complete_core_java;

import java.util.Scanner;

// Program to convert binary to decimal
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number");
        int binary = sc.nextInt();
        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            int rem = binary % 2;
            decimal = decimal + rem * base;
            binary = binary / 10;
            base = base * 10;
        }
        System.out.println("Decimal number is: " + decimal);
    }
}
//explain nation
//Consider the binary number 1010 as an example. To convert it to decimal:

//        Initialization:
//        binary: 1010
//        decimal: 0 (Initialized to store the result)
//        base: 1 (Initialized to 2^0, the weight of the rightmost digit)
//        Loop Iteration 1:
//        rem: 0 (1010 % 10 = 0)
//        decimal: 0 + 0 * 1 = 0 (No change in decimal)
//        binary: 101 (1010 / 10 = 101)
//        base: 2 (1 * 2 = 2)
//        Loop Iteration 2:
//        rem: 1 (101 % 10 = 1)
//        decimal: 0 + 1 * 2 = 2 (Adding 1 * 2^1 to decimal)
//        binary: 10 (101 / 10 = 10)
//        base: 4 (2 * 2 = 4)
//        Loop Iteration 3:
//        rem: 0 (10 % 10 = 0)
//        decimal: 2 + 0 * 4 = 2 (No change in decimal)
//        binary: 1 (10 / 10 = 1)
//        base: 8 (4 * 2 = 8)
//        Loop Iteration 4:
//        rem: 1 (1 % 10 = 1)
//        decimal: 2 + 1 * 8 = 10 (Adding 1 * 2^3 to decimal)
//        binary: 0 (1 / 10 = 0)
//        base: 16 (8 * 2 = 16)
//        Loop Termination:
//        Since binary becomes 0, the loop terminates.
//        Result:
//        decimal: 10
//        So, the binary number 1010 is equivalent to the decimal number 10.
//
//        The program iterates through each digit of the binary number from right to left. For each digit, it calculates its contribution to the decimal number by multiplying the digit with the appropriate power of 2 (based on its position from right to left) and adds this contribution to the decimal variable. Finally, it prints the decimal variable, which holds the converted decimal value.



