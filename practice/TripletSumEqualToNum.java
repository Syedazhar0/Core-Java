package practice;

public class TripletSumEqualToNum {
    public static void main(String [] args){
        // write a java program to print the triplet elements whose sum == given num
        int sum=11;
        int [] arr={1,4,45,6,10,8};// this code work for every condition
        for(int i =0; i<arr.length-2;i++){ // this loop iterate till the i <3 and this loop start from 0 index =element 1
            for(int j=i+1; j<arr.length;j++){// this loop iterate till the i <4 and this loop start from 1 index =element 4
                for(int k=j+1; k<arr.length;k++){// this loop iterate till the i <5 and this loop start from 2 index=element 45
                    if(arr[i]+arr[j]+arr[k]==sum){// first time condition false second time k incre index 3 element 6 equal to 11
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
