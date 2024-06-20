package complete_core_java;

import java.util.Scanner;

// print hello 10 times using do while loop
public class Do_While_Loop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i =1;
        do {
            System.out.print("hello");
            i++;
        }while(i<=number);

        // multiplication table
        int multi = 1;
        do {
            System.out.print(multi*2);
            multi++;
        }while (multi<=number);

        //fibonacci series

        int a =0; int b=1; int c =0,f=1;
        do {
            System.out.print(a);
            c= a+b;
            a=b;
            b=c;
            f++;
        }while (f<=number);

        // program to check given number is prime or not

        int count =0;
        int p =1;
        do {
            if(number%p==0){
                count++;
            }
            p++;
        }while (p<=number);
        if(count==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
