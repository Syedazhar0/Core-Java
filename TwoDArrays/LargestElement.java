package TwoDArrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String [] args){
        // write a java program to find the largest element in a given array
        Scanner sc = new Scanner(System.in);
        int [] [] arr= new int[3][3];
        System.out.println("enter the size of a array");
        int size = sc.nextInt();
        System.out.println("enter the elements of array");
        for(int i =0; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i] [j]=sc.nextInt();
            }
        }
        int largest=0; int r=0,c=0;
        for(int i=0; i<size;i++){
            for(int j=0; j<size; j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                    r=i;
                    c=j;
                }
            }
        }
        System.out.println("largest element in a given array is .........."+largest);
        System.out.println("position of largest element is ........"+ r +" "+c);
    }
}
