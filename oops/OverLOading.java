package oops;

// same method with different arguments is called method overloading in polymorphism
public class OverLOading {

    public  int add(){
        int a = 10;
        int b = 20;
//        int c = a+b;

//        return c ;

        return a+b;

    }

    public  int add(int x, int y){

        return x+y;
    }

    public  double add(double x, double y){

        return x+y;
    }

    public  static void main(String [] args){

        OverLOading overLOading = new OverLOading();
                  int result = overLOading.add();
                  int result1 = overLOading.add(2,5);
                  double result2 = overLOading.add(3.5,9.5);
                  System.out.println(result);
                  System.out.println(result1);
                  System.out.println(result2);
    }
}
