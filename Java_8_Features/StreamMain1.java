package Java_8_Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {
        // creating list of numbers
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // finding even numbers using a for loop
        // before stream api the approach we follow
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                even.add(list1.get(i));
            }
        }

        System.out.println("Original List: " + list1);
        System.out.println("Even Numbers: " + even);

        System.out.println("********************");

        // with stream api
        // using stream to filter even numbers
        List<Integer> even1 = list1.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original List: " + list1);
        System.out.println("Even Numbers: " + even1);

        System.out.println("************************");

      List<Integer> integerStream= list1.stream().filter(i->i>5).collect(Collectors.toList());
        System.out.println(integerStream);

        System.out.println("*****************************");

        List<Integer> odd = list1.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(odd);


    }
}
