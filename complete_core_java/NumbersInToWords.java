package complete_core_java;

import java.util.Scanner;

public class NumbersInToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int digit;
        int rev = 0;
        int originalNumber = number; // Store original number for later use

//         Reversing the number (not necessary for this conversion)
        while (number > 0) {
            digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
         int temp =rev;
        System.out.println(temp);
//         Converting each digit into words
        System.out.print("Number in words: ");
        while (temp > 0) {
            digit = temp % 10;
            switch (digit) {
                case 0:
                    System.out.print("ZERO ");
                    break;
                case 1:
                    System.out.print("ONE ");
                    break;
                case 2:
                    System.out.print("TWO ");
                    break;
                case 3:
                    System.out.print("THREE ");
                    break;
                case 4:
                    System.out.print("FOUR ");
                    break;
                case 5:
                    System.out.print("FIVE ");
                    break;
                case 6:
                    System.out.print("SIX ");
                    break;
                case 7:
                    System.out.print("SEVEN ");
                    break;
                case 8:
                    System.out.print("EIGHT ");
                    break;
                case 9:
                    System.out.print("NINE ");
                    break;
                default:
                    System.out.print("Invalid ");
                    break;
            }
            temp = temp / 10;
        }
    }
}
