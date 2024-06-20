package Patterns;

public class Pattern_4 {
    public static void main(String [] args){
        for(int i =5 ; i>=1; i-- ){
            for(int j =5; j>=i; j--){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
/*  5 with j
    54
    543
    5432
    54321   */


//            5 with i
//            44
//            333
//            2222
//            11111