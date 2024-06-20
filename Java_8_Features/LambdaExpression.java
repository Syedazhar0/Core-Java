package Java_8_Features;

public class LambdaExpression {
    public static void main(String [] args){


        CreatingFunctionalInterFace inter =()->{
            System.out.println("Hello every one this is first time im using lambda");
        };

        inter.sayHello();

        System.out.println("****************");

        SumInterface sum = (a,b)-> a+b;

        System.out.println(sum.sum(100,20));
        System.out.println("******************");

        StringLenghtInterFace lenghtInterFace = (strlenght)->{

            return  strlenght.length();

        };

        System.out.println( lenghtInterFace.lenghtofstring("Syed Azhar"));

        System.out.println("****************");
    }
}
