package Collections;

import java.util.HashSet;
import java.util.Set;

// 1. create a hashset from another collection using the hashset collection c constructor.
// 2. Add all the elements form a collection to the hashset using hte addall() method
public class CreateHashSetFromCollectionExample {
    public static void main(String [] args){

        // first 5 even numbers

        Set<Integer> firstFiveEvenNumbers = new HashSet<>();

        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);

        Set<Integer> tenEvenNumbers = new HashSet<>(firstFiveEvenNumbers);

        System.out.println(tenEvenNumbers);

        Set<Integer> nextFiveEvenNumbers = new HashSet<>();

        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);

        tenEvenNumbers.addAll(nextFiveEvenNumbers);

        System.out.println(tenEvenNumbers);
    }
}

