package Java_8_Features;

import java.time.LocalDate;

public class MethodReferencesAnotherClass {
    public static void doStuff() {
        System.out.println("I am doing Task");
        System.out.println("I am second line");
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());
    }

    public static void thread() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
