package complete_core_java;

import java.util.Scanner;

// program to find the next highest number which is less than the given number without the digit entered by the user
public class NextHighestNumLessThanGivenNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the digit to exclude: ");
        int excludeDigit = scanner.nextInt();

        int nextHighestNumber = -1; // you can also use zero here I'm using -1

        for (int i = number - 1; i > 0; i--) {
            int temp = i; // Changed from 'number' to 'i'
            int count = 0;
            while (temp != 0) {
                int remainder = temp % 10;
                if (remainder == excludeDigit) {
                    count++;
                    break;
                }
                temp = temp / 10;
            }
            if (count == 0) {
                nextHighestNumber = i; // Changed from 'temp' to 'i'
                System.out.println("The next highest value is: " + nextHighestNumber);
                break; // Exit the loop once the next highest number is found
            }
        }

        if (nextHighestNumber == -1) {
            System.out.println("There is no higher number that doesn't contain the digit " + excludeDigit);
        }

        scanner.close();
    }
}


/*Given  number is : 2349 and the  output is : 2339 we want to find the next
 highest number less than 2349 without including the digit 4.

Starting from 2348 (2349 - 1) we will iterate downward:

2348 contains the excluded digit 4, so we move to the next number.
2347 contains the excluded digit 4, so we move to the next number.
2346 contains the excluded digit 4, so we move to the next number.
2345 contains the excluded digit 4, so we move to the next number.
2344 does not contain the excluded digit 4, so it's not a valid candidate.
2343 contains the excluded digit 4, so we move to the next number.
2342 contains the excluded digit 4, so we move to the next number.
2341 contains the excluded digit 4, so we move to the next number.
2340 contains the excluded digit 4, so we move to the next number.
2339 does not contain the excluded digit 4, so it's the desired output.
Therefore, the loop iterated 10 times before finding the desired output, which is
the next highest number less than 2349 and excluding the digit 4, which is 2339.*/
