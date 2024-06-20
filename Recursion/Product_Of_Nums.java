package Recursion;

import java.util.Scanner;

public class Product_Of_Nums {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        int result = Product(a,b);
        System.out.println(result);
    }
    public static int Product(int a , int b){
        if (a==1){
            return b;
        }else {
            return (b+Product(a-1,b));
        }
    }
}
// internal calculation
//    Product(a=10, b=10):
//
//Since a is not 1, we calculate 10 + Product(9, 10).
//
//
//
//Product(9, 10):
//
//Again, a is not 1, so we calculate 10 + Product(8, 10).
//
//
//
//Continue this process until a becomes 1.
//
//
//The final result will be the sum of 10 added to itself 10 times:
//Product(10,10)=10+10+10+10+10+10+10+10+10+10=100
//
//
//Therefore, the product of 10 and 10 is 100
//enter value of a
//10
//enter the value of b
//10
//100