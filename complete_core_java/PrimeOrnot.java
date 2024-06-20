package complete_core_java;

import java.util.Scanner;

//program to check prime or not
public class PrimeOrnot {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        int i=0,count=0;
        while(i<number){
            i++;
            if(number%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("is a prime number");
        }else{
            System.out.println("is not a prime");
        }
    }
}
