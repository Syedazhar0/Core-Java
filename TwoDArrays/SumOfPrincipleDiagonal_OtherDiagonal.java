package TwoDArrays;

import java.util.Scanner;

public class SumOfPrincipleDiagonal_OtherDiagonal {

        public  static  void main(String [] args){
            // write a java program to print the diagonal matrix is nothing but a cross line from top left corner  to  bottom right corner
            // 1    2   3
            // 0,0 0,1 0,2 index values of i and j
            // 4    5   6
            // 1,0 1,1 1,2
            // 7    8   9
            // 2,0 2,1 2.2
            Scanner sc= new Scanner(System.in);
            int [] [] arr= new int[3][3];
            System.out.println("enter the size of a array");
            int row = sc.nextInt();
            System.out.println(row-1);
            System.out.println("enter the size of a array");
            int col = sc.nextInt();
            System.out.println("enter the elements of a array");
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int psum=0,odsum=0;
            System.out.println("diagonal matrix is .........");
            for(int i =0; i<row; i++){
                for(int j=0;j<col; j++){
                    if(i==j)
                       psum=psum+arr[i][j];
                    if(i+j==row-1)// explaination : ex:i+j i is 2 j is 0 2+0 =2 row =3 rwo -1 =2 i+j is 2 2==2 true
                           odsum=odsum+arr[i][j];


                }
            }
            System.out.print(" hello "+psum);
            System.out.println(" hello "+odsum);
        }
    }

