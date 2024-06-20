package TwoDArrays;

import java.util.Scanner;

public class SumAndProductOf2DArray {
    public static void main(String [] args){
        // write a java program to print the sum amd product of 2d array
        Scanner sc = new Scanner(System.in);
        int [] [] arr = new int[3][3]; // dynamic array
//        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; static array
        System.out.println("enter the size of a array");
        int size = sc.nextInt();
        System.out.println("enter the elements of array ");
        for(int i=0; i< size;i++){
            for(int j=0; j<size;j++){
               arr[i][j]=sc.nextInt();

            }
        }
        int sum = 0,prod=1;
        for(int i=0; i< arr.length;i++){
            for(int j=0; j<arr.length;j++){
                sum=sum+arr[i][j];
                prod=prod*arr[i][j];
            }
        }
        System.out.println("sum of 2d array is......"+sum);
        System.out.println("product of 2d array is......"+prod);
    }
}
