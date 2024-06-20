package practice;

import java.util.Arrays;

public class Minimum_maximum {
    public static void main(String [] args) {
       // find the minimum and maximum numbers from the given array
        int arr []={3,5,4,1,9};
//        int tem=0;
//        for (int i =0; i<arr.length;i++) {
//
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    tem = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tem;
//                }
//            }
//        }
//            for (int i =0; i<arr.length;i++){
//                System.out.print(arr[i]);
//            }
//        System.out.println("minimum element in a given array is "+arr[0]+" ");
//        System.out.println("maximum element in a given array is "+arr[arr.length-1]+" ");
//
        // another method

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);


    }
}
