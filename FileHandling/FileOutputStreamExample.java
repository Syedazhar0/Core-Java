package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        FileOutputStream outputStream = null;

        try {
            // Create FileOutputStream with the file path
            outputStream = new FileOutputStream("D:/example_output.txt");

            // Write some data to the file
            String data = "This is an example of writing data to a file using FileOutputStream.";
            byte[] bytes = data.getBytes(); // Convert string to bytes
            outputStream.write(bytes); // Write bytes to the file

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            // Handle any I/O exceptions
            e.printStackTrace();
        } finally {
            try {
                // Close the stream in the finally block
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                // Handle any exceptions that occur during closing
                e.printStackTrace();
            }
        }
    }
}
