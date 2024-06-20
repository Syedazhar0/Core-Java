package Stirngs;

import java.util.Scanner;

public class Chat_to_Ascii_to_Char {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        char ch= sc.next().charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            int ascii = (int) (ch);
            System.out.println(ascii);
        }else {
            System.out.println("not a character");
        }
    }
}
