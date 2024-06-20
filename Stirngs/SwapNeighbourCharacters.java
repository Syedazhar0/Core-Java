package Stirngs;

public class SwapNeighbourCharacters {
    public static void main(String[] args) {
        String str = "abcde";
        char[] ch = str.toCharArray();
        String swap = "";
        char temp='0';
        for (int i = 0; i < ch.length - 1; i=i+ 2) {
            temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;

        }

        swap = new String(ch);

        System.out.println(swap);

        // another way

        for(int i=0; i<str.length(); i+=2){
            if(i+2<str.length())
                swap = swap+str.charAt(i+1)+str.charAt(i);
            else
                swap +=str.charAt(i);

        }
        System.out.println(swap);
    }
}
