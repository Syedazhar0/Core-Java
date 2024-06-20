package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapMainClass {

    public static void main(String[] args) {
        // Create instances of Tiffins and ChineseFood
        MapTiffins tiffin1 = new MapTiffins("Masala Dosa", "South Indian");
        MapTiffins tiffin2 = new MapTiffins("Poha", "Maharashtrian");

        MapChineseFood chineseFood1 = new MapChineseFood("Manchurian", "Stir-fried vegetable balls in tangy sauce");
        MapChineseFood chineseFood2 = new MapChineseFood("Hakka Noodles", "Stir-fried noodles with vegetables");

        // Create a Map to store instances
        Map<String, Object> foodMap = new HashMap<>();

        // CRUD Operations

        // Create
        foodMap.put("Tiffin1", tiffin1);
        foodMap.put("Tiffin2", tiffin2);
        foodMap.put("ChineseFood1", chineseFood1);
        foodMap.put("ChineseFood2", chineseFood2);

        // Read and iterate in all possible ways

        // 1. Using forEach loop (traditional way)
        System.out.println("Iterating using forEach loop:");
        for (Map.Entry<String, Object> entry : foodMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        // 2. Using forEach method with lambda expression (Java 8+)
        System.out.println("Iterating using forEach method:");
        foodMap.forEach((key, value) -> System.out.println(key + " -> " + value));
        System.out.println();

        // 3. Using keySet() to iterate over keys and get values
        System.out.println("Iterating using keySet:");
        for (String key : foodMap.keySet()) {
            System.out.println(key + " -> " + foodMap.get(key));
        }
        System.out.println();

        // 4. Using values() to iterate over values directly
        System.out.println("Iterating using values:");
        for (Object value : foodMap.values()) {
            System.out.println(value);
        }
        System.out.println();

        // Update (Modify an existing entry)
        if (foodMap.containsKey("Tiffin1")) {
            MapTiffins updatedTiffin = new MapTiffins("Idli", "South Indian");
            foodMap.put("Tiffin1", updatedTiffin);
            System.out.println("Updated Tiffin1: " + foodMap.get("Tiffin1"));
        }
        System.out.println();

        // Delete (Remove an entry)
        foodMap.remove("ChineseFood2");
        System.out.println("After deleting ChineseFood2:");
        foodMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

}
