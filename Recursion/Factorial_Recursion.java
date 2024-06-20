package Recursion;

import java.util.Scanner;

public class Factorial_Recursion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int result = Factorial(number);
        System.out.println(result);
    }
    public static int Factorial(int number){
        if(number>0){
            return (number*(Factorial(number-1)));
        }else {
            return 1;
        }
    }
}
//Factorial(3) calls Factorial(2) and multiplies 3 by the result.
//Factorial(2) calls Factorial(1) and multiplies 2 by the result.
//Factorial(1) calls Factorial(0) and multiplies 1 by the result.
//Factorial(0) is the base case, so it returns 1.
//The calls would look like this:
//
//Factorial(3) = 3 * Factorial(2)
//Factorial(2) = 2 * Factorial(1)
//Factorial(1) = 1 * Factorial(0)
//Factorial(0) = 1
//
//So, the final calculation is 3 * 2 * 1 * 1 = 6.

//enter the number
//3
//6