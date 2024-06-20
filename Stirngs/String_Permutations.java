package Stirngs;

import java.util.Scanner;

public class String_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine(); // Read input from the user
        char[] ch = str.toCharArray();
        char temp;

        for (int i = 0; i < ch.length - 1; i++) {
            String permutation = "";
            for (int j = 0; j < ch.length; j++) { // Corrected the loop condition
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                permutation = new String(ch); // Create a new string from the modified character array
                System.out.println(permutation);
            }
        }
    }
}
