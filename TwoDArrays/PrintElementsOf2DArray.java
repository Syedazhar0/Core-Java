package TwoDArrays;

public class PrintElementsOf2DArray {
    public static void main(String [] args){
        // write a java program to print 2d array or matrix elements

        int [] [] arr={{1,2,3,},{4,5,6},{7,8,9}};
        System.out.println("2d array elements are .......");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
