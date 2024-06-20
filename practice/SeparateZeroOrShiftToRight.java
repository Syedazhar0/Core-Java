package practice;

public class SeparateZeroOrShiftToRight {
    public static void main(String [] args){
        // write a java program to separate zeros from the given array
        int arr[]={12,0,-5,0,2,5,0,4};
        for(int i =0; i< arr.length; i++){
            for(int j=i+1; j< arr.length;j++) {
                if (arr[i] < 0 || arr[i]>0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
