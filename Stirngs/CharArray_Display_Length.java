package Stirngs;

public class CharArray_Display_Length {
    public static void main(String [] args){
        char [] ch ={'a','x','3','m','x','@','p','7','m','4','$'};
        //display length
        System.out.println(ch.length);
        //display first char
        System.out.println(ch[0]);
        //display last char
        System.out.println(ch[ch.length-1]);
        //display first char ascii
        int ascii = ch[0];
        //display last char ascii
        int asciii = ch[ch.length-1];
        System.out.println(ascii);

        System.out.println(asciii);
         //check first char is alphabet or not
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            System.out.println("is a char");
        }else {
            System.out.println("not");
        }
        //check last char is vowel or not
        if (ch[ch.length-1] == 'a' || ch[ch.length-1] == 'e' || ch[ch.length-1] == 'i' || ch[ch.length-1] == 'o' ||  ch[ch.length-1] == 'u' ) {
            System.out.println("vowel");
        }else {
            System.out.println("not");
        }
        // print the array elements
        for(int i =0; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }
            // print the array elements reverse
        for(int i=ch.length-1; i>=0; i--){
            System.out.print(ch[i]+" ");
        }

        for(int i =0; i<ch.length; i++){
            if(ch[i]>='a' && ch[i]<='z'){
                System.out.println(ch[i]);
            }
        }

        for(int i =0; i<ch.length; i++){
            if(!((ch[i]>='a' && ch[i]<='z')||(ch[i]>='0' && ch[i]<='9')||(ch[i]>='A' && ch[i]<='Z'))){
                System.out.print(ch[i]);
            }
        }
        for(int i =0; i<ch.length; i++){
            if (i % 2 == 0) {
                System.out.println(ch[i] + " ");
            }
        }

        for(int i =0; i<ch.length; i++){
            if (i % 2 != 0) {
                System.out.print(ch[i] + " ");
            }
        }

        char chr = ch[0],count=0;
        for(int i=0; i<ch.length; i++){
                if(ch[i]==chr){
                    count++;
                }
            }
        if(count>1){
            System.out.println("duplicate");
        }else{
            System.out.println("not");
        }

        for(int i =0; i<ch.length; i++){
            int digit = (int) (ch[i]);
            System.out.println(digit);
        }
        int a = ch[2]-'0';
        System.out.println(a);

        int sum=0;
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='0'&& ch[i]<='9'){
                sum = sum+ ch[i]-48;
            }
        }
        System.out.println(sum);
    }
}
