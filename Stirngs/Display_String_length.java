package Stirngs;

public class Display_String_length {
    public static void main(String [] args){
        // display length
        String st = "azhar";
        System.out.println(st.length());
        // display first char of string
        System.out.println(st.charAt(0));
        //display last char of string
        System.out.println(st.charAt(st.length()-1));
        //uppercase the string
        System.out.println(st.toUpperCase());
        //lowercase the string
        System.out.println(st.toLowerCase());
        // uppercase the first char of string
        String s = String.valueOf(st.charAt(0));
        System.out.println((s.toUpperCase()+st.substring(1)));
        // another way to upper case
        System.out.println(st.substring(0,1).toUpperCase()+st.substring(1));
        // lower case the last char
        System.out.println(st.substring(0,st.length()-1)+st.substring(st.length()-1).toUpperCase());

        // ascii value of first char
        int ascii = st.charAt(0);
        System.out.println(ascii);

        // check length is even or not
        if(st.length()%2==0){
            System.out.println("even");
        }else {
            System.out.println("not even");
        }

        // print string elements character by character
        for(int i =0; i<st.length();i++){
            char ch = st.charAt(i);
            System.out.println(ch);
        }

        // print string elements character by character in reverse
        for(int i =st.length()-1;i>=0;i--){
            char ch = st.charAt(i);
            System.out.println(ch);
        }

        for(int i =0; i<st.length();i++){
            char ch = st.charAt(i);
            int asciii = ch;
            System.out.println(asciii);
        }
// first paper complete

    }
}
