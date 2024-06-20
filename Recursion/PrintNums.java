package Recursion;

import java.util.Scanner;

public class PrintNums {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        PrintNums.print_numbers(num);
    }
    public static void print_numbers(int num){
        int n =100;
        System.out.println(num);
        if(num<n){
            print_numbers(num+1);
        }

    }
}
