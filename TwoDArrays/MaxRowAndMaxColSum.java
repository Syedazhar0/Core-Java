package TwoDArrays;

import java.util.Scanner;

public class MaxRowAndMaxColSum {
    public static void main(String [] args){
        // write a java program to find the max row sum and max column sum
        Scanner sc = new Scanner(System.in);
        int [] [] arr = new  int[3][3];
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter the elements of array");
        for(int i=0 ; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum;int maxrowsum=0;
        for(int i=0; i<size; i++){
            sum=0;
            for(int j=0; j<size; j++){
                sum= sum+arr[i][j];
                if(sum>maxrowsum){
                    maxrowsum=sum;
                }
            }
        }
        System.out.println("maximum row sum is :"+maxrowsum);

        System.out.println();

        int sum1; int maxcolsum=0;
        for(int i=0; i<size; i++){
            sum1=0;
            for(int j=0; j<size; j++){
                sum1=sum1+arr[j][i];
                if(sum1>maxcolsum){
                    maxcolsum=sum1;
                }
            }
        }
        System.out.println("maximum column sum is .."+maxcolsum);
    }
}
