package Collections;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String [] args){

        // create a hashset using the hashset() constructor
        // add new elements to it using the add() method.\

        Set<String>  progLangs = new HashSet<>();
        progLangs.add("c");
        progLangs.add("c++");
        progLangs.add("c#");
        progLangs.add("java");
        progLangs.add("python");

        System.out.println(progLangs);

        // lets add duplicate elements
        progLangs.add("java");
        System.out.println(progLangs);
    }
}
