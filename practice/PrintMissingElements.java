package practice;

public class PrintMissingElements {
    public static  void main(String [] args){
        // write a java program to print the missing element from the given array
        int[]arr={2,5,6,8,10};
        int j=0;
        int min=arr[0]; int max=arr[arr.length-1];
        for(int i =min;i<max;i++){
            if(j< arr.length && arr[j]==i){
                j++;
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
