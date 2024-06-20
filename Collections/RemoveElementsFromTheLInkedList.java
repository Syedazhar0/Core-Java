package Collections;

import java.util.LinkedList;

public class RemoveElementsFromTheLInkedList {
    public static void main(String [] args){

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("grapes");
        fruits.add("orange");
        fruits.add("papaya");

        System.out.println(fruits);

        // remove first element form the linkedlist

        System.out.println(fruits.remove());// it will remove first element
        System.out.println(fruits);
        System.out.println(fruits.remove(1));// display the removed element
        System.out.println(fruits);
        System.out.println(fruits.removeFirst());//remove last element from the linkedlist
        System.out.println(fruits);
        System.out.println(fruits.removeLast());// remove last element from the linkedlist
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}