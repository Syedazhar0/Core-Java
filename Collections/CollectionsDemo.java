package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo {

    public static void main(String [] args){
        Collection<String> fruitsCollections = new ArrayList<>();

        fruitsCollections.add("Apple");
        fruitsCollections.add("Mango");
        fruitsCollections.add("Strawberry");
        fruitsCollections.add("Apple");
        fruitsCollections.add("Banana");
        fruitsCollections.add("Orange");

        // Print the sorted list
        System.out.println(fruitsCollections.isEmpty());
        System.out.println(fruitsCollections);

        fruitsCollections.forEach(fruit-> System.out.println(fruit));

        fruitsCollections.remove("Banana");
        System.out.println(fruitsCollections);

        System.out.println(fruitsCollections.contains("Banana"));

        for (String fruit : fruitsCollections) {
            System.out.println(fruit);
        }

//        fruitsCollections.clear();
        System.out.println(fruitsCollections);

        Iterator<String> fruits = fruitsCollections.iterator();
        while (fruits.hasNext()){
            System.out.println(fruits.next());
        }

    }
}
