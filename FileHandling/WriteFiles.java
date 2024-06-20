package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        FileWriter fileWriter = null; // Declare FileWriter outside try block

        try {
            fileWriter = new FileWriter("D:/example2.txt"); // Initialize FileWriter

            fileWriter.write("Java programming is the best language..!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close(); // Close FileWriter in finally block
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
