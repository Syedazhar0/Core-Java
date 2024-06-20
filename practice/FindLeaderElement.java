package practice;

public class FindLeaderElement {
    // write a java program to pint the leader elements from the given array
    public static void main(String[] args) {
        int arr[] = {12,9,7,14,8,6,3};

        for (int i = 0;i< arr.length;i++){
            boolean bool=false;
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]<arr[j] ){
                   bool=true;
                   break;
                }
            }
            if(bool==false){
                System.out.println(arr[i]);
            }
        }
    }
}
