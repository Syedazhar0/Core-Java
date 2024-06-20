package complete_core_java;

import java.util.Scanner;

//program to check the occurrence of a number in a given number
public class OccurenceOfDigit {
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int count=0;
        while(number>0){
            int rem = number%10;
            if(rem==2){
                count++;
            }
                number=number/10;
        }
        System.out.println(count);
    }
}
