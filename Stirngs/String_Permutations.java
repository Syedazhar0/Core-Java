public class String_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine(); // Read input from the user
        char[] ch = str.toCharArray();

        generatePermutations(ch, 0);
    }


    private static void generatePermutations(char[] ch, int currentIndex) {
        if (currentIndex == ch.length - 1) {
            System.out.println(new String(ch)); // Print the permutation
            return;
        }

        for (int i = currentIndex; i < ch.length; i++) {
            // Swap characters
            char temp = ch[currentIndex];
            ch[currentIndex] = ch[i];
            ch[i] = temp;


            generatePermutations(ch, currentIndex + 1);

            // Undo the swap
            temp = ch[currentIndex];
            ch[currentIndex] = ch[i];
            ch[i] = temp;
        }
    }
}


//package Stirngs; // Corrected typo in "Strings"
//
//import java.util.Scanner;
//
//public class String_Permutations {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String:");
//        String str = sc.nextLine(); // Read input from the user
//
//        // method called
//        generatePermutations("", str);
//    }
//
//    // using recursive method
//    private static void generatePermutations(String prefix, String remaining) {
//        int n = remaining.length();
//        if (n == 0) {
//            System.out.println(prefix);
//        } else {
//            for (int i = 0; i < n; i++) {
//                // Recursive call with updated prefix and remaining string
//                generatePermutations(prefix + remaining.charAt(i),
//                        remaining.substring(0, i) + remaining.substring(i + 1));
//            }
//        }
//    }
//}




//package Stirngs;
//
//import java.util.Scanner;
//
//public class String_Permutations {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String:");
//        String str = sc.nextLine(); // Read input from the user
//        char[] ch = str.toCharArray();
//        char temp;
//
//        for (int i = 0; i < ch.length-1; i++) {
//            String permutation = "";
//            for (int j = 0; j < ch.length; j++) { // Corrected the loop condition
//                temp = ch[i];
//                ch[i] = ch[j];
//                ch[j] = temp;
//                permutation = new String(ch); // Create a new string from the modified character array
//                System.out.println(permutation);
//
//                temp = ch[i];
//                ch[i] = ch[j];
//                ch[j] = temp;
//            }
//        }
//    }
//}











