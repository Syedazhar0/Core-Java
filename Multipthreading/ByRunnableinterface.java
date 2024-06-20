package Multipthreading;

// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
    // Implement the run() method from the Runnable interface
    public void run() {
        // Print a message indicating the execution of the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " executing");
            try {
                // Pause the execution of the thread for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Define the main class
public class ByRunnableinterface {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Create two threads, passing the instance of MyRunnable to their constructors
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish execution
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a message indicating that all threads have finished execution
        System.out.println("All threads finished execution");
    }
}
