package complete_core_java;

import java.util.Scanner;

// program to check number is palindrome or not
public class Palindrome {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int test = number;
        int palin=0;
        while(test>0){
            int rem = test%10;
              palin = palin*10+rem;
            test=test/10;
        }if(palin==number){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not a palindrome");
        }
    }
}
