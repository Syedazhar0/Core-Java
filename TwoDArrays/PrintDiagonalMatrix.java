package TwoDArrays;

import java.util.Scanner;

public class PrintDiagonalMatrix {
    public  static  void main(String [] args){
        // write a java program to print the diagonal matrix is nothing but a cross line from top left corner  to  bottom right corner

        Scanner sc= new Scanner(System.in);
        int [] [] arr= new int[3][3];
        System.out.println("enter the size of a array");
        int size = sc.nextInt();
        System.out.println("enter the elements of a array");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("diagonal matrix is .........");
        for(int i =0; i<size; i++){
            for(int j=0;j<size; j++){
                if(i==j){
                    System.out.print("["+arr[i][j]+"]");
                }
                System.out.print(" ");
            }
        }

    }
}
