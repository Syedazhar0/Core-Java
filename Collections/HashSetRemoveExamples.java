package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//remove method remove element form the hashset
//removeall() method remove all elements that exist in a given collection form the hashset
// cleat() method cleast the hashset completely by removing all elements
public class HashSetRemoveExamples {
    public static void main(String [] args){

        // create hashset

        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(numbers);


        // Method 1: Using Iterator
        System.out.println("Method 1: Using Iterator");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.print(number + " ");
        }
        System.out.println();

        // Method 2: Using enhanced for-loop (since Java 5)
        System.out.println("Method 2: Using enhanced for-loop");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Method 3: Using forEach method with lambda expression (since Java 8)
        System.out.println("Method 3: Using forEach method");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Using stream() and forEach() method
        System.out.println("Using Stream:");
        numbers.stream().forEach(number -> System.out.print(number + " "));
        System.out.println();

        // Another way to use stream with method reference
        System.out.println("Using Stream with method reference:");
        numbers.stream().forEach(System.out::println);

//        // using remove method
//
//        numbers.remove(1);
//        System.out.println(numbers);
//
//        // using clear method\
//        numbers.clear();
//        System.out.println(numbers);
//
//        //using removeall method
//        numbers.removeAll(numbers);
//        System.out.println(numbers);



    }
}
