package Collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayLIst {
    public static void main(String [] args){

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println(list);

        list.remove("Banana");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);




    }
}
