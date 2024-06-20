package complete_core_java;
// program to check number is perfect number of not
public class PerfectNumber {
    public static void main(String [] args){
        int number =12,sum=0;
        for(int i=1; i<number; i++){
            if(number%i ==0){
                sum=sum+i;
                System.out.println("factors "+i+" "+sum);
            }
        }
        if(sum==number){
            System.out.println("perfect number");
        }else {
            System.out.println("not a perfect number"+sum);
        }
    }
}
