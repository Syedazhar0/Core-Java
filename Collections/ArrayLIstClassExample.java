package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLIstClassExample {

    public static void main(String [] args){
        // create array list object
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("grapes");
        fruits.add(("black_grapes"));

        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
