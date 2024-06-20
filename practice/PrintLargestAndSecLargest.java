package practice;

public class PrintLargestAndSecLargest {
    public  static  void main(String [] args){
        // write a java program to print the maximum element and second maximum element from a given array
        int arr[]={1,2,5,3,4,7,6,9,8,8,9};

        for(int i =0; i<arr.length; i++){
            for (int j=i+1; j< arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int max=0; int second_max=0;
        for(int i=0; i< arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > second_max && arr[j] != max) {
                    second_max = arr[j];
                }
            }
        System.out.println("maximum element in a given array is :"+max);
        System.out.println("second maximum element in a given array is :"+second_max);
    }
}
