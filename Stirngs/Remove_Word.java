package Stirngs;

import java.util.Scanner;

public class Remove_Word {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = sc.nextLine();
        System.out.println("enter word which you want to remove from the string");
        String word = sc.next();

        String after_remove = Remove_Word.Remove(sentence,word);
        System.out.println(after_remove);
    }
    public static String Remove(String sentence , String word){
       String [] str= sentence.split(" ");
       String removed ="";
       for(int i =0; i<str.length; i++){
           if(str[i].equals(word)){
               continue;
           }else {
               removed=removed+" "+str[i];
           }
       }
        return removed;
    }
}
