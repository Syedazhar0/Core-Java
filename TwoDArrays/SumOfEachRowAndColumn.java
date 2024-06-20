package TwoDArrays;

import java.util.Scanner;

public class SumOfEachRowAndColumn {
    public static void main(String [] args){
        // write a java program ro find the sum of each row and each column
        Scanner sc = new Scanner(System.in);
        int [] [] arr= new int[3][3];
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        System.out.println("enter the elements of array");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int rowsum=0; int colcum=0;
        for(int i=0; i<size;i++){
            for(int j=0; j<size; j++){
                rowsum=rowsum+arr[i][j];
            }
        }
        for (int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                colcum=colcum+arr[j][i];
            }
        }
        System.out.println("row sum is :"+rowsum);
        System.out.println("column sum is :"+colcum);
    }
}
