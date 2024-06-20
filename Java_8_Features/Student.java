package Java_8_Features;

public class Student {
    public Student() {
        System.out.println("Student object created"); // Constructor for Student class
    }

    public void display() {
        System.out.println("Student is displaying information"); // Method to display information
    }

    public static void main(String[] args) {
        System.out.println("Learning Constructor Reference");

        // Creating an instance of ConstructorRef using lambda expression
//        ConstructorRef constructorRef = () -> {
//            return new Student(); // Lambda expression creating a new Student object
//        };


        // Using the functional interface to get a Student object
//        Student student = constructorRef.getStudent();

        // Calling display method on the Student object
//        student.display();


        //by using Constructor reference
        ConstructorRef ref = Student::new;
        Student student = ref.getStudent();
        student.display();
    }
}
