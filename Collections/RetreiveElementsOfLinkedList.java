package Collections;

import java.util.LinkedList;

public class RetreiveElementsOfLinkedList {
    public  static  void main(String [] args){

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);

        // get first element of the linkedlist
        System.out.println(fruits.getFirst());

        // get last element of the linkedlist
        System.out.println(fruits.getLast());

        // get element by index
        System.out.println(fruits.get(0));

        // print all elements of list
        System.out.println("*********************");
        for (String fruts: fruits
             ) {
            System.out.println(fruts);
        }
    }
}
