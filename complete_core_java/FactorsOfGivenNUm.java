package complete_core_java;

// display the factors of given number
public class FactorsOfGivenNUm {
    public static void main(String [] args){
        int number=5;
        for(int i =1; i<=10; i++){
            if(number%i==0){
                System.out.println("factors of given number is :"+i);
            }
        }

    }
}
