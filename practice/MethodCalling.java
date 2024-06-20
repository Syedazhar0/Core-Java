package practice;

public class MethodCalling {
    public static  void main(String [] args){
        MethodCalling m =new MethodCalling();
       int result= m.add(10,20);
        System.out.println(result);
    }
    public int add(int a,int b){
        int sum = a+b;
        return sum;
    }
}
