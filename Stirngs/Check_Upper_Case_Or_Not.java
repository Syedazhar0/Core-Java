package Stirngs;

import java.util.Scanner;

//program to check given character is in upper case or not
public class Check_Upper_Case_Or_Not {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {

            System.out.println(" Uppercase");
        }else{

            System.out.println(" not in uppercase");
        }
    }
}
