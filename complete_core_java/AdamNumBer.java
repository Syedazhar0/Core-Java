package complete_core_java;

import java.util.Scanner;

// program to check the given number is adam number or not
public class AdamNumBer {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int number = sc.nextInt();
        int original_number = number;
        int square = number*number;
        System.out.println("square of given number is :"+square);

        int reverse =0;

        while (number>0){
            int remainder = number%10;
                reverse   = reverse*10+remainder;
                number=number/10;
        }
        int reversed = reverse;
        System.out.println("number after reverse :"+reversed);

        // square the reversed number
        reversed =reverse*reversed;
        System.out.println("number after square :"+reversed);

        // now reverse the number to compare with the original number square which is 144 if u enter 12
        int reverse1 =0;
        while (reversed>0){
            int remainder1 = reversed%10;
                reverse1   = reverse1*10+remainder1;
                reversed   = reversed/10;
        }
        System.out.println("number after reverse :"+reverse1);
        if(reverse1== square){
            System.out.println("is a adam number :"+original_number);
        }else {
            System.out.println("is not a adam number :"+original_number);
        }
    }
}
