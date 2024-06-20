package complete_core_java;

import java.util.Scanner;

public class PrimeNumWithFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            int count = 0;
            // Check if 'i' is a prime number
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            // If 'i' is prime, print it and its factors
            if (count == 2) {
                System.out.println("Prime: " + i);
                System.out.print("Factors: ");
                for (int k = 1; k <= i; k++) {
                    if (i % k == 0) {
                        System.out.print(k + " ");
                    }
                }
                System.out.println(); // Move to the next line after printing all factors
            }
        }
        sc.close();
    }
}
