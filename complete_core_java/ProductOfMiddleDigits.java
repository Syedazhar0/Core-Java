
package complete_core_java;

import java.util.Scanner;

public class ProductOfMiddleDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        int originalNumber = number;
        int count = 0;

        // Count the number of digits
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits in the given number: " + count);

        // Find the first and last digits
        int firstDigit = (int) (originalNumber / Math.pow(10, count - 1));//count minus 1 becaues if you try to divide exact count of digits
        // it will gives 0 ans out put because ex:10/10 is zero
        // for ex if you entered 10 digits so to get the 1 first digit you have to divide it 9 times to get 1st digit so count-1 is 9
        int lastDigit = originalNumber % 10;
        System.out.println("First digit of the given number is: " + firstDigit);
        System.out.println("Last digit of the given number is: " + lastDigit);

        // Calculate the product of the middle digits
        int middleNumber = (int) (originalNumber % Math.pow(10, count - 1) / 10);
        int product = 1;
        while (middleNumber > 0) {
            int digit = middleNumber % 10;
            product *= digit;
            middleNumber /= 10;
        }

        System.out.println("The product of the middle digits is: " + product);
    }
}
