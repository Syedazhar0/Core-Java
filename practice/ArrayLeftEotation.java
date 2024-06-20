package practice;

public class ArrayLeftEotation {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5};
        // write a java program to left rotate the array elements
        int n=3;// how many element you want to rotate or shift
        for(int i=0;i<n;i++){
            int first=arr[0]; int j;
            for( j=0; j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
