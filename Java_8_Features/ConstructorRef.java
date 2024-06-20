package Java_8_Features;
// Functional interface with a single abstract method (SAM)
// Abstract method without parameters, returning a Student object
@FunctionalInterface
public interface ConstructorRef {
     Student getStudent();

}
