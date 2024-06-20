package complete_core_java;

import java.util.Scanner;

//program which reads the numbers until you enter the 0 then calculate the average
public class ReadTheNumersTillEnterZero {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int limit = sc.nextInt(); int avg=0; int count =0; int sum=0;
        for(int i =0; i<limit;i++){
            System.out.println("enter the numbers");
            int num = sc.nextInt();
            if(num==0){
                break;
            }else {
                sum= sum+num;
                count++;
            }

        }
        avg=sum/count;
        System.out.println("average is :"+avg);
    }
}
