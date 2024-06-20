package TwoDArrays;

import java.util.Scanner;

public class SumOfUpperDiagonalAndLowerDiagonal {
    public static void main(String [] args){
        // write a java program to print the sum of upper diagonal and sum of lower diagonal
        Scanner sc = new Scanner(System.in);
        int [] [] arr=new int[3][3];
        System.out.println("inter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the element of array");
        for(int i =0; i<size;i++){
            for(int j=0; j<arr.length; j++){
               arr[i] [j]=sc.nextInt();
            }
        }
        int upperDiagonal=0; int lowerdiagonal=0;
        for(int i =0; i<size; i++){
            for(int j=0; j<size;j++){
                if(i<j) {
                    upperDiagonal = upperDiagonal + arr[i][j];
                    System.out.println(arr[i][j]);
                }
                    if(i>j) {
                        lowerdiagonal = lowerdiagonal + arr[i][j];
                        System.out.println(arr[i][j]);
                    }
            }
        }
        System.out.println("*************");
        int sum= upperDiagonal+lowerdiagonal;
        System.out.println("sum of upper and lower diagonal is   :"+sum);
    }
}
