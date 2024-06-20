package complete_core_java;

import java.util.Scanner;

// program to create a simple calculator using switch case
public class SimpleCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("enter a number");
        int num1 = sc.nextInt();
        System.out.println("*************** CHOOSE OPERATOR*****************");
        System.out.println(" Addition                 ->  +");
        System.out.println(" subtraction              ->  -");
        System.out.println(" multiplication           ->  *");
        System.out.println(" division                 ->  /");
        System.out.println(" percentile for remainder ->  %");
        System.out.println("***************");
        String operator = sc.next();

        switch (operator){
            case "+":
                System.out.println("addition of two numbers is : "+(num+num1));
                break;
            case "-":
                System.out.println("subtraction of two numbers is : "+(num-num1));
                break;
            case "*":
                System.out.println("multiplication of two numbers is : "+(num*num1));
                break;
            case "/":
                System.out.println("division of two numbers is : "+(num/num1));
                break;
            case "%":
                System.out.println("remainder of two numbers is : "+(num%num1));
                break;
            default:
                System.out.println(" sorry invalid operator");
        }

    }
}
