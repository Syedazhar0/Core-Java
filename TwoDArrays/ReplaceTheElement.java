package TwoDArrays;

import java.util.Scanner;

public class ReplaceTheElement {
    public static void main(String [] args){
        // write a java program to replace the source element with the replacing element
        Scanner sc = new Scanner(System.in);
        int [] [] arr=new int[3][3];
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter the elements of 2d array");
        for(int i=0; i<size;i++){
            for(int j=0; j<size; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the source element which you want to replace");
        int source= sc.nextInt();
        System.out.println("enter the replacing element ");
        int replace = sc.nextInt();

        for(int i=0;i<size;i++){
            for(int j=0; j<size;j++){
                if(arr[i][j]==source){
                    arr[i][j]=replace;
                }
            }
        }
        for(int i=0; i<size; i++){
            for(int j =0; j<size; j++){
                System.out.print("["+arr[i][j]+"]");
            }
            System.out.println();
        }
    }
}
