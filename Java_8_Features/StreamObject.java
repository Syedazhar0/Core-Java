package Java_8_Features;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream Api - collection process
        // collection/group of object

        String names [] = {"azhar","mazhar","athar","syed","idrees","adil","tousif"};

        Stream<String > stream = Stream.of(names);

        stream.forEach(e->{
            System.out.println(e);
        });

     IntStream even=  Arrays.stream(new int[]{2,4,6,8,10});
       even.forEach(e->{
           System.out.println(e);
       });
        
    }
}
