package complete_core_java;

import java.util.Scanner;

// program to print armstrong numbers till the limit
public class NestedForLoop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int limit = sc.nextInt();
        int temp =0; int remainder =0; int sum_of_power=0; int count_digits=0;
        for(int i =1; i<=limit; i++){
            temp=i;
            count_digits=0;
            while (temp>0){
                   temp=temp/10;
                   count_digits++;// count the digits
            }
            sum_of_power=0;
            int original =i;
            while (original>0){
                remainder = original%10;
                sum_of_power=(int) (sum_of_power+Math.pow(remainder,count_digits));
                original=original/10;
            }
            if(sum_of_power==i){
                System.out.println(i);
            }
        }
    }
}
