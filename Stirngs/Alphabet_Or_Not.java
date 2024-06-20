package Stirngs;

import java.util.Scanner;

// program to check given character is alphabet or not
public class Alphabet_Or_Not {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("Alphabet");
        }else {
            System.out.println("not");
        }
    }
}
