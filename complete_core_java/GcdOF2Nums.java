package complete_core_java;

import java.util.Scanner;

//program to find gcd of 2 numbers
public interface GcdOF2Nums {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int first = sc.nextInt();
        System.out.println("enter a number");
        int second = sc.nextInt();

        int largest = Math.max(first, second);// or use ternary to find largest number (first>second)?first:second;
        System.out.println(largest);
        int i =0;int gcd=0;
        while (i<largest){
            i++;
            if(first%i ==0 && second%i==0) {
                gcd =i;
            }
        }
        System.out.println("the greatest common divisor is :" + gcd);

        // find lcm to find lam in easy way first find the gcd of hcf then multiply the 2 numbers and divide with gcd of hcf
        int lcm = (first*second)/gcd;
        System.out.println("lac is :"+lcm);
    }
}
