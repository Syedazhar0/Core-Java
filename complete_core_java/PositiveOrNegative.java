package complete_core_java;

import java.util.Scanner;

// program to check number is positive or not
public class PositiveOrNegative {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int b = sc.nextInt();
        if(b>0){
            System.out.println("number is positive number");
        }else{
            System.out.println("number is negative number");
        }

    }
}
