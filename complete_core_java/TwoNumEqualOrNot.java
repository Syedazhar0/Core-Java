package complete_core_java;

import java.util.Scanner;

// to check to number or equal of not
public class TwoNumEqualOrNot {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 10;
        if(a==b){
            System.out.println("both numbers are equal "+a + " "+b);
        }else{
            System.out.println("both numbers are not equal "+a + " "+b);
        }
    }
}
