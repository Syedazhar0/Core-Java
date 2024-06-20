package practice;

public class Max_sum_subArray {
    public  static  void  main(String [] args){
        // write a java program to print the max sum  of subarray from the given array
        int input []={1,5,-2,-4,6};
        int sum=0; int maxsum=input[0];
            for(int j=0; j<input.length;j++){
                sum=sum+input[j];
                if(sum>maxsum){
                    maxsum=sum;
                }
                if(sum<0){
                    sum=0;
            }
            for (int l=0;l<input.length;l++){
                System.out.print(input[l]);
            }
            System.out.println();
        }
        System.out.println(maxsum);
    }
}
