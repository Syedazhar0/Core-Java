package complete_core_java;

import java.util.Scanner;
//program to check person is eligible for vote or not
public class EligibleToVote {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you age");
        int age = sc.nextInt();
        if(age >=18){
            System.out.println("you are eligible for vote ");
        }else{
            System.out.println("sorry you are not eligible for vote");
        }
    }
}
