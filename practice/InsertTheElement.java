package practice;

import java.util.Scanner;

public class InsertTheElement {
    public static void main(String [] args){
        // write a java program to insert the element at specified location
        int [] arr = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the location where you want to insert");
        int posi = scanner.nextInt();
        System.out.println("enter the element which you want to insert");
        int element = scanner.nextInt();

        for(int i=0;i<=posi; i++){
              if(i==posi){
                arr[i]=element;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
