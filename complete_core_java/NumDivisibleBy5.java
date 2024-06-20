package complete_core_java;

import java.util.Scanner;
// program to check whether the number divisible by 5 or not if not then print the nearest number
public class NumDivisibleBy5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println(" enter divisor");
        int b = sc.nextInt();
        int reminder = a%b;

        if(a%b ==0){
            System.out.println("the number is divisible by "+b);
        }else if(reminder<=2){
            System.out.println("the nearest number is "+(a-reminder));
        }else {
            System.out.println("the nearest number is "+(a-reminder+(5)));
        }

    }
}
