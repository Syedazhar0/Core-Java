package Recursion;

import java.util.Scanner;

public class Sum_Of_Individual_Digits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int result = Sum_Of_individuals(number);
        System.out.println(result);
    }

    public static int Sum_Of_individuals(int number){
        if(number>0){
            return (number%10+Sum_Of_individuals(number/10));
        }else{
            return 0;
        }
    }
}
// enter the number
//123
//6

//Sum_Of_individuals(123) calls Sum_Of_individuals(12) and adds 3 (123 % 10) to the result.
//Sum_Of_individuals(12) calls Sum_Of_individuals(1) and adds 2 (12 % 10) to the result.
//Sum_Of_individuals(1) calls Sum_Of_individuals(0) and adds 1 (1 % 10) to the result.
//Sum_Of_individuals(0) is the base case, so it returns 0.

//Sum_Of_individuals(123) = 3 + Sum_Of_individuals(12)
//Sum_Of_individuals(12) = 2 + Sum_Of_individuals(1)
//Sum_Of_individuals(1) = 1 + Sum_Of_individuals(0)
//Sum_Of_individuals(0) = 0

//So, the final calculation is 3 + 2 + 1 + 0 = 6.