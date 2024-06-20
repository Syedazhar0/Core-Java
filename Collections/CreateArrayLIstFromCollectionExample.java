package Collections;

//How to create an arraylist form another collections using the
//Arraylist (Collection c) constructor.

import java.util.ArrayList;
import java.util.List;

//how to add all the elements from an existing collections to the new
//ArrayList using the addAll() method.
public class CreateArrayLIstFromCollectionExample {
    public static void main(String [] args){

// create arraylist object
        List<Integer> firstFivePrimeNumber = new ArrayList<>();
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);

        List<Integer> firstTenPrimeNUmber = new ArrayList<>(firstFivePrimeNumber);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(29);

        firstTenPrimeNUmber.addAll(nextFivePrimeNumber);

        System.out.println(firstTenPrimeNUmber);
    }
}
