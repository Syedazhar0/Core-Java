package Java_8_Features;

public class MethodReferences {
    public static void main(String[] args) {
        System.out.println("Learning method reference");

        // Creating an instance of MyFunctionalInterface using lambda expression
        MyFunctionalInterface references = () -> {
            System.out.println("Hello, world!");
        };

        // Calling the doTask method through the instance of the functional interface
        references.doTask();

        //using method references

        MyFunctionalInterface references1 = MethodReferencesAnotherClass::doStuff;
        references1.doTask();

        Runnable runnable = MethodReferencesAnotherClass::thread;
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("***********************");
        //referring non static method
        MethodReferencesAnotherClass anotherClass = new MethodReferencesAnotherClass();
        Runnable runnable1 = anotherClass::printNumber;

        Thread thread1 = new Thread(runnable);
        thread1.start();


    }
}
