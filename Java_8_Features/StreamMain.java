package Java_8_Features;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(14,12352,5625,367356);

        System.out.println(integers);
        System.out.println("************");
        integers.stream().forEach(System.out::println);
    }
}
