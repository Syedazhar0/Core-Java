package TwoDArrays;

import java.util.Scanner;

public class StroreTheSumOf2MatrixsOfEachElementInOneMat {
    public static void main(String [] args){
        // write a java program to print the sum of two matrix of each element and store into another matrix
        Scanner sc = new Scanner(System.in);
        int [][] arr=new int[3][3];
        int [][] arr1=new int[3][3];
        int [][] arr2=new int[3][3];
        System.out.println("enter the size of arr array");
        int size=sc.nextInt();
        System.out.println("enter the elements of arr array");
        for(int i =0; i<size;i++){
            for(int j=0; j<size; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the element of arr1 array");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i< arr2.length;i++){
            for(int j=0; j<arr2.length;j++){
                arr2[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("sum of two matrix arrays of each element is .........");
         for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2.length; j++){
                System.out.print("["+arr2[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
}
