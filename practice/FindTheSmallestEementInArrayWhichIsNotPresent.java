package practice;

public class FindTheSmallestEementInArrayWhichIsNotPresent {
    public static void main(String[] args) {
        // write a java program and find the smallest positive integer which is not present in an unsorted array
        int arr[] = {3,4,-1,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
       int min=arr[0]; int max=arr[arr.length-1]; int j=0;
        for(int i =min; i<max; i++){
            if(j<arr.length && arr[j]==i){
                j++;
            }else if(i>0)
                System.out.println(i);
        }
    }
}
