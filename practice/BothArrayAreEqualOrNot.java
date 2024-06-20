package practice;

public class BothArrayAreEqualOrNot {
    public static  void main(String [] args){
        // write the java program to check whether both arrays are equal are not
        int arr1[]={9,8,7,6,5,4,3,2,1};
        int arr2[]={5,4,3,2,1,6,7,8,9};

        for (int i =0; i<arr1.length;i++){
            for(int j=i+1; j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        for (int i =0; i<arr2.length;i++){
            for(int j=i+1; j<arr2.length;j++){
                if(arr2[i]>arr2[j]){
                    int temp1=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp1;
                }
            }
        }
        int count=0;
        int i;
        for (i =0; i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                count++;
            }
        }
        if (count==i){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
