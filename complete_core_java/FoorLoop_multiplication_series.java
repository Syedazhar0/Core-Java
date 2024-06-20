package complete_core_java;
// program to print multiplication series of numbers
public class FoorLoop_multiplication_series {
    public static void main(String [] args){

                int num = 12; // Starting number for the series
                int limit = 10; // Limit of the series

                // Loop to print multiplication series
                for (int i = 1; i <= limit; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
            }
        }
