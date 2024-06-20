package practice;

public class ArrayRightRotation {
public static void main(String [] args){
    // write a java program to right rotate the given array
    int [] arr={1,2,3,4,5};
    int n=3;
    for(int i=0;i<n;i++){
        int last =arr[arr.length-1];int j;
        for(j= arr.length-1;j>0;j--){
            arr[j]=arr[j-1];
        }
        arr[0]=last;
    }
    for(int i=0;i< arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
