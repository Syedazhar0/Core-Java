package Stirngs;

public class Frequency_Of_Each_Char {
    public static void main(String [] args){
        String str = "aaaabbbcdddd";
        char [] ch = str.toCharArray();
        int count =0;
        for(int i =0 ; i<ch.length; i++) {
            count = 1;
            char c = '-';
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = c;
                }
            }
            if (ch[i] != c) {
                System.out.println(ch[i] + " :" + count);
            }
        }
    }
}
