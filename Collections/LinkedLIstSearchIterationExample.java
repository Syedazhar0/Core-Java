package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLIstSearchIterationExample {
    public static void main(String [] args){

        LinkedList<String> progLangs = new LinkedList<>();

        progLangs.add("c");
        progLangs.add("c++");
        progLangs.add("c#");
        progLangs.add("java");
        progLangs.add("python");

      boolean result =  progLangs.contains("c");
        System.out.println(result);

        // how to find index of the first occurrence of an element in the linkedlist

        int index = progLangs.indexOf("java");
        System.out.println(index);

        // iterate all elements

        progLangs.stream().forEach(elements-> System.out.println(elements));

        System.out.println("**********");
        for (String ele: progLangs
             )
            System.out.println(ele); {

        }
        System.out.println("******************");
        for (int i =0; i<progLangs.size(); i++){
            System.out.println(progLangs.get(i));
        }

        Iterator<String> programing = progLangs.iterator();
        System.out.println("*******************");
        while (programing.hasNext()){
            System.out.println(programing.next());
        }
    }
}
