package Stirngs;

public class Find_The_Duplicates{
    public static void main(String [] args){
        String str = "Sakkett";
        int count = 0;
        for (int i =0; i<str.length(); i++){
            count=1;
            for (int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }if(count>1){
                System.out.println(str.charAt(i));
            }
        }
    }
}
