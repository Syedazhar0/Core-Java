package Stirngs;

import java.util.Scanner;

public class UpperCase_To_Lower_case {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        char ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){// this will convert upper to lower
            ch=(char) (ch+32);
            System.out.println(ch);
        } else if (ch>='a' && ch<='z') {// this will convert lower to upper
            ch =(char) (ch-32);
            System.out.println(ch);
        }
    }
}
