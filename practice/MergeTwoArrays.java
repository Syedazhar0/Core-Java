package practice;

public class MergeTwoArrays {
    public static void main(String[] args) {
        // write a java program to merge two arrays into one single array
        int[] arr = {-89, -62, -57, 12, 31, 45};
        int[] arr1 = {-89, -62, -57, 12, 31, 45};
        int n=arr.length+arr1.length;
       int [] arr2=new int[n];

       for(int i =0; i<arr.length;i++){
           arr2[i]=arr[i];
       }
        for(int i =0; i<arr1.length;i++){
            arr2[arr1.length+i]=arr1[i];
        }

        for(int i =0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
