package practice;

public class Constructor {
    int a;
    int b;
    String name;

    public Constructor(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "a=" + a +
                ", b=" + b +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String [] args){
        Constructor c =new Constructor(10,20,"azhar");
        System.out.println(c);
    }
}
