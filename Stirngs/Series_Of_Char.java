package Stirngs;

public class Series_Of_Char {
    public static void main(String [] args){
        String str = "a3b2c4";
        int digit =0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='0' &&ch<='9'){
                digit=(ch-48);
                for(int j=0; j<digit;j++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}
