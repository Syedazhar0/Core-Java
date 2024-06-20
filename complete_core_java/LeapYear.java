package complete_core_java;

import java.util.Scanner;

// program to check leap year or not
public class LeapYear {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        if(year%4==0 && year %100!=0 || year%400==0){
            System.out.println("entered year is leap year "+year);
        }else{
            System.out.println("entered year is not a leap year "+year);
        }
    }
}
