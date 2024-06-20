package Collections;

import java.util.ArrayList;
import java.util.List;

public class LIstDemo {
    public static void main(String [] args){

        List<String> list = new ArrayList<>();
        // list allows you to add duplicates elements

        list.add("hi");
        list.add("hi");
        list.add("hello");
        list.add("bye");
        System.out.println(list);

        // list also allows you to add null

        list.add(null);
        list.add(null);
        System.out.println(list);

        list.add("hi");//indes 0
        list.add("hi");//1
        list.add("hello");//2
        list.add("bye");//3
        //get by index number
        System.out.println(list.get(0));

        //get first element of list
        System.out.println(list.getFirst());

        //get last element of list
        System.out.println(list.getLast());
    }
}
