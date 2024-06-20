package complete_core_java;

import java.util.Scanner;

// program to find the sum of individual digit and repeat the process until you get single digit
public class GetSingleDigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int sum=0;
        while (number>0){
            int rem = number%10;
                sum=sum+rem;
                number=number/10;
        }
        System.out.println(sum);
        int test= sum,sum2=0;
        while (test>0 || test>9){
           int rem2 = test%10;
           sum2=sum2+rem2;
           test=test/10;

        }

        System.out.println(sum2);
    }
}
