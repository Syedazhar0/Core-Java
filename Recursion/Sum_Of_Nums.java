package Recursion;

import java.util.Scanner;

public class Sum_Of_Nums {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int result = Sum(number);
        System.out.println(result);

    }
    public static int Sum(int num){
        if(num>=1){
            return num+Sum(num-1);
        }else {
            return 0;
        }
    }
}

//    Sum(3) = 3 + Sum(2)
//        Sum(2) = 2 + Sum(1)
//        Sum(1) = 1 + Sum(0)
//        Sum(0) = 0
// So, the final calculation is 3 + 2 + 1 + 0 = 6.
// enter the number
//3
//6