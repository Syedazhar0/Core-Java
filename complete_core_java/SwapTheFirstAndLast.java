package complete_core_java;

import java.util.Scanner;

// Program to swap the first and last digit
public class SwapTheFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;

        // Count the number of digits
        int count = 0;
        while (original > 0) {
            original /= 10;
            count++;
        }
        System.out.println("Number of digits are: " + count);

        // Extract the first and last digits
        int firstDigit = (int) (number / Math.pow(10, count - 1));
        System.out.println("First digit of entered number is: " + firstDigit);
        int lastDigit = number % 10;
        System.out.println("Last digit of entered number is: " + lastDigit);
        System.out.println("******************");

        // Extract the middle digits
        int middleDigits = (int) (number % Math.pow(10, count - 1) / 10);
        System.out.println("Middle digits of entered number are: " + middleDigits);

        // Swap the first and last digit
        int swappedNumber = (int) (lastDigit * Math.pow(10, count - 1)) + middleDigits * 10 + firstDigit;
        System.out.println("The number after swapping the first and last digit is: " + swappedNumber);
    }
}
