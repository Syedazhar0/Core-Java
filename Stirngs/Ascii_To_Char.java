package Stirngs;

import java.util.Scanner;

public class Ascii_To_Char {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ascii");
        int ascii = sc.nextInt();
        if(ascii >= 0 && ascii <= 127){
            char ch= (char)(ascii);
            System.out.println(ch);
        }else {
            System.out.println("invalid");
        }
    }
}
