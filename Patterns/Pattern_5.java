package Patterns;

public class Pattern_5 {
    public static void main(String [] args){
        for(char i ='a'; i<='e'; i++){
            for (char j ='a' ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
//        a
//        ab
//        abc
//        abcd
//        abcde
        for(char i ='A'; i<='E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

//A
//AB
//ABC
//ABCD
//ABCDE

        for(char i ='E'; i>='A'; i--) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
//        E
//        ED
//        EDC
//        EDCB
//        EDCBA


        for(char i ='E'; i>='A'; i--) {
            for (char j = i; j <= 'E'; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
//        E
//        DE
//        CDE
//        BCDE
//        ABCDE

        for(char i ='A'; i<='E'; i++) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
//        EDCBA
//        EDCB
//        EDC
//        ED
//        E


        // combination of above two loop

        for(char i ='E'; i>='A'; i--) {
            for (char j = i; j <= 'E'; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for(char i ='A'; i<='E'; i++) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

//        E
//        DE
//        CDE
//        BCDE
//        ABCDE
//        EDCBA
//        EDCB
//        EDC
//        ED
//        E
    }
}
