package Multipthreading;

// Define a class MyThread which extends Thread class
class MyThread extends Thread {
    // Override the run() method of Thread class
    public void run() {
        // Loop 5 times
        for (int i = 0; i < 5; i++) {
            // Print the name of the current thread and a message indicating its execution
            System.out.println(Thread.currentThread().getName() + " executing");
            try {
                // Pause the execution of the thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle InterruptedException if it occurs
                e.printStackTrace();
            }
        }
    }
}

// Define the main class
public class Main {
    // The entry point of the program
    public static void main(String[] args) {
        // Create three instances of MyThread class
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        // Start execution of thread1, thread2, and thread3
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Wait for thread1, thread2, and thread3 to finish execution
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            // Handle InterruptedException if it occurs
            e.printStackTrace();
        }

        // Print a message indicating that all threads have finished execution
        System.out.println("All threads finished execution");
    }
}
