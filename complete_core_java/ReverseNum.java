package complete_core_java;

import java.util.Scanner;

// program to reverse the number using while loop
public class ReverseNum {
    public static  void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number that you want to reverse");
        int reverse = sc.nextInt();
        int rev=0;
        while (reverse>0){
            int rem = reverse%10;
                rev = rev*10+ rem;
                reverse=reverse/10;
        }
        System.out.println(rev);
    }
}
