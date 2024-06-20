package Stirngs;

import java.util.Scanner;

//program to check given character is vowel or not
public class Check_Char_Or_Not {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        char ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("vowel");
        }else {
            System.out.println(" not a vowel");
        }
    }
}
