package Patterns;

public class Pattern_3 {
    public static void main(String [] args){
        for (int i =1; i<=5; i++){
            for(int j =1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
/*
1 with j
12
123
1234
12345
 */

/*
1 with i
22
333
4444
55555
 */