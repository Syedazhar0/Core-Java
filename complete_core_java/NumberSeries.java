//package complete_core_java;
//
//import java.util.Scanner;
//
//// Program to print a number of series incrementally and then decremental
//public class NumberSeries {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//
//        int i = 1; // Start from 1 for incremental series
//        while (i <= num) {
//            System.out.print(i + " ");
//            i++;
//        }
//
//        i = num - 1; // Start from num - 1 for decremental series
//        while (i > 0) {
//            System.out.print(i + " ");
//            i--;
//        }
//    }
//}
package complete_core_java;

import java.util.Scanner;

// Program to print a number series incrementally and then decrementally
public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int i = 1; // Start from 1 for incremental series
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }

        i = num - 1; // Start from num - 1 for decremental series
        while (i > 0) {
            System.out.print(-i + " "); // Print negative numbers
            i--;
        }
    }
}
