package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaystoIterateOverLIst {
    public static void main(String [] args){

        List<String>courses = Arrays.asList("c","c++","java","Spring","Hibernate");

        //basic for loop
        for (int i =0; i<courses.size(); i++){
            System.out.println(courses.get(i));
        }

        // foreach loop
        System.out.println("*******************");

        for (String course: courses) {
            System.out.println(course);

        }
        System.out.println("***************");
        //foreach method

        courses.forEach(elements-> System.out.println(elements));
        System.out.println("*****************");
        // using iterator
        Iterator<String> cours = courses.iterator();

        while (cours.hasNext()){
            System.out.println(cours.next());
        }
    }
}
