package complete_core_java;

import java.util.Scanner;

// calculate the electricity bill
public class ElectricityBill {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter present units");
        int ps = sc.nextInt();
        System.out.println("enter previous units");
        int pv = sc.nextInt();

        double total_units_consumed = ps-pv;

        System.out.println("total unit consumed :"+total_units_consumed);
        System.out.println("*************************");

        double E_Bill =0;

        // calculate the bill after subtracting present - previous the bill will be calculated on remaining units

        if(total_units_consumed<=50){
            E_Bill = total_units_consumed*1.95;// e_bill is 29.0 units 20
            System.out.println(" total e_bill amount :"+E_Bill);
        }else if( total_units_consumed >50 && total_units_consumed<=100) {
           E_Bill=97.5+(total_units_consumed-50)*3.10;// e_bill is 202.5 units 100
            System.out.println(" total e_bill amount :"+E_Bill);
        }else if(total_units_consumed==100){// this will not work cuz the above condition is same
            E_Bill=total_units_consumed*3.40;
            System.out.println(" total e_bill amount :"+E_Bill);
        } else if(total_units_consumed>101 && total_units_consumed<=200) {
            E_Bill = 330+(total_units_consumed-100)*4.80;
            System.out.println(" total e_bill amount :"+E_Bill);
        }
    }
}
