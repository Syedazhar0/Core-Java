package practice;

public class RemoveDupolicates {
    public static void main(String [] args){
        // write a java program to remove duplicates from a given array
        int []arr={1,2,3,3,4,5,6,6,7,8,8};
        int num=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=num;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=num){
                System.out.print(arr[i]+"  ");
            }
        }
    }
}
