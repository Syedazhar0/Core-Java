package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentMain {
    public static void main(String[] args) {

        Map<Integer, Students> studentDetails = new HashMap<>();

        // Adding student objects with unique keys
        studentDetails.put(1, new Students("Syed", "Azhar"));
        studentDetails.put(2, new Students("Syed", "MAzhar"));
        studentDetails.put(3, new Students("Syed", "Athar"));

        // Adding a new student
        studentDetails.put(4, new Students("John", "Doe"));


        // Printing student details using System.out.println
        System.out.println("Student ID: 1, Name: " + studentDetails.get(1).getFirstName() + " " + studentDetails.get(1).getLastName());
        System.out.println("Student ID: 2, Name: " + studentDetails.get(2).getFirstName() + " " + studentDetails.get(2).getLastName());
        System.out.println("Student ID: 3, Name: " + studentDetails.get(3).getFirstName() + " " + studentDetails.get(3).getLastName());


        System.out.println("***************************");

        // Iterating over the map using Iterator
        Iterator<Map.Entry<Integer, Students>> iterator = studentDetails.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Students> entry = iterator.next();
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue().getFirstName() + " " + entry.getValue().getLastName());
        }

        System.out.println("****************************");

        // Iterating over the map using forEach loop (Java 8+)
        studentDetails.forEach((key, value) -> {
            System.out.println("Student ID: " + key + ", Name: " + value.getFirstName() + " " + value.getLastName());
        });

        System.out.println("*******************************");

        // Iterating over the map using Stream API (Java 8+)
        studentDetails.entrySet().stream()
                .forEach(entry -> System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue().getFirstName() + " " + entry.getValue().getLastName()));

        System.out.println("*******************************");
        // Iterating over the map using traditional for loop
        for (Map.Entry<Integer, Students> entry : studentDetails.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue().getFirstName() + " " + entry.getValue().getLastName());
        }

        System.out.println("*****************************");
        // Adding a new student
        studentDetails.put(5, new Students("jonny", "Doe"));

        System.out.println("*****************************");
        // Retrieving a student by ID
        Students student = studentDetails.get(2);
        if (student != null) {
            System.out.println("Student ID: 2, Name: " + student.getFirstName() + " " + student.getLastName());
        }

        System.out.println("******************************");
        // Updating a student's details
        Students updatedStudent = new Students("Updated", "Name");
        studentDetails.put(3, updatedStudent);  // Update student with ID 3


        System.out.println("***************************");
        // Removing a student by ID
        studentDetails.remove(1);

    }
}
