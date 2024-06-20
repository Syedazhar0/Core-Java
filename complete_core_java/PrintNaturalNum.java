package complete_core_java;

import java.util.Scanner;

//program to print natural numbers using while loop
public class PrintNaturalNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit to print natural numbers");
        int limit = sc.nextInt();
        int i =0;
        while(i<=limit){
            System.out.println(i);
            i++;
        }
    }
}
