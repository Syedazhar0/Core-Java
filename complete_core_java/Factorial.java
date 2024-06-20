package complete_core_java;

import java.util.Scanner;

//program to find the factorials of given number
public class Factorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int i =1; int fact=1;
        while(i<=num){
            fact = fact*i;
            i++;

        }
        System.out.println("the factorial of given number is :"+fact);
    }
}
