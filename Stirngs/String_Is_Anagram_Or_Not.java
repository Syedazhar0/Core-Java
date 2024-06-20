package Stirngs;

import java.util.Arrays;

public class String_Is_Anagram_Or_Not {
    public static void main(String[] args) {
        String s = "silent";
        String s1 = "listen";

        if (s.length() == s1.length()) {
            System.out.println("Anagram is possible");
        } else {
            System.out.println("Anagram is not possible");
        }

        char[] ch = s.toCharArray();
        char[] ch1 = s1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch) + " " + Arrays.toString(ch1));

        if(Arrays.toString(ch).equals(Arrays.toString(ch1))){
            System.out.println("string are anagram");
        }else {
            System.out.println("not anagram");
        }
    }
}
