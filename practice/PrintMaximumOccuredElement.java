package practice;

public class PrintMaximumOccuredElement {
    public static void main(String [] args){
        //write a java program to print maximum occured element in a given array
        int []arr={4,5,8,7,4,7,6,7};// ans count is 3 element is 7
        int posi=0;
        int count ; int max_count=0;
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max_count){
                max_count=count;
                posi=i;
            }
        }
        System.out.println(max_count+"  "+arr[posi]);
    }
}
