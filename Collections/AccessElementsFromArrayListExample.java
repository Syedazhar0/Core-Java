package Collections;

import java.util.ArrayList;
import java.util.List;

//how to access if an arraylist is empty using the isEmpty()method
//how to find the size of an arraylist using the size method
//how to access the element at a particular index in a arraylist using the get() method
//how to modify the element at a particular index in an arraylist using the set() method
public class AccessElementsFromArrayListExample {
    public static void main(String [] args){

        List<String> topProgrammingLanguages = new ArrayList<>();
        // if an arraylist is empty
        System.out.println(topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("c");
        topProgrammingLanguages.add("c++");
        topProgrammingLanguages.add("c#");
        topProgrammingLanguages.add("java");
        topProgrammingLanguages.add("python");

        //find the size of an arralist
        System.out.println(topProgrammingLanguages.size());

        //retrieve the element at a given index

        System.out.println(topProgrammingLanguages.get(4));

        // modify the element

     String canstoreinvariable= topProgrammingLanguages.get(0);
        System.out.println(canstoreinvariable);

        System.out.println(topProgrammingLanguages.set(0,"java"));

        System.out.println(topProgrammingLanguages);
    }
}
