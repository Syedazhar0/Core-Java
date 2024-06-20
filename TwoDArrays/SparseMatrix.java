package TwoDArrays;

import java.util.Scanner;

public class SparseMatrix {
    public static void main (String [] args){
        // write a java program to check weather a given matrix is sparse matrix or not if a matirx contains more number of zeros
        // is called sparse matrix

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        System.out.println("enter the elements of array");
        for(int i=0; i<size; i++){
            for(int j =0; j<size; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        if(count >(size*2)/2){
            System.out.println("sparse matrix");
        }else{
            System.out.println("not a sparse matrix");
        }
    }
}
