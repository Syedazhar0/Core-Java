package Stirngs;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] ch = str.toCharArray();
        char c = 'c';

        for(int i = 0; i< ch.length; i++){
            for(int j =i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                   ch[j]=c;
                }
            }
            if(ch[i]!=c){
                System.out.print(ch[i]);
            }
        }

       }
}
