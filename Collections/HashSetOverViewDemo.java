package Collections;

import java.util.HashSet;
import java.util.Set;

// hashset internally follow hashmap
public class HashSetOverViewDemo {

    public static void main(String [] args){

        nullValueDemo();
        System.out.println("************");
         duplicateValueDemo();
        System.out.println("************");
        unorderedDemo();

    }

    // set can contain one null value

    private static void nullValueDemo(){
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.toString());
    }

    //set is not contain duplicate elements
    private static void duplicateValueDemo(){
        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element1");
        //display only one element
        System.out.println(set.toString());
    }

    private static void unorderedDemo(){
        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element2");
        set.add("element3");
        set.add("element4");
        set.add("element5");
        set.add("element6");
        //display only one element
        System.out.println(set.toString());
    }
}
