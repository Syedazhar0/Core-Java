package complete_core_java;

import java.util.Scanner;

// program to print palindrome numbers from 1 to n
public class Palindrome1ToN {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int limit = sc.nextInt();

        int temp = 0; int remainder=0; int reverse =0; int sum_of_product=0;

        for(int i =1 ; i<=limit ; i++){
            temp =i;
            sum_of_product=0;
            while (temp!=0){
                   remainder = temp%10;
                   sum_of_product = sum_of_product*10+remainder;
                   temp= temp/10;
            }
            if (sum_of_product==i){
                System.out.println(i);
            }
        }
    }
}
