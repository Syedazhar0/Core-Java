package Recursion;

import java.util.Scanner;

// easy formila to convert binary to decimal :
// 1 : take the binary number ex: 1 0 0 1
// apply: formula :               8 4 2 1 --> up to n it depends up on the digits of binary num here i taken 4 digits
// now pick those digits
// which are not under 0 and add ex: 8+1 =9 is decimal number
// here u observe that the series is multiplying with 2 ex: 1*2=2 2*2=4 4*2=8 so on..................
// ex: 1 0 1 1
//     8 4 2 1
// decimal number is 8+2+1=11

// decimal to binary decimal num =16
// formula:   16 8 4 2 1
// here place 1  0 0 0 0                           under the number for which you want to convert to binary remaining put zeros
// ans is 10000 is binary of 16 decimal
//ex:2 deci =19  formula = 16 8 4 2 1 here check by adding which numbers you will get 19 and put 1 under that numbers
//placing binary numbers   1  0 0 1 1 is binary of 19
public class BinaryToDecimal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary number");
        int binary = sc.nextInt();
        int result = Decimal(binary);
        System.out.println(result);
    }
    public static int Decimal(int binary){
        if(binary==0){
            return 0;
        }else {
            return (binary%10+2*Decimal(binary/10));
        }
    }
}
//enter a binary number
//1011
//11

//Here’s the mathematical representation of the calculation for a binary number 1011:
//Decimal(1011)​=1+2×Decimal(101)=1+2×
// (1+2×Decimal(10))=1+2×
// (1+2×(0+2×Decimal(1)))=1+2×
// (1+2×(0+2×(1)))=1+2×
// (1+2×(0+2))=1+2×(1+4)=1+2×
// 5=1+10=11decimal​​