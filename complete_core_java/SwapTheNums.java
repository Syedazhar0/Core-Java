package complete_core_java;

import java.util.Scanner;

// swap the number if the ratio of the numbers is >0 after division
public class SwapTheNums {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        float f = sc.nextFloat();
        System.out.println("enter number");
        float f1 = sc.nextFloat();

        float division = f /f1;

        if (division>0){
            float temp = f;
            f = f1;
            f1=temp;
            System.out.println("values after swaping "+f+ " "+f1);
        }else{
            System.out.println("ratio is less than zero "+division);
        }
    }
}
