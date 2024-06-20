package practice;

import java.util.Scanner;
// create a function which returns true or false if any element found duplicate in a array
public class ReturnTrueORFalseIfDuplicateFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean result = ReturnTrueORFalseIfDuplicateFound.duplicate(arr);
        System.out.println(result);
    }
   public static  boolean duplicate(int [] arr){
       for (int i =0; i< arr.length;i++){
           for (int j =i+1; j<arr.length;j++){
               if(arr[i]==arr[j]){
                  return true;
               }
               }
           }

       return false;
   }
}
