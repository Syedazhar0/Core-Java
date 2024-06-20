package practice;

public class SreingArrayPrintSameElements {
    // write a java program to crate two string arrays and find the equal name which are present in both array and set in to another array
    public static void main(String [] args){
        String s1 []={"three","one","four","two"};
        String s2 []={"three","two","six","eight"};
        for(int i =0; i<s1.length;i++){
            for(int j =0;j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                    System.out.println(s1[i]);
                }
            }
        }
    }

}
