package Collections;

import java.util.LinkedList;

public class CreateLinkedLIstExample {
    public static void main(String [] args){

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println(fruits);

        // adding element at specified index in the linkedlist
        fruits.add(1,"orange");
        System.out.println(fruits);

        //adding the element at the beginning of the linkedlist
        fruits.addFirst("strawberry");
        System.out.println(fruits);

        //adding the element at the end of the linkedlist
        fruits.addLast("grapes");
        System.out.println(fruits);


    }
}
