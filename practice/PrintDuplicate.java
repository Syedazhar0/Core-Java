package practice;

public class PrintDuplicate {
    public static void main(String [] args){
        //write a java program to print the duplicates from the given array
        int arr[]={1,2,2,4,5,5,8,9,9};
        for(int i =0; i< arr.length;i++){
            for (int j =i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }


    }
}
