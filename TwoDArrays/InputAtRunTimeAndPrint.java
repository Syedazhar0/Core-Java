package TwoDArrays;

import java.util.Scanner;

public class InputAtRunTimeAndPrint {
    public static void main(String [] args){
        // write a java program which takes array elements at runtime and print the matrix
        Scanner sc = new Scanner(System.in);
        int [] [] arr=new int[3][3];
        System.out.println("enter the size of an 2d array");
        int size= sc.nextInt();
        System.out.println("enter the elements of 2d array");
         for(int i=0; i< size;i++){
             for(int j=0;j<size;j++){
                 arr[i][j]=sc.nextInt();
             }
         }
        System.out.println(" array elements are ......");
        for(int i=0; i< size;i++){
            for(int j=0;j<size;j++){
                System.out.print(" ["+ arr[i][j]+" ]");
            }
            System.out.println();
        }
    }
}
