package practice;

import java.util.Scanner;

public class DeleteElement {
    public  static void main(String [] args){
        // write a java program to remove the element from the given array
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[10];
        System.out.println("enter the size");
        int size= sc.nextInt();

        System.out.println("enter the elements of an array");

        for(int i=0;i<size;i++) {
             arr[i] = sc.nextInt();
        }

        System.out.println("enter the location  to delete the element");
        int loc =sc.nextInt();
        for(int i=loc;i<=size-1;i++){
            arr[i]=arr[i+1];
            }
        size--;
        for(int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
