package TwoDArrays;

import java.util.Scanner;

public class ExchangeRows {
        public static void main(String[] args) {
            // write a java program to interchange the rows or exchange the rows
            Scanner sc = new Scanner(System.in);
            int [] [] arr = new int[3][3];
            System.out.println("enter the size of a array");
            int size = sc.nextInt();
            System.out.println("enter the elements of array");
            for(int i=0; i<size; i++){
                for(int j =0; j<size; j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int temp=0;
            for(int i=0; i<size; i++){
               temp=arr[0][i];
                arr[0][i]=arr[2][i];// this is for first and last row exchange
                arr[2][i]=temp;
            }
            // for exchange of 1st and 2nd rwo just replace the 2s with 1s
            for(int i=0; i<size;i++){
                for(int j=0; j<size; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

        }
    }



