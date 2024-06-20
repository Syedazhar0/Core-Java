package Stirngs;

import java.util.Scanner;

// program to check given character is digit or not
public class Check_Digit_Or_Not {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        if (ch >= '0' && ch <= '9') {
            System.out.println("digit");
        }else {
            System.out.println("not a digit");
        }
    }
}
