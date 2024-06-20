package Stirngs;

public class Palindrome_Or_Not {
    public static void main(String [] args){
        String str = "mommom";
        String palindrome = "";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            palindrome = palindrome+ch;
        }if(palindrome.equals(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
