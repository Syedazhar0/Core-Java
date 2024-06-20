package practice;
public class PrintArrayElemetsumis9 {
    public static void main(String [] args){
        // write a java program to print the index of the elements whose sum ==9
       int  nums [] = {3,2,4,3,5};
       int firstindex=0,secondindex=0;
       for(int i =0; i<nums.length-1;i++){
           if (nums[i]+nums[i+1]==9){
              firstindex=i;
              secondindex=i+1;
              break;
           }
       }
        System.out.println(firstindex+" "+secondindex);
    }
}