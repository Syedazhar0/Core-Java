package Java_8_Features;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        // Example of using Streams and Stream operations in Java 8

        // Example of using Predicate (functional interface) in lambda expression
        List<String> names = List.of("azhar", "mazhar", "athar", "syed");
        List<String> namesStartsWithA = names.stream()
                .filter(e -> e.startsWith("a")) // Filtering names that start with 'a'
                .collect(Collectors.toList()); // Collecting filtered names into a new list

        // Printing original list using lambda expression
        names.forEach(e -> System.out.println(e));

        // Printing names starting with 'a' using method reference (::)
        namesStartsWithA.forEach(System.out::println);

        // Example of using map function to transform elements
        List<Integer> numbers = List.of(23, 2, 4, 5, 8, 7, 9);
        List<Integer> newNumbers = numbers.stream()
                .map(e -> e * e) // Squaring each number
                .collect(Collectors.toList()); // Collecting squared numbers into a new list
        System.out.println(newNumbers);

        // Printing squared numbers using lambda expression
        newNumbers.forEach(e -> System.out.println(e));

        // Example of sorting numbers using sorted() method
        numbers.stream()
                .sorted() // Sorting numbers in natural order
                .forEach(System.out::println); // Printing sorted numbers

        // Example of finding minimum and maximum using min() and max() methods
        // Finding minimum number using Comparator lambda expression
        Integer min = numbers.stream()// get method cuz min maybe present on may not so get() is optional if present it will print else empty
                .min((x, y) -> x.compareTo(y)) // Finding minimum using Comparator
                .get(); // Getting the result as an Integer (Optional<Integer> is unwrapped using get())
        System.out.println("min: " + min);

        // Finding maximum number using Comparator lambda expression
        Integer max = numbers.stream()
                .max((x, y) -> x.compareTo(y)) // Finding maximum using Comparator
                .get(); // Getting the result as an Integer (Optional<Integer> is unwrapped using get())
        System.out.println("max: " + max);
    }
}
