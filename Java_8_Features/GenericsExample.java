package Java_8_Features;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // ArrayList without generics (raw type)
        List numbers = new ArrayList();
        numbers.add(1);         // Adding an Integer
        numbers.add("azhar");   // Adding a String (not type-checked)
        numbers.add(0.00);      // Adding a Double (not type-checked)

        System.out.println("ArrayList without generics:");
        System.out.println(numbers);  // Output: [1, azhar, 0.0]

        // ArrayList with generics
        List<String> names = new ArrayList<>();
        names.add("Azhar");
        names.add("syed");
        names.add("athar");
        names.add("john");

        System.out.println("\nArrayList with generics:");
        System.out.println(names);   // Output: [Azhar, syed, athar, john]

        // Attempting to add an Integer to a List<String> (compile-time error)
        // names.add(123);  // Uncommenting this line would cause a compilation error
    }
}
