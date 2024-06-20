package Stirngs;

import java.util.Scanner;

public class Swap_First_And_Last_Name {
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter first name");
            String first_name = sc.next();
            System.out.println("enter last name");
            String last_name = sc.next();

            String after_swap = Swap_First_And_Last_Name.swap(first_name,last_name);
            System.out.println(after_swap);
        }
        public static String swap( String first_name  , String last_name){
            String swapped ="";
            if(first_name!=null && last_name!=null){
                swapped = swapped+last_name+" "+first_name;
                return swapped;
            }else{
                return "cannot swap the null values .....";
            }
        }
    }

