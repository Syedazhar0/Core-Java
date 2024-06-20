package Patterns;

public class Pattern_8_Hollo_Triangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows you want in your pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Printing space
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
//             *
//            * *
//           *   *
//          *     *
//         *********