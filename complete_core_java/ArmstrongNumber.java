package complete_core_java;

import java.util.Scanner;

//program to check number is armstrong number or not
public class ArmstrongNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();

        int test = number;
        int multiplication=0;
        while(test>0){
            int rem =test%10;
            multiplication =multiplication+rem*rem*rem;
            test=test/10;
        }
        if (multiplication==number){
            System.out.println("is a armstrong number");
        }else{
            System.out.println("not a  armstrong number");
        }
    }
}
